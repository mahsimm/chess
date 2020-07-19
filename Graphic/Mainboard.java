/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphic;

import Refrnces.Path;
import Refrnces.User_Info;
import WorkWithFile.WorkWithFile;
import chess.Bishop;
import chess.BishopCheck;
import chess.KingMove;
import chess.KingSituation;
import chess.Knight;
import chess.KnightCheck;
import chess.Mate;
import chess.Pawn;
import chess.PawnCheck;
import chess.Queen;
import chess.QueenCheck;
import chess.Rook;
import chess.RookCheck;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author MASON
 */
public class Mainboard extends javax.swing.JFrame implements ActionListener{

    JFrame f;
    JButton buttons[][];
    
    
    static boolean move = true;
    static boolean check = true;
    static int position1;
    static int position2;
    static boolean click = false;
    static boolean turn = true;
    static Pawn PawnTest;
    static int n = 0;
    static boolean NumberPawn;
    static boolean Controlmove = false;
    static Knight KnightTest;
    static boolean PawnTime = false;
    static boolean KnightTime = false;
    static boolean RookTime = false;
    static Rook RookTest;
    static Bishop BishopTest;
    static boolean BishopTime = false;
    static Queen QueenTest;
    static boolean QueenTime = false;
    static boolean KingTime = false;
    static KingMove kingTest;
    static KingSituation kingSituationTest;
    static boolean KingSituationTime = false;
    static PawnCheck pawnCheckTest;
    static boolean PawnCheckTime = false;
    static RookCheck RookCheckTest;
    static boolean RookCheckTime;
    static KnightCheck KnightCheckTest;
    static boolean KnightCheckTime;
    static BishopCheck BishopCheckTest;
    static boolean BishopCheckTime;
    static QueenCheck QueenCheckTest;
    static boolean QueenCheckTime;
    static Mate ENDGAME;
    static boolean endgame;
    
    
    public void chess() {

        f = new JFrame();
        buttons = new JButton[8][8];

        location = new int[8][8];
        entity = new int[8][8];
        order = new int[8][8];
        maps = new int[8][8];

        for (int i = 0; i < location.length; i++) {
            for (int j = 0; j < location.length; j++) {
                location[i][j] = 0;
                entity[i][j] = 0;
            }
        }

        location[0][0] = 2;
        location[0][1] = 3;
        location[0][2] = 4;
        location[0][3] = 6;
        location[0][4] = 5;
        location[0][5] = 4;
        location[0][6] = 3;
        location[0][7] = 2;

        location[1][0] = 1;
        location[1][1] = 1;
        location[1][2] = 1;
        location[1][3] = 1;
        location[1][4] = 1;
        location[1][5] = 1;
        location[1][6] = 1;
        location[1][7] = 1;

        location[7][0] = 12;
        location[7][1] = 13;
        location[7][2] = 14;
        location[7][3] = 16;
        location[7][4] = 15;
        location[7][5] = 14;
        location[7][6] = 13;
        location[7][7] = 12;

        location[6][0] = 11;
        location[6][1] = 11;
        location[6][2] = 11;
        location[6][3] = 11;
        location[6][4] = 11;
        location[6][5] = 11;
        location[6][6] = 11;
        location[6][7] = 11;

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {

                if (location[i][j] > 0) {
                    entity[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (location[i][j] == 0) {
                    maps[i][j] = 0;
                }

                if (location[i][j] < 10 && location[i][j] > 0) {
                    maps[i][j] = 1;
                }

                if (location[i][j] > 9) {
                    maps[i][j] = 2;
                }
            }
        }
        Color dark = new Color(255, 204, 179);
        Color sefid = new Color(230, 115, 0);

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {

                if (((i + j) % 2) == 0) {
                    buttons[i][j] = new JButton();
                    buttons[i][j].setBackground(dark);
                    f.add(buttons[i][j]);
                }

                if (((i + j) % 2) == 1) {
                    buttons[i][j] = new JButton();
                    buttons[i][j].setBackground(sefid);
                    f.add(buttons[i][j]);
                }

            }
        }
        buttons[7][0].setText("Rook");
        buttons[7][0].setForeground(Color.WHITE);
        buttons[7][0].setFont(new Font("rook", 32, 30));

        buttons[7][1].setText("Knight");
        buttons[7][1].setForeground(Color.WHITE);
        buttons[7][1].setFont(new Font("Knight", 32, 30));

        buttons[7][2].setText("Bishop");
        buttons[7][2].setForeground(Color.WHITE);
        buttons[7][2].setFont(new Font("Bishop", 32, 30));

        buttons[7][3].setText("King");
        buttons[7][3].setForeground(Color.WHITE);
        buttons[7][3].setFont(new Font("King", 32, 30));

        buttons[7][4].setText("Queen");
        buttons[7][4].setForeground(Color.WHITE);
        buttons[7][4].setFont(new Font("Qeen", 32, 30));

        buttons[7][5].setText("Bishop");
        buttons[7][5].setForeground(Color.WHITE);
        buttons[7][5].setFont(new Font("Bishop", 32, 30));

        buttons[7][6].setText("Knight");
        buttons[7][6].setForeground(Color.WHITE);
        buttons[7][6].setFont(new Font("king", 32, 30));

        buttons[7][7].setText("Rook");
        buttons[7][7].setForeground(Color.WHITE);
        buttons[7][7].setFont(new Font("Rook", 32, 30));

        buttons[6][0].setText("Pawn");
        buttons[6][0].setForeground(Color.WHITE);
        buttons[6][0].setFont(new Font("Pawn", 32, 30));

        buttons[6][1].setText("Pawn");
        buttons[6][1].setForeground(Color.WHITE);
        buttons[6][1].setFont(new Font("Pawn", 32, 30));

        buttons[6][2].setText("Pawn");
        buttons[6][2].setForeground(Color.WHITE);
        buttons[6][2].setFont(new Font("Pawn", 32, 30));

        buttons[6][3].setText("Pawn");
        buttons[6][3].setForeground(Color.WHITE);
        buttons[6][3].setFont(new Font("Pawn", 32, 30));

        buttons[6][4].setText("Pawn");
        buttons[6][4].setForeground(Color.WHITE);
        buttons[6][4].setFont(new Font("Pawn", 32, 30));

        buttons[6][5].setText("Pawn");
        buttons[6][5].setForeground(Color.WHITE);
        buttons[6][5].setFont(new Font("Pawn", 32, 30));

        buttons[6][6].setText("Pawn");
        buttons[6][6].setForeground(Color.WHITE);
        buttons[6][6].setFont(new Font("Pawn", 32, 30));

        buttons[6][7].setText("Pawn");
        buttons[6][7].setForeground(Color.WHITE);
        buttons[6][7].setFont(new Font("Pawn", 32, 30));
        buttons[0][0].setText("Rook");
        buttons[0][0].setForeground(Color.DARK_GRAY);
        buttons[0][0].setFont(new Font("rook", 32, 30));

        buttons[0][1].setText("Knight");
        buttons[0][1].setForeground(Color.DARK_GRAY);
        buttons[0][1].setFont(new Font("Knight", 32, 30));

        buttons[0][2].setText("Bishop");
        buttons[0][2].setForeground(Color.DARK_GRAY);
        buttons[0][2].setFont(new Font("Bishop", 32, 30));

        buttons[0][3].setText("King");
        buttons[0][3].setForeground(Color.DARK_GRAY);
        buttons[0][3].setFont(new Font("King", 32, 30));

        buttons[0][4].setText("Queen");
        buttons[0][4].setForeground(Color.DARK_GRAY);
        buttons[0][4].setFont(new Font("Qeen", 32, 30));

        buttons[0][5].setText("Bishop");
        buttons[0][5].setForeground(Color.DARK_GRAY);
        buttons[0][5].setFont(new Font("Bishop", 32, 30));

        buttons[0][6].setText("Knight");
        buttons[0][6].setForeground(Color.DARK_GRAY);
        buttons[0][6].setFont(new Font("king", 32, 30));

        buttons[0][7].setText("Rook");
        buttons[0][7].setForeground(Color.DARK_GRAY);
        buttons[0][7].setFont(new Font("Rook", 32, 30));

        buttons[1][0].setText("Pawn");
        buttons[1][0].setForeground(Color.DARK_GRAY);
        buttons[1][0].setFont(new Font("Pawn", 32, 30));

        buttons[1][1].setText("Pawn");
        buttons[1][1].setForeground(Color.DARK_GRAY);
        buttons[1][1].setFont(new Font("Pawn", 32, 30));

        buttons[1][2].setText("Pawn");
        buttons[1][2].setForeground(Color.DARK_GRAY);
        buttons[1][2].setFont(new Font("Pawn", 32, 30));

        buttons[1][3].setText("Pawn");
        buttons[1][3].setForeground(Color.DARK_GRAY);
        buttons[1][3].setFont(new Font("Pawn", 32, 30));

        buttons[1][4].setText("Pawn");
        buttons[1][4].setForeground(Color.DARK_GRAY);
        buttons[1][4].setFont(new Font("Pawn", 32, 30));

        buttons[1][5].setText("Pawn");
        buttons[1][5].setForeground(Color.DARK_GRAY);
        buttons[1][5].setFont(new Font("Pawn", 32, 30));

        buttons[1][6].setText("Pawn");
        buttons[1][6].setForeground(Color.DARK_GRAY);
        buttons[1][6].setFont(new Font("Pawn", 32, 30));

        buttons[1][7].setText("Pawn");
        buttons[1][7].setForeground(Color.DARK_GRAY);
        buttons[1][7].setFont(new Font("Pawn", 32, 30));

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                buttons[i][j].addActionListener(this);

            }
        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                buttons[i][j].addActionListener(this);
            }
        }

        f.setLayout(new GridLayout(8, 8));
        f.setSize(800, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    static int[][] location;
    static int[][] entity;
    static int[][] order;
    static int[][] maps;
    
    WorkWithFile wwf=new WorkWithFile();
    ArrayList<User_Info> allUsers;
    ArrayList<User_Info> cuUser;
    
    public Mainboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MainBoard");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setText("DASH BOARD");

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setText("Start match");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Edit profile");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("Scoreboard");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("About programmer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fight.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setText("Start game");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel3))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jButton7)))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel3)
                .addGap(59, 59, 59)
                .addComponent(jButton7)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Match", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Last_name");

        jLabel9.setText("Password");

        jLabel10.setText("First_name");

        jButton5.setText("Make change");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jButton5)))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(27, 27, 27)
                .addComponent(jButton5)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Edit Info", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jTextArea1);

        jButton8.setText("SHOW ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jButton8)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButton8)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("ScoreBoard", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("Programmer");

        jTextField1.setText("zahraheydari");

        jLabel4.setText("U.Code");

        jTextField4.setText("98243020");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addComponent(jTextField4))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(404, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("About Programmer", jPanel11);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String f=jTextField2.getText().toString();
        String l=jTextField3.getText().toString();
        String p=jTextField5.getText().toString();
        
        try {
            infoo();
            User_Info user_Info=cuUser.get(0);
            System.err.println(cuUser.get(0).getUser_name());
            User_Info user_Info1=new User_Info(f, l,user_Info.getUser_name(), p, user_Info.getMath_win(), user_Info.getMath_lose());
            cuUser.set(0, user_Info1);
            for (int i = 0; i < allUsers.size(); i++)
            {
                if(allUsers.get(i).getUser_name().equals(user_Info.getUser_name()))
                {
                    allUsers.set(i, user_Info1);
                }
                
            }
           new WorkWithFile().overWrite(new Path().getCupath(), cuUser);
           new WorkWithFile().overWrite(new Path().getMainpath(), allUsers);
           
            for (int i = 0; i < 1; i++) 
            {
                System.out.println(cuUser.get(i).getFirst_name());
                System.out.println(cuUser.get(i).getLast_name());
                System.out.println(cuUser.get(i).getUser_name());
                System.out.println(cuUser.get(i).getPass());
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Mainboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mainboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        chess(); 
        int[][] experiment = new int[8][8];
        experiment[0][0] = 2;
        experiment[0][1] = 3;
        experiment[0][2] = 0;
        experiment[0][3] = 6;
        experiment[0][4] = 5;
        experiment[0][5] = 4;
        experiment[0][6] = 3;
        experiment[0][7] = 2;
        for (int i = 0; i < 8; i++) {
            experiment[1][i] = 1;
        }
        experiment[1][3] = 0;
        for (int i = 0; i < 8; i++) {
            experiment[2][i] = 0;
        }
        experiment[2][3] = 1;
        for (int i = 0; i < 8; i++) {
            experiment[3][i] = 0;
        }
        for (int i = 0; i < 8; i++) {
            experiment[4][i] = 0;
        }
        for (int i = 0; i < 8; i++) {
            experiment[5][i] = 0;
        }
        experiment[5][0] = 11;
        experiment[5][4] = 11;
        for (int i = 0; i < 8; i++) {
            experiment[6][i] = 11;
        }
        experiment[6][0] = 0;
        experiment[6][4] = 0;
        experiment[5][7] = 0;
        experiment[7][0] = 12;
        experiment[7][1] = 13;
        experiment[7][2] = 14;
        experiment[7][3] = 16;
        experiment[7][4] = 15;
        experiment[7][5] = 14;
        experiment[7][6] = 13;
        experiment[7][7] = 12;
        experiment[3][7] = 4;

        int[][] maps1 = new int[8][8];
        int[][] entiry1 = new int[8][8];
        for (int i = 0; i < entiry1.length; i++) {
            for (int j = 0; j < entiry1.length; j++) {
                if (experiment[i][j] > 10) {
                    maps1[i][j] = 2;
                    entiry1[i][j] = 1;
                }
                if (experiment[i][j] < 10) {
                    maps1[i][j] = 1;
                    entiry1[i][j] = 1;
                }
                if (experiment[i][j] == 0) {
                    maps1[i][j] = 0;
                    entiry1[i][j] = 0;
                }

            }
        }

        RookCheckTest = new RookCheck(5, 7, entiry1, true, maps1, experiment);
        int[][] test = new int[8][8];
        test = RookCheckTest.information();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(experiment[i][j] + " ");
            }
            System.out.println("");
        }
        kingSituationTest = new KingSituation(7, 3, true, maps1, experiment);
        boolean test1 = kingSituationTest.information();
        System.out.print(test1);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            // TODO add your handling code here:
            infoo();
            int score []=new int[allUsers.size()];
            for (int i = 0; i < score.length; i++) 
            {
                score[i]=allUsers.get(i).getMath_win();
            }
            
                    
            
            for (int i = 0; i < score.length-1; i++) 
            {
                for (int j = 0; j < score.length-1; j++) 
                {
                    if(score[j]>score[j+1])
                    {
                    int temp=score[j];
                    score[j]=score[j+1];
                    score[j+1]=temp;
                    }
                }
            }
            
            String temp=null;
            
            for (int i = 0; i < score.length; i++) 
            {
                temp=score[i]+"\n";
                
            }
            
            jTextArea1.setText(temp);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Mainboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Mainboard.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mainboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
 public void infoo() throws IOException, ClassNotFoundException
     {
          
        try {
            allUsers=wwf.showallmem(new Path().getMainpath());
            cuUser=wwf.showallmem(new Path().getCupath());
            
            System.out.println(cuUser.get(0).getUser_name()+"555555555");
  
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
        
     }

   @Override
    public void actionPerformed(ActionEvent evt) {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 11 && click == false && turn == true && KingSituationTime == false) {

                    position1 = i;
                    position2 = j;

                    if (position1 != 6) {
                        NumberPawn = false;
                    } else {
                        NumberPawn = true;
                    }
                    check = true;
                    PawnTest = new Pawn(position1, position2, entity, check, NumberPawn, maps);
                    order = PawnTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[i][j].setText("");
                        click = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;

                        move = true;
                        turn = false;
                        PawnTime = true;
                        n = 1;

                    }

                    Controlmove = false;

                }
            }
        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && PawnTime == true) {

                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("pawn");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Pawn", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 11;
                    maps[position1][position2] = 2;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 6) {

                                kingSituationTest = new KingSituation(k, l, false, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    click = false;
                    move = false;
                    PawnTime = false;

                    n = 0;
                }
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 1 && click == false && turn == false && KingSituationTime == false) {

                    position1 = i;
                    position2 = j;

                    if (position1 != 1) {
                        NumberPawn = false;
                    } else {
                        NumberPawn = true;
                    }
                    check = false;

                    PawnTest = new Pawn(position1, position2, entity, check, NumberPawn, maps);
                    order = PawnTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }
                    if (Controlmove == true) {
                        buttons[i][j].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        PawnTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;

                        n = 2;
                    }
                }
                Controlmove = false;

            }
        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && PawnTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Pawn", 32, 30));
                    buttons[position1][position2].setText("pawn");

                    entity[position1][position2] = 1;
                    location[position1][position2] = 1;
                    maps[position1][position2] = 1;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                kingSituationTest = new KingSituation(k, l, true, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    PawnTime = false;
                    click = false;
                    move = false;
                    n = 0;
                }
            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 13 && turn == true && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = true;
                    KnightTest = new Knight(position1, position2, entity, check, maps);
                    order = KnightTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }
                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = false;
                        KnightTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 1;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && KnightTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Knight");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Knight", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 13;
                    maps[position1][position2] = 2;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 6) {

                                kingSituationTest = new KingSituation(k, l, false, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    KnightTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 3 && turn == false && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    KnightTest = new Knight(position1, position2, entity, check, maps);
                    order = KnightTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }
                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        KnightTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 2;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && KnightTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Knight");
                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Knight", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 3;
                    maps[position1][position2] = 1;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                kingSituationTest = new KingSituation(k, l, true, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    KnightTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 12 && turn == true && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = true;
                    RookTest = new Rook(position1, position2, entity, check, maps);
                    order = RookTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = false;
                        RookTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 1;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && RookTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Rook");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Rook", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 12;
                    maps[position1][position2] = 2;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 6) {

                                kingSituationTest = new KingSituation(k, l, false, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    RookTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 2 && turn == false && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    RookTest = new Rook(position1, position2, entity, check, maps);
                    order = RookTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        RookTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 2;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && RookTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Rook");
                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Rook", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 2;
                    maps[position1][position2] = 1;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                kingSituationTest = new KingSituation(k, l, true, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    RookTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 14 && turn == true && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = true;
                    BishopTest = new Bishop(position1, position2, check, maps);
                    order = BishopTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = false;
                        BishopTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 1;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && BishopTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Bishop");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Bishop", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 14;
                    maps[position1][position2] = 2;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 6) {

                                kingSituationTest = new KingSituation(k, l, false, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    BishopTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 4 && turn == false && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    BishopTest = new Bishop(position1, position2, check, maps);
                    order = BishopTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        BishopTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 2;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && BishopTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Bishop");
                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Bishop", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 4;
                    maps[position1][position2] = 1;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                kingSituationTest = new KingSituation(k, l, true, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    BishopTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 15 && turn == true && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = true;
                    QueenTest = new Queen(position1, position2, entity, check, maps);
                    order = QueenTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = false;
                        QueenTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 1;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && QueenTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Queen");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Queen", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 15;
                    maps[position1][position2] = 2;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 6) {

                                kingSituationTest = new KingSituation(k, l, false, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    QueenTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 5 && turn == false && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    QueenTest = new Queen(position1, position2, entity, check, maps);
                    order = QueenTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        QueenTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 2;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && QueenTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Queen");
                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Queen", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 5;
                    maps[position1][position2] = 1;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                kingSituationTest = new KingSituation(k, l, true, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    QueenTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 16 && turn == true && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = true;
                    kingTest = new KingMove(position1, position2, entity, check, maps, location);
                    order = kingTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = false;
                        KingTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 1;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && KingTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("King");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("King", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 16;
                    maps[position1][position2] = 2;

                    KingTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 6 && turn == false && click == false) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    kingTest = new KingMove(position1, position2, entity, check, maps, location);
                    order = kingTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        KingTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 2;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && KingTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("King");
                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("King", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 6;
                    maps[position1][position2] = 1;

                    KingTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 11 && click == false && turn == true && KingSituationTime == true) {

                    position1 = i;
                    position2 = j;

                    if (position1 != 6) {
                        NumberPawn = false;
                    } else {
                        NumberPawn = true;
                    }

                    check = true;
                    pawnCheckTest = new PawnCheck(position1, position2, entity, check, NumberPawn, maps, location);
                    order = pawnCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[i][j].setText("");
                        click = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;

                        move = true;
                        turn = false;
                        PawnCheckTime = true;
                        n = 1;

                    }

                    Controlmove = false;

                }
            }
        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && PawnCheckTime == true) {

                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("pawn");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Pawn", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 11;
                    maps[position1][position2] = 2;

                    KingSituationTime = false;

                    click = false;
                    move = false;
                    PawnTime = false;

                    n = 0;
                }
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 1 && click == false && turn == false && KingSituationTime == true) {

                    position1 = i;
                    position2 = j;

                    if (position1 != 1) {
                        NumberPawn = false;
                    } else {
                        NumberPawn = true;
                    }
                    check = false;
                    pawnCheckTest = new PawnCheck(position1, position2, entity, check, NumberPawn, maps, location);
                    order = pawnCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }
                    if (Controlmove == true) {
                        buttons[i][j].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        PawnCheckTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;

                        n = 2;
                    }
                }
                Controlmove = false;

            }
        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && PawnCheckTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Pawn", 32, 30));
                    buttons[position1][position2].setText("pawn");

                    entity[position1][position2] = 1;
                    location[position1][position2] = 1;
                    maps[position1][position2] = 1;

                    KingSituationTime = false;

                    PawnTime = false;
                    click = false;
                    move = false;
                    n = 0;
                }
            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 12 && turn == true && click == false && KingSituationTime == true) {
                    position1 = i;
                    position2 = j;

                    check = true;
                    RookCheckTest = new RookCheck(position1, position2, entity, check, maps, location);
                    order = RookCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = false;
                        RookCheckTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 1;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && RookCheckTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Rook");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Rook", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 12;
                    maps[position1][position2] = 2;

                    KingSituationTime = false;
                    RookCheckTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 2 && turn == false && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    RookCheckTest = new RookCheck(position1, position2, entity, check, maps, location);
                    order = RookCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        RookCheckTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 2;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && RookCheckTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Rook");
                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Rook", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 2;
                    maps[position1][position2] = 1;

                    KingSituationTime = false;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                kingSituationTest = new KingSituation(k, l, true, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    RookCheckTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 13 && turn == true && click == false && KingSituationTime == true) {

                    position1 = i;
                    position2 = j;

                    check = true;
                    KnightCheckTest = new KnightCheck(position1, position2, entity, check, maps, location);
                    order = KnightCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = false;
                        KnightCheckTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 1;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && KnightCheckTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Knight");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Knight", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 13;
                    maps[position1][position2] = 2;

                    KingSituationTime = false;
                    KnightCheckTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 3 && turn == false && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    KnightCheckTest = new KnightCheck(position1, position2, entity, check, maps, location);
                    order = KnightCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        KnightCheckTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 2;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && KnightCheckTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Rook");
                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Rook", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 3;
                    maps[position1][position2] = 1;

                    KingSituationTime = false;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                kingSituationTest = new KingSituation(k, l, true, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    KnightCheckTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 14 && turn == true && click == false && KingSituationTime == true) {

                    position1 = i;
                    position2 = j;

                    check = true;
                    BishopCheckTest = new BishopCheck(position1, position2, check, maps, location);
                    order = BishopCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = false;
                        BishopCheckTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 1;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && BishopCheckTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Bishop");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Bishop", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 14;
                    maps[position1][position2] = 2;

                    KingSituationTime = false;
                    BishopCheckTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 4 && turn == false && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    BishopCheckTest = new BishopCheck(position1, position2, check, maps, location);
                    order = BishopCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        BishopCheckTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 2;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && BishopCheckTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Bishop");
                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Bishop", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 4;
                    maps[position1][position2] = 1;

                    KingSituationTime = false;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                kingSituationTest = new KingSituation(k, l, true, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    BishopCheckTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 15 && turn == true && click == false && KingSituationTime == true) {

                    position1 = i;
                    position2 = j;

                    check = true;
                    QueenCheckTest = new QueenCheck(position1, position2, entity, check, maps, location);
                    order = QueenCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = false;
                        QueenCheckTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 1;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 1 && QueenCheckTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Queen");
                    buttons[position1][position2].setForeground(Color.WHITE);
                    buttons[position1][position2].setFont(new Font("Queen", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 15;
                    maps[position1][position2] = 2;

                    KingSituationTime = false;
                    QueenCheckTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && location[i][j] == 5 && turn == false && click == false && KingSituationTime == false) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    QueenCheckTest = new QueenCheck(position1, position2, entity, check, maps, location);
                    order = QueenCheckTest.information();

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {
                            if (order[k][l] > 0) {
                                Controlmove = true;
                            }
                        }
                    }

                    if (Controlmove == true) {
                        buttons[position1][position2].setText("");

                        click = true;
                        move = true;
                        turn = true;
                        QueenCheckTime = true;

                        entity[position1][position2] = 0;
                        location[position1][position2] = 0;
                        maps[position1][position2] = 0;
                        n = 2;
                    }

                }
                Controlmove = false;
            }

        }
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if (evt.getSource() == buttons[i][j] && order[i][j] == 1 && move == true && n == 2 && QueenCheckTime == true) {
                    position1 = i;
                    position2 = j;

                    buttons[position1][position2].setText("Queen");
                    buttons[position1][position2].setForeground(Color.DARK_GRAY);
                    buttons[position1][position2].setFont(new Font("Queen", 32, 30));

                    entity[position1][position2] = 1;
                    location[position1][position2] = 5;
                    maps[position1][position2] = 1;

                    KingSituationTime = false;

                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < 8; l++) {

                            if (location[k][l] == 16) {

                                kingSituationTest = new KingSituation(k, l, true, maps, location);
                                KingSituationTime = kingSituationTest.information();

                            }

                        }
                    }

                    QueenCheckTime = false;
                    click = false;
                    move = false;

                    n = 0;
                }

            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if ( location[i][j] == 16 && KingSituationTime == true) {
                    position1 = i;
                    position2 = j;

                    check = true;
                     ENDGAME = new Mate(position1, position2, entity, check, maps, location);
                    endgame = ENDGAME.information();

                  if(endgame== false){
                    JOptionPane.showMessageDialog(null,"ENDGAME");                  
                  }
                    
                }
    
            }

        }

        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons.length; j++) {
                if ( location[i][j] == 6 && KingSituationTime==true) {
                    position1 = i;
                    position2 = j;

                    check = false;
                    kingTest = new KingMove(position1, position2, entity, check, maps, location);
                    order = kingTest.information();


                    if(endgame== false){
                    JOptionPane.showMessageDialog(null,"ENDGAME");
                    }

                }
     
            }

        }
        System.out.println(position1+" "+position2);

    }

}
