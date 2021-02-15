
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

public class roomdetails extends javax.swing.JFrame {

   
    public roomdetails() {
        initComponents();
            show_roomDetails();
    }

    public ArrayList<Room> roomList(){
        ArrayList<Room> roomDetails=new ArrayList<>();
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="SELECT * FROM roomdatabase";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            Room r;
            while(rs.next()){
                r=new Room(rs.getInt("room_id"),rs.getInt("capacity"),rs.getInt("no_of_beds"),rs.getString("furniture_type"),rs.getInt("hostel_id"),rs.getString("name_of_student"));
                roomDetails.add(r);
            }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }   
        return roomDetails;
    }
    
    public void show_roomDetails(){
        ArrayList<Room> list=roomList();
        DefaultTableModel model=(DefaultTableModel) roomtable.getModel();
        Object[] row=new Object[6];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getroom_id();
            row[1]=list.get(i).getcapacity();
            row[2]=list.get(i).getno_of_beds();
            row[3]=list.get(i).getfurniture_type();
            row[4]=list.get(i).gethostelID();
            row[5]=list.get(i).getname_of_student();
            model.addRow(row);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        room_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        capacity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        no_of_beds = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        furniture_type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        hostel_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        name_of_student = new javax.swing.JTextField();
        insertroom = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomtable = new javax.swing.JTable();
        updateroom = new javax.swing.JButton();
        deleteroom = new javax.swing.JButton();
        resetroom = new javax.swing.JButton();
        roomback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Room Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(204, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Room ID:-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Capacity:-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Number of Beds:-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Furniture Type:-");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Hostel ID:-");

        hostel_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostel_idActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Student Name:-");

        insertroom.setBackground(new java.awt.Color(255, 204, 204));
        insertroom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertroom.setText("INSERT");
        insertroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertroomActionPerformed(evt);
            }
        });

        roomtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room ID", "Capacity", "Number of Beds", "Furniture Type", "Hostel ID", "Student Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        roomtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(roomtable);

        updateroom.setBackground(new java.awt.Color(255, 204, 204));
        updateroom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateroom.setText("UPDATE");
        updateroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateroomActionPerformed(evt);
            }
        });

        deleteroom.setBackground(new java.awt.Color(255, 204, 204));
        deleteroom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteroom.setText("DELETE");
        deleteroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteroomActionPerformed(evt);
            }
        });

        resetroom.setBackground(new java.awt.Color(255, 204, 204));
        resetroom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetroom.setText("RESET");
        resetroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetroomActionPerformed(evt);
            }
        });

        roomback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        roomback.setForeground(new java.awt.Color(255, 0, 0));
        roomback.setText("BACK");
        roomback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roombackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(capacity, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                    .addComponent(room_id)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(no_of_beds)
                                    .addComponent(furniture_type, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(hostel_id)
                                        .addComponent(name_of_student)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(insertroom)
                                        .addComponent(deleteroom))
                                    .addGap(50, 50, 50)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(updateroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(resetroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 92, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(roomback)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(room_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(no_of_beds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(furniture_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hostel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(name_of_student, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertroom)
                    .addComponent(updateroom))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteroom)
                    .addComponent(resetroom))
                .addGap(18, 18, 18)
                .addComponent(roomback)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void roombackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roombackActionPerformed
        // TODO add your handling code here:
        welcome w=new welcome();
        w.setVisible(true);
    }//GEN-LAST:event_roombackActionPerformed

    private void insertroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertroomActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="insert into roomdatabase(room_id,capacity,no_of_beds,furniture_type,hostel_id,name_of_student)values(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, room_id.getText());
            pst.setString(2, capacity.getText());
            pst.setString(3, no_of_beds.getText());
            pst.setString(4, furniture_type.getText());
            pst.setString(5, hostel_id.getText());
            pst.setString(6, name_of_student.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)roomtable.getModel();
            model.setRowCount(0);
            show_roomDetails();
            JOptionPane.showMessageDialog(null,"Inserted Sucessfully!!!");
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }       
    }//GEN-LAST:event_insertroomActionPerformed

    private void updateroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateroomActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =roomtable.getSelectedRow();
            String value=(roomtable.getModel().getValueAt(row, 0).toString());
            String query="UPDATE roomdatabase SET room_id=?, capacity=?,no_of_beds=?,furniture_type=?,hostel_id=?,name_of_student=? WHERE room_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, room_id.getText());
            pst.setString(2, capacity.getText());
            pst.setString(3, no_of_beds.getText());
            pst.setString(4, furniture_type.getText());
            pst.setString(5, hostel_id.getText());
            pst.setString(6, name_of_student.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)roomtable.getModel();
            model.setRowCount(0);
            show_roomDetails();
            JOptionPane.showMessageDialog(null,"Updated Sucessfully!!!");
        
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_updateroomActionPerformed

    private void roomtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomtableMouseClicked
        // TODO add your handling code here:
        int i=roomtable.getSelectedRow();
        TableModel model=roomtable.getModel();
        room_id.setText(model.getValueAt(i, 0).toString());
        capacity.setText(model.getValueAt(i, 1).toString());
        no_of_beds.setText(model.getValueAt(i, 2).toString());
        furniture_type.setText(model.getValueAt(i, 3).toString());
        hostel_id.setText(model.getValueAt(i, 4).toString());
        name_of_student.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_roomtableMouseClicked

    private void deleteroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteroomActionPerformed
        // TODO add your handling code here:
         try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =roomtable.getSelectedRow();
            String value=(roomtable.getModel().getValueAt(row, 0).toString());
            String query="DELETE FROM roomdatabase WHERE room_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)roomtable.getModel();
            model.setRowCount(0);
            show_roomDetails();
            JOptionPane.showMessageDialog(null,"Deleted Sucessfully!!!");
            }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_deleteroomActionPerformed

    private void resetroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetroomActionPerformed
        // TODO add your handling code here:
        hostel_id.setText(null);
        name_of_student.setText(null);
        room_id.setText(null);
        furniture_type.setText(null);
        no_of_beds.setText(null);
        capacity.setText(null);
    
    }//GEN-LAST:event_resetroomActionPerformed

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
            java.util.logging.Logger.getLogger(roomdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roomdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roomdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roomdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roomdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField capacity;
    private javax.swing.JButton deleteroom;
    private javax.swing.JTextField furniture_type;
    private javax.swing.JTextField hostel_id;
    private javax.swing.JButton insertroom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_of_student;
    private javax.swing.JTextField no_of_beds;
    private javax.swing.JButton resetroom;
    private javax.swing.JTextField room_id;
    private javax.swing.JButton roomback;
    private javax.swing.JTable roomtable;
    private javax.swing.JButton updateroom;
    // End of variables declaration//GEN-END:variables
}
