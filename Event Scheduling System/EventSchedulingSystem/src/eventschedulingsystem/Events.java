/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package eventschedulingsystem;

import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alfin
 */
public class Events extends javax.swing.JInternalFrame {

    /**
     * Creates new form Events
     */
        static final String DB_URL="jdbc:mysql://localhost:3306/EventSS"; 
	static final String USER ="root";
	static final String PASS = "Aleena123$";
    public Events() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        displayEventData();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(850, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 25)); // NOI18N
        jLabel1.setText("All Upcoming Event");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "EVENT NAME", "EVENT DATE", "START TIME", "STOP TIME", "AM/PM", "HALLS ALLOCATED"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(jLabel1)
                .addContainerGap(309, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void displayEventData() {
        // Create a connection to your database
        try (Connection connection =DriverManager.getConnection(DB_URL,USER,PASS);) {
            // Create a statement for executing SQL queries
            Statement statement = connection.createStatement();
            
            // Execute a query to retrieve event data
            ResultSet resultSet = statement.executeQuery("SELECT * FROM hallallocation");
            
            // Create a DefaultTableModel to hold the table data
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            
            // Clear the existing table data
            tableModel.setRowCount(0);
            
            // Iterate over the query results and populate the table model
            while (resultSet.next()) {
                String eventName = resultSet.getString("name");
                String eventDate = resultSet.getString("date");
                String startTime = resultSet.getString("start_time");
                String stopTime = resultSet.getString("end_time");
                String amPm = resultSet.getString("am_pm");
                String hallallocated= resultSet.getString("hallallocate");
                // Add a new row to the table model with the retrieved data
                tableModel.addRow(new Object[]{eventName, eventDate, startTime, stopTime, amPm, hallallocated});
            }
            
            // Close the ResultSet, statement, and connection
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any errors that may occur during the database operations
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
