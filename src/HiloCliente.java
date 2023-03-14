import javax.swing.*;
import java.io.*;

public class HiloCliente extends Thread{
    private DataInputStream dis;
    private DataOutputStream dos;

    private  JTextArea textoRecibir;
    private String nombre;
    public HiloCliente(DataInputStream dis, DataOutputStream dos, JTextArea textoRecibir, String nombre) {
        this.dis = dis;
        this.dos = dos;
        this.textoRecibir=textoRecibir;
        this.nombre=nombre;
    }

    @Override
    public void run(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while(true){
            try {

                String msg=dis.readUTF();

                textoRecibir.append("Servidor: "+msg+"\n");



            } catch (IOException e) {
                throw new RuntimeException(e);
            }



        }
    }
}
