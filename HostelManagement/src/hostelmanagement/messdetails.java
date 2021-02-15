
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

public class messdetails extends javax.swing.JFrame {

    public messdetails() {
        initComponents();
         show_messDetails();
    }
public ArrayList<Mess> messList(){
        ArrayList<Mess> messDetails=new ArrayList<>();
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="SELECT * FROM messdatabase";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            Mess m;
            while(rs.next()){
                m=new Mess(rs.getInt("mess_incharge_id"),rs.getInt("monthly_expenses"),rs.getString("mess_timing"),rs.getInt("hostel_id"));
                messDetails.add(m);
            }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }   
        return messDetails;
    }
     public void show_messDetails(){
        ArrayList<Mess> list=messList();
        DefaultTableModel model=(DefaultTableModel) messtable.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getmess_incharge_id();
            row[1]=list.get(i).getmonthly_expences();
            row[2]=list.get(i).getmess_timing();
            row[3]=list.get(i).gethostel_id();
            model.addRow(row);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mess_incharge_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        monthly_expenses = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mess_timing = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        hostel_id = new javax.swing.JTextField();
        insertmess = new javax.swing.JButton();
        updatemess = new javax.swing.JButton();
        deletemess = new javax.swing.JButton();
        resetmess = new javax.swing.JButton();
        backmess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messtable = new javax.swing.JTable();

        jButton1.setText("jButton1");

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Mess Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(153, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Mess Incharge ID:-");

        mess_incharge_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mess_incharge_idActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Monthly Expenses:-");

        monthly_expenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthly_expensesActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mess Timing:-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Hostel ID:-");

        hostel_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostel_idActionPerformed(evt);
            }
        });

        insertmess.setBackground(new java.awt.Color(204, 153, 255));
        insertmess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertmess.setText("INSERT");
        insertmess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertmessActionPerformed(evt);
            }
        });

        updatemess.setBackground(new java.awt.Color(204, 153, 255));
        updatemess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatemess.setText("UPDATE");
        updatemess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatemessActionPerformed(evt);
            }
        });

        deletemess.setBackground(new java.awt.Color(204, 153, 255));
        deletemess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletemess.setText("DELETE");
        deletemess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletemessActionPerformed(evt);
            }
        });

        resetmess.setBackground(new java.awt.Color(204, 153, 255));
        resetmess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetmess.setText("RESET");
        resetmess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetmessActionPerformed(evt);
            }
        });

        backmess.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backmess.setForeground(new java.awt.Color(255, 0, 0));
        backmess.setText("BACK");
        backmess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backmessActionPerformed(evt);
            }
        });

        messtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mess Incharge ID", "Monthly Expenses", "Mess Timing", "Hostel ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        messtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(messtable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(insertmess, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deletemess, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(mess_incharge_id, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(monthly_expenses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mess_timing, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hostel_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(resetmess, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(updatemess))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(backmess)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mess_incharge_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(monthly_expenses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mess_timing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hostel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertmess)
                    .addComponent(updatemess))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletemess)
                    .addComponent(resetmess))
                .addGap(18, 18, 18)
                .addComponent(backmess)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
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

    private void mess_incharge_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mess_incharge_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mess_incharge_idActionPerformed

    private void backmessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backmessActionPerformed
        // TODO add your handling code here:
         welcome w=new welcome();
        w.setVisible(true);
    }//GEN-LAST:event_backmessActionPerformed

    private void updatemessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatemessActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =messtable.getSelectedRow();
            String value=(messtable.getModel().getValueAt(row, 0).toString());
            String query="UPDATE messdatabase SET mess_incharge_id=?, monthly_expenses=?,mess_timing=?,hostel_id=? WHERE mess_incharge_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, mess_incharge_id.getText());
            pst.setString(2, monthly_expenses.getText());
            pst.setString(3, mess_timing.getText());
            pst.setString(4, hostel_id.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)messtable.getModel();
            model.setRowCount(0);
            show_messDetails();
            JOptionPane.showMessageDialog(null,"Updated Sucessfully!!!");
        
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  

    }//GEN-LAST:event_updatemessActionPerformed

    private void monthly_expensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthly_expensesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthly_expensesActionPerformed

    private void insertmessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertmessActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="insert into messdatabase(mess_incharge_id,monthly_expenses,mess_timing,hostel_id)values(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, mess_incharge_id.getText());
            pst.setString(2, monthly_expenses.getText());
            pst.setString(3, mess_timing.getText());
            pst.setString(4, hostel_id.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)messtable.getModel();
            model.setRowCount(0);
            show_messDetails();
            JOptionPane.showMessageDialog(null,"Inserted Sucessfully!!!");
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }       
    }//GEN-LAST:event_insertmessActionPerformed

    private void messtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messtableMouseClicked
        // TODO add your handling code here:
        int i=messtable.getSelectedRow();
        TableModel model=messtable.getModel();
        mess_incharge_id.setText(model.getValueAt(i, 0).toString());
        monthly_expenses.setText(model.getValueAt(i, 1).toString());
        mess_timing.setText(model.getValueAt(i, 2).toString());
        hostel_id.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_messtableMouseClicked

    private void deletemessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletemessActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row=messtable.getSelectedRow();
            String value=(messtable.getModel().getValueAt(row, 0).toString());
            String query="DELETE FROM messdatabase WHERE mess_incharge_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)messtable.getModel();
            model.setRowCount(0);
            show_messDetails();
            JOptionPane.showMessageDialog(null,"Deleted Sucessfully!!!");
            }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_deletemessActionPerformed

    private void resetmessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetmessActionPerformed
        // TODO add your handling code here:
        mess_incharge_id.setText(null);
        monthly_expenses.setText(null);
        mess_timing.setText(null);
        hostel_id.setText(null);
    }//GEN-LAST:event_resetmessActionPerformed

    private void hostel_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostel_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostel_idActionPerformed

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
            java.util.logging.Logger.getLogger(messdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(messdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(messdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(messdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new messdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backmess;
    private javax.swing.JButton deletemess;
    private javax.swing.JTextField hostel_id;
    private javax.swing.JButton insertmess;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mess_incharge_id;
    private javax.swing.JTextField mess_timing;
    private javax.swing.JTable messtable;
    private javax.swing.JTextField monthly_expenses;
    private javax.swing.JButton resetmess;
    private javax.swing.JButton updatemess;
    // End of variables declaration//GEN-END:variables
}
