/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Jframe;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Jframe extends javax.swing.JFrame {

    private static final String username = "karthi";
    private static final String password = "Selvan@6643";
    private static final String dataConn = "jdbc:mysql://localhost:3307/connector";
    
    Connection sqlConn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int q, i, id, deleteItem;
    
    public Jframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void upDateDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("select * from admission");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
                    RecordTable.setRowCount(0);
                    
                    while(rs.next()){
                        Vector columnData = new Vector();
                        for(i = 1; i<=q; i++)
                        {
                            columnData.add(rs.getString("S_NO"));
                            columnData.add(rs.getString("ID"));
                            columnData.add(rs.getString("NAME"));
                            columnData.add(rs.getString("DOB"));
                            columnData.add(rs.getString("DEPT"));
                            columnData.add(rs.getString("FEES"));
                            columnData.add(rs.getString("PHONE_NO"));
                        }
                        RecordTable.addRow(columnData);
                    }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtdob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtdept = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtfees = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtphoneno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbtninsert = new javax.swing.JButton();
        jbtnupdate = new javax.swing.JButton();
        jbtndelete = new javax.swing.JButton();
        jbtnsearch = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();
        jbtnreset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Jframe/img1.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 8));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 8, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 21, -1, -1));

        jtxtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtidActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 14, 265, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NAME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 54, -1, -1));
        jPanel1.add(jtxtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 54, 265, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DOB");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 96, -1, -1));
        jPanel1.add(jtxtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 94, 265, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DEPT");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 136, -1, -1));
        jPanel1.add(jtxtdept, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 134, 265, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("FEES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 176, -1, -1));
        jPanel1.add(jtxtfees, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 174, 265, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("PHONE NO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 216, -1, -1));
        jPanel1.add(jtxtphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 214, 265, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S_NO", "ID", "NAME", "DOB", "DEPT", "FEES", "PHONE NO"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 490, 130));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("ID");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 21, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 530, 440));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 8, true));

        jbtninsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtninsert.setText("INSERT");
        jbtninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtninsertActionPerformed(evt);
            }
        });

        jbtnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnupdate.setText("UPDATE");
        jbtnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnupdateActionPerformed(evt);
            }
        });

        jbtndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtndelete.setText("DELETE");
        jbtndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndeleteActionPerformed(evt);
            }
        });

        jbtnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnsearch.setText("SEARCH");
        jbtnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchActionPerformed(evt);
            }
        });

        jbtnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnexit.setText("EXIT");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        jbtnreset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtnreset.setText("RESET");
        jbtnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jbtninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jbtninsert)
                .addGap(46, 46, 46)
                .addComponent(jbtnupdate)
                .addGap(41, 41, 41)
                .addComponent(jbtndelete)
                .addGap(40, 40, 40)
                .addComponent(jbtnsearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jbtnreset)
                .addGap(18, 18, 18)
                .addComponent(jbtnexit)
                .addGap(35, 35, 35))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 130, 440));

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COLLEGE ADMISSION SYSTEM");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 500, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 650, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtidActionPerformed
    private JFrame frame;
    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","MySQL Connector",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtninsertActionPerformed
      
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into admission(ID,NAME,DOB,DEPT,FEES,PHONE_NO) values(?,?,?,?,?,?)");
            pst.setString(1, jtxtid.getText());
            pst.setString(2, jtxtname.getText());
            pst.setString(3, jtxtdob.getText()); 
            pst.setString(4, jtxtdept.getText());
            pst.setString(5, jtxtfees.getText());
            pst.setString(6, jtxtphoneno.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            upDateDB();      
        }
        catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch(SQLException ex){
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbtninsertActionPerformed

    private void jbtnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnupdateActionPerformed
     
      try {
        Class.forName("com.mysql.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        pst = sqlConn.prepareStatement("UPDATE admission SET NAME=?, DOB=?, DEPT=?, FEES=?, PHONE_NO=? WHERE ID=?");
        pst.setString(1, jtxtname.getText());
        pst.setString(2, jtxtdob.getText());
        pst.setString(3, jtxtdept.getText());
        pst.setString(4, jtxtfees.getText());
        pst.setString(5, jtxtphoneno.getText());
        pst.setString(6, jtxtid.getText()); // Assuming jtxtid holds the ID of the record to be updated
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Record Updated");
        upDateDB();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Jframe.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        
        
        
        
    }//GEN-LAST:event_jbtnupdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
            int SelectedRows = jTable1.getSelectedRow();
            jtxtid.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
            jtxtname.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
            jtxtdob.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
            jtxtdept.setText(RecordTable.getValueAt(SelectedRows, 4).toString());
            jtxtfees.setText(RecordTable.getValueAt(SelectedRows, 5).toString());
            jtxtphoneno.setText(RecordTable.getValueAt(SelectedRows, 6).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbtndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndeleteActionPerformed
       
    try {
        Class.forName("com.mysql.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn,username,password);
        pst = sqlConn.prepareStatement("DELETE FROM admission WHERE ID=?");
        pst.setInt(1, Integer.parseInt(jtxtid.getText()));
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this,"Deleted");
    }catch (ClassNotFoundException ex) { 
            Logger.getLogger(Jframe.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
        java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }   
    }//GEN-LAST:event_jbtndeleteActionPerformed

    private void jbtnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchActionPerformed
      try {
        Class.forName("com.mysql.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);
        pst = sqlConn.prepareStatement("SELECT * FROM admission WHERE ID=? ");
        pst.setInt(1,Integer.parseInt(jtxtid.getText())); 
        rs = pst.executeQuery();
        if (rs.next()) {
            jtxtid.setText(Integer.toString(rs.getInt("ID")));
            jtxtname.setText(rs.getString(3));
            jtxtdob.setText(rs.getString(4));
            jtxtdept.setText(rs.getString(5));
            jtxtfees.setText(rs.getString(6));
            jtxtphoneno.setText(rs.getString(7));
        }
    }catch (SQLException ex) {
    java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }catch (ClassNotFoundException ex) {
    java.util.logging.Logger.getLogger(Jframe.class.getName()).log(Level.SEVERE, null, ex);
    } 



     
    }//GEN-LAST:event_jbtnsearchActionPerformed

    private void jbtnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnresetActionPerformed
        jtxtid.setText("");
        jtxtname.setText("");
        jtxtdob.setText("");
        jtxtdept.setText("");
        jtxtfees.setText("");
        jtxtphoneno.setText("");
    }//GEN-LAST:event_jbtnresetActionPerformed

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
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtndelete;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JButton jbtninsert;
    private javax.swing.JButton jbtnreset;
    private javax.swing.JButton jbtnsearch;
    private javax.swing.JButton jbtnupdate;
    private javax.swing.JTextField jtxtdept;
    private javax.swing.JTextField jtxtdob;
    private javax.swing.JTextField jtxtfees;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JTextField jtxtphoneno;
    // End of variables declaration//GEN-END:variables
}
