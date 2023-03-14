//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.net.InetSocketAddress;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class Conexion extends Thread {
//    DataInputStream dis ;
//    DataOutputStream dos;
//    Socket sc ;
//    InetSocketAddress addr;
//
//    String mensajeEvento;
//    private JFrame marco;
//    private JPanel panel;
//    private JTextArea textoRecibir;
//    private JTextField textoEscribir;
//    private JButton botonEnviar;
//    private String nombre;
//    private int puerto;
//    public Conexion(InetSocketAddress addr) {
//        this.nombre=nombre;
//        this.puerto=5555;
//        this.sc= new Socket();
//
//        this.addr=addr;
//        try {
//            this.sc.connect(addr);
//            this.dis = new DataInputStream(sc.getInputStream());
//            this.dos = new DataOutputStream(sc.getOutputStream());
//            dos.writeUTF(nombre);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//}
////public void establecerConexion(){
//
//
//
//
//
////        this.sc.connect(this.addr);
////        this.dis = new DataInputStream(sc.getInputStream());
////        this.dos = new DataOutputStream(sc.getOutputStream());
////        String mensajito = "hola buenas";
////        dos.writeUTF(mensajito);
////        HiloCliente hc = new HiloCliente(dis);
////        hc.start();
////        hc.join();
//
//
////
////}
//    @Override
//    public void run(){
//        distribucion();
//        textoRecibir.append("(comando !salir para desconectarse) \n");
////        ViewManager vm= new ViewManager();
////vm.distribucion();
////        while(true){
////            System.out.println("Conectado al servidor");
////            try {
////                this.sc.connect(this.addr);
////                System.out.println("Conectado al servidor");
////                this.dis = new DataInputStream(sc.getInputStream());
////                this.dos = new DataOutputStream(sc.getOutputStream());
////
////            } catch (IOException e) {
////                throw new RuntimeException(e);
////            }
//        while(true){
//            try {
//
//                String msg=dis.readUTF();
//
//              textoRecibir.append("Servidor: "+msg+"\n");
//
//
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//        }
//    public void comp() {
//        marco = new JFrame("MSN MESSENGER CLIENT");
//        panel = new JPanel();
//        panel.setLayout(null);
//        botonEnviar = new JButton("ENVIAR");
//
//
//
//        textoEscribir = new JTextField();
//        textoRecibir = new JTextArea();
//        panel.setSize(620, 480);
//        marco.setSize(620, 480);
//    }
//    public void closeWindow(){
//        marco.setLocationRelativeTo(marco);
//        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        marco.setVisible(true);
//    }
//    public void botones(){
//        botonEnviar.setBounds(480,380,80,50);
//        panel.add(botonEnviar);
//        botonEnviar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//
//                try {
//                    String auxMsg= textoEscribir.getText();
//                    if(auxMsg.equalsIgnoreCase("!salir")){
//                        sc.close();
//                    }
////                cn.setMensajeEvento(auxMsg);
//
//                    dos.writeUTF(nombre+": "+auxMsg);
//                    textoRecibir.append(nombre+" :"+auxMsg+"\n");
//                    textoEscribir.setText("");
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        });
//    }
//
//
//
//    public void mostrarRecibidos(String msg)  {
//
//
//
//
//        textoRecibir.setText("Server: "+msg+"\n");
//
//
//
//    }
//    public void distribucion()  {
//
//        this.comp();
//        this.botones();
//        this.closeWindow();
//        textoEscribir.setBounds(2, 380, 420, 50);
//        textoRecibir.setBounds(1, 1, 600, 360);
//        panel.add(textoEscribir);
//        panel.add(textoRecibir);
//        marco.add(panel);
////        this.cn = new Conexion();
////        cn.start();
////        cn.establecerConexion();
//
//    }
//
//
//    public DataInputStream getDis() {
//        return dis;
//    }
//
//    public void setDis(DataInputStream dis) {
//        this.dis = dis;
//    }
//
//    public DataOutputStream getDos() {
//        return dos;
//    }
//
//    public void setDos(DataOutputStream dos) {
//        this.dos = dos;
//    }
//
//    public String getMensajeEvento() {
//        return mensajeEvento;
//    }
//
//    public void setMensajeEvento(String mensajeEvento) {
//        this.mensajeEvento = mensajeEvento;
//    }
//
//
//
//}
