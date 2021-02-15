
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
public class HostelFrame extends javax.swing.JFrame {

    
    public HostelFrame() {
        initComponents();
        show_hostelDetails();
    }

    public ArrayList<Hostel> hostelList(){
        ArrayList<Hostel> hostelDetails=new ArrayList<>();
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="SELECT * FROM hosteldatabase";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            Hostel h;
            while(rs.next()){
                h=new Hostel(rs.getInt("hostel_id"),rs.getInt("no_of_students"),rs.getString("location"),rs.getInt("annual_fees"),rs.getInt("no_of_rooms"));
                hostelDetails.add(h);
            }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }   
        return hostelDetails;
    }
    
    public void show_hostelDetails(){
        ArrayList<Hostel> list=hostelList();
        DefaultTableModel model=(DefaultTableModel) hosteltable.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).gethostel_id();
            row[1]=list.get(i).getno_of_students();
            row[2]=list.get(i).getlocation();
            row[3]=list.get(i).getannual_fees();
            row[4]=list.get(i).getno_of_rooms();
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hostel_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        no_of_students = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        annual_fees = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        no_of_rooms = new javax.swing.JTextField();
        inserthostel = new javax.swing.JButton();
        updatehostel = new javax.swing.JButton();
        deletehostel = new javax.swing.JButton();
        resethostel = new javax.swing.JButton();
        backhostel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hosteltable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Hostel Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(153, 0, 153))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Hostel ID:-");

        hostel_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostel_idActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Number of Students:-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Location:-");

        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Annual Fees:-");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Number of Rooms:-");

        no_of_rooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_of_roomsActionPerformed(evt);
            }
        });

        inserthostel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        inserthostel.setText("INSERT");
        inserthostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserthostelActionPerformed(evt);
            }
        });

        updatehostel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatehostel.setText("UPDATE");
        updatehostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatehostelActionPerformed(evt);
            }
        });

        deletehostel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletehostel.setText("DELETE");
        deletehostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletehostelActionPerformed(evt);
            }
        });

        resethostel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resethostel.setText("RESET");
        resethostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resethostelActionPerformed(evt);
            }
        });

        backhostel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backhostel.setForeground(new java.awt.Color(255, 0, 0));
        backhostel.setText("BACK");
        backhostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backhostelActionPerformed(evt);
            }
        });

        hosteltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hostel ID", "Number of students", "Location", "Annual Fees", "Number of rooms"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        hosteltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hosteltableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(hosteltable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(no_of_students, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hostel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(no_of_rooms, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(annual_fees, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(resethostel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(deletehostel))
                                        .addGap(58, 58, 58))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backhostel)
                                .addGap(174, 174, 174)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inserthostel)
                            .addComponent(jLabel1)
                            .addComponent(updatehostel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(13, 13, 13))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hostel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(no_of_students, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(annual_fees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_of_rooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inserthostel)
                    .addComponent(deletehostel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resethostel)
                    .addComponent(updatehostel))
                .addGap(18, 18, 18)
                .addComponent(backhostel)
                .addGap(8, 8, 8))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void no_of_roomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_of_roomsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_of_roomsActionPerformed

    private void inserthostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserthostelActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="insert into hosteldatabase(hostel_id,no_of_students,location,annual_fees,no_of_rooms)values(?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, hostel_id.getText());
            pst.setString(2, no_of_students.getText());
            pst.setString(3, location.getText());
            pst.setString(4, annual_fees.getText());
            pst.setString(5, no_of_rooms.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)hosteltable.getModel();
            model.setRowCount(0);
            show_hostelDetails();
            JOptionPane.showMessageDialog(null,"Inserted Sucessfully!!!");
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }       
    }//GEN-LAST:event_inserthostelActionPerformed

    private void deletehostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletehostelActionPerformed
        // TODO add your handling code here:
          try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =hosteltable.getSelectedRow();
            String value=(hosteltable.getModel().getValueAt(row, 0).toString());
            String query="DELETE FROM hosteldatabase WHERE hostel_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)hosteltable.getModel();
            model.setRowCount(0);
            show_hostelDetails();
            JOptionPane.showMessageDialog(null,"Deleted Sucessfully!!!");
            }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_deletehostelActionPerformed

    private void updatehostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatehostelActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =hosteltable.getSelectedRow();
            String value=(hosteltable.getModel().getValueAt(row, 0).toString());
            String query="UPDATE hosteldatabase SET hostel_id=?, no_of_students=?,location=?,annual_fees=?,no_of_rooms=? WHERE hostel_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, hostel_id.getText());
            pst.setString(2, no_of_students.getText());
            pst.setString(3, location.getText());
            pst.setString(4, annual_fees.getText());
            pst.setString(5, no_of_rooms.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)hosteltable.getModel();
            model.setRowCount(0);
            show_hostelDetails();
            JOptionPane.showMessageDialog(null,"Updated Sucessfully!!!");
        
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_updatehostelActionPerformed

    private void resethostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resethostelActionPerformed
        // TODO add your handling code here:
         hostel_id.setText(null);
        no_of_students.setText(null);
        location.setText(null);
        annual_fees.setText(null);
        no_of_rooms.setText(null);
    }//GEN-LAST:event_resethostelActionPerformed

    private void backhostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backhostelActionPerformed
        // TODO add your handling code here:
         welcome w=new welcome();
        w.setVisible(true);
    }//GEN-LAST:event_backhostelActionPerformed

    private void hosteltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hosteltableMouseClicked
        // TODO add your handling code here:
        int i=hosteltable.getSelectedRow();
        TableModel model=hosteltable.getModel();
        hostel_id.setText(model.getValueAt(i, 0).toString());
        no_of_students.setText(model.getValueAt(i, 1).toString());
        location.setText(model.getValueAt(i, 2).toString());
        annual_fees.setText(model.getValueAt(i, 3).toString());
        no_of_rooms.setText(model.getValueAt(i, 4).toString());
    }//GEN-LAST:event_hosteltableMouseClicked

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
            java.util.logging.Logger.getLogger(HostelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HostelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HostelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HostelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HostelFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField annual_fees;
    private javax.swing.JButton backhostel;
    private javax.swing.JButton deletehostel;
    private javax.swing.JTextField hostel_id;
    private javax.swing.JTable hosteltable;
    private javax.swing.JButton inserthostel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField location;
    private javax.swing.JTextField no_of_rooms;
    private javax.swing.JTextField no_of_students;
    private javax.swing.JButton resethostel;
    private javax.swing.JButton updatehostel;
    // End of variables declaration//GEN-END:variables
}
