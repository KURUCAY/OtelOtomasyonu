package application;


import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Huda
 */
public class pnlUserPassword extends javax.swing.JPanel {

    /**
     * Creates new form pnlUserPassword
     */
    public pnlUserPassword() {
        initComponents();
        backGroundColor();
        
    }

     public void backGroundColor() {
        this.setBackground(new Color(119, 119, 119));
        pnlPassword.setBackground(new Color(119, 119, 119));
        pnlPassword.setBackground(new Color(119, 119, 119));
        eParola.setBackground(new Color(160, 160, 160));
        yParola1.setBackground(new Color(160, 160, 160));
        yParola2.setBackground(new Color(160, 160, 160));
        degistirBtn.setBackground(new Color(75, 75, 75));
       

    }
     Db db = new Db("oteldenemeleri", "root", "");
     LoggerClass lg = new LoggerClass();
    private String kid = "1";
    
    private boolean parolaDogruMu(String p) {
        try {
            PreparedStatement pr = db.preConnect("call userControlPasswordPro(?,?);");
            pr.setInt(1, Integer.valueOf(kid));
            pr.setString(2, p);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            lg.loggerFunction(ex);
//            System.err.println("hata " + ex);
        }
        return false;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPassword = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        eParola = new javax.swing.JPasswordField();
        yParola1 = new javax.swing.JPasswordField();
        yParola2 = new javax.swing.JPasswordField();
        degistirBtn = new javax.swing.JButton();

        pnlPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Şifre Değişikliği"));

        jLabel1.setText("Eski Parola");

        jLabel2.setText("Yeni Parola");

        jLabel3.setText("Yeni Parola Tekrar");

        degistirBtn.setText("Değiştir");
        degistirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degistirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPasswordLayout = new javax.swing.GroupLayout(pnlPassword);
        pnlPassword.setLayout(pnlPasswordLayout);
        pnlPasswordLayout.setHorizontalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasswordLayout.createSequentialGroup()
                .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(degistirBtn)
                    .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlPasswordLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(yParola2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlPasswordLayout.createSequentialGroup()
                            .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yParola1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(eParola, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 93, Short.MAX_VALUE))
        );
        pnlPasswordLayout.setVerticalGroup(
            pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(eParola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yParola1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(yParola2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(degistirBtn)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void degistirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degistirBtnActionPerformed
        String p = String.valueOf(eParola.getPassword());

        if (parolaDogruMu(p)) {
            String y1 = String.valueOf(yParola1.getPassword());
            String y2 = String.valueOf(yParola2.getPassword());
            if (y1.equals(y2)) {
                try {
                    PreparedStatement pr = db.preConnect("call userUpdatePasswordPro(?,?);");
                    pr.setInt(1, Integer.valueOf(kid));
                    pr.setString(2, y1);
                    int i=pr.executeUpdate();
                    if (i>0) {
                        JOptionPane.showMessageDialog(this, "Şifreniz Başarıyla değiştirildi");
                    }
                } catch (SQLException ex) {
                    lg.loggerFunction(ex);
//                    System.err.println("sifre degistirme hatasi "+ex);
                }
            }
        }
    }//GEN-LAST:event_degistirBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton degistirBtn;
    private javax.swing.JPasswordField eParola;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pnlPassword;
    private javax.swing.JPasswordField yParola1;
    private javax.swing.JPasswordField yParola2;
    // End of variables declaration//GEN-END:variables
}
