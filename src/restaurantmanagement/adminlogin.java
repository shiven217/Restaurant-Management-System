/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Connect;

/**
 *
 * @author Ankit
 */
public class adminlogin extends javax.swing.JFrame {

    /**
     * Creates new form loginform
     */
    public adminlogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        admin_login_btn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1360, 780));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ADMIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 120, 172, 98);

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Home");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 90, 120, 60);

        username.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jPanel1.add(username);
        username.setBounds(40, 254, 285, 78);

        password.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jPanel1.add(password);
        password.setBounds(40, 396, 285, 78);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Uu.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(329, 254, 75, 78);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IMG_20190716_184219.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(331, 396, 73, 78);

        jLabel9.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 338, 252, 52);

        jLabel10.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel10.setText("Username");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 196, 252, 52);

        admin_login_btn.setBackground(new java.awt.Color(255, 0, 51));
        admin_login_btn.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        admin_login_btn.setForeground(new java.awt.Color(255, 255, 255));
        admin_login_btn.setText("Login");
        admin_login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_login_btnActionPerformed(evt);
            }
        });
        jPanel1.add(admin_login_btn);
        admin_login_btn.setBounds(100, 540, 175, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/31.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(0, 0, 120, 120);

        jLabel11.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("LOGIN");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(180, 120, 168, 98);

        jLabel13.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("LOGIN");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(180, 120, 168, 98);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-5, 0, 410, 870);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1260, 750));
        jPanel2.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Georgia", 3, 52)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FAST   SERVICE");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);
        jLabel7.setBounds(90, 20, 647, 75);

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 56)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RESTAURANT");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(80, 110, 667, 75);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edward-franklin-Nb_Q-M3Cdzg-unsplash.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 1260, 720);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(405, 0, 1260, 720);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void admin_login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_login_btnActionPerformed
        // TODO add your handling code here:
        String user=username.getText();
        String pas=password.getText();
        Statement st=new Connect().createConnection();
        ResultSet rs;
        
        try {
            rs = st.executeQuery("select * from adminlogin");
             rs.next();
        if(user.equals("ankit")&&pas.equals("pass")){
        JOptionPane.showMessageDialog(null, "YOU HAVE LOGGED IN SUCCESSFULLY");
        
                
        new options().setVisible(true);
        this.setVisible(false);
        }
        else  
        {
            JOptionPane.showMessageDialog(null, "Invalid Credentails !! \n Try Again ");
           username.setText("");
           password.setText("");
        }   
  
        } catch (SQLException ex) {
            Logger.getLogger(adminlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        
        
        
                 
    }//GEN-LAST:event_admin_login_btnActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        new Welcomepage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin_login_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
