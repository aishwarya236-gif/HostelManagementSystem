
package hostelmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class fessdetails extends javax.swing.JFrame {

    public fessdetails() {
        initComponents();
        show_feesDetails();
    }

     public ArrayList<Fees> feesList(){
        ArrayList<Fees> feesDetails=new ArrayList<>();
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="SELECT * FROM feesdatabase";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            Fees f;
            while(rs.next()){
                f=new Fees(rs.getString("fees_month"),rs.getString("fees_status"),rs.getInt("student_id"),rs.getString("student_name"));
                feesDetails.add(f);
            }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }   
        return feesDetails;
    }
    
    public void show_feesDetails(){
        ArrayList<Fees> list=feesList();
        DefaultTableModel model=(DefaultTableModel) feestable.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getfees_month();
            row[1]=list.get(i).getfees_status();
            row[2]=list.get(i).getstud_id();
            row[3]=list.get(i).getstud_name();
             model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fees_month = new javax.swing.JTextField();
        fees_status = new javax.swing.JTextField();
        student_id = new javax.swing.JTextField();
        student_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        feestable = new javax.swing.JTable();
        insertfees = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        deletefees = new javax.swing.JButton();
        resetfees = new javax.swing.JButton();
        feesback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Fees Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(153, 0, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Fees Month:-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Fees Status:-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Student ID:-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Student Name:-");

        feestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fees Month", "Fees Status", "Student ID", "Student Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        feestable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feestableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(feestable);

        insertfees.setBackground(new java.awt.Color(255, 204, 204));
        insertfees.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertfees.setText("INSERT");
        insertfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertfeesActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        deletefees.setBackground(new java.awt.Color(255, 204, 204));
        deletefees.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletefees.setText("DELETE");
        deletefees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletefeesActionPerformed(evt);
            }
        });

        resetfees.setBackground(new java.awt.Color(255, 204, 204));
        resetfees.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetfees.setText("RESET");
        resetfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetfeesActionPerformed(evt);
            }
        });

        feesback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        feesback.setForeground(new java.awt.Color(255, 0, 0));
        feesback.setText("BACK");
        feesback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fees_month, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fees_status)
                                .addComponent(student_id)
                                .addComponent(student_name, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertfees)
                            .addComponent(deletefees))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetfees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(feesback)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fees_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fees_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertfees)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletefees)
                    .addComponent(resetfees))
                .addGap(18, 18, 18)
                .addComponent(feesback)
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void feesbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesbackActionPerformed
        // TODO add your handling code here:
        welcome w=new welcome();
        w.setVisible(true);
       
    }//GEN-LAST:event_feesbackActionPerformed

    private void resetfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetfeesActionPerformed
        // TODO add your handling code here:
        fees_month.setText(null);
        fees_status.setText(null);
        student_id.setText(null);
        student_name.setText(null);
    }//GEN-LAST:event_resetfeesActionPerformed

    private void insertfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertfeesActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="insert into feesdatabase(fees_month,fees_status,student_id,student_name)values(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, fees_month.getText());
            pst.setString(2, fees_status.getText());
            pst.setString(3, student_id.getText());
            pst.setString(4, student_name.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)feestable.getModel();
            model.setRowCount(0);
            show_feesDetails();
            JOptionPane.showMessageDialog(null,"Inserted Sucessfully!!!");
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }       
    }//GEN-LAST:event_insertfeesActionPerformed

    private void feestableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feestableMouseClicked
        // TODO add your handling code here:
         int i=feestable.getSelectedRow();
        TableModel model=feestable.getModel();
        fees_month.setText(model.getValueAt(i, 0).toString());
        fees_status.setText(model.getValueAt(i, 1).toString());
        student_id.setText(model.getValueAt(i, 2).toString());
        student_name.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_feestableMouseClicked

    private void deletefeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletefeesActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =feestable.getSelectedRow();
            String value=(feestable.getModel().getValueAt(row, 2).toString());
            String query="DELETE FROM feesdatabase WHERE student_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)feestable.getModel();
            model.setRowCount(0);
            show_feesDetails();
            JOptionPane.showMessageDialog(null,"Deleted Sucessfully!!!");
            }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_deletefeesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =feestable.getSelectedRow();
            String value=(feestable.getModel().getValueAt(row, 2).toString());
            String query="UPDATE feesdatabase SET fees_month=?,fees_status=?,student_id=?,student_name=? WHERE student_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, fees_month.getText());
            pst.setString(2, fees_status.getText());
            pst.setString(3, student_id.getText());
            pst.setString(4, student_name.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)feestable.getModel();
            model.setRowCount(0);
            show_feesDetails();
            JOptionPane.showMessageDialog(null,"Updated Sucessfully!!!");
        
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_jButton1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(fessdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fessdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fessdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fessdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fessdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletefees;
    private javax.swing.JTextField fees_month;
    private javax.swing.JTextField fees_status;
    private javax.swing.JButton feesback;
    private javax.swing.JTable feestable;
    private javax.swing.JButton insertfees;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetfees;
    private javax.swing.JTextField student_id;
    private javax.swing.JTextField student_name;
    // End of variables declaration//GEN-END:variables
}
