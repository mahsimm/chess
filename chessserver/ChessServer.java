package chessserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChessServer {

    public static void main(String[] args) throws IOException {
        int number = 0;
        Socket playerOne = null;
        Socket playerTwo = null;
        ServerSocket serverSocket = new ServerSocket(2020);
        // accepting two socket untill game start
        while (number != 2) {
            Socket socket = serverSocket.accept();
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
            if (number == 1) {
                System.out.println("Player 2 Join");
                printWriter.println("player2");
                number++;
                playerTwo = socket;
            }
            if (socket != null && number == 0) {
                System.out.println("Player 1 Join");
                printWriter.println("player1");
                number++;
                playerOne = socket;
            }
        }
        PrintWriter printWriter = new PrintWriter(playerOne.getOutputStream(), true);
        printWriter.println("start");
        // Thread for recieve and send player one from two
        Thread playerOneSend = new Thread(new MiniServer(playerOne, playerTwo));
        playerOneSend.start();
        // Thread for recieve and send player two from one
        Thread playerTwoSend = new Thread(new MiniServer(playerTwo, playerOne));
        playerTwoSend.start();
        System.out.println("Game Start.");
    }

}
