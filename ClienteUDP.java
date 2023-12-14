import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ClienteUDP {
    //Recibimos en los argumentos el mensaje, IP destino y puerto
    // java ClienteUDP hola localhost 9999
    public static void main(String args[]){
        // control de entrada de argumentos
        if (args.length<2){
            System.out.println("Uso: java ClienteUDP <IP_destino/localhost> <numPuerto>");
            System.exit(1);
        }

        DatagramSocket dSocket = null;

        try {
            //pide el mensaje al usuario
            System.out.println("Introduce el mensaje a enviar:");
            Scanner lee = new Scanner(System.in);
            String mensajeEnviado = lee.nextLine();
            lee.close();

            //envio del datagrama
            dSocket = new DatagramSocket();            
            InetAddress aHost = InetAddress.getByName(args[0]);
            int puerto = Integer.valueOf(args[1]).intValue();



            DatagramPacket dpEnvio = new DatagramPacket(mensajeEnviado.getBytes(), mensajeEnviado.length(),aHost,puerto);
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
