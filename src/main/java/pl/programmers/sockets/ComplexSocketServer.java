package pl.programmers.sockets;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author: Daniel
 */
public class ComplexSocketServer {

    public static void main(String args[]) throws Exception {
        ServerSocket servSocket;
        Socket fromClientSocket;
        int cTosPortNumber = 1777;
        String str;
        ComplexCompany comp;

        servSocket = new ServerSocket(cTosPortNumber);
        System.out.println("Waiting for a connection on " + cTosPortNumber);

        fromClientSocket = servSocket.accept();

        /*ObjectOutputStream oos = new ObjectOutputStream(fromClientSocket.getOutputStream());

        ObjectInputStream ois = new ObjectInputStream(fromClientSocket.getInputStream());

        while ((comp = (ComplexCompany) ois.readObject()) != null) {
            comp.printCompanyObject();

            oos.writeObject("bye bye");
            break;
        }
        oos.close();

        fromClientSocket.close();*/
    }
}