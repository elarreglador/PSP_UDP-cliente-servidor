import java.net.*;
import java.io.*;

public class ServidorUDP {
    public static void main(String args[]){

        DatagramSocket dSocket = null;

        // exige un puerto como parametro
        if (args.length < 1){
            System.out.println("Uso: java ServidorUDP <numPuerto>");
            System.exit(1);
        }

        try{
            //numero de puerto
            int puerto = Integer.valueOf(args[0]).intValue();
            dSocket = new DatagramSocket(puerto);
            byte[] mensajeRecibido = new byte[1000];

            while (true) {
                //Recibo y leo datagrama
                DatagramPacket dpRecibido = new DatagramPacket(mensajeRecibido,mensajeRecibido.length);
                dSocket.receive(dpRecibido);
                System.out.println("[Cliente] "+new String(dpRecibido.getData()));
                mensajeRecibido = new byte[1000];

                //Envio el mismo paquete recibido al remitente
                DatagramPacket dpRespuesta = new DatagramPacket(
                        dpRecibido.getData(),dpRecibido.getLength(),dpRecibido.getAddress(),dpRecibido.getPort());
                dSocket.send(dpRespuesta);
            }
        } catch (SocketException e){
            System.out.println("SocketException en main(): "+e);
        } catch (IOException e){
            System.out.println("IOException en main():"+e);
        } finally {
            if (dSocket!=null){
                dSocket.close();
            }
        }
    }
}