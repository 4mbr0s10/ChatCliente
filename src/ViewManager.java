//import javax.swing.*;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.IOException;
//import java.io.DataInputStream;
//import java.io.DataOutputStream;
//
//public class ViewManager {
//    private JFrame marco;
//    private JPanel panel;
//    private JTextArea textoRecibir;
//    private JTextField textoEscribir;
//    private JButton botonEnviar;
//
//    Conexion cn;
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
//public void closeWindow(){
//    marco.setLocationRelativeTo(marco);
//    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    marco.setVisible(true);
//}
//public void botones(){
//botonEnviar.setBounds(480,380,80,50);
//panel.add(botonEnviar);
//botonEnviar.addActionListener(new ActionListener() {
//    @Override
//    public void actionPerformed(ActionEvent actionEvent) {
//
//        try {
//                String auxMsg= textoEscribir.getText();
////                cn.setMensajeEvento(auxMsg);
//
//                cn.getDos().writeUTF(auxMsg);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//    }
//});
//}
//
//
//
//public void mostrarRecibidos(String msg)  {
//
//
//
//
//        textoRecibir.setText("Server: "+msg+"\n");
//
//
//
//}
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
//        this.cn = new Conexion();
////        cn.start();
////        cn.establecerConexion();
//
//    }
//
//
//}
