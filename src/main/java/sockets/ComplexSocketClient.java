package sockets;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Author: Daniel
 */
public class ComplexSocketClient {

    public static void main(String args[]) throws Exception {
        Socket socket1;
        int portNumber = 1777;
        String str = "";

        socket1 = new Socket(InetAddress.getLocalHost(), portNumber);

        ObjectInputStream ois = new ObjectInputStream(socket1.getInputStream());

        ObjectOutputStream oos = new ObjectOutputStream(socket1.getOutputStream());

        ComplexCompany comp = new ComplexCompany("A");
        ComplexEmployee emp0 = new ComplexEmployee("B", 1000);
        comp.addPresident(emp0);

        ComplexCompany com1 = new ComplexCompany("C");
        ComplexEmployee emp1 = new ComplexEmployee("D", 1000);
        com1.addPresident(emp1);

        oos.writeObject(comp);
//        oos.reset();
        oos.writeObject(com1);

        while ((str = (String) ois.readObject()) != null) {
            System.out.println(str);
            oos.writeObject("bye");

            if (str.equals("bye"))
                break;
        }

        ois.close();
        oos.close();
        socket1.close();
    }

}