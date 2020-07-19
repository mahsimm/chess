/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import Graphic.Sign_in;
import Graphic.Sing_up;
import Refrnces.Path;
import Refrnces.User_Info;
import WorkWithFile.WorkWithFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.awt.windows.WWindowPeer;

/**
 *
 * @author MASON
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
      new Sign_in().setVisible(true);
      
    }
    
}
