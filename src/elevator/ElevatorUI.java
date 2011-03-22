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

        callListFrame = new javax.swing.JFrame();
        toolBar = new javax.swing.JToolBar();
        levelLabel = new javax.swing.JLabel();
        levelsInputNum = new javax.swing.JSpinner();
        elevatorsLabel = new javax.swing.JLabel();
        elevatorsInputNum = new javax.swing.JSpinner();
        startButton = new javax.swing.JButton();
        holdButton = new javax.swing.JButton();
        stepButton = new javax.swing.JButton();
        scrollingStage = new javax.swing.JScrollPane();
        stage = new javax.swing.JPanel();
        callListFrameScrollPane = new javax.swing.JScrollPane();
        callListTextArea = new javax.swing.JTextArea();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();

        callListFrame.setTitle("CallList");

        javax.swing.GroupLayout callListFrameLayout = new javax.swing.GroupLayout(callListFrame.getContentPane());
        callListFrame.getContentPane().setLayout(callListFrameLayout);
        callListFrameLayout.setHorizontalGroup(
            callListFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );
        callListFrameLayout.setVerticalGroup(
            callListFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolBar.setRollover(true);
        toolBar.setPreferredSize(new java.awt.Dimension(340, 31));

        levelLabel.setText("Levels:");
        toolBar.add(levelLabel);

        levelsInputNum.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(2), Integer.valueOf(2), null, Integer.valueOf(1)));
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

        holdButton.setText("Hold");
        holdButton.setEnabled(false);
        holdButton.setFocusable(false);
        holdButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        holdButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(holdButton);

        stepButton.setText("Step");
        stepButton.setEnabled(false);
        stepButton.setFocusable(false);
        stepButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        stepButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(stepButton);

        stage.setLayout(new java.awt.GridLayout(1, 0));
        scrollingStage.setViewportView(stage);

        callListTextArea.setEditable(false);
        callListFrameScrollPane.setViewportView(callListTextArea);

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
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
            .addComponent(scrollingStage, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
            .addComponent(callListFrameScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 711, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollingStage, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(callListFrameScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 689, Short.MAX_VALUE))
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
        stepButton.setEnabled(true);
        holdButton.setEnabled(true);

        Controls controls = new Controls();
        controls.holdButton = holdButton;
        controls.stepButton = stepButton;
        controls.callListTextArea = callListTextArea;
        
//        Building building = Bootstrap.init((Integer) levelsInputNum.getValue(), (Integer) elevatorsInputNum.getValue(), stage);
        Building building = new Building((Integer) levelsInputNum.getValue(), (Integer) elevatorsInputNum.getValue(), controls);

        stage.removeAll();
        stage.add(building);

//        CallListTextField.setText("Hello World");

        pack();
        System.out.println("(Re-) init succesful.");

    }//GEN-LAST:event_startButtonActionPerformed

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
    private javax.swing.JFrame callListFrame;
    private javax.swing.JScrollPane callListFrameScrollPane;
    private javax.swing.JTextArea callListTextArea;
    private javax.swing.JMenu editMenu;
    private javax.swing.JSpinner elevatorsInputNum;
    private javax.swing.JLabel elevatorsLabel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton holdButton;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JSpinner levelsInputNum;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JScrollPane scrollingStage;
    private javax.swing.JPanel stage;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stepButton;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

}
