import com.sun.net.ssl.internal.ssl.Provider;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.Security;

public class Main {
    static DataInputStream dis ;
    static DataOutputStream dos;
    static Socket sc ;
    InetSocketAddress addr;
    private static JFrame marco;
    private static JPanel panel;
    private static JTextArea textoRecibir;
    private static JTextField textoEscribir;
    private static JButton botonEnviar;
    private static String nombre;
    public static void main(String[] args) throws IOException {
        distribucion();
        InetSocketAddress addr = new InetSocketAddress("127.0.0.1", 5555);
        Socket sc = new Socket();
        sc.connect(addr);
         dis = new DataInputStream(sc.getInputStream());
         dos = new DataOutputStream(sc.getOutputStream());
         nombre =JOptionPane.showInputDialog(dis.readUTF());
        dos.writeUTF(nombre);
        HiloCliente hc = new HiloCliente(dis, dos,textoRecibir,nombre);
        hc.start();
        try {
            hc.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        String nombre="";
//        int c=0;
//        while(c<3) {
//            nombre = JOptionPane.showInputDialog("Indique su nombre: ");
//            InetSocketAddress addr= new InetSocketAddress("127.0.0.1", 5555+c);
//            System.out.println(nombre);
//            Conexion cn = new Conexion(addr);
//            cn.start();
//
//            c++;
//        }
//       ViewManager vm = new ViewManager();
//       vm.distribucion();




    }

    public static void comp() {
        marco = new JFrame("MSN MESSENGER CLIENT");
        panel = new JPanel();
        panel.setLayout(null);
        botonEnviar = new JButton("ENVIAR");



        textoEscribir = new JTextField();
        textoRecibir = new JTextArea();
        panel.setSize(620, 480);
        marco.setSize(620, 480);
    }
    public static void closeWindow(){
        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }
    public static void botones(){
        botonEnviar.setBounds(480,380,80,50);
        panel.add(botonEnviar);
        botonEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {
                    String auxMsg= textoEscribir.getText();
                    if(auxMsg.equalsIgnoreCase("!salir")){
                        sc.close();
                    }
//                cn.setMensajeEvento(auxMsg);

                    dos.writeUTF(nombre+": "+auxMsg);
                    textoRecibir.append(nombre+" :"+auxMsg+"\n");
                    textoEscribir.setText("");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }



    public void mostrarRecibidos(String msg)  {




        textoRecibir.setText("Server: "+msg+"\n");



    }
    public static void distribucion()  {

        comp();
        botones();
        closeWindow();
        textoEscribir.setBounds(2, 380, 420, 50);
        textoRecibir.setBounds(1, 1, 600, 360);
        panel.add(textoEscribir);
        panel.add(textoRecibir);
        marco.add(panel);
//        this.cn = new Conexion();
//        cn.start();
//        cn.establecerConexion();

    }
}