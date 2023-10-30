
package vacationrentals;


public class NewJFrame extends javax.swing.JFrame {

 
    public NewJFrame() {
        initComponents();
            LblDisplay.setVisible(false);
        
            
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CmbLocation = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CmbBedroom = new javax.swing.JComboBox<>();
        ChkMeal = new javax.swing.JCheckBox();
        btnProcess = new javax.swing.JButton();
        LblDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Select Location");

        CmbLocation.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OceanView", "DolphinCoast", "Lakeside" }));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Select Bedroom");

        CmbBedroom.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        CmbBedroom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "One", "Two", "Three" }));

        ChkMeal.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        ChkMeal.setText("Are meals included?");

        btnProcess.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        LblDisplay.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LblDisplay.setText("Result:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChkMeal)
                            .addComponent(CmbBedroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(CmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnProcess))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(LblDisplay)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmbBedroom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ChkMeal)
                .addGap(18, 18, 18)
                .addComponent(btnProcess)
                .addGap(28, 28, 28)
                .addComponent(LblDisplay)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
      String location = (String) CmbLocation.getSelectedItem();
      String bedrooms = (String)CmbBedroom.getSelectedItem();
        //If Combobox worked with numbers
        //int bedrooms = Integer.parseInt((String) bedroomsComboBox.getSelectedItem()); 
         int locationPrice = 0;
         switch (location) {
         case "OceanView":
         locationPrice = 600;
         break;
         case "DolphinCoast":
         locationPrice = 750;
         break;
         case "Lakeside":
         locationPrice = 825;
         break;
         }
            int totalCost = locationPrice ;
            if (ChkMeal.isSelected()) {
                totalCost += 200;
                 LblDisplay.setVisible(true);
                 LblDisplay.setText("Total Cost + Meal: R" + totalCost + " for " + bedrooms +" bedrooms.");
            }
            else
            {
               LblDisplay.setVisible(true);
               LblDisplay.setText("Total Cost excluding meal: R" + totalCost + " for " + bedrooms +" bedrooms");          
            }

    }//GEN-LAST:event_btnProcessActionPerformed

 
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
          
          
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
         ;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkMeal;
    private javax.swing.JComboBox<String> CmbBedroom;
    private javax.swing.JComboBox<String> CmbLocation;
    private javax.swing.JLabel LblDisplay;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
