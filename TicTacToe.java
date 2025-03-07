/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sazim
 */
public class TicTacToe extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    public TicTacToe() {
        initComponents();
        //setSize(1400,800);
       // setLocationRelativeTo(null);
    }
    
    private void gameScore()
    {
        jblplayerX.setText(String.valueOf(xCount));
        jblplayerO.setText(String.valueOf(oCount));
    }
    
    private void Choose_a_Player()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    private void winnigGame()
    {
        String b1 = jbtntic1.getText();
        String b2 = jbtntic2.getText();
        String b3 = jbtntic3.getText();
        String b4 = jbtntic4.getText();
        String b5 = jbtntic5.getText();
        String b6 = jbtntic6.getText();
        String b7 = jbtntic7.getText();
        String b8 = jbtntic8.getText();
        String b9 = jbtntic9.getText();
        
        //For player X start
        //horijontal start
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic1.setBackground(Color.YELLOW);
            jbtntic2.setBackground(Color.YELLOW);
            jbtntic3.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
        }
        
        if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic4.setBackground(Color.CYAN);
            jbtntic5.setBackground(Color.CYAN);
            jbtntic6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic7.setBackground(Color.GREEN);
            jbtntic8.setBackground(Color.GREEN);
            jbtntic9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
        }
        //horijontal end
        
        //vertical start
        if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic1.setBackground(Color.MAGENTA);
            jbtntic4.setBackground(Color.MAGENTA);
            jbtntic7.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
        }
        
        if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic2.setBackground(Color.PINK);
            jbtntic5.setBackground(Color.PINK);
            jbtntic8.setBackground(Color.PINK);
            xCount++;
            gameScore();
        }
        
        if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic3.setBackground(Color.MAGENTA);
            jbtntic6.setBackground(Color.MAGENTA);
            jbtntic9.setBackground(Color.MAGENTA);
            xCount++;
            gameScore();
        }
        //vertical end
        
        //cross start
        if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic1.setBackground(Color.PINK);
            jbtntic5.setBackground(Color.PINK);
            jbtntic9.setBackground(Color.PINK);
            xCount++;
            gameScore();
        }
        if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic3.setBackground(Color.CYAN);
            jbtntic5.setBackground(Color.CYAN);
            jbtntic7.setBackground(Color.CYAN);
            xCount++;
            gameScore();
        }
        //cross END 
        //For player X End
        
        //For player O start
        //horijontal start
        if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic1.setBackground(Color.PINK);
            jbtntic2.setBackground(Color.PINK);
            jbtntic3.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        
        if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic4.setBackground(Color.YELLOW);
            jbtntic5.setBackground(Color.YELLOW);
            jbtntic6.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic7.setBackground(Color.MAGENTA);
            jbtntic8.setBackground(Color.MAGENTA);
            jbtntic9.setBackground(Color.MAGENTA);
            oCount++;
            gameScore();
        }
        //horijontal end
        
        //vertical start
        if(b1  == ("O") && b4 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic1.setBackground(Color.MAGENTA);
            jbtntic4.setBackground(Color.MAGENTA);
            jbtntic7.setBackground(Color.MAGENTA);
            oCount++;
            gameScore();
        }
        
        if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic2.setBackground(Color.PINK);
            jbtntic5.setBackground(Color.PINK);
            jbtntic8.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        
        if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic3.setBackground(Color.PINK);
            jbtntic6.setBackground(Color.PINK);
            jbtntic9.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        //vertical end
        
        //cross start
        if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic1.setBackground(Color.PINK);
            jbtntic5.setBackground(Color.PINK);
            jbtntic9.setBackground(Color.PINK);
            oCount++;
            gameScore();
        }
        if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            jbtntic3.setBackground(Color.RED);
            jbtntic5.setBackground(Color.RED);
            jbtntic7.setBackground(Color.RED);
            oCount++;
            gameScore();
        }
        //cross END 
        //For player O End
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
        jPanel4 = new javax.swing.JPanel();
        jbtntic9 = new javax.swing.JButton();
        jbtntic7 = new javax.swing.JButton();
        jbtntic8 = new javax.swing.JButton();
        jbtntic6 = new javax.swing.JButton();
        jbtntic5 = new javax.swing.JButton();
        jbtntic4 = new javax.swing.JButton();
        jbtntic2 = new javax.swing.JButton();
        jbtntic1 = new javax.swing.JButton();
        jbtntic3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jblplayerX = new javax.swing.JLabel();
        jblplayerO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jbtnexit = new javax.swing.JButton();
        jbtnnewgame = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtntic9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtntic9.setToolTipText("");
        jbtntic9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntic9.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtntic9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntic9ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtntic9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 200, 190));

        jbtntic7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtntic7.setToolTipText("");
        jbtntic7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntic7.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtntic7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntic7ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtntic7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 200, 190));

        jbtntic8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtntic8.setToolTipText("");
        jbtntic8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntic8.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtntic8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntic8ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtntic8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 190, 190));

        jbtntic6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtntic6.setToolTipText("");
        jbtntic6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntic6.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtntic6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntic6ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtntic6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 200, 190));

        jbtntic5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtntic5.setToolTipText("");
        jbtntic5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntic5.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtntic5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntic5ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtntic5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 190, 190));

        jbtntic4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtntic4.setToolTipText("");
        jbtntic4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntic4.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtntic4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntic4ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtntic4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, 190));

        jbtntic2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtntic2.setToolTipText("");
        jbtntic2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntic2.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtntic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntic2ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtntic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 190, 190));

        jbtntic1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtntic1.setToolTipText("");
        jbtntic1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntic1.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtntic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntic1ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtntic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 190));

        jbtntic3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtntic3.setToolTipText("");
        jbtntic3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtntic3.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtntic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntic3ActionPerformed(evt);
            }
        });
        jPanel4.add(jbtntic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, 200, 190));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 650, 630));

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(95, 158, 160));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel25.setBackground(new java.awt.Color(95, 158, 160));
        jPanel25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(95, 158, 160));
        jPanel26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel25.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel27.setBackground(new java.awt.Color(95, 158, 160));
        jPanel27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(95, 158, 160));
        jPanel28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel27.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel25.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel29.setBackground(new java.awt.Color(95, 158, 160));
        jPanel29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(95, 158, 160));
        jPanel30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel29.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel31.setBackground(new java.awt.Color(95, 158, 160));
        jPanel31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(95, 158, 160));
        jPanel32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel31.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel29.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel33.setBackground(new java.awt.Color(95, 158, 160));
        jPanel33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setBackground(new java.awt.Color(95, 158, 160));
        jPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel33.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel35.setBackground(new java.awt.Color(95, 158, 160));
        jPanel35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel36.setBackground(new java.awt.Color(95, 158, 160));
        jPanel36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel35.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel33.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel37.setBackground(new java.awt.Color(95, 158, 160));
        jPanel37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setBackground(new java.awt.Color(95, 158, 160));
        jPanel38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel37.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel39.setBackground(new java.awt.Color(95, 158, 160));
        jPanel39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel40.setBackground(new java.awt.Color(95, 158, 160));
        jPanel40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel39.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel37.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel33.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel29.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel25.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel7.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel4.setText("Player O:");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 310, 80));

        jblplayerX.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jblplayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblplayerX.setText("0");
        jblplayerX.setOpaque(true);
        jPanel7.add(jblplayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 300, 80));

        jblplayerO.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jblplayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblplayerO.setText("0");
        jblplayerO.setOpaque(true);
        jPanel7.add(jblplayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 300, 80));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel5.setText("Player X:");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 300, 80));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 630, 290));

        jPanel9.setBackground(new java.awt.Color(95, 158, 160));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(95, 158, 160));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel11.setBackground(new java.awt.Color(95, 158, 160));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(95, 158, 160));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel13.setBackground(new java.awt.Color(95, 158, 160));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(95, 158, 160));
        jPanel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel15.setBackground(new java.awt.Color(95, 158, 160));
        jPanel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(95, 158, 160));
        jPanel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel17.setBackground(new java.awt.Color(95, 158, 160));
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(95, 158, 160));
        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel19.setBackground(new java.awt.Color(95, 158, 160));
        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(95, 158, 160));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel21.setBackground(new java.awt.Color(95, 158, 160));
        jPanel21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(95, 158, 160));
        jPanel22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel23.setBackground(new java.awt.Color(95, 158, 160));
        jPanel23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(95, 158, 160));
        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 660, 700));

        jPanel21.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel17.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel13.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 610, 230));

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnexit.setText("Exit");
        jbtnexit.setToolTipText("");
        jbtnexit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnexit.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 280, 120));

        jbtnnewgame.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnnewgame.setText("New Game");
        jbtnnewgame.setToolTipText("");
        jbtnnewgame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnnewgame.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnnewgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnewgameActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnnewgame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 610, 150));

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jbtnreset.setText("Reset");
        jbtnreset.setToolTipText("");
        jbtnreset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbtnreset.setPreferredSize(new java.awt.Dimension(200, 158));
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });
        jPanel9.add(jbtnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 320, 120));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 630, 300));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 650, 630));

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TicTocToe Game");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 550, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 24, 1320, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jbtntic9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntic9ActionPerformed
       jbtntic9.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jbtntic9.setForeground(Color.GREEN);
        }
        else 
        {
            jbtntic9.setForeground(Color.BLUE);
        }
        Choose_a_Player();
        winnigGame();
    }//GEN-LAST:event_jbtntic9ActionPerformed

    private void jbtntic7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntic7ActionPerformed
        jbtntic7.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jbtntic7.setForeground(Color.GREEN);
        }
        else 
        {
            jbtntic7.setForeground(Color.BLUE);
        }
        Choose_a_Player();
        winnigGame();
    }//GEN-LAST:event_jbtntic7ActionPerformed

    private void jbtntic8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntic8ActionPerformed
        jbtntic8.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jbtntic8.setForeground(Color.GREEN);
        }
        else 
        {
            jbtntic8.setForeground(Color.BLUE);
        }
        Choose_a_Player();
        winnigGame();
    }//GEN-LAST:event_jbtntic8ActionPerformed

    private void jbtntic6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntic6ActionPerformed
       jbtntic6.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jbtntic6.setForeground(Color.GREEN);
        }
        else 
        {
            jbtntic6.setForeground(Color.BLUE);
        }
        Choose_a_Player();
        winnigGame();
    }//GEN-LAST:event_jbtntic6ActionPerformed

    private void jbtntic5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntic5ActionPerformed
        jbtntic5.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jbtntic5.setForeground(Color.GREEN);
        }
        else 
        {
            jbtntic5.setForeground(Color.BLUE);
        }
        Choose_a_Player();
        winnigGame();
    }//GEN-LAST:event_jbtntic5ActionPerformed

    private void jbtntic4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntic4ActionPerformed
        jbtntic4.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jbtntic4.setForeground(Color.GREEN);
        }
        else 
        {
            jbtntic4.setForeground(Color.BLUE);
        }
        Choose_a_Player();
        winnigGame();
    }//GEN-LAST:event_jbtntic4ActionPerformed
