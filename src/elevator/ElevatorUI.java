/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ElevatorUI.java
 *
 * Created on 15.03.2011, 20:44:22
 */

package elevator;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m

            @Override
            public StringBuffer format(double d, StringBuffer sb, FieldPosition fp) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public StringBuffer format(long l, StringBuffer sb, FieldPosition fp) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public Number parse(String string, ParsePosition pp) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        }rtin
 */
public class ElevatorUI extends javax.swing.JFrame {

    /** Creates new form ElevatorUI */
    public ElevatorUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        levelLabel = new javax.swing.JLabel();
        levelsInputNum = new javax.swing.JSpinner();
        elevatorsLabel = new javax.swing.JLabel();
        elevatorsInputNum = new javax.swing.JSpinner();
        startButton = new javax.swing.JButton();
        building = new javax.swing.JPanel();
        elevator0 = new javax.swing.JPanel();
        level0_2 = new javax.swing.JPanel();
        cabin0_2 = new javax.swing.JPanel();
        floor0_2 = new javax.swing.JPanel();
        levelLabel0_2 = new javax.swing.JLabel();
        buttonDown0_2 = new javax.swing.JButton();
        level0_1 = new javax.swing.JPanel();
        cabin0_1 = new javax.swing.JPanel();
        floor0_1 = new javax.swing.JPanel();
        levelLabel0_1 = new javax.swing.JLabel();
        buttonUp0_1 = new javax.swing.JButton();
        buttonDown0_1 = new javax.swing.JButton();
        level0_0 = new javax.swing.JPanel();
        cabin0_0 = new javax.swing.JPanel();
        cabinReal0 = new javax.swing.JPanel();
        cabinButton0_0 = new javax.swing.JButton();
        cabinButton0_1 = new javax.swing.JButton();
        cabinButton0_2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        floor0_0 = new javax.swing.JPanel();
        levelLabel0_0 = new javax.swing.JLabel();
        buttonUp0_0 = new javax.swing.JButton();
        elevator1 = new javax.swing.JPanel();
        level1_2 = new javax.swing.JPanel();
        cabin1_2 = new javax.swing.JPanel();
        floor1_2 = new javax.swing.JPanel();
        level1_1 = new javax.swing.JPanel();
        cabin1_1 = new javax.swing.JPanel();
        floor1_1 = new javax.swing.JPanel();
        level1_0 = new javax.swing.JPanel();
        cabin1_0 = new javax.swing.JPanel();
        floor1_0 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolBar.setRollover(true);

        levelLabel.setText("Levels:");
        toolBar.add(levelLabel);

        levelsInputNum.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        toolBar.add(levelsInputNum);

        elevatorsLabel.setText("Elevators:");
        toolBar.add(elevatorsLabel);

        elevatorsInputNum.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        toolBar.add(elevatorsInputNum);

        startButton.setText("Start");
        startButton.setFocusable(false);
        startButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        startButton.setPreferredSize(new java.awt.Dimension(68, 29));
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        toolBar.add(startButton);

        building.setAutoscrolls(true);
        building.setLayout(new java.awt.GridLayout());

        elevator0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        elevator0.setLayout(new java.awt.GridLayout(0, 1));

        level0_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        level0_2.setLayout(new java.awt.GridLayout());

        cabin0_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout cabin0_2Layout = new javax.swing.GroupLayout(cabin0_2);
        cabin0_2.setLayout(cabin0_2Layout);
        cabin0_2Layout.setHorizontalGroup(
            cabin0_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );
        cabin0_2Layout.setVerticalGroup(
            cabin0_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        level0_2.add(cabin0_2);

        floor0_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        levelLabel0_2.setText("Level 2");

        buttonDown0_2.setText("Down");

        javax.swing.GroupLayout floor0_2Layout = new javax.swing.GroupLayout(floor0_2);
        floor0_2.setLayout(floor0_2Layout);
        floor0_2Layout.setHorizontalGroup(
            floor0_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
            .addGap(0, 239, Short.MAX_VALUE)
            .addGroup(floor0_2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(levelLabel0_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDown0_2)
                .addGap(100, 100, 100))
        );
        floor0_2Layout.setVerticalGroup(
            floor0_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
            .addGap(0, 147, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, floor0_2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(floor0_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel0_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDown0_2))
                .addGap(49, 49, 49))
        );

