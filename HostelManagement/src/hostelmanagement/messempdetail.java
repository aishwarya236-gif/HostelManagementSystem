
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

public class messempdetail extends javax.swing.JFrame {

    public messempdetail() {
        initComponents();
        show_messempDetails();
    }

     public ArrayList<MessEmp> messempList(){
        ArrayList<MessEmp> messempDetails=new ArrayList<>();
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="SELECT * FROM messempdatabase";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            MessEmp me;
            while(rs.next()){
                me=new MessEmp(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getString("emp_address"),rs.getInt("salary"),rs.getInt("emp_phone"),rs.getInt("hostel_id"),rs.getString("emp_designation"),rs.getInt("mess_incharge_id"));
                messempDetails.add(me);
            }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }   
        return messempDetails;
    }
    
    public void show_messempDetails(){
        ArrayList<MessEmp> list=messempList();
        DefaultTableModel model=(DefaultTableModel) messemptable.getModel();
        Object[] row=new Object[10];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getemp_id();
            row[1]=list.get(i).getemp_name();
            row[2]=list.get(i).getemp_address();
            row[3]=list.get(i).getsalary();
            row[4]=list.get(i).getemp_phone();
            row[5]=list.get(i).gethostel_id();
            row[6]=list.get(i).getemp_designation();
            row[7]=list.get(i).getmess_incharge_id();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emp_id = new javax.swing.JTextField();
        emp_name = new javax.swing.JTextField();
        emp_address = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        emp_phone = new javax.swing.JTextField();
        hostel_id = new javax.swing.JTextField();
        emp_designation = new javax.swing.JTextField();
        mess_incharge_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messemptable = new javax.swing.JTable();
        insertmessemp = new javax.swing.JButton();
        updatemessemp = new javax.swing.JButton();
        deletemessemp = new javax.swing.JButton();
        resetmessemp = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Mess Employee Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(102, 0, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Employee ID:-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Employee Name:-");
        jLabel2.setAutoscrolls(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Employee Address:-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Salary:-");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Phone Number:-");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Hostel ID:-");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Employee Designation:-");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Mess Incharge ID:-");

        hostel_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostel_idActionPerformed(evt);
            }
        });

        messemptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Employee Name", "Employee Address", "Salary", "Phone Number", "Hostel ID", "Employee Designation", "Mess Incharge ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        messemptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                messemptableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(messemptable);

        insertmessemp.setBackground(new java.awt.Color(204, 255, 204));
        insertmessemp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertmessemp.setText("INSERT");
        insertmessemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertmessempActionPerformed(evt);
            }
        });

        updatemessemp.setBackground(new java.awt.Color(204, 255, 204));
        updatemessemp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatemessemp.setText("UPDATE");
        updatemessemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatemessempActionPerformed(evt);
            }
        });

        deletemessemp.setBackground(new java.awt.Color(204, 255, 204));
        deletemessemp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletemessemp.setText("DELETE");
        deletemessemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletemessempActionPerformed(evt);
            }
        });

        resetmessemp.setBackground(new java.awt.Color(204, 255, 204));
        resetmessemp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetmessemp.setText("RESET");
        resetmessemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetmessempActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 0));
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(deletemessemp)
                                .addComponent(insertmessemp)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emp_id)
                                    .addComponent(emp_name)
                                    .addComponent(emp_address)
                                    .addComponent(salary)
                                    .addComponent(emp_phone)
                                    .addComponent(hostel_id)
                                    .addComponent(emp_designation)
                                    .addComponent(mess_incharge_id, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(updatemessemp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(resetmessemp, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                        .addGap(90, 90, 90))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(emp_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(emp_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emp_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emp_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hostel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(emp_designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mess_incharge_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertmessemp)
                    .addComponent(updatemessemp))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetmessemp)
                    .addComponent(deletemessemp))
                .addGap(9, 9, 9)
                .addComponent(jButton5)
                .addGap(0, 19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        welcome w=new welcome();
        w.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void updatemessempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatemessempActionPerformed
        // TODO add your handling code here:
         try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =messemptable.getSelectedRow();
            String value=(messemptable.getModel().getValueAt(row, 0).toString());
            String query="UPDATE messempdatabase SET emp_id=?, emp_name=?,emp_address=?,salary=?,emp_phone=?,hostel_id=?,emp_designation=?,mess_incharge_id=? WHERE emp_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, emp_id.getText());
            pst.setString(2, emp_name.getText());
            pst.setString(3, emp_address.getText());
            pst.setString(4, salary.getText());
            pst.setString(5, emp_phone.getText());
            pst.setString(6, hostel_id.getText());
            pst.setString(7, emp_designation.getText());
            pst.setString(8, mess_incharge_id.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)messemptable.getModel();
            model.setRowCount(0);
            show_messempDetails();
            JOptionPane.showMessageDialog(null,"Updated Sucessfully!!!");
        
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  

    }//GEN-LAST:event_updatemessempActionPerformed

    private void insertmessempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertmessempActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="insert into messempdatabase(emp_id,emp_name,emp_address,salary,emp_phone,hostel_id,emp_designation,mess_incharge_id)values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, emp_id.getText());
            pst.setString(2, emp_name.getText());
            pst.setString(3, emp_address.getText());
            pst.setString(4, salary.getText());
            pst.setString(5, emp_phone.getText());
            pst.setString(6, hostel_id.getText());
            pst.setString(7, emp_designation.getText());
            pst.setString(8, mess_incharge_id.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)messemptable.getModel();
            model.setRowCount(0);
            show_messempDetails();
            JOptionPane.showMessageDialog(null,"Inserted Sucessfully!!!");
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }       
    }//GEN-LAST:event_insertmessempActionPerformed

    private void messemptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_messemptableMouseClicked
        // TODO add your handling code here:
        int i=messemptable.getSelectedRow();
        TableModel model=messemptable.getModel();
        emp_id.setText(model.getValueAt(i, 0).toString());
        emp_name.setText(model.getValueAt(i, 1).toString());
        emp_address.setText(model.getValueAt(i, 2).toString());
        salary.setText(model.getValueAt(i, 3).toString());
        emp_phone.setText(model.getValueAt(i, 4).toString());
        hostel_id.setText(model.getValueAt(i, 5).toString());
        emp_designation.setText(model.getValueAt(i, 6).toString());
        mess_incharge_id.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_messemptableMouseClicked

    private void deletemessempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletemessempActionPerformed
        // TODO add your handling code here:
         try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =messemptable.getSelectedRow();
            String value=(messemptable.getModel().getValueAt(row, 0).toString());
            String query="DELETE FROM messempdatabase WHERE emp_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)messemptable.getModel();
            model.setRowCount(0);
            show_messempDetails();
            JOptionPane.showMessageDialog(null,"Deleted Sucessfully!!!");
            }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_deletemessempActionPerformed

    private void resetmessempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetmessempActionPerformed
        // TODO add your handling code here:
         hostel_id.setText(null);
        emp_name.setText(null);
        emp_address.setText(null);
        salary.setText(null);
        emp_phone.setText(null);
        emp_id.setText(null);
        emp_designation.setText(null);
        mess_incharge_id.setText(null);
    }//GEN-LAST:event_resetmessempActionPerformed

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
            java.util.logging.Logger.getLogger(messempdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(messempdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(messempdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(messempdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new messempdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deletemessemp;
    private javax.swing.JTextField emp_address;
    private javax.swing.JTextField emp_designation;
    private javax.swing.JTextField emp_id;
    private javax.swing.JTextField emp_name;
    private javax.swing.JTextField emp_phone;
    private javax.swing.JTextField hostel_id;
    private javax.swing.JButton insertmessemp;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mess_incharge_id;
    private javax.swing.JTable messemptable;
    private javax.swing.JButton resetmessemp;
    private javax.swing.JTextField salary;
    private javax.swing.JButton updatemessemp;
    // End of variables declaration//GEN-END:variables
}
