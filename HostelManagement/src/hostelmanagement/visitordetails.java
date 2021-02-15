
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

public class visitordetails extends javax.swing.JFrame {

    public visitordetails() {
        initComponents();
        show_visitorDetails();
    }

     public ArrayList<Visitor> visitorList(){
        ArrayList<Visitor> visitorDetails=new ArrayList<>();
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="SELECT * FROM visitordatabase";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            Visitor v;
            while(rs.next()){
                v=new Visitor(rs.getInt("visitor_id"),rs.getInt("student_id"),rs.getString("visitor_name"),rs.getString("time_in"),rs.getString("time_out"),rs.getString("date"));
                visitorDetails.add(v);
            }
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }   
        return visitorDetails;
    }
   
   public void show_visitorDetails(){
        ArrayList<Visitor> list=visitorList();
        DefaultTableModel model=(DefaultTableModel) visitortable.getModel();
        Object[] row=new Object[10];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getvisitor_id();
            row[1]=list.get(i).getstudent_id();
            row[2]=list.get(i).getvisitor_name();
            row[3]=list.get(i).gettime_in();
            row[4]=list.get(i).gettime_out();
            row[5]=list.get(i).getdate();
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
        visitor_id = new javax.swing.JTextField();
        student_id = new javax.swing.JTextField();
        visitor_name = new javax.swing.JTextField();
        time_in = new javax.swing.JTextField();
        time_out = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        visitortable = new javax.swing.JTable();
        insertvisitor = new javax.swing.JButton();
        updatevisitor = new javax.swing.JButton();
        deletevisitor = new javax.swing.JButton();
        resetvisitor = new javax.swing.JButton();
        visitorback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Visitor Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Visitor ID:-");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Student ID:-");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Visitor Name:-");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Time In:-");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Time Out:-");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Date:-");

        visitortable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Visitor ID", "Student ID", "Visitor Name", "Time In", "Time Out", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        visitortable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visitortableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(visitortable);

        insertvisitor.setBackground(new java.awt.Color(204, 204, 255));
        insertvisitor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        insertvisitor.setText("INSERT");
        insertvisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertvisitorActionPerformed(evt);
            }
        });

        updatevisitor.setBackground(new java.awt.Color(204, 204, 255));
        updatevisitor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updatevisitor.setText("UPDATE");
        updatevisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatevisitorActionPerformed(evt);
            }
        });

        deletevisitor.setBackground(new java.awt.Color(204, 204, 255));
        deletevisitor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletevisitor.setText("DELETE");
        deletevisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletevisitorActionPerformed(evt);
            }
        });

        resetvisitor.setBackground(new java.awt.Color(204, 204, 255));
        resetvisitor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetvisitor.setText("RESET");
        resetvisitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetvisitorActionPerformed(evt);
            }
        });

        visitorback.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        visitorback.setForeground(new java.awt.Color(255, 0, 0));
        visitorback.setText("BACK");
        visitorback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time_in)
                            .addComponent(time_out)
                            .addComponent(date)
                            .addComponent(student_id)
                            .addComponent(visitor_name)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(visitor_id, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deletevisitor)
                            .addComponent(insertvisitor))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updatevisitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetvisitor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(visitorback)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(visitor_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(visitor_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(time_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(time_out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertvisitor)
                    .addComponent(updatevisitor))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletevisitor)
                    .addComponent(resetvisitor))
                .addGap(18, 18, 18)
                .addComponent(visitorback)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

    private void visitorbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorbackActionPerformed
        // TODO add your handling code here:
        welcome w=new welcome();
        w.setVisible(true);
    }//GEN-LAST:event_visitorbackActionPerformed

    private void insertvisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertvisitorActionPerformed
        // TODO add your handling code here:
        try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            String query="insert into visitordatabase(visitor_id,student_id,visitor_name,time_in,time_out,date)values(?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, visitor_id.getText());
            pst.setString(2, student_id.getText());
            pst.setString(3, visitor_name.getText());
            pst.setString(4, time_in.getText());
            pst.setString(5, time_out.getText());
            pst.setString(6, date.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)visitortable.getModel();
            model.setRowCount(0);
            show_visitorDetails();
            JOptionPane.showMessageDialog(null,"Inserted Sucessfully!!!");
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }       
    }//GEN-LAST:event_insertvisitorActionPerformed

    private void visitortableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visitortableMouseClicked
        // TODO add your handling code here:
        int i=visitortable.getSelectedRow();
        TableModel model=visitortable.getModel();
        visitor_id.setText(model.getValueAt(i, 0).toString());
        student_id.setText(model.getValueAt(i, 1).toString());
        visitor_name.setText(model.getValueAt(i, 2).toString());
        time_in.setText(model.getValueAt(i, 3).toString());
        time_out.setText(model.getValueAt(i, 4).toString());
        date.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_visitortableMouseClicked

    private void updatevisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatevisitorActionPerformed
        // TODO add your handling code here:
         try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =visitortable.getSelectedRow();
            String value=(visitortable.getModel().getValueAt(row, 0).toString());
            String query="UPDATE visitordatabase SET visitor_id=?, student_id=?,visitor_name=?,time_in=?,time_out=?,date=? WHERE visitor_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, visitor_id.getText());
            pst.setString(2, student_id.getText());
            pst.setString(3, visitor_name.getText());
            pst.setString(4, time_in.getText());
            pst.setString(5, time_out.getText());
            pst.setString(6, date.getText());
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)visitortable.getModel();
            model.setRowCount(0);
            show_visitorDetails();
            JOptionPane.showMessageDialog(null,"Updated Sucessfully!!!");
        
        }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_updatevisitorActionPerformed

    private void deletevisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletevisitorActionPerformed
        // TODO add your handling code here:
         try{
            String url="jdbc:mysql://localhost:3306/hostelmanagementsystem?user=root&password=";
            Connection con=DriverManager.getConnection(url);
            int row =visitortable.getSelectedRow();
            String value=(visitortable.getModel().getValueAt(row, 0).toString());
            String query="DELETE FROM visitordatabase WHERE visitor_id="+value;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)visitortable.getModel();
            model.setRowCount(0);
            show_visitorDetails();
            JOptionPane.showMessageDialog(null,"Deleted Sucessfully!!!");
            }
         catch(Exception e){
             JOptionPane.showMessageDialog(null,e);
         }  
    }//GEN-LAST:event_deletevisitorActionPerformed

    private void resetvisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetvisitorActionPerformed
        // TODO add your handling code here:
         visitor_id.setText(null);
        student_id.setText(null);
        visitor_name.setText(null);
        time_in.setText(null);
        time_out.setText(null);
        date.setText(null);
    }//GEN-LAST:event_resetvisitorActionPerformed

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
            java.util.logging.Logger.getLogger(visitordetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visitordetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visitordetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visitordetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visitordetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JButton deletevisitor;
    private javax.swing.JButton insertvisitor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton resetvisitor;
    private javax.swing.JTextField student_id;
    private javax.swing.JTextField time_in;
    private javax.swing.JTextField time_out;
    private javax.swing.JButton updatevisitor;
    private javax.swing.JTextField visitor_id;
    private javax.swing.JTextField visitor_name;
    private javax.swing.JButton visitorback;
    private javax.swing.JTable visitortable;
    // End of variables declaration//GEN-END:variables
}
