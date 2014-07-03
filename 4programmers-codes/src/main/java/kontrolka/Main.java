package kontrolka;//package kontrolka;
//
///**
// * Author: Daniel
// */
//import java.util.Timer;
//import java.io.*;
//import java.net.*;
//import java.awt.*;
//import java.awt.geom.*;
//
//
//
//public class Main extends javax.swing.JFrame {
//
//    Timer _timer;
//    Socket _mySocket;
//    Sender _sender;
//    Listener _listener;
//
//    public GUI()
//    {
//        initComponents();
//        initTextField();
//        _timer= new Timer();
//        _mySocket=new Socket();
//        _listener=new Listener(this);
//        _sender= new Sender(this);
//
//
//    }
//
//    public void UpdateTextField1(String value)
//    {
//        jTextField1.setText(value);
//    }
//    public void UpdateTextField2(String value)
//    {
//        jTextField2.setText(value);
//    }
//    public void UpdateTextField3(String value)
//    {
//        jTextField3.setText(value);
//    }
//    public void UpdateTextField4(String value)
//    {
//        jTextField4.setText(value);
//    }
//    public void UpdateTextField5(String value)
//    {
//        jTextField5.setText(value);
//    }
//    public void EnableButton()
//    {
//        jButton2.setEnabled(true);
//    }
//    private void initTextField()
//    {
//        jTextField1.setEditable(false);
//        jTextField2.setEditable(false);
//        jTextField3.setEditable(false);
//        jTextField4.setEditable(false);
//        jTextField5.setEditable(false);
//
//        jTextField1.setText("0");
//        jTextField2.setText("0");
//        jTextField3.setText("0");
//        jTextField4.setText("0");
//        jTextField5.setText("0");
//
//
//    }
//    @Override
//    public void paint(Graphics g) {
//
//
//        Graphics2D g2d = (Graphics2D) g;
//        Ellipse2D.Double circle = new Ellipse2D.Double();
//        g2d.setColor(getBackground());
//        circle.width = 50;
//        circle.height = 50;
//        circle.x = 140;
//        circle.y = 140;
//        g2d.draw(circle);
//        g2d.setColor(Color.green);
//        g2d.fill(circle);
//        g2d.setStroke(new BasicStroke(2));
//        g2d.setColor(Color.black);
//        g2d.draw(circle);
//        g2d.setPaintMode();
//
//
//
//
//    }
//
//
//    public void CloseApp()
//    {
//        _timer.cancel();
//
//        if(_mySocket.isConnected())
//        {
//            try {
//                _mySocket.close();
//            }
//            catch (IOException ex) {}
//
//        }
//        _timer.purge();
//
//        if(_listener._thread!=null)
//        {
//            _listener._thread.stop();
//
//        }
//        this.dispose();
//
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="Generated Code">
//    private void initComponents() {
//
//        jButton1 = new javax.swing.JButton();
//        jButton2 = new javax.swing.JButton();
//        jTextField1 = new javax.swing.JTextField();
//        jTextField2 = new javax.swing.JTextField();
//        jTextField3 = new javax.swing.JTextField();
//        jTextField4 = new javax.swing.JTextField();
//        jTextField5 = new javax.swing.JTextField();
//        jLabel1 = new javax.swing.JLabel();
//        jLabel2 = new javax.swing.JLabel();
//        jLabel3 = new javax.swing.JLabel();
//        jLabel4 = new javax.swing.JLabel();
//        jLabel5 = new javax.swing.JLabel();
//
//        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//        addWindowListener(new java.awt.event.WindowAdapter() {
//            public void windowClosing(java.awt.event.WindowEvent evt) {
//                formWindowClosing(evt);
//            }
//        });
//
//        jButton1.setText("Zamknij");
//        jButton1.setName("_close"); // NOI18N
//        jButton1.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton1ActionPerformed(evt);
//            }
//        });
//
//        jButton2.setText("Połącz");
//        jButton2.setName("_open"); // NOI18N
//        jButton2.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jButton2ActionPerformed(evt);
//            }
//        });
//
//        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//
//        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//
//        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//
//        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//
//        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//
//        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//        jLabel1.setText("Czystość azotu [%]");
//
//        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//        jLabel2.setText("Przepływ azotu [m3/h]");
//
//        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//        jLabel3.setText("Ciśnienie azotu [bar]");
//
//        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//        jLabel4.setText("Temperatura azotu [C]");
//
//        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
//        jLabel5.setText("Przepływ dobowy [m3/24h]");
//
//        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addGap(258, 258, 258)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                                        .addComponent(jLabel3)
//                                                        .addComponent(jLabel2)
//                                                        .addComponent(jLabel4)
//                                                        .addComponent(jLabel5)
//                                                        .addComponent(jLabel1))
//                                                .addGap(69, 69, 69)
//                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                                        .addGroup(layout.createSequentialGroup()
//                                                .addGap(67, 67, 67)
//                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                                .addGap(60, 60, 60)
//                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
//                                .addContainerGap(208, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//                        .addGroup(layout.createSequentialGroup()
//                                .addContainerGap(129, Short.MAX_VALUE)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(jLabel1)
//                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGap(37, 37, 37)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(jLabel3)
//                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGap(32, 32, 32)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(jLabel2))
//                                .addGap(33, 33, 33)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(jLabel4)
//                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGap(32, 32, 32)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGap(47, 47, 47)
//                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
//                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
//                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
//                                .addGap(32, 32, 32))
//        );
//
//        pack();
//    }// </editor-fold>
//    //-------------------------Połącz---------------------------------
//    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
//
//        jButton2.setEnabled(false);
//        _timer.schedule(_sender, 0,200);//wysyłaj zapytanie co 2 sekundy
//    }
//    //------------------------Zamknij---------------------
//    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
//
//        CloseApp();
//    }
//
//    private void formWindowClosing(java.awt.event.WindowEvent evt) {
//        CloseApp();
//    }
//
//
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Modbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Modbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Modbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Modbus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI().setVisible(true);
//            }
//        });
//    }
//
//    // Variables declaration - do not modify
//    private javax.swing.JButton jButton1;
//    private javax.swing.JButton jButton2;
//    private javax.swing.JLabel jLabel1;
//    private javax.swing.JLabel jLabel2;
//    private javax.swing.JLabel jLabel3;
//    private javax.swing.JLabel jLabel4;
//    private javax.swing.JLabel jLabel5;
//    private javax.swing.JTextField jTextField1;
//    private javax.swing.JTextField jTextField2;
//    private javax.swing.JTextField jTextField3;
//    private javax.swing.JTextField jTextField4;
//    private javax.swing.JTextField jTextField5;
//    // End of variables declaration
//}
//
//Klasa Listener gdzie jest aktualizacja textfieldów:
//
//        mport java.io.*;
//        import java.net.*;
//
//public class Listener implements Runnable {
//
//    private final byte[] _buforIn=new byte[40];
//
//    Thread _thread;
//    InputStream _inputStream;
//    DataInputStream _dataInputStream;
//    Socket _mySocket;
//    GUI _gui;
//
//    int _temp1=0;
//    int _temp2=0;
//    int _temp3=0;
//    int _temp4=0;
//    int _temp5=0;
//
//
//    Listener(GUI gui)
//    {
//        this._mySocket=gui._mySocket;
//        this._gui=gui;
//        _thread=new Thread(this,"Communication");
//        _thread.start();
//
//    }
//
//    public void run()
//    {
//        while(true)
//        {
//
//            try
//            {
//                Thread.sleep(100);
//
//                if(_mySocket.isConnected())
//                {
//                    _inputStream=_mySocket.getInputStream();
//                    _dataInputStream=new DataInputStream(_inputStream);
//                }
//                else
//                {
//                    ClearTextFields();
//                    continue;
//                }
//                _dataInputStream.read(_buforIn, 0, _buforIn.length);
//
//
//            }
//            catch(Exception ex)
//            {
//                ClearTextFields();
//                continue;
//            }
//
//            if(_buforIn[10]==0x01)//on/off
//            {
//                int  firstByte=0;
//                int  secondByte=0;
//
//                firstByte = (0x000000FF & ((int)_buforIn[11]));
//                secondByte = (0x000000FF & ((int)_buforIn[12]));
//                _temp1=(int)(firstByte << 8 | secondByte);
//                _gui.UpdateTextField2(String.valueOf(_temp1));
//                firstByte=0;
//                secondByte=0;
//
//
//
//                firstByte = (0x000000FF & ((int)_buforIn[13]));
//                secondByte = (0x000000FF & ((int)_buforIn[14]));
//                _temp2=(int)(firstByte << 8 | secondByte);
//                _gui.UpdateTextField5(String.valueOf(_temp2));
//                firstByte=0;
//                secondByte=0;
//
//
//
//                firstByte = (0x000000FF & ((int)_buforIn[15]));
//                secondByte = (0x000000FF & ((int)_buforIn[16]));
//                _temp3=(int)(firstByte << 8 | secondByte);
//                _gui.UpdateTextField1(String.valueOf((float)_temp3/10).replace(".", ","));
//                firstByte=0;
//                secondByte=0;
//
//
//
//                secondByte = (0x000000FF & ((int)_buforIn[18]));
//                _temp4=(int)(secondByte);
//                _gui.UpdateTextField3(String.valueOf((float)_temp4/10).replace(".", ","));
//                secondByte=0;
//
//                //------------temperatura azotu ----------------
//                firstByte = (0x000000FF & ((int)_buforIn[19]));
//                secondByte = (0x000000FF & ((int)_buforIn[20]));
//                _temp5=(int)(firstByte << 8 | secondByte);
//                _gui.UpdateTextField4(String.valueOf((float)_temp5/10).replace(".", ","));
//                firstByte=0;
//                secondByte=0;
//
//            }
//
//            for(byte i:_buforIn) i=0;
//        }
//    }
//    private void ClearTextFields()
//    {
//        _gui.UpdateTextField1("0");
//        _gui.UpdateTextField2("0");
//        _gui.UpdateTextField3("0");
//        _gui.UpdateTextField4("0");
//        _gui.UpdateTextField5("0");
//
//    }
//}