        level0_2.add(floor0_2);

        elevator0.add(level0_2);

        level0_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        level0_1.setLayout(new java.awt.GridLayout());

        cabin0_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout cabin0_1Layout = new javax.swing.GroupLayout(cabin0_1);
        cabin0_1.setLayout(cabin0_1Layout);
        cabin0_1Layout.setHorizontalGroup(
            cabin0_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 239, Short.MAX_VALUE)
        );
        cabin0_1Layout.setVerticalGroup(
            cabin0_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        level0_1.add(cabin0_1);

        floor0_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        levelLabel0_1.setText("Level 1");

        buttonUp0_1.setText("Up");

        buttonDown0_1.setText("Down");
        buttonDown0_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDown0_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout floor0_1Layout = new javax.swing.GroupLayout(floor0_1);
        floor0_1.setLayout(floor0_1Layout);
        floor0_1Layout.setHorizontalGroup(
            floor0_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(floor0_1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(levelLabel0_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUp0_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDown0_1)
                .addGap(64, 64, 64))
        );
        floor0_1Layout.setVerticalGroup(
            floor0_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, floor0_1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(floor0_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel0_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonUp0_1)
                    .addComponent(buttonDown0_1))
                .addGap(49, 49, 49))
        );

        level0_1.add(floor0_1);

        elevator0.add(level0_1);

        level0_0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        level0_0.setLayout(new java.awt.GridLayout());

        cabin0_0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cabin0_0.setLayout(new java.awt.GridLayout());

        cabinReal0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cabinButton0_0.setText("L0");
        cabinButton0_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabinButton0_0ActionPerformed(evt);
            }
        });

        cabinButton0_1.setText("L1");

        cabinButton0_2.setText("L2");
        cabinButton0_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabinButton0_2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cabin");

        javax.swing.GroupLayout cabinReal0Layout = new javax.swing.GroupLayout(cabinReal0);
        cabinReal0.setLayout(cabinReal0Layout);
        cabinReal0Layout.setHorizontalGroup(
            cabinReal0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cabinReal0Layout.createSequentialGroup()
                .addComponent(cabinButton0_0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cabinButton0_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cabinButton0_2)
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabinReal0Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
        );
        cabinReal0Layout.setVerticalGroup(
            cabinReal0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cabinReal0Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cabinReal0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cabinButton0_0)
                    .addComponent(cabinButton0_1)
                    .addComponent(cabinButton0_2))
                .addGap(35, 35, 35))
        );

        cabin0_0.add(cabinReal0);

        level0_0.add(cabin0_0);

        floor0_0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        levelLabel0_0.setText("Level 0");

        buttonUp0_0.setText("Up");

        javax.swing.GroupLayout floor0_0Layout = new javax.swing.GroupLayout(floor0_0);
        floor0_0.setLayout(floor0_0Layout);
        floor0_0Layout.setHorizontalGroup(
            floor0_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(floor0_0Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(levelLabel0_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUp0_0)
                .addGap(117, 117, 117))
        );
        floor0_0Layout.setVerticalGroup(
            floor0_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, floor0_0Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(floor0_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelLabel0_0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonUp0_0))
                .addGap(49, 49, 49))
        );

        level0_0.add(floor0_0);

        elevator0.add(level0_0);

        building.add(elevator0);

        elevator1.setLayout(new java.awt.GridLayout(0, 1));

        level1_2.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout cabin1_2Layout = new javax.swing.GroupLayout(cabin1_2);
        cabin1_2.setLayout(cabin1_2Layout);
        cabin1_2Layout.setHorizontalGroup(
            cabin1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        cabin1_2Layout.setVerticalGroup(
            cabin1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        level1_2.add(cabin1_2);

        javax.swing.GroupLayout floor1_2Layout = new javax.swing.GroupLayout(floor1_2);
        floor1_2.setLayout(floor1_2Layout);
        floor1_2Layout.setHorizontalGroup(
            floor1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        floor1_2Layout.setVerticalGroup(
            floor1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        level1_2.add(floor1_2);

        elevator1.add(level1_2);

        level1_1.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout cabin1_1Layout = new javax.swing.GroupLayout(cabin1_1);
        cabin1_1.setLayout(cabin1_1Layout);
        cabin1_1Layout.setHorizontalGroup(
            cabin1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        cabin1_1Layout.setVerticalGroup(
            cabin1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        level1_1.add(cabin1_1);

        javax.swing.GroupLayout floor1_1Layout = new javax.swing.GroupLayout(floor1_1);
        floor1_1.setLayout(floor1_1Layout);
        floor1_1Layout.setHorizontalGroup(
            floor1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        floor1_1Layout.setVerticalGroup(
            floor1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        level1_1.add(floor1_1);

        elevator1.add(level1_1);

        level1_0.setLayout(new java.awt.GridLayout());

        javax.swing.GroupLayout cabin1_0Layout = new javax.swing.GroupLayout(cabin1_0);
        cabin1_0.setLayout(cabin1_0Layout);
        cabin1_0Layout.setHorizontalGroup(
            cabin1_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        cabin1_0Layout.setVerticalGroup(
            cabin1_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        level1_0.add(cabin1_0);

        javax.swing.GroupLayout floor1_0Layout = new javax.swing.GroupLayout(floor1_0);
        floor1_0.setLayout(floor1_0Layout);
        floor1_0Layout.setHorizontalGroup(
            floor1_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );
        floor1_0Layout.setVerticalGroup(
            floor1_0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
        );

        level1_0.add(floor1_0);

        elevator1.add(level1_0);

        building.add(elevator1);

        fileMenu.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Close");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        menuBar.add(fileMenu);

        editMenu.setText("Edit");
        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 972, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(building, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(building, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        try {
            levelsInputNum.commitEdit();
            elevatorsInputNum.commitEdit();
        } catch (ParseException ex) {
            Logger.getLogger(ElevatorUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        startButton.setText("Restart");
        System.out.println(startButton.getSize());
        
        Building building = Bootstrap.init((Integer) levelsInputNum.getValue(), (Integer) elevatorsInputNum.getValue());
        System.out.println("Yes!");
    }//GEN-LAST:event_startButtonActionPerformed

    private void cabinButton0_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabinButton0_2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cabinButton0_2ActionPerformed

    private void cabinButton0_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabinButton0_0ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cabinButton0_0ActionPerformed

    private void buttonDown0_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDown0_1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_buttonDown0_1ActionPerformed

   /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElevatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel building;
    private javax.swing.JButton buttonDown0_1;
    private javax.swing.JButton buttonDown0_2;
    private javax.swing.JButton buttonUp0_0;
    private javax.swing.JButton buttonUp0_1;
    private javax.swing.JPanel cabin0_0;
    private javax.swing.JPanel cabin0_1;
    private javax.swing.JPanel cabin0_2;
    private javax.swing.JPanel cabin1_0;
    private javax.swing.JPanel cabin1_1;
    private javax.swing.JPanel cabin1_2;
    private javax.swing.JButton cabinButton0_0;
    private javax.swing.JButton cabinButton0_1;
    private javax.swing.JButton cabinButton0_2;
    private javax.swing.JPanel cabinReal0;
    private javax.swing.JMenu editMenu;
    private javax.swing.JPanel elevator0;
    private javax.swing.JPanel elevator1;
    private javax.swing.JSpinner elevatorsInputNum;
    private javax.swing.JLabel elevatorsLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel floor0_0;
    private javax.swing.JPanel floor0_1;
    private javax.swing.JPanel floor0_2;
    private javax.swing.JPanel floor1_0;
    private javax.swing.JPanel floor1_1;
    private javax.swing.JPanel floor1_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel level0_0;
    private javax.swing.JPanel level0_1;
    private javax.swing.JPanel level0_2;
    private javax.swing.JPanel level1_0;
    private javax.swing.JPanel level1_1;
    private javax.swing.JPanel level1_2;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel levelLabel0_0;
    private javax.swing.JLabel levelLabel0_1;
    private javax.swing.JLabel levelLabel0_2;
    private javax.swing.JSpinner levelsInputNum;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton startButton;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

}