/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Paul Duan
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        //initialize Components
        initComponents();
        //add JButtons(cells) into arraylist to orangize
        cells.add(cell11);
        cells.add(cell12);
        cells.add(cell13);
        cells.add(cell21);
        cells.add(cell22);
        cells.add(cell23);
        cells.add(cell31);
        cells.add(cell32);
        cells.add(cell33);
        //call initialize() to set up
        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new MyJPanel(background);
        gamePanel = new javax.swing.JPanel();
        winLabel = new javax.swing.JLabel();
        cell11 = new javax.swing.JButton();
        cell12 = new javax.swing.JButton();
        cell13 = new javax.swing.JButton();
        cell21 = new javax.swing.JButton();
        cell22 = new javax.swing.JButton();
        cell23 = new javax.swing.JButton();
        cell31 = new javax.swing.JButton();
        cell32 = new javax.swing.JButton();
        cell33 = new javax.swing.JButton();
        xWinsLabel = new javax.swing.JLabel();
        oWinsLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        tieLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        backgroundPanel.setPreferredSize(new java.awt.Dimension(400, 500));
        backgroundPanel.setLayout(null);

        gamePanel.setOpaque(false);
        gamePanel.setLayout(null);
        gamePanel.add(winLabel);
        winLabel.setBounds(0, 0, 400, 400);

        cell11.setIcon(cellBlue);
        cell11.setContentAreaFilled(false);
        cell11.setDisabledIcon(cellBlue);
        cell11.setFocusable(false);
        cell11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell11ActionPerformed(evt);
            }
        });
        gamePanel.add(cell11);
        cell11.setBounds(9, 8, 109, 110);

        cell12.setIcon(cellCyan);
        cell12.setContentAreaFilled(false);
        cell12.setDisabledIcon(cellCyan);
        cell12.setFocusable(false);
        cell12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell12ActionPerformed(evt);
            }
        });
        gamePanel.add(cell12);
        cell12.setBounds(146, 9, 108, 109);

        cell13.setIcon(cellBlue);
        cell13.setContentAreaFilled(false);
        cell13.setDisabledIcon(cellBlue);
        cell13.setFocusable(false);
        cell13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell13ActionPerformed(evt);
            }
        });
        gamePanel.add(cell13);
        cell13.setBounds(282, 9, 109, 109);

        cell21.setIcon(cellCyan);
        cell21.setContentAreaFilled(false);
        cell21.setDisabledIcon(cellCyan);
        cell21.setFocusable(false);
        cell21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell21ActionPerformed(evt);
            }
        });
        gamePanel.add(cell21);
        cell21.setBounds(9, 146, 108, 108);

        cell22.setIcon(cellBlue);
        cell22.setContentAreaFilled(false);
        cell22.setDisabledIcon(cellBlue);
        cell22.setFocusable(false);
        cell22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell22ActionPerformed(evt);
            }
        });
        gamePanel.add(cell22);
        cell22.setBounds(146, 146, 108, 108);

        cell23.setIcon(cellCyan);
        cell23.setContentAreaFilled(false);
        cell23.setDisabledIcon(cellCyan);
        cell23.setFocusable(false);
        cell23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell23ActionPerformed(evt);
            }
        });
        gamePanel.add(cell23);
        cell23.setBounds(282, 146, 108, 108);

        cell31.setIcon(cellBlue);
        cell31.setContentAreaFilled(false);
        cell31.setDisabledIcon(cellBlue);
        cell31.setFocusable(false);
        cell31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell31ActionPerformed(evt);
            }
        });
        gamePanel.add(cell31);
        cell31.setBounds(9, 282, 109, 109);

        cell32.setIcon(cellCyan);
        cell32.setContentAreaFilled(false);
        cell32.setDisabledIcon(cellCyan);
        cell32.setFocusable(false);
        cell32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell32ActionPerformed(evt);
            }
        });
        gamePanel.add(cell32);
        cell32.setBounds(146, 282, 108, 109);

        cell33.setIcon(cellBlue);
        cell33.setContentAreaFilled(false);
        cell33.setDisabledIcon(cellBlue);
        cell33.setFocusable(false);
        cell33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell33ActionPerformed(evt);
            }
        });
        gamePanel.add(cell33);
        cell33.setBounds(282, 282, 109, 109);

        backgroundPanel.add(gamePanel);
        gamePanel.setBounds(0, 0, 400, 400);

        xWinsLabel.setFont(new java.awt.Font("Arial", 0, 55)); // NOI18N
        xWinsLabel.setForeground(new java.awt.Color(255, 255, 255));
        xWinsLabel.setText("X-0");
        backgroundPanel.add(xWinsLabel);
        xWinsLabel.setBounds(10, 410, 150, 90);

        oWinsLabel.setFont(new java.awt.Font("Arial", 0, 55)); // NOI18N
        oWinsLabel.setForeground(new java.awt.Color(255, 255, 255));
        oWinsLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        oWinsLabel.setText("0-O");
        backgroundPanel.add(oWinsLabel);
        oWinsLabel.setBounds(230, 410, 160, 90);

        resetButton.setBackground(new java.awt.Color(255, 255, 255));
        resetButton.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        resetButton.setText("Reset");
        resetButton.setFocusable(false);
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(resetButton);
        resetButton.setBounds(160, 440, 70, 30);

        tieLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tieLabel.setForeground(new java.awt.Color(255, 255, 255));
        tieLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tieLabel.setText("TIE!");
        tieLabel.setFocusable(false);
        backgroundPanel.add(tieLabel);
        tieLabel.setBounds(160, 400, 70, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //set up or reset

    public void initialize() {
        status = 0; //set game status
        isWin = false; //set isWin
        tieLabel.setVisible(false); //hide tie Label
        //use "0" to fill up 2-D array to initialize it
        for (int i = 0; i < 3; i++) {
            for (int ii = 0; ii < 3; ii++) {
                tictac[i][ii] = "0";
            }
        }
    }

    //button pressed
    public void pressedEvent(JButton cell, int x, int y) { //which button, which row, which column
        if (status % 2 == 0) { //Even number? X:O
            cell.setDisabledIcon(imgX); //setDisabledIcon
            cell.setEnabled(false); //set Disable
            tictac[x - 1][y - 1] = "x"; //change value in 2-D array
            status++; //update status
            isGameOver(); //is this step lead game over?
        } else {
            cell.setDisabledIcon(imgO);
            cell.setEnabled(false);
            tictac[x - 1][y - 1] = "o";
            status++;
            isGameOver();
        }
    }

    public void isGameOver() {
        /**
         * 0X0 <----row1
         * OOX 
         * XX0
         */
        //get row1 as String like "xxo" or "xxx"
        row1 = tictac[0][0] + tictac[0][1] + tictac[0][2];
        if (row1.contains("xxx") || row1.contains("ooo")) { //contains xxx means x wins in row1
            isWin = true; //set isWin value
            gameOver("row1"); //use "row1" to call gameOver method
            //update scores
            if (row1.contains("xxx")) {
                xWins++;
                xWinsLabel.setText("X-" + xWins);
            } else {
                oWins++;
                oWinsLabel.setText(oWins + "-O");
            }
        }

        row2 = tictac[1][0] + tictac[1][1] + tictac[1][2];
        if (row2.contains("xxx") || row2.contains("ooo")) {
            isWin = true;
            gameOver("row2");
            if (row2.contains("xxx")) {
                xWins++;
                xWinsLabel.setText("X-" + xWins);
            } else {
                oWins++;
                oWinsLabel.setText(oWins + "-O");
            }
        }

        row3 = tictac[2][0] + tictac[2][1] + tictac[2][2];
        if (row3.contains("xxx") || row3.contains("ooo")) {
            isWin = true;
            gameOver("row3");
            if (row3.contains("xxx")) {
                xWins++;
                xWinsLabel.setText("X-" + xWins);
            } else {
                oWins++;
                oWinsLabel.setText(oWins + "-O");
            }
        }

        column1 = tictac[0][0] + tictac[1][0] + tictac[2][0];
        if (column1.contains("xxx") || column1.contains("ooo")) {
            isWin = true;
            gameOver("column1");
            if (column1.contains("xxx")) {
                xWins++;
                xWinsLabel.setText("X-" + xWins);
            } else {
                oWins++;
                oWinsLabel.setText(oWins + "-O");
            }
        }

        column2 = tictac[0][1] + tictac[1][1] + tictac[2][1];
        if (column2.contains("xxx") || column2.contains("ooo")) {
            isWin = true;
            gameOver("column2");
            if (column2.contains("xxx")) {
                xWins++;
                xWinsLabel.setText("X-" + xWins);
            } else {
                oWins++;
                oWinsLabel.setText(oWins + "-O");
            }
        }

        column3 = tictac[0][2] + tictac[1][2] + tictac[2][2];
        if (column3.contains("xxx") || column3.contains("ooo")) {
            isWin = true;
            gameOver("column3");
            if (column3.contains("xxx")) {
                xWins++;
                xWinsLabel.setText("X-" + xWins);
            } else {
                oWins++;
                oWinsLabel.setText(oWins + "-O");
            }
        }

        diagonal1 = tictac[0][0] + tictac[1][1] + tictac[2][2];
        if (diagonal1.contains("xxx") || diagonal1.contains("ooo")) {
            isWin = true;
            gameOver("diagonal1");
            if (diagonal1.contains("xxx")) {
                xWins++;
                xWinsLabel.setText("X-" + xWins);
            } else {
                oWins++;
                oWinsLabel.setText(oWins + "-O");
            }
        }

        diagonal2 = tictac[0][2] + tictac[1][1] + tictac[2][0];
        if (diagonal2.contains("xxx") || diagonal2.contains("ooo")) {
            isWin = true;
            gameOver("diagonal2");
            if (diagonal2.contains("xxx")) {
                xWins++;
                xWinsLabel.setText("X-" + xWins);
            } else {
                oWins++;
                oWinsLabel.setText(oWins + "-O");
            }
        }

        //if it is the end of the game, and isWin is still false
        if (status == 9 && !isWin) {
            gameOver("tie"); //use "tie" to call gameOver()
        }

    }

    public void gameOver(String s) { //s as arg
        //as game over we do not allow any change on buttons
        ListIterator<JButton> itr = cells.listIterator();
        while (itr.hasNext()) {
            itr.next().setEnabled(false);
        }

        //use s to set which Line should show
        switch (s) {
            case "row1":
                winLabel.setIcon(imgRow1); //show imgRow1 which is a line cross row1
                winLabel.setVisible(true);
                break;
            case "row2":
                winLabel.setIcon(imgRow2);
                winLabel.setVisible(true);
                break;
            case "row3":
                winLabel.setIcon(imgRow3);
                winLabel.setVisible(true);
                break;
            case "column1":
                winLabel.setIcon(imgColumn1);
                winLabel.setVisible(true);
                break;
            case "column2":
                winLabel.setIcon(imgColumn2);
                winLabel.setVisible(true);
                break;
            case "column3":
                winLabel.setIcon(imgColumn3);
                winLabel.setVisible(true);
                break;
            case "diagonal1":
                winLabel.setIcon(imgDiagonal1);
                winLabel.setVisible(true);
                break;
            case "diagonal2":
                winLabel.setIcon(imgDiagonal2);
                winLabel.setVisible(true);
                break;
            case "tie":
                tieLabel.setVisible(true); //show tie label
                break;
        }
    }
    private void cell11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell11ActionPerformed
        // TODO add your handling code here:
        pressedEvent(cell11, 1, 1);
    }//GEN-LAST:event_cell11ActionPerformed

    private void cell12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell12ActionPerformed
        // TODO add your handling code here:
        pressedEvent(cell12, 1, 2);
    }//GEN-LAST:event_cell12ActionPerformed

    private void cell13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell13ActionPerformed
        // TODO add your handling code here:
        pressedEvent(cell13, 1, 3);
    }//GEN-LAST:event_cell13ActionPerformed

    private void cell21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell21ActionPerformed
        // TODO add your handling code here:
        pressedEvent(cell21, 2, 1);
    }//GEN-LAST:event_cell21ActionPerformed

    private void cell22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell22ActionPerformed
        // TODO add your handling code here:
        pressedEvent(cell22, 2, 2);
    }//GEN-LAST:event_cell22ActionPerformed

    private void cell23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell23ActionPerformed
        // TODO add your handling code here:
        pressedEvent(cell23, 2, 3);
    }//GEN-LAST:event_cell23ActionPerformed

    private void cell31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell31ActionPerformed
        // TODO add your handling code here:
        pressedEvent(cell31, 3, 1);
    }//GEN-LAST:event_cell31ActionPerformed

    private void cell32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell32ActionPerformed
        // TODO add your handling code here:
        pressedEvent(cell32, 3, 2);
    }//GEN-LAST:event_cell32ActionPerformed

    private void cell33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell33ActionPerformed
        // TODO add your handling code here:
        pressedEvent(cell33, 3, 3);
    }//GEN-LAST:event_cell33ActionPerformed

    //reset all game
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        initialize(); //call intialize() to reset most of it.
        //set Enabled and setDisabledIcon to cell(transparent picture) and
        //be ready for next time
        ListIterator<JButton> itr = cells.listIterator();
        while (itr.hasNext()) {
            JButton cell = itr.next();
            cell.setEnabled(true);
            cell.setDisabledIcon(this.cell);
        }
        winLabel.setVisible(false); //hide winLabel
        tieLabel.setVisible(false); //hide tieLabel
    }//GEN-LAST:event_resetButtonActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton cell11;
    private javax.swing.JButton cell12;
    private javax.swing.JButton cell13;
    private javax.swing.JButton cell21;
    private javax.swing.JButton cell22;
    private javax.swing.JButton cell23;
    private javax.swing.JButton cell31;
    private javax.swing.JButton cell32;
    private javax.swing.JButton cell33;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel oWinsLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel tieLabel;
    private javax.swing.JLabel winLabel;
    private javax.swing.JLabel xWinsLabel;
    // End of variables declaration//GEN-END:variables
    //Delcaration of images
    ImageIcon background = new ImageIcon(TicTacToe.class.getResource("/pictures/background.png"));
    ImageIcon cellBlue = new ImageIcon(TicTacToe.class.getResource("/pictures/cell1.png"));
    ImageIcon cellCyan = new ImageIcon(TicTacToe.class.getResource("/pictures/cell2.png"));
    ImageIcon imgO = new ImageIcon(TicTacToe.class.getResource("/pictures/o.png"));
    ImageIcon imgX = new ImageIcon(TicTacToe.class.getResource("/pictures/x.png"));
    ImageIcon imgRow1 = new ImageIcon(TicTacToe.class.getResource("/pictures/row1.png"));
    ImageIcon imgRow2 = new ImageIcon(TicTacToe.class.getResource("/pictures/row2.png"));
    ImageIcon imgRow3 = new ImageIcon(TicTacToe.class.getResource("/pictures/row3.png"));
    ImageIcon imgColumn1 = new ImageIcon(TicTacToe.class.getResource("/pictures/column1.png"));
    ImageIcon imgColumn2 = new ImageIcon(TicTacToe.class.getResource("/pictures/column2.png"));
    ImageIcon imgColumn3 = new ImageIcon(TicTacToe.class.getResource("/pictures/column3.png"));
    ImageIcon imgDiagonal1 = new ImageIcon(TicTacToe.class.getResource("/pictures/diagonal1.png"));
    ImageIcon imgDiagonal2 = new ImageIcon(TicTacToe.class.getResource("/pictures/diagonal2.png"));
    ImageIcon cell = new ImageIcon(TicTacToe.class.getResource("/pictures/cell.png"));

    ArrayList<JButton> cells = new ArrayList<>(); //JButton ArrayList for cells

    boolean isWin = false;
    int status = 0;
    int xWins = 0;
    int oWins = 0;
    String[][] tictac = new String[3][3]; //2-D array to save data
    String row1, row2, row3, column1, column2, column3, diagonal1, diagonal2;
}
