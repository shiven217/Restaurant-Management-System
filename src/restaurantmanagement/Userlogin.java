/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class Userlogin extends javax.swing.JFrame {

    
    /**
     * Creates new form Userlogin
     */
    public Userlogin() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        userLogin_btn = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        new_user_register_here = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1257, 791));
        setMinimumSize(new java.awt.Dimension(1257, 791));
        setPreferredSize(new java.awt.Dimension(1257, 791));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("USER");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 128, 172, 80);

        jLabel3.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(180, 130, 168, 80);

        username.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jPanel1.add(username);
        username.setBounds(34, 254, 285, 78);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Uu.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(325, 254, 75, 78);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/IMG_20190716_184219.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(327, 401, 73, 78);

        jLabel9.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel9.setText("Password");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(38, 343, 281, 52);

        jLabel10.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel10.setText("Username");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(34, 196, 273, 52);

        userLogin_btn.setBackground(new java.awt.Color(255, 0, 51));
        userLogin_btn.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        userLogin_btn.setForeground(new java.awt.Color(255, 255, 255));
        userLogin_btn.setText("Login");
        userLogin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userLogin_btnActionPerformed(evt);
            }
        });
        jPanel1.add(userLogin_btn);
        userLogin_btn.setBounds(96, 497, 175, 70);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/31.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 120, 110);

        jLabel13.setFont(new java.awt.Font("Verdana", 3, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Home");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 100, 120, 30);

        password.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jPanel1.add(password);
        password.setBounds(40, 400, 280, 80);

        new_user_register_here.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        new_user_register_here.setForeground(new java.awt.Color(255, 0, 0));
        new_user_register_here.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        new_user_register_here.setText("Register Here");
        new_user_register_here.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                new_user_register_hereMouseClicked(evt);
            }
        });
        jPanel1.add(new_user_register_here);
        new_user_register_here.setBounds(10, 630, 190, 70);

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("New User  ?");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 590, 130, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-5, 0, 410, 790);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jPanel3.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Georgia", 3, 52)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FAST   SERVICE");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(90, 20, 647, 75);

        jLabel6.setFont(new java.awt.Font("Georgia", 3, 56)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RESTAURANT");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(80, 90, 667, 75);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(410, 0, 850, 180);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rBVaSlpqpheAGqouAAJzzx7VRgs819.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 50, 850, 740);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userLogin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userLogin_btnActionPerformed
        String user=username.getText();
        String pass=password.getText();
        Statement st=new Connect().createConnection();
        String q="select * from USERLOGIN where USERNAME=' "+user+ " ' ";

try {
            ResultSet rs=st.executeQuery(q);
            rs.next();
            String s= rs.getString("PASSWORD");
            if(pass.equals(s))
            {
                  JOptionPane.showMessageDialog(null,"INCORRECT PASSWORD");
              } 
              else
              {
                  
                  JOptionPane.showMessageDialog(null,"LOGGED IN SUCCESSFULLY !!");
  
                  new Menu().setVisible(true);
                  this.setVisible(false);
              }
        }
catch(SQLException ex){
     System.out.print(ex);   
        
        JOptionPane.showMessageDialog(null,"INVALID CREDENTIALS");
}

       
    }//GEN-LAST:event_userLogin_btnActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        new Welcomepage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void new_user_register_hereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_new_user_register_hereMouseClicked
        // TODO add your handling code here:
        new Newuser().setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_new_user_register_hereMouseClicked
    

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
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Userlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel new_user_register_here;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton userLogin_btn;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
