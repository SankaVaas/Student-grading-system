/*
  project svs
 */
package finalyearproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1234
 */
public class MainApp extends javax.swing.JFrame {
    private int shomeworks;
    private int stestmarks;
    private String grade;
    private String resultID;
    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
        stud_id.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        stud_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        stud_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        stud_hwScore = new javax.swing.JTextField();
        stud_tScore = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT GRADING SYSTEM");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Student Name");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Home work Score not exceeding 30%");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Test score not exceeding 70%");

        jButton1.setBackground(new java.awt.Color(0, 255, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 153, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("ADD STUDENT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton3.setText("VIEW GRADES");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(636, 636, 636)
                                                                .addComponent(stud_id, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(stud_name, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGap(305, 305, 305)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4))
                                                                        .addGap(204, 204, 204)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(stud_hwScore, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(stud_tScore, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGap(218, 218, 218)
                                                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGap(41, 41, 41)
                                                                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(196, 196, 196)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(465, 465, 465)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(227, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(stud_id, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(21, 21, 21)
                                                .addComponent(stud_name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(stud_hwScore, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(stud_tScore, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(120, 120, 120)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(67, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        GradesTable tab = new GradesTable();
        tab.setVisible(true);
        setVisible(false);
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        if(stud_name.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the student Name");
        }else if(stud_hwScore.getText().equals("")){

            JOptionPane.showMessageDialog(null, "Homework score must not be empty");

        }else if(stud_tScore.getText().equals("")){
            //check if  marks is an integer
            JOptionPane.showMessageDialog(null, "Test marks must not be empty");


        }else{

            //Calculate the total score
            //check if value entered is an integer
            Connection connect = createConnection();
            String homework = stud_hwScore.getText();
            String db_ID = "SELECT `id` FROM `students`";
            Statement stmt;
            ResultSet result;
            String ID = stud_id.getText();
            try{
                stmt = connect.createStatement();
                result = stmt.executeQuery(db_ID);
                StudentInfo stud;
                while(result.next())
                {
                    String resultID = result.getString("id");
                }

                if(ID == resultID){
                    JOptionPane.showMessageDialog(null, "Sudent ID already exists");
                    //System.exit(1);
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }

            //validate home work to be only number
            try {
                shomeworks = Integer.parseInt(homework);
            }
            catch (NumberFormatException e) {
                //if Not an integer  output this error
                JOptionPane.showMessageDialog(null, "Homework mark must be an integer value");

            }
            //validate test score to be only number
            String test = stud_tScore.getText();
            try {
                stestmarks = Integer.parseInt(test);

            }
            catch (NumberFormatException e) {
                //Not an integer
                JOptionPane.showMessageDialog(null, "Test marks must be an integer value");
            }
            int total;
            total = shomeworks + stestmarks;
            total = shomeworks + stestmarks;
            if (shomeworks > 30){
                //JOptionPane.showMessageDialog(null, "Home work should not exceed score of 30%!");
                JOptionPane.showMessageDialog(null , "Homework score must not exceed 30%" , "Homework" , JOptionPane.INFORMATION_MESSAGE);
            }else if(stestmarks > 70){
                JOptionPane.showMessageDialog(null, "Test score must not exceed 70%","testmarks", JOptionPane.INFORMATION_MESSAGE);
                //System.exit(0);
            }else{
                if(total > 89 ){
                    grade = "A";
                }else if(total > 79 && total < 90){
                    grade = "B";
                }else if(total > 69 && total <= 80){
                    grade = "C";
                }else if(total > 59 && total <= 70){
                    grade = "D";
                }else if(total < 60){
                    grade = "F";
                }else if(total > 100 || total < 0){
                    JOptionPane.showMessageDialog(null, "Total Can not exceed 100!","total", JOptionPane.INFORMATION_MESSAGE);
                }
                String query = "INSERT INTO `students`(`username`, `HomeWork`, `TEST`, `total`, `grade`) VALUES ('"+stud_name.getText()+"','"+stud_hwScore.getText()+"','"+stud_tScore.getText()+"','"+total+"','"+grade+"')";

                CommandHelper(query," added ");
                //clear all fields after insertion
                stud_id.setText("");
                stud_name.setText("");
                stud_hwScore.setText("");
                stud_tScore.setText("");

            }
        }

    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //query to delete student data
        String query = "DELETE FROM `students` WHERE `id`="+stud_id.getText();
        CommandHelper(query," Deleted");
        GradesTable tab = new GradesTable();
        tab.setVisible(true);
        setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if(stud_name.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the student Name");
        }else if(stud_hwScore.getText().equals("")){

            JOptionPane.showMessageDialog(null, "Homework score must not be empty");

        }else if(stud_tScore.getText().equals("")){
            //check if  marks is an integer
            JOptionPane.showMessageDialog(null, "Test marks must not be empty");


        }else{

            //Calculate the total SCORE
            //check if value entered is an integer
            Connection connect = createConnection();
            String homework = stud_hwScore.getText();
            String db_ID = "SELECT `id` FROM `students`";
            Statement stmt;
            ResultSet result;
            String ID = stud_id.getText();
            try{
                stmt = connect.createStatement();
                result = stmt.executeQuery(db_ID);
                StudentInfo stud;
                while(result.next())
                {
                    String resultID = result.getString("id");
                }

                if(ID == resultID){
                    JOptionPane.showMessageDialog(null, "Sudent ID already exists");
                    //System.exit(1);
                }
            }catch(Exception ex){
                ex.printStackTrace();
            }

            //validate home work to be only number
            try {
                shomeworks = Integer.parseInt(homework);
            }
            catch (NumberFormatException e) {
                //if Not an integer  output this error
                JOptionPane.showMessageDialog(null, "Homework mark must be an integer value");

            }
            //validate test score to be only number
            String test = stud_tScore.getText();
            try {
                stestmarks = Integer.parseInt(test);

            }
            catch (NumberFormatException e) {
                //Not an integer
                JOptionPane.showMessageDialog(null, "Test marks must be an integer value");
            }
            int total;
            total = shomeworks + stestmarks;
            total = shomeworks + stestmarks;
            if (shomeworks > 30){
                //JOptionPane.showMessageDialog(null, "Home work should not exceed score of 30%!");
                JOptionPane.showMessageDialog(null , "Homework score must not exceed 30%" , "Homework" , JOptionPane.INFORMATION_MESSAGE);
            }else if(stestmarks > 70){
                JOptionPane.showMessageDialog(null, "Test score must not exceed 70%","testmarks", JOptionPane.INFORMATION_MESSAGE);
                //System.exit(0);
            }else{
                if(total > 89 ){
                    grade = "A";
                }else if(total > 79 && total < 90){
                    grade = "B";
                }else if(total > 69 && total <= 80){
                    grade = "C";
                }else if(total > 59 && total <= 70){
                    grade = "D";
                }else if(total < 60){
                    grade = "F";
                }else if(total > 100 || total < 0){
                    JOptionPane.showMessageDialog(null, "Total Can not exceed 100!","total", JOptionPane.INFORMATION_MESSAGE);
                }
                String query = "UPDATE `students` SET `username`='"+stud_name.getText()+"',`HomeWork`='"+stud_hwScore.getText()+"',`TEST`='"+stud_tScore.getText()+"',`total`='"+total+"',`Grade`='"+grade+"' WHERE `id` = "+stud_id.getText();

                CommandHelper(query," updated ");
                GradesTable tab = new GradesTable();
                tab.setVisible(true);
                setVisible(false);
            }
        }
    }
    // all functions, add, update, delete works under the operation of this command
    public void CommandHelper(String sql,String result)
    {
        Connection con = createConnection();
        Statement stmt;
        try{
            stmt = con.createStatement();
            if(stmt.executeUpdate(sql) == 1)
            {
                //refresh table automatically
                GradesTable tbl = new GradesTable();
                DefaultTableModel model = (DefaultTableModel) tbl.students_table.getModel();
                model.setRowCount(0);
                tbl.show_Student_Details();
                JOptionPane.showMessageDialog(null,"Student data " + result +" successfully");
            }else{
                JOptionPane.showMessageDialog(null,"Student data not " + result);
            }
        }catch(Exception exp){
            exp.printStackTrace();
        }
    }
    public Connection createConnection()
    {

        Connection conn = null;
        //try to connect to the studentsdb
        try{

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studentsdb";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url,user ,password);

            return conn;
        }catch(Exception e){
            //print error message if not connected
            e.printStackTrace();
            return null;
        }
    }

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField stud_hwScore;
    public javax.swing.JTextField stud_id;
    public javax.swing.JTextField stud_name;
    public javax.swing.JTextField stud_tScore;
    // End of variables declaration                   
}