
package quiz;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class QuizFrame extends javax.swing.JFrame {

    public QuizFrame() {
        initComponents();
      ComboBoxQ1.addItem("Please select an answer");
        ComboBoxQ1.addItem("a) It is used to indicate that the class cannot be inherited.");
        ComboBoxQ1.addItem("b)It is used to declare a constant.");
        ComboBoxQ1.addItem("c)It is used to create an immutable object.");
          ComboBoxQ1.addItem("d)It is used to make a method or variable unchangeable");
          
          
          ComboBoxQ2.addItem("Please select an answer");
         ComboBoxQ2.addItem("a)final int constantNumber = 5");
         ComboBoxQ2.addItem("b)const int constantNumber = 5");
         ComboBoxQ2.addItem("c)static final constantNumber = 5");
         ComboBoxQ2.addItem("d)constant int constantNumber = 5");
        
         
 ComboBoxQ3.addItem("Please select an answer");
         ComboBoxQ3.addItem("a)java.lang");
         ComboBoxQ3.addItem("b)java.util");
         ComboBoxQ3.addItem("c)java.awt");
     ComboBoxQ3.addItem("d)java.io");
        
}
    


    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxQ1 = new javax.swing.JComboBox<>();
        BtnCheckQ1 = new javax.swing.JButton();
        BtnQuizAnswersForm = new javax.swing.JButton();
        ComboBoxQ2 = new javax.swing.JComboBox<>();
        ComboBoxQ3 = new javax.swing.JComboBox<>();
        BtnCheckQ2 = new javax.swing.JButton();
        BtnCheckQ3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Quiz");

        jLabel2.setText("Question 1: What is the purpose of the keyword \"final\" in Java?");

        jLabel3.setText("Question 2: Which of the following is the correct way to declare a constant in Java?");

        jLabel4.setText("Question 3: Which of the following is used for input/output operations?");

        ComboBoxQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxQ1ActionPerformed(evt);
            }
        });

        BtnCheckQ1.setText("Check Q1");
        BtnCheckQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCheckQ1ActionPerformed(evt);
            }
        });

        BtnQuizAnswersForm.setText("Check Answers");
        BtnQuizAnswersForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuizAnswersFormActionPerformed(evt);
            }
        });

        ComboBoxQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxQ2ActionPerformed(evt);
            }
        });

        ComboBoxQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxQ3ActionPerformed(evt);
            }
        });

        BtnCheckQ2.setText("Check Q2");
        BtnCheckQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCheckQ2ActionPerformed(evt);
            }
        });

        BtnCheckQ3.setText("Check Q3");
        BtnCheckQ3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCheckQ3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ComboBoxQ1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(140, 140, 140)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtnQuizAnswersForm)
                                        .addComponent(BtnCheckQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnCheckQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BtnCheckQ3)))))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxQ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboBoxQ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(BtnCheckQ1))
                .addGap(4, 4, 4)
                .addComponent(ComboBoxQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(BtnCheckQ2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxQ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(BtnCheckQ3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxQ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(BtnQuizAnswersForm)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboBoxQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxQ1ActionPerformed
      
        
        
        
    }//GEN-LAST:event_ComboBoxQ1ActionPerformed

    private void BtnCheckQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCheckQ1ActionPerformed
         if (ComboBoxQ1.getSelectedItem().equals("d)It is used to make a method or variable unchangeable")) {
                    JOptionPane.showMessageDialog(this, "Your answer is correct!");
                }
        else
         {
             JOptionPane.showMessageDialog(this, "Your answer is incorrect! Please try again"); 
         }
    }//GEN-LAST:event_BtnCheckQ1ActionPerformed

    private void BtnQuizAnswersFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuizAnswersFormActionPerformed
        
        String fileName = "Answers.txt";

      
        String textToWrite = "Question 1 Answer: d)It is used to make a method or variable unchangeable";
String textToWrite2 = "Question 2 Answer: a)final int constantNumber = 5";
String textToWrite3 = "Question 3 Answer: d)java.io";
        
try {          
 BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            writer.write(textToWrite);
            writer.newLine(); 
            writer.write(textToWrite2);
            writer.newLine(); 
            writer.write(textToWrite3);

            writer.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        QuizAnswers QA= new QuizAnswers();
      QA.setVisible(true);
      
      
      
    }//GEN-LAST:event_BtnQuizAnswersFormActionPerformed

    private void ComboBoxQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxQ2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxQ2ActionPerformed

    private void ComboBoxQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxQ3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxQ3ActionPerformed

    private void BtnCheckQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCheckQ2ActionPerformed
      
         if (ComboBoxQ2.getSelectedItem().equals("a)final int constantNumber = 5")) {
                    JOptionPane.showMessageDialog(this, "Your answer is correct!");
                }
        else
         {
             JOptionPane.showMessageDialog(this, "Your answer is incorrect! Please try again"); 
         }
    }//GEN-LAST:event_BtnCheckQ2ActionPerformed

    private void BtnCheckQ3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCheckQ3ActionPerformed
        // TODO add your handling code here:
         if (ComboBoxQ3.getSelectedItem().equals("d)java.io")) {
                    JOptionPane.showMessageDialog(this, "Your answer is correct!");
                }
        else
         {
             JOptionPane.showMessageDialog(this, "Your answer is incorrect! Please try again"); 
         }
        
    }//GEN-LAST:event_BtnCheckQ3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCheckQ1;
    private javax.swing.JButton BtnCheckQ2;
    private javax.swing.JButton BtnCheckQ3;
    private javax.swing.JButton BtnQuizAnswersForm;
    private javax.swing.JComboBox<String> ComboBoxQ1;
    private javax.swing.JComboBox<String> ComboBoxQ2;
    private javax.swing.JComboBox<String> ComboBoxQ3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

