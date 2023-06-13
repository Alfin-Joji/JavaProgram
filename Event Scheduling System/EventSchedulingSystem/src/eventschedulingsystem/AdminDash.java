/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eventschedulingsystem;

import eventschedulingsystem.Ereq;
import eventschedulingsystem.Events;
import eventschedulingsystem.HallAlloc;

/**
 *
 * @author alfin
 */
public class AdminDash extends javax.swing.JFrame {

    /**
     * Creates new form AdminDash
     */
    public AdminDash() {
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
        Header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        PEvent = new javax.swing.JPanel();
        LEvent = new javax.swing.JLabel();
        PReq = new javax.swing.JPanel();
        LReq = new javax.swing.JLabel();
        PHall = new javax.swing.JPanel();
        LHall = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Header.setBackground(new java.awt.Color(240, 151, 57));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Event Scheduling System");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(789, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, -1));

        Menu.setBackground(new java.awt.Color(13, 36, 51));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PEvent.setBackground(new java.awt.Color(240, 151, 57));

        LEvent.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LEvent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEvent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-events-24.png"))); // NOI18N
        LEvent.setText("Events");
        LEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LEventMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PEventLayout = new javax.swing.GroupLayout(PEvent);
        PEvent.setLayout(PEventLayout);
        PEventLayout.setHorizontalGroup(
            PEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEventLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );
        PEventLayout.setVerticalGroup(
            PEventLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEventLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LEvent, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(PEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, -1));

        PReq.setBackground(new java.awt.Color(240, 151, 57));

        LReq.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LReq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LReq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-invite-24.png"))); // NOI18N
        LReq.setText("Event Request");
        LReq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LReqMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PReqLayout = new javax.swing.GroupLayout(PReq);
        PReq.setLayout(PReqLayout);
        PReqLayout.setHorizontalGroup(
            PReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LReq, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        );
        PReqLayout.setVerticalGroup(
            PReqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PReqLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LReq, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(PReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 203, -1));

        PHall.setBackground(new java.awt.Color(240, 151, 57));

        LHall.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LHall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LHall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-conference-foreground-selected-24.png"))); // NOI18N
        LHall.setText("Halls Allocated");
        LHall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LHallMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PHallLayout = new javax.swing.GroupLayout(PHall);
        PHall.setLayout(PHallLayout);
        PHallLayout.setHorizontalGroup(
            PHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PHallLayout.createSequentialGroup()
                .addComponent(LHall, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addContainerGap())
        );
        PHallLayout.setVerticalGroup(
            PHallLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PHallLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LHall, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        Menu.add(PHall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        jLabel1.setBackground(new java.awt.Color(240, 151, 57));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-account-96_1.png"))); // NOI18N
        Menu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel2.setBackground(new java.awt.Color(240, 151, 57));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 151, 57));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMIN");
        Menu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 70, -1));

        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 200, 600));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 850, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LEventMouseClicked
        Events event =new Events();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(event).setVisible(true);
    }//GEN-LAST:event_LEventMouseClicked

    private void LHallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LHallMouseClicked
        HallAlloc hallalloc =new HallAlloc();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(hallalloc).setVisible(true);
    }//GEN-LAST:event_LHallMouseClicked

    private void LReqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LReqMouseClicked
        // TODO add your handling code here:
        Ereq req =new Ereq();
        jDesktopPane1.removeAll();
        req.retrieveEventRequests();
        jDesktopPane1.add(req).setVisible(true);
    }//GEN-LAST:event_LReqMouseClicked
    
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
            java.util.logging.Logger.getLogger(AdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel LEvent;
    private javax.swing.JLabel LHall;
    private javax.swing.JLabel LReq;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel PEvent;
    private javax.swing.JPanel PHall;
    private javax.swing.JPanel PReq;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