private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Tic Tac Toe", 
             JOptionPane.YES_NO_OPTION  )== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtntic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntic2ActionPerformed
        jbtntic2.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jbtntic2.setForeground(Color.GREEN);
        }
        else 
        {
            jbtntic2.setForeground(Color.BLUE);
        }
        Choose_a_Player();
        winnigGame();
    }//GEN-LAST:event_jbtntic2ActionPerformed

    private void jbtntic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntic1ActionPerformed
        jbtntic1.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jbtntic1.setForeground(Color.GREEN);
        }
        else 
        {
            jbtntic1.setForeground(Color.BLUE);
        }
        Choose_a_Player();
        winnigGame();
    }//GEN-LAST:event_jbtntic1ActionPerformed

    private void jbtntic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntic3ActionPerformed
        jbtntic3.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
            jbtntic3.setForeground(Color.GREEN);
        }
        else 
        {
            jbtntic3.setForeground(Color.BLUE);
        }
        Choose_a_Player();
        winnigGame();
    }//GEN-LAST:event_jbtntic3ActionPerformed

    private void jbtnnewgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnewgameActionPerformed
        jbtntic1.setEnabled(true);
        jbtntic2.setEnabled(true);
        jbtntic3.setEnabled(true);
        jbtntic4.setEnabled(true);
        jbtntic5.setEnabled(true);
        jbtntic6.setEnabled(true);
        jbtntic7.setEnabled(true);
        jbtntic7.setEnabled(true);
        jbtntic8.setEnabled(true);
        
        jblplayerX.setText("0");
        jblplayerO.setText("0");
        
        jbtntic1.setText("");
        jbtntic2.setText("");
        jbtntic3.setText("");
        jbtntic4.setText("");
        jbtntic5.setText("");
        jbtntic6.setText("");
        jbtntic7.setText("");
        jbtntic8.setText("");
        jbtntic9.setText("");
        
        jbtntic1.setBackground(Color.LIGHT_GRAY);
        jbtntic2.setBackground(Color.LIGHT_GRAY);
        jbtntic3.setBackground(Color.LIGHT_GRAY);
        jbtntic4.setBackground(Color.LIGHT_GRAY);
        jbtntic5.setBackground(Color.LIGHT_GRAY);
        jbtntic6.setBackground(Color.LIGHT_GRAY);
        jbtntic7.setBackground(Color.LIGHT_GRAY);
        jbtntic8.setBackground(Color.LIGHT_GRAY);
        jbtntic9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_jbtnnewgameActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        jbtntic1.setEnabled(true);
        jbtntic2.setEnabled(true);
        jbtntic3.setEnabled(true);
        jbtntic4.setEnabled(true);
        jbtntic5.setEnabled(true);
        jbtntic6.setEnabled(true);
        jbtntic7.setEnabled(true);
        jbtntic8.setEnabled(true);
        jbtntic9.setEnabled(true);
        
        jbtntic1.setText("");
        jbtntic2.setText("");
        jbtntic3.setText("");
        jbtntic4.setText("");
        jbtntic5.setText("");
        jbtntic6.setText("");
        jbtntic7.setText("");
        jbtntic8.setText("");
        jbtntic9.setText("");
        
        jbtntic1.setBackground(Color.LIGHT_GRAY);
        jbtntic2.setBackground(Color.LIGHT_GRAY);
        jbtntic3.setBackground(Color.LIGHT_GRAY);
        jbtntic4.setBackground(Color.LIGHT_GRAY);
        jbtntic5.setBackground(Color.LIGHT_GRAY);
        jbtntic6.setBackground(Color.LIGHT_GRAY);
        jbtntic7.setBackground(Color.LIGHT_GRAY);
        jbtntic8.setBackground(Color.LIGHT_GRAY);
        jbtntic9.setBackground(Color.LIGHT_GRAY);
        
        
        
        
        
    }//GEN-LAST:event_jbtnresetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jblplayerO;
    private javax.swing.JLabel jblplayerX;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtnnewgame;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton jbtntic1;
    private javax.swing.JButton jbtntic2;
    private javax.swing.JButton jbtntic3;
    private javax.swing.JButton jbtntic4;
    private javax.swing.JButton jbtntic5;
    private javax.swing.JButton jbtntic6;
    private javax.swing.JButton jbtntic7;
    private javax.swing.JButton jbtntic8;
    private javax.swing.JButton jbtntic9;
    // End of variables declaration//GEN-END:variables
}
