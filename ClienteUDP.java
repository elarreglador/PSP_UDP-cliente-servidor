import java.net.*;
import java.io.*;

public class ClienteUDP {
    //Recibimos en los argumentos el mensaje, IP destino y puerto
    // java ClienteUDP hola localhost 9999
    public static void main(String args[]){
        // control de entrada de argumentos
        if (args.length<3){
            System.out.println("Uso: java ClienteUDP <mensaje> <IP_destino/localhost> <numPuerto>");
            System.exit(1);
        }

        DatagramSocket dSocket = null;

        try {
            //envio del datagrama
            dSocket = new DatagramSocket();
            byte[] mensajeEnviado = args[0].getBytes();
            InetAddress aHost = InetAddress.getByName(args[1]);
            int puerto = Integer.valueOf(args[2]).intValue();

            DatagramPacket dpEnvio = new DatagramPacket(mensajeEnviado, args[0].length(),aHost,puerto);
            dSocket.send(dpEnvio);

            //Recepcion del datagrama
            byte[] mensajeRecibido = new byte[1000];
            DatagramPacket dpRespuesta = new DatagramPacket(mensajeRecibido, mensajeRecibido.length);
            dSocket.receive(dpRespuesta);

            System.out.println("[Servidor] "+ new String(dpRespuesta.getData()));
        } catch (SocketException e){
            System.out.println("SocketException en main(): "+e);
        } catch (IOException e){
            System.out.println("IOException en main(): "+e);
        } finally {
            if (dSocket!=null){
                dSocket.close();
            }
        }
    }
}
