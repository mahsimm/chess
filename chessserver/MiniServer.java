package chessserver;

import java.io.*;
import java.net.Socket;

public class MiniServer implements Runnable{
    Socket sender;
    Socket reciver;
    MiniServer (Socket sender , Socket reciver){
        this.sender = sender;
        this.reciver = reciver;
    }
    @Override
    public void run() {
        while(true){
            try {
                if (sender.isClosed()==true || reciver.isClosed()==true){
                 System.exit(0);
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(sender.getInputStream()));
                PrintWriter printWriter = new PrintWriter(reciver.getOutputStream(),true);
                printWriter.println(bufferedReader.readLine());
            } catch (IOException exception) {
            }
        }
        }
    }
    

