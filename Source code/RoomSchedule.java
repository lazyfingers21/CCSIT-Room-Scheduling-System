
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
 public class RoomSchedule extends javax.swing.JFrame {

    public RoomSchedule() {
        initComponents();
        
    }
    
    public ArrayList<Sched> schedList() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM lab1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched(){
        
        ArrayList<Sched> list = schedList();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        }
    }
    
    public ArrayList<Sched> schedList2() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM lab2";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched2(){
        
        ArrayList<Sched> list = schedList2();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        }
    }
    
    public ArrayList<Sched> schedList3() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM lab3";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched3(){
        
        ArrayList<Sched> list = schedList3();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        
        }
    }
    public ArrayList<Sched> schedList4() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM gislab";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched4(){
        
        ArrayList<Sched> list = schedList4();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        }
    }
    
    public ArrayList<Sched> schedList5() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM researchlab";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched5(){
        
        ArrayList<Sched> list = schedList5();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    public ArrayList<Sched> schedList6() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ciscolab";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched6(){
        
        ArrayList<Sched> list = schedList6();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    public ArrayList<Sched> schedList7() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ict1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched7(){
        
        ArrayList<Sched> list = schedList7();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    public ArrayList<Sched> schedList8() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ict2";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched8(){
        
        ArrayList<Sched> list = schedList8();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    public ArrayList<Sched> schedList9() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ict3";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched9(){
        
        ArrayList<Sched> list = schedList9();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    public ArrayList<Sched> schedList10() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ict4";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched10(){
        
        ArrayList<Sched> list = schedList10();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    public ArrayList<Sched> schedList11() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ict5";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched11(){
        
        ArrayList<Sched> list = schedList11();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    public ArrayList<Sched> schedList12() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ict6";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched12(){
        
        ArrayList<Sched> list = schedList12();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    public ArrayList<Sched> schedList13() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ict7";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched13(){
        
        ArrayList<Sched> list = schedList13();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    public ArrayList<Sched> schedList14() {
        ArrayList<Sched> schedsList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ict8";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Sched sched;
            while(rs.next()){
                sched = new Sched(rs.getString("time"), rs.getString("mth"), rs.getString("w"), rs.getString("tf"), rs.getString("s"));
                schedsList.add(sched);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return schedsList;
    }
    public void show_sched14(){
        
        ArrayList<Sched> list = schedList14();
        DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[5];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).gettime();
            row[1] = list.get(i).getmth();
            row[2] = list.get(i).getw();
            row[3] = list.get(i).gettf();
            row[4] = list.get(i).gets();
            model.addRow(row);
        } 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        panelRoomSchedule = new javax.swing.JPanel();
        comboRoom = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRoom = new javax.swing.JTable();
        btnSelect = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtbxTime = new javax.swing.JTextField();
        txtbxMTH = new javax.swing.JTextField();
        txtbxW = new javax.swing.JTextField();
        txtbxTF = new javax.swing.JTextField();
        txtbxS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        panelCourseID = new javax.swing.JPanel();
        comboCourse = new javax.swing.JComboBox<>();
        btnSelect2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCourse = new javax.swing.JTable();
        btnReset2 = new javax.swing.JButton();
        btnUpdate2 = new javax.swing.JButton();
        btnDelete2 = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtbxCourseNum = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtbxTitle = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableTeacher = new javax.swing.JTable();
        comboTeacher = new javax.swing.JComboBox<>();
        btnSelect3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtbxSubjects = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnAdd3 = new javax.swing.JButton();
        btnDelete3 = new javax.swing.JButton();
        btnUpdate3 = new javax.swing.JButton();
        btnReset3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        txtbxSchedule = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/final na jud ni.png"))); // NOI18N
        jLabel20.setText("jLabel20");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        jLabel21.setText("EXIT");
        jLabel21.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 130, 170, 110));

        jLabel22.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        jLabel22.setText("HOME");
        jLabel22.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel22MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel22MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, 110));

        jLabel23.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/room2.png"))); // NOI18N
        jLabel23.setText("ROOM SCHEDULE");
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.setIconTextGap(0);
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 136, 300, 100));

        jLabel24.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/course id.png"))); // NOI18N
        jLabel24.setText("COURSE ID");
        jLabel24.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 210, 110));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logow.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 130, 110));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel5.setText("College of Computer Studies and Information Technology");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Department of Information Technology");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("1st Semester SY:2019-2020");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transparent-waves-smoke.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 730, 130));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transparent-waves-smoke.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, 0, 810, 130));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1300, 10));

        jLabel25.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teachersinfo.png"))); // NOI18N
        jLabel25.setText("TEACHER'S INFO");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel25MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel25MouseExited(evt);
            }
        });
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 270, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 240));

        jTabbedPane1.setBackground(new java.awt.Color(102, 0, 255));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logosogod.png"))); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 180, 190));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edited2.png"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 30, -1, 170));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 102));
        jTextField1.setFont(new java.awt.Font("Mongolian Baiti", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 204, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("SOUTHERN LEYTE STATE UNIVERSITY");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 730, 70));

        jLabel18.setFont(new java.awt.Font("Cambria", 3, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("College of Computer Studies and Information Technology");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 620, 40));

        jLabel19.setFont(new java.awt.Font("Impact", 0, 60)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 204, 204));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CCSIT ROOM SCHEDULING SYSTEM");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 970, 120));

        jTabbedPane1.addTab("Home", jPanel6);

        panelRoomSchedule.setBackground(new java.awt.Color(0, 0, 102));
        panelRoomSchedule.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelRoomSchedule.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboRoom.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        comboRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ICT-1", "ICT-2", "ICT-3", "ICT-4", "ICT-5", "ICT-6", "ICT-7", "ICT-8", "LAB-1", "LAB-2", "LAB-3", "RESEARCH LAB", "GIS LAB", "CISCO LAB" }));
        comboRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRoomActionPerformed(evt);
            }
        });
        panelRoomSchedule.add(comboRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 190, 30));

        tableRoom.setBackground(new java.awt.Color(153, 153, 255));
        tableRoom.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        tableRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Time", "Monday/Thursday", "Wednesday", "Tuesday/Friday", "Saturday"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableRoom.setRowHeight(60);
        tableRoom.setSelectionBackground(new java.awt.Color(0, 0, 102));
        tableRoom.getTableHeader().setReorderingAllowed(false);
        tableRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRoom);
        if (tableRoom.getColumnModel().getColumnCount() > 0) {
            tableRoom.getColumnModel().getColumn(0).setMinWidth(150);
            tableRoom.getColumnModel().getColumn(0).setPreferredWidth(150);
            tableRoom.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        panelRoomSchedule.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 1020, 420));

        btnSelect.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnSelect.setText("Select");
        btnSelect.setBorder(null);
        btnSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });
        panelRoomSchedule.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 100, 30));

        txtUsername.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsername.setBorder(null);
        txtUsername.setName(""); // NOI18N
        panelRoomSchedule.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 68, 296, 44));

        txtbxTime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbxTime.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRoomSchedule.add(txtbxTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 30));

        txtbxMTH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbxMTH.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRoomSchedule.add(txtbxMTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 30));

        txtbxW.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbxW.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbxW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbxWActionPerformed(evt);
            }
        });
        panelRoomSchedule.add(txtbxW, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 200, 30));

        txtbxTF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbxTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRoomSchedule.add(txtbxTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 30));

        txtbxS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbxS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelRoomSchedule.add(txtbxS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Saturday:");
        panelRoomSchedule.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 170, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Time:");
        panelRoomSchedule.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Monday/Thursday:");
        panelRoomSchedule.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Wednesday:");
        panelRoomSchedule.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tuesday/Friday:");
        panelRoomSchedule.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 20));

        jSeparator1.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));
        panelRoomSchedule.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 10, 500));

        btnDelete.setBackground(new java.awt.Color(255, 153, 153));
        btnDelete.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(null);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        panelRoomSchedule.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 90, 30));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(null);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panelRoomSchedule.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 90, 30));

        btnReset.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnReset.setText("Clear");
        btnReset.setBorder(null);
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        panelRoomSchedule.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 90, 30));

        btnDeleteAll.setBackground(new java.awt.Color(255, 51, 51));
        btnDeleteAll.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnDeleteAll.setText("Delete All");
        btnDeleteAll.setBorder(null);
        btnDeleteAll.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteAll.setEnabled(false);
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });
        panelRoomSchedule.add(btnDeleteAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 450, 90, 30));

        jTabbedPane1.addTab("Room Schedule", panelRoomSchedule);

        panelCourseID.setBackground(new java.awt.Color(0, 0, 102));
        panelCourseID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCourseID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboCourse.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        comboCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Year", "2nd Year", "3rd Year", "4th Year" }));
        comboCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelCourseID.add(comboCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 140, 30));

        btnSelect2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnSelect2.setText("Select");
        btnSelect2.setBorder(null);
        btnSelect2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelect2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect2ActionPerformed(evt);
            }
        });
        panelCourseID.add(btnSelect2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 100, 30));

        tableCourse.setBackground(new java.awt.Color(153, 153, 255));
        tableCourse.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        tableCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course Number", "Descriptive Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCourse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableCourse.setRowHeight(45);
        tableCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCourseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCourse);
        if (tableCourse.getColumnModel().getColumnCount() > 0) {
            tableCourse.getColumnModel().getColumn(0).setMinWidth(300);
            tableCourse.getColumnModel().getColumn(0).setPreferredWidth(300);
            tableCourse.getColumnModel().getColumn(0).setMaxWidth(300);
        }

        panelCourseID.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 880, 420));

        btnReset2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnReset2.setText("Clear");
        btnReset2.setBorder(null);
        btnReset2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset2ActionPerformed(evt);
            }
        });
        panelCourseID.add(btnReset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 150, 30));

        btnUpdate2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnUpdate2.setText("Update");
        btnUpdate2.setBorder(null);
        btnUpdate2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate2.setEnabled(false);
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate2ActionPerformed(evt);
            }
        });
        panelCourseID.add(btnUpdate2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 150, 30));

        btnDelete2.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnDelete2.setText("Delete");
        btnDelete2.setBorder(null);
        btnDelete2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete2.setEnabled(false);
        btnDelete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete2ActionPerformed(evt);
            }
        });
        panelCourseID.add(btnDelete2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 150, 30));

        btnAdd2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnAdd2.setText("Add");
        btnAdd2.setBorder(null);
        btnAdd2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd2.setEnabled(false);
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });
        panelCourseID.add(btnAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 150, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descriptive Title:");
        panelCourseID.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 20));

        txtbxCourseNum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbxCourseNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCourseID.add(txtbxCourseNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Course Number:");
        panelCourseID.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 20));

        jSeparator2.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 20));
        panelCourseID.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 10, 500));

        txtbxTitle.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbxTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCourseID.add(txtbxTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 340, 30));

        jTabbedPane1.addTab("Course ID", panelCourseID);

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableTeacher.setBackground(new java.awt.Color(153, 153, 255));
        tableTeacher.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        tableTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subjects Handled", "Schedule"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableTeacher.setRowHeight(45);
        tableTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTeacherMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableTeacher);
        if (tableTeacher.getColumnModel().getColumnCount() > 0) {
            tableTeacher.getColumnModel().getColumn(0).setMinWidth(300);
            tableTeacher.getColumnModel().getColumn(0).setPreferredWidth(300);
            tableTeacher.getColumnModel().getColumn(0).setMaxWidth(300);
        }

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 880, 420));

        comboTeacher.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        comboTeacher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keano Nikko Sy", "Arman Masangkay", "Gilbert Siega", "James Brian Flores", "Francis Rey Padao", "Julius Amfil Dublado", "Florentino Gozo", "Alboleras", "Nerissa Johnna Codal", "Patrex Amoguiz", "Jorton Tagud", "Czarina Ancella Gabi", "Jimson Olaybar", "Rea Mae Ruba", "Arneda Jean Gonzales", "Jude Ymari Ansale", "Rolly Acaso", "Rhoderick Malangsa", "Honrada", "Rene Radaza", "Jannie Fleur Orano", "Dumalag", "Alex Bacalla" }));
        jPanel5.add(comboTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 350, 30));

        btnSelect3.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnSelect3.setText("Select");
        btnSelect3.setBorder(null);
        btnSelect3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelect3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelect3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnSelect3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 100, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Subjects Handled:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 20));

        txtbxSubjects.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbxSubjects.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(txtbxSubjects, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 340, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Schedule:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 170, 20));

        btnAdd3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnAdd3.setText("Add");
        btnAdd3.setBorder(null);
        btnAdd3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd3.setEnabled(false);
        btnAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 150, 30));

        btnDelete3.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnDelete3.setText("Delete");
        btnDelete3.setBorder(null);
        btnDelete3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete3.setEnabled(false);
        btnDelete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 150, 30));

        btnUpdate3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnUpdate3.setText("Update");
        btnUpdate3.setBorder(null);
        btnUpdate3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate3.setEnabled(false);
        btnUpdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 150, 30));

        btnReset3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        btnReset3.setText("Clear");
        btnReset3.setBorder(null);
        btnReset3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnReset3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 150, 30));

        jSeparator3.setBackground(new java.awt.Color(153, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 10, 500));

        txtbxSchedule.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtbxSchedule.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbxSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbxScheduleActionPerformed(evt);
            }
        });
        jPanel5.add(txtbxSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 340, 30));

        lblName.setBackground(new java.awt.Color(0, 0, 102));
        lblName.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        lblName.setForeground(new java.awt.Color(153, 153, 255));
        lblName.setOpaque(true);
        jPanel5.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 340, 35));

        btnImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder.png"))); // NOI18N
        btnImage.setBorder(null);
        btnImage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImage.setOpaque(false);
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });
        jPanel5.add(btnImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 40, 40));

        lblImage.setOpaque(true);
        jPanel5.add(lblImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 210, 180));
        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 280, 100));

        jTabbedPane1.addTab("Teacher's Info", jPanel5);

        jPanel7.setBackground(new java.awt.Color(0, 0, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Exit", jPanel7);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 1330, 530));

        setSize(new java.awt.Dimension(1305, 729));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        
        TableColorCellRenderer renderer = new TableColorCellRenderer();
        tableRoom.setDefaultRenderer(Object.class, renderer);

        txtbxTime.setText("");
        txtbxMTH.setText("");
        txtbxW.setText("");
        txtbxTF.setText("");
        txtbxS.setText("");
        btnDeleteAll.setEnabled(true);
        
        if (comboRoom.getSelectedItem().toString() == "LAB-1"){
            show_sched();
        }
        else if (comboRoom.getSelectedItem().toString() == "LAB-2"){
            show_sched2();
        }
        else if (comboRoom.getSelectedItem().toString() == "LAB-3"){
            show_sched3();
        }
        else if (comboRoom.getSelectedItem().toString() == "GIS LAB"){
            show_sched4();
        }
        else if (comboRoom.getSelectedItem().toString() == "RESEARCH LAB"){
            show_sched5();
        }
        else if (comboRoom.getSelectedItem().toString() == "CISCO LAB"){
            show_sched6();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-1"){
            show_sched7();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-2"){
            show_sched8();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-3"){
            show_sched9();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-4"){
            show_sched10();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-5"){
            show_sched11();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-6"){
            show_sched12();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-7"){
            show_sched13();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-8"){
            show_sched14();
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    public ArrayList<Course> courseList() {
        ArrayList<Course> coursesList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query2 = "SELECT * FROM firstyear";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            Course course;
            while(rs.next()){
                course = new Course(rs.getString("coursenum"), rs.getString("title"));
                coursesList.add(course);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return coursesList;
    }
    public void show_course(){
        
        ArrayList<Course> list = courseList();
        DefaultTableModel model = (DefaultTableModel)tableCourse.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getcoursenum();
            row[1] = list.get(i).gettitle();
            model.addRow(row);
        }
    }
    
    public ArrayList<Course> courseList2() {
        ArrayList<Course> coursesList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query2 = "SELECT * FROM secondyear";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            Course course;
            while(rs.next()){
                course = new Course(rs.getString("coursenum"), rs.getString("title"));
                coursesList.add(course);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return coursesList;
    }
    public void show_course2(){
        
        ArrayList<Course> list = courseList2();
        DefaultTableModel model = (DefaultTableModel)tableCourse.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getcoursenum();
            row[1] = list.get(i).gettitle();
            model.addRow(row);
        }
    }
    
    public ArrayList<Course> courseList3() {
        ArrayList<Course> coursesList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query2 = "SELECT * FROM thirdyear";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            Course course;
            while(rs.next()){
                course = new Course(rs.getString("coursenum"), rs.getString("title"));
                coursesList.add(course);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return coursesList;
    }
    public void show_course3(){
        
        ArrayList<Course> list = courseList3();
        DefaultTableModel model = (DefaultTableModel)tableCourse.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getcoursenum();
            row[1] = list.get(i).gettitle();
            model.addRow(row);
        }
    }
    
    public ArrayList<Course> courseList4() {
        ArrayList<Course> coursesList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query2 = "SELECT * FROM fourthyear";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            Course course;
            while(rs.next()){
                course = new Course(rs.getString("coursenum"), rs.getString("title"));
                coursesList.add(course);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return coursesList;
    }
    public void show_course4(){
        
        ArrayList<Course> list = courseList4();
        DefaultTableModel model = (DefaultTableModel)tableCourse.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getcoursenum();
            row[1] = list.get(i).gettitle();
            model.addRow(row);
        }
    }
    
    private void btnSelect2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect2ActionPerformed
        txtbxCourseNum.setText("");
        txtbxTitle.setText("");
        btnAdd2.setEnabled(true);
        
        if (comboCourse.getSelectedItem().toString() == "1st Year"){
            show_course();
        }
        if (comboCourse.getSelectedItem().toString() == "2nd Year"){
            show_course2();
        }
        if (comboCourse.getSelectedItem().toString() == "3rd Year"){
            show_course3();
        }
        if (comboCourse.getSelectedItem().toString() == "4th Year"){
            show_course4();
        }
    }//GEN-LAST:event_btnSelect2ActionPerformed

    public ArrayList<Picture> pictureList() {
        ArrayList<Picture> picturesList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query2 = "SELECT * FROM teacherspicture";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query2);
            Picture pic;
            while(rs.next()){
                pic = new Picture (rs.getInt("num"), rs.getBytes("image"));
                picturesList.add(pic);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return picturesList;
    }

    
    
    private void btnSelect3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelect3ActionPerformed
            txtbxSubjects.setText("");
        txtbxSchedule.setText("");
        btnAdd3.setEnabled(true);
        
        
        if (comboTeacher.getSelectedItem().toString() == "Keano Nikko Sy"){
            show_teacher(); lblName.setText("Keano Nikko Sy");
            byte[] img = (pictureList().get(0).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
           
        }
        else if (comboTeacher.getSelectedItem().toString() == "Arman Masangkay"){
            show_teacher2(); lblName.setText("Arman Masangkay");
            byte[] img = (pictureList().get(1).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
            
        }
        else if (comboTeacher.getSelectedItem().toString() == "Gilbert Siega"){
            show_teacher3(); lblName.setText("Gilbert Siega");
            byte[] img = (pictureList().get(2).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
            
        }
        else if (comboTeacher.getSelectedItem().toString() == "James Brian Flores"){
            show_teacher4(); lblName.setText("James Brian Flores");
            byte[] img = (pictureList().get(3).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
          
        }
        else if (comboTeacher.getSelectedItem().toString() == "Francis Rey Padao"){
            show_teacher5(); lblName.setText("Francis Rey Padao");
            byte[] img = (pictureList().get(4).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
            
        }
        else if (comboTeacher.getSelectedItem().toString() == "Julius Amfil Dublado"){
            show_teacher6(); lblName.setText("Julius Amfil Dublado");
            byte[] img = (pictureList().get(5).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
      
        }
        else if (comboTeacher.getSelectedItem().toString() == "Florentino Gozo"){
            show_teacher7(); lblName.setText("Florentino Gozo");
            byte[] img = (pictureList().get(6).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
         
        }
        else if (comboTeacher.getSelectedItem().toString() == "Alboleras"){
            show_teacher8(); lblName.setText("Alboleras");
            byte[] img = (pictureList().get(7).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
           
        }
        else if (comboTeacher.getSelectedItem().toString() == "Nerissa Johnna Codal"){
            show_teacher9(); lblName.setText("Nerissa Johnna Codal");
            byte[] img = (pictureList().get(8).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
            
        }
        else if (comboTeacher.getSelectedItem().toString() == "Patrex Amoguiz"){
            show_teacher10(); lblName.setText("Patrex Amoguiz");
            byte[] img = (pictureList().get(9).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
          
        }
        else if (comboTeacher.getSelectedItem().toString() == "Jorton Tagud"){
            show_teacher11(); lblName.setText("Jorton Tagud");
            byte[] img = (pictureList().get(10).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
         
        }
        else if (comboTeacher.getSelectedItem().toString() == "Czarina Ancella Gabi"){
            show_teacher12(); lblName.setText("Czarina Ancella Gabi");
            byte[] img = (pictureList().get(11).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
          
        }
        else if (comboTeacher.getSelectedItem().toString() == "Jimson Olaybar"){
            show_teacher13(); lblName.setText("Jimson Olaybar");
            byte[] img = (pictureList().get(12).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
            
        }
        else if (comboTeacher.getSelectedItem().toString() == "Rea Mae Ruba"){
            show_teacher14(); lblName.setText("Rea Mae Ruba");
            byte[] img = (pictureList().get(13).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
           
        }
        else if (comboTeacher.getSelectedItem().toString() == "Arneda Jean Gonzales"){
            show_teacher15(); lblName.setText("Arneda Jean Gonzales");
            byte[] img = (pictureList().get(14).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
           
        }
        else if (comboTeacher.getSelectedItem().toString() == "Jude Ymari Ansale"){
            show_teacher16(); lblName.setText("Jude Ymari Ansale");
            byte[] img = (pictureList().get(15).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
           
        }
        else if (comboTeacher.getSelectedItem().toString() == "Rolly Acaso"){
            show_teacher17(); lblName.setText("Rolly Acaso");
            byte[] img = (pictureList().get(16).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
        
        }
        else if (comboTeacher.getSelectedItem().toString() == "Rhoderick Malangsa"){
            show_teacher18(); lblName.setText("Rhoderick Malangsa");
            byte[] img = (pictureList().get(17).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
     
        }
        else if (comboTeacher.getSelectedItem().toString() == "Honrada"){
            show_teacher19(); lblName.setText("Honrada");
            byte[] img = (pictureList().get(18).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
            
        }
        else if (comboTeacher.getSelectedItem().toString() == "Rene Radaza"){
            show_teacher20(); lblName.setText("Rene Radaza");
            byte[] img = (pictureList().get(19).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
           
        }
        else if (comboTeacher.getSelectedItem().toString() == "Jannie Fleur Orano"){
            show_teacher21(); lblName.setText("Jannie Fleur Orano");
            byte[] img = (pictureList().get(20).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
            
        }
        else if (comboTeacher.getSelectedItem().toString() == "Dumalag"){
            show_teacher22(); lblName.setText("Dumalag");
            byte[] img = (pictureList().get(21).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
           
        }
        else if (comboTeacher.getSelectedItem().toString() == "Alex Bacalla"){
            show_teacher23(); lblName.setText("Alex Bacalla");
            byte[] img = (pictureList().get(22).getpicture());
            ImageIcon imageicon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
            lblImage.setIcon(imageicon);
            
        }
    }//GEN-LAST:event_btnSelect3ActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete this data?", "Delete", JOptionPane.WARNING_MESSAGE ,JOptionPane.YES_NO_OPTION);
        if (option==0){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
            String room="";
            if (comboRoom.getSelectedItem().toString() == "LAB-1"){
                room = "lab1";
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-2")
            {
                room = "lab2";
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-3")
            {
                room = "lab3";
            }
            else if (comboRoom.getSelectedItem().toString() == "GIS LAB")
            {
                room = "gislab";
            }
            else if (comboRoom.getSelectedItem().toString() == "RESEARCH LAB")
            {
                room = "researchlab";
            }
            else if (comboRoom.getSelectedItem().toString() == "CISCO LAB")
            {
                room = "ciscolab";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-1"){
                room = "ict1";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-2"){
                room = "ict2";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-3"){
                room = "ict3";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-4"){
                room = "ict4";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-5"){
                room = "ict5";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-6"){
                room = "ict6";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-7"){
                room = "ict7";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-8"){
                room = "ict8";
            }
            
            String query = "UPDATE " + room + " SET mth=?, w=?, tf=?, s=? where time=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "");
            pst.setString(2, "");
            pst.setString(3, "");
            pst.setString(4, "");
            pst.setString(5, txtbxTime.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
            model.setRowCount(0);
            if (comboRoom.getSelectedItem().toString() == "LAB-1")
            {
            show_sched();
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-2")
            {
            show_sched2();
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-3")
            {
            show_sched3();
            }
            else if (comboRoom.getSelectedItem().toString() == "GIS LAB")
            {
            show_sched4();
            }
            else if (comboRoom.getSelectedItem().toString() == "RESEARCH LAB")
            {
            show_sched5();
            }
            else if (comboRoom.getSelectedItem().toString() == "CISCO LAB"){
            show_sched6();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-1"){
            show_sched7();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-2"){
            show_sched8();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-3"){
            show_sched9();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-4"){
            show_sched10();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-5"){
            show_sched11();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-6"){
            show_sched12();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-7"){
            show_sched13();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-8"){
            show_sched14();
        }
            
            JOptionPane.showMessageDialog(null,"Row Deleted Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Confirm Update?", "Update", JOptionPane.INFORMATION_MESSAGE ,JOptionPane.YES_NO_OPTION);
        if (option==0){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
            String room="";
            if (comboRoom.getSelectedItem().toString() == "LAB-1"){
                room = "lab1";
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-2")
            {
                room = "lab2";
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-3")
            {
                room = "lab3";
            }
            else if (comboRoom.getSelectedItem().toString() == "GIS LAB")
            {
                room = "gislab";
            }
            else if (comboRoom.getSelectedItem().toString() == "RESEARCH LAB")
            {
                room = "researchlab";
            }
            else if (comboRoom.getSelectedItem().toString() == "CISCO LAB")
            {
                room = "ciscolab";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-1"){
                room = "ict1";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-2"){
                room = "ict2";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-3"){
                room = "ict3";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-4"){
                room = "ict4";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-5"){
                room = "ict5";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-6"){
                room = "ict6";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-7"){
                room = "ict7";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-8"){
                room = "ict8";
            }
                
            String query = "UPDATE " + room + " SET mth=?, w=?, tf=?, s=? where time=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtbxMTH.getText());
            pst.setString(2, txtbxW.getText());
            pst.setString(3, txtbxTF.getText());
            pst.setString(4, txtbxS.getText());
            
            pst.setString(5, txtbxTime.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
            model.setRowCount(0);
            if (comboRoom.getSelectedItem().toString() == "LAB-1")
            {
            show_sched();
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-2")
            {
            show_sched2();
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-3")
            {
            show_sched3();
            }
            else if (comboRoom.getSelectedItem().toString() == "GIS LAB")
            {
            show_sched4();
            }
            else if (comboRoom.getSelectedItem().toString() == "RESEARCH LAB")
            {
            show_sched5();
            }
            else if (comboRoom.getSelectedItem().toString() == "CISCO LAB"){
            show_sched6();
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-1"){
            show_sched7();
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-2"){
            show_sched8();
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-3"){
            show_sched9();
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-4"){
            show_sched10();
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-5"){
            show_sched11();
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-6"){
            show_sched12();
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-7"){
            show_sched13();
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-8"){
            show_sched14();
            }
            JOptionPane.showMessageDialog(null,"Updated Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtbxTime.setText("");
        txtbxMTH.setText("");
        txtbxW.setText("");
        txtbxTF.setText("");
        txtbxS.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtbxWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbxWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbxWActionPerformed

    private void tableRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRoomMouseClicked
        btnUpdate.setEnabled(true); btnDelete.setEnabled(true);

        int i = tableRoom.getSelectedRow();
        TableModel model = tableRoom.getModel();
        txtbxTime.setText(""); txtbxMTH.setText(""); txtbxW.setText(""); txtbxTF.setText(""); txtbxS.setText("");
        
        txtbxTime.setText(model.getValueAt(i, 0)+ "");
        txtbxMTH.setText(model.getValueAt(i, 1)+ "");
        txtbxW.setText(model.getValueAt(i, 2)+ "");
        txtbxTF.setText(model.getValueAt(i, 3)+ "");
        txtbxS.setText(model.getValueAt(i, 4)+ "");
    }//GEN-LAST:event_tableRoomMouseClicked

    private void btnReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset2ActionPerformed
        txtbxCourseNum.setText(""); txtbxTitle.setText("");
    }//GEN-LAST:event_btnReset2ActionPerformed

    private void btnUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate2ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Confirm Update?", "Update", JOptionPane.INFORMATION_MESSAGE ,JOptionPane.YES_NO_OPTION);
        if (option==0){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
            String year="";
            if (comboCourse.getSelectedItem().toString() == "1st Year"){
                year = "firstyear";
            }
            else if (comboCourse.getSelectedItem().toString() == "2nd Year")
            {
                year = "secondyear";
            }
            else if (comboCourse.getSelectedItem().toString() == "3rd Year")
            {
                year = "thirdyear";
            }
            else if (comboCourse.getSelectedItem().toString() == "4th Year")
            {
                year = "fourthyear";
            }
                
            String query = "UPDATE " + year + " SET title=? where coursenum=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtbxTitle.getText());
            pst.setString(2, txtbxCourseNum.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tableCourse.getModel();
            model.setRowCount(0);
            if (comboCourse.getSelectedItem().toString() == "1st Year")
            {
            show_course();
            }
            else if (comboCourse.getSelectedItem().toString() == "2nd Year")
            {
            show_course2();
            }
            else if (comboCourse.getSelectedItem().toString() == "3rd Year")
            {
            show_course3();
            }
            else if (comboCourse.getSelectedItem().toString() == "4th Year")
            {
            show_course4();
            }

            JOptionPane.showMessageDialog(null,"Updated Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnUpdate2ActionPerformed

    private void btnDelete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete2ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete this data?", "Delete", JOptionPane.WARNING_MESSAGE ,JOptionPane.YES_NO_OPTION);
        if (option==0){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
            String year="";
            if (comboCourse.getSelectedItem().toString() == "1st Year"){
                year = "firstyear";
            }
            else if (comboCourse.getSelectedItem().toString() == "2nd Year")
            {
                year = "secondyear";
            }
            else if (comboCourse.getSelectedItem().toString() == "3rd Year")
            {
                year = "thirdyear";
            }
            else if (comboCourse.getSelectedItem().toString() == "4th Year")
            {
                year = "fourthyear";
            }
            
            String query = "DELETE FROM " + year + " where coursenum = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtbxCourseNum.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tableCourse.getModel();
            model.setRowCount(0);
            if (comboCourse.getSelectedItem().toString() == "1st Year")
            {
            show_course();
            }
            else if (comboCourse.getSelectedItem().toString() == "2nd Year")
            {
            show_course2();
            }
            else if (comboCourse.getSelectedItem().toString() == "3rd Year")
            {
            show_course3();
            }
            else if (comboCourse.getSelectedItem().toString() == "4th Year")
            {
            show_course4();
            }
            JOptionPane.showMessageDialog(null,"Deleted Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnDelete2ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Add New Data?", "Add", JOptionPane.INFORMATION_MESSAGE ,JOptionPane.YES_NO_OPTION);
        if (option==0){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
            String year="";
            if (comboCourse.getSelectedItem().toString() == "1st Year"){
                year = "firstyear";
            }
            else if (comboCourse.getSelectedItem().toString() == "2nd Year")
            {
                year = "secondyear";
            }
            else if (comboCourse.getSelectedItem().toString() == "3rd Year")
            {
                year = "thirdyear";
            }
            else if (comboCourse.getSelectedItem().toString() == "4th Year")
            {
                year = "fourthyear";
            }
                
            String query = "insert into " + year + "(coursenum, title)values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtbxCourseNum.getText());
            pst.setString(2, txtbxTitle.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tableCourse.getModel();
            model.setRowCount(0);
            if (comboCourse.getSelectedItem().toString() == "1st Year")
            {
            show_course();
            }
            else if (comboCourse.getSelectedItem().toString() == "2nd Year")
            {
            show_course2();
            }
            else if (comboCourse.getSelectedItem().toString() == "3rd Year")
            {
            show_course3();
            }
            else if (comboCourse.getSelectedItem().toString() == "4th Year")
            {
            show_course4();
            }

            JOptionPane.showMessageDialog(null,"Inserted Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void tableCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCourseMouseClicked
        btnUpdate2.setEnabled(true); btnDelete2.setEnabled(true);
        
        int i = tableCourse.getSelectedRow();
        TableModel model = tableCourse.getModel();
        txtbxCourseNum.setText(""); txtbxTitle.setText("");
        
        txtbxCourseNum.setText(model.getValueAt(i, 0)+ "");
        txtbxTitle.setText(model.getValueAt(i, 1)+ "");
        
    }//GEN-LAST:event_tableCourseMouseClicked

    private void btnAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd3ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Add New Data?", "Add", JOptionPane.INFORMATION_MESSAGE ,JOptionPane.YES_NO_OPTION);
        if (option==0){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
            String teacher="";
            if (comboTeacher.getSelectedItem().toString() == "Keano Nikko Sy"){
                teacher = "sirnikko";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arman Masangkay")
            {
                teacher = "sirarman";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Gilbert Siega")
            {
                teacher = "sirgelo";
            }
            else if (comboTeacher.getSelectedItem().toString() == "James Brian Flores")
            {
                teacher = "sirjames";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Francis Rey Padao")
            {
                teacher = "sirpadao";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Julius Amfil Dublado")
            {
                teacher = "sirdublado";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Florentino Gozo")
            {
                teacher = "sirgozo";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alboleras")
            {
                teacher = "alboleras";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Nerissa Johnna Codal")
            {
                teacher = "codal";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Patrex Amoguiz")
            {
                teacher = "amoguiz";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jorton Tagud")
            {
                teacher = "sirtagud";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Czarina Ancella Gabi")
            {
                teacher = "gabi";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jimson Olaybar")
            {
                teacher = "olaybar";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rea Mae Ruba")
            {
                teacher = "ruba";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arneda Jean Gonzales")
            {
                teacher = "mamjean";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jude Ymari Ansale")
            {
                teacher = "ansale";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rolly Acaso")
            {
                teacher = "acaso";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rhoderick Malangsa")
            {
                teacher = "malangsa";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Honrada")
            {
                teacher = "honrada";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rene Radaza")
            {
                teacher = "sirradaza";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jannie Fleur Orano")
            {
                teacher = "mamjan";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Dumalag")
            {
                teacher = "dumalag";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alex Bacalla")
            {
                teacher = "siralex";
            }
                
            String query = "insert into " + teacher + "(subjects, schedule)values(?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtbxSubjects.getText());
            pst.setString(2, txtbxSchedule.getText());
            
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
            model.setRowCount(0);
            
            if (comboTeacher.getSelectedItem().toString() == "Keano Nikko Sy"){
                show_teacher();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arman Masangkay")
            {
                show_teacher2();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Gilbert Siega")
            {
                show_teacher3();
            }
            else if (comboTeacher.getSelectedItem().toString() == "James Brian Flores")
            {
                show_teacher4();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Francis Rey Padao")
            {
                show_teacher5();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Julius Amfil Dublado")
            {
                show_teacher6();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Florentino Gozo")
            {
                show_teacher7();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alboleras")
            {
                show_teacher8();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Nerissa Johnna Codal")
            {
                show_teacher9();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Patrex Amoguiz")
            {
                show_teacher10();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jorton Tagud")
            {
                show_teacher11();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Czarina Ancella Gabi")
            {
                show_teacher12();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jimson Olaybar")
            {
                show_teacher13();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rea Mae Ruba")
            {
                show_teacher14();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arneda Jean Gonzales")
            {
                show_teacher15();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jude Ymari Ansale")
            {
                show_teacher16();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rolly Acaso")
            {
                show_teacher17();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rhoderick Malangsa")
            {
                show_teacher18();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Honrada")
            {
                show_teacher19();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rene Radaza")
            {
                show_teacher20();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jannie Fleur Orano")
            {
                show_teacher21();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Dumalag")
            {
                show_teacher22();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alex Bacalla")
            {
                show_teacher23();
            }

            JOptionPane.showMessageDialog(null,"Inserted Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnAdd3ActionPerformed

    private void btnDelete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete3ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete this data?", "Delete", JOptionPane.WARNING_MESSAGE ,JOptionPane.YES_NO_OPTION);
        if (option==0){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
            String teacher="";
            if (comboTeacher.getSelectedItem().toString() == "Keano Nikko Sy"){
                teacher = "sirnikko";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arman Masangkay")
            {
                teacher = "sirarman";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Gilbert Siega")
            {
                teacher = "sirgelo";
            }
            else if (comboTeacher.getSelectedItem().toString() == "James Brian Flores")
            {
                teacher = "sirjames";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Francis Rey Padao")
            {
                teacher = "sirpadao";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Julius Amfil Dublado")
            {
                teacher = "sirdublado";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Florentino Gozo")
            {
                teacher = "sirgozo";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alboleras")
            {
                teacher = "alboleras";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Nerissa Johnna Codal")
            {
                teacher = "codal";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Patrex Amoguiz")
            {
                teacher = "amoguiz";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jorton Tagud")
            {
                teacher = "sirtagud";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Czarina Ancella Gabi")
            {
                teacher = "gabi";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jimson Olaybar")
            {
                teacher = "olaybar";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rea Mae Ruba")
            {
                teacher = "ruba";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arneda Jean Gonzales")
            {
                teacher = "mamjean";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jude Ymari Ansale")
            {
                teacher = "ansale";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rolly Acaso")
            {
                teacher = "acaso";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rhoderick Malangsa")
            {
                teacher = "malangsa";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Honrada")
            {
                teacher = "honrada";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rene Radaza")
            {
                teacher = "sirradaza";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jannie Fleur Orano")
            {
                teacher = "mamjan";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Dumalag")
            {
                teacher = "dumalag";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alex Bacalla")
            {
                teacher = "siralex";
            }
                
            String query = "DELETE FROM " + teacher + " where subjects = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtbxSubjects.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
            model.setRowCount(0);
            
            if (comboTeacher.getSelectedItem().toString() == "Keano Nikko Sy"){
                show_teacher();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arman Masangkay")
            {
                show_teacher2();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Gilbert Siega")
            {
                show_teacher3();
            }
            else if (comboTeacher.getSelectedItem().toString() == "James Brian Flores")
            {
                show_teacher4();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Francis Rey Padao")
            {
                show_teacher5();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Julius Amfil Dublado")
            {
                show_teacher6();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Florentino Gozo")
            {
                show_teacher7();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alboleras")
            {
                show_teacher8();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Nerissa Johnna Codal")
            {
                show_teacher9();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Patrex Amoguiz")
            {
                show_teacher10();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jorton Tagud")
            {
                show_teacher11();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Czarina Ancella Gabi")
            {
                show_teacher12();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jimson Olaybar")
            {
                show_teacher13();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rea Mae Ruba")
            {
                show_teacher14();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arneda Jean Gonzales")
            {
                show_teacher15();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jude Ymari Ansale")
            {
                show_teacher16();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rolly Acaso")
            {
                show_teacher17();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rhoderick Malangsa")
            {
                show_teacher18();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Honrada")
            {
                show_teacher19();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rene Radaza")
            {
                show_teacher20();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jannie Fleur Orano")
            {
                show_teacher21();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Dumalag")
            {
                show_teacher22();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alex Bacalla")
            {
                show_teacher23();
            }
            JOptionPane.showMessageDialog(null,"Deleted Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnDelete3ActionPerformed

    private void btnUpdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate3ActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Confirm Update?", "Update", JOptionPane.INFORMATION_MESSAGE ,JOptionPane.YES_NO_OPTION);
        if (option==0){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
            String teacher="";
            if (comboTeacher.getSelectedItem().toString() == "Keano Nikko Sy"){
                teacher = "sirnikko";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arman Masangkay")
            {
                teacher = "sirarman";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Gilbert Siega")
            {
                teacher = "sirgelo";
            }
            else if (comboTeacher.getSelectedItem().toString() == "James Brian Flores")
            {
                teacher = "sirjames";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Francis Rey Padao")
            {
                teacher = "sirpadao";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Julius Amfil Dublado")
            {
                teacher = "sirdublado";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Florentino Gozo")
            {
                teacher = "sirgozo";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alboleras")
            {
                teacher = "alboleras";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Nerissa Johnna Codal")
            {
                teacher = "codal";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Patrex Amoguiz")
            {
                teacher = "amoguiz";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jorton Tagud")
            {
                teacher = "sirtagud";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Czarina Ancella Gabi")
            {
                teacher = "gabi";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jimson Olaybar")
            {
                teacher = "olaybar";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rea Mae Ruba")
            {
                teacher = "ruba";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arneda Jean Gonzales")
            {
                teacher = "mamjean";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jude Ymari Ansale")
            {
                teacher = "ansale";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rolly Acaso")
            {
                teacher = "acaso";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rhoderick Malangsa")
            {
                teacher = "malangsa";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Honrada")
            {
                teacher = "honrada";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rene Radaza")
            {
                teacher = "sirradaza";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jannie Fleur Orano")
            {
                teacher = "mamjan";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Dumalag")
            {
                teacher = "dumalag";
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alex Bacalla")
            {
                teacher = "siralex";
            }
                
            String query = "UPDATE " + teacher + " SET schedule=? where subjects=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, txtbxSchedule.getText());
            pst.setString(2, txtbxSubjects.getText());
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
            model.setRowCount(0);
            
            if (comboTeacher.getSelectedItem().toString() == "Keano Nikko Sy"){
                show_teacher();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arman Masangkay")
            {
                show_teacher2();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Gilbert Siega")
            {
                show_teacher3();
            }
            else if (comboTeacher.getSelectedItem().toString() == "James Brian Flores")
            {
                show_teacher4();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Francis Rey Padao")
            {
                show_teacher5();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Julius Amfil Dublado")
            {
                show_teacher6();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Florentino Gozo")
            {
                show_teacher7();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alboleras")
            {
                show_teacher8();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Nerissa Johnna Codal")
            {
                show_teacher9();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Patrex Amoguiz")
            {
                show_teacher10();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jorton Tagud")
            {
                show_teacher11();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Czarina Ancella Gabi")
            {
                show_teacher12();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jimson Olaybar")
            {
                show_teacher13();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rea Mae Ruba")
            {
                show_teacher14();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Arneda Jean Gonzales")
            {
                show_teacher15();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jude Ymari Ansale")
            {
                show_teacher16();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rolly Acaso")
            {
                show_teacher17();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rhoderick Malangsa")
            {
                show_teacher18();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Honrada")
            {
                show_teacher19();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Rene Radaza")
            {
                show_teacher20();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Jannie Fleur Orano")
            {
                show_teacher21();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Dumalag")
            {
                show_teacher22();
            }
            else if (comboTeacher.getSelectedItem().toString() == "Alex Bacalla")
            {
                show_teacher23();
            }

            JOptionPane.showMessageDialog(null,"Updated Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnUpdate3ActionPerformed

    private void btnReset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset3ActionPerformed
        txtbxSubjects.setText(""); txtbxSchedule.setText("");
    }//GEN-LAST:event_btnReset3ActionPerformed

    private void tableTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTeacherMouseClicked
        btnUpdate3.setEnabled(true); btnDelete3.setEnabled(true);
        
        int i = tableTeacher.getSelectedRow();
        TableModel model = tableTeacher.getModel();
        txtbxSubjects.setText(""); txtbxSchedule.setText("");
        
        txtbxSubjects.setText(model.getValueAt(i, 0)+ "");
        txtbxSchedule.setText(model.getValueAt(i, 1)+ "");

    }//GEN-LAST:event_tableTeacherMouseClicked

    private void txtbxScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbxScheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbxScheduleActionPerformed

    String filename = null;
    byte[] teacher_image = null, teacher_image2 = null, teacher_image3 = null, teacher_image4 = null, teacher_image5 = null,
           teacher_image6 = null, teacher_image7 = null, teacher_image8 = null, teacher_image9 = null, teacher_image10 = null, teacher_image11 = null,
           teacher_image12 = null, teacher_image13 = null, teacher_image14 = null, teacher_image15 = null, teacher_image16 = null, teacher_image17 = null,
           teacher_image18 = null, teacher_image19 = null, teacher_image20 = null, teacher_image21 = null, teacher_image22 = null, teacher_image23 = null;
    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        
    try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
    if (comboTeacher.getSelectedItem().toString() == "Keano Nikko Sy"){
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
                
            String query = "UPDATE teacherspicture SET image=? where num=1";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setBytes(1, teacher_image);
            pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Arman Masangkay"){
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image2 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }        
        
        String query = "UPDATE teacherspicture SET image=? where num=2";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setBytes(1, teacher_image2);
        pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Gilbert Siega"){
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image3 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=3";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setBytes(1, teacher_image3);
        pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "James Brian Flores"){
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image4 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=4";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setBytes(1, teacher_image4);
        pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Francis Rey Padao"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image5 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=5";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setBytes(1, teacher_image5);
        pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Julius Amfil Dublado"){
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image6 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
                String query = "UPDATE teacherspicture SET image=? where num=6";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image6);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Florentino Gozo"){
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image7 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
                String query = "UPDATE teacherspicture SET image=? where num=7";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image7);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Alboleras"){
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image8 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
                String query = "UPDATE teacherspicture SET image=? where num=8";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image8);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Nerissa Johnna Codal"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image9 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=9";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image9);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Patrex Amoguiz"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image10 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=10";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image10);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Jorton Tagud"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image11 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=11";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image11);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Czarina Ancella Gabi"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image12 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=12";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image12);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Jimson Olaybar"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image13 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=13";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image13);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Rea Mae Ruba"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image14 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=14";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image14);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Arneda Jean Gonzales"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image15 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=15";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image15);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Jude Ymari Ansale"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image16 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=16";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image16);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Rolly Acaso"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image17 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=17";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image17);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Rhoderick Malangsa"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image18 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=18";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image18);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Honrada"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image19 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=19";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image19);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Rene Radaza"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image20 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=20";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image20);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Jannie Fleur Orano"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image21 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=21";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image21);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Dumalag"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image22 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=22";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image22);
                pst.executeUpdate();
    }
    else if (comboTeacher.getSelectedItem().toString() == "Alex Bacalla"){
                
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lblImage.getWidth(),lblImage.getHeight(),Image.SCALE_SMOOTH));
        lblImage.setIcon(imageicon);
        
        try{
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum; (readNum = fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            teacher_image23 = bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        String query = "UPDATE teacherspicture SET image=? where num=23";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setBytes(1, teacher_image23);
                pst.executeUpdate();
    }

            JOptionPane.showMessageDialog(null,"Image Updated!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_btnImageActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure to delete all rows?", "Delete All", JOptionPane.WARNING_MESSAGE ,JOptionPane.YES_NO_OPTION);
        if (option==0){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            
            String room="";
            if (comboRoom.getSelectedItem().toString() == "LAB-1"){
                room = "lab1";
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-2")
            {
                room = "lab2";
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-3")
            {
                room = "lab3";
            }
            else if (comboRoom.getSelectedItem().toString() == "GIS LAB")
            {
                room = "gislab";
            }
            else if (comboRoom.getSelectedItem().toString() == "RESEARCH LAB")
            {
                room = "researchlab";
            }
            else if (comboRoom.getSelectedItem().toString() == "CISCO LAB")
            {
                room = "ciscolab";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-1"){
                room = "ict1";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-2"){
                room = "ict2";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-3"){
                room = "ict3";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-4"){
                room = "ict4";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-5"){
                room = "ict5";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-6"){
                room = "ict6";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-7"){
                room = "ict7";
            }
            else if (comboRoom.getSelectedItem().toString() == "ICT-8"){
                room = "ict8";
            }
            
            String query = "UPDATE " + room + " SET mth=?, w=?, tf=?, s=? where time=time";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "");
            pst.setString(2, "");
            pst.setString(3, "");
            pst.setString(4, "");
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tableRoom.getModel();
            model.setRowCount(0);
            if (comboRoom.getSelectedItem().toString() == "LAB-1")
            {
            show_sched();
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-2")
            {
            show_sched2();
            }
            else if (comboRoom.getSelectedItem().toString() == "LAB-3")
            {
            show_sched3();
            }
            else if (comboRoom.getSelectedItem().toString() == "GIS LAB")
            {
            show_sched4();
            }
            else if (comboRoom.getSelectedItem().toString() == "RESEARCH LAB")
            {
            show_sched5();
            }
            else if (comboRoom.getSelectedItem().toString() == "CISCO LAB"){
            show_sched6();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-1"){
            show_sched7();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-2"){
            show_sched8();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-3"){
            show_sched9();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-4"){
            show_sched10();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-5"){
            show_sched11();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-6"){
            show_sched12();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-7"){
            show_sched13();
        }
        else if (comboRoom.getSelectedItem().toString() == "ICT-8"){
            show_sched14();
        }
            JOptionPane.showMessageDialog(null,"All Rows Deleted Successfully!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        }
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void comboRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRoomActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseExited
        jLabel22.setOpaque(false); jLabel22.setBackground(Color.blue);
    }//GEN-LAST:event_jLabel22MouseExited

    private void jLabel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseEntered
        jLabel22.setOpaque(true); jLabel22.setBackground(Color.cyan);
    }//GEN-LAST:event_jLabel22MouseEntered

    private void jLabel22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseReleased
       
    }//GEN-LAST:event_jLabel22MouseReleased

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
        jLabel23.setOpaque(true); jLabel23.setBackground(Color.cyan);
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
        jLabel23.setOpaque(false); jLabel23.setBackground(Color.blue);
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseEntered
        jLabel24.setOpaque(true); jLabel24.setBackground(Color.cyan);
    }//GEN-LAST:event_jLabel24MouseEntered

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        jLabel24.setOpaque(false); jLabel24.setBackground(Color.blue);
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseEntered
        jLabel25.setOpaque(true); jLabel25.setBackground(Color.cyan);
    }//GEN-LAST:event_jLabel25MouseEntered

    private void jLabel25MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseExited
        jLabel25.setOpaque(false); jLabel25.setBackground(Color.blue);
    }//GEN-LAST:event_jLabel25MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
         jLabel21.setOpaque(true); jLabel21.setBackground(Color.PINK);
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
        jLabel21.setOpaque(false); jLabel21.setBackground(Color.blue);
    }//GEN-LAST:event_jLabel21MouseExited

    
    public ArrayList<Teacher> teacherList() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM sirnikko";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher(){
        
        ArrayList<Teacher> list = teacherList();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    
    public ArrayList<Teacher> teacherList2() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM sirarman";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher2(){
        
        ArrayList<Teacher> list = teacherList2();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList3() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM sirgelo";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher3(){
        
        ArrayList<Teacher> list = teacherList3();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList4() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM sirjames";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher4(){
        
        ArrayList<Teacher> list = teacherList4();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList5() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM sirpadao";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher5(){
        
        ArrayList<Teacher> list = teacherList5();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList6() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM sirdublado";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher6(){
        
        ArrayList<Teacher> list = teacherList6();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList7() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM sirgozo";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher7(){
        
        ArrayList<Teacher> list = teacherList7();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList8() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM alboleras";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher8(){
        
        ArrayList<Teacher> list = teacherList8();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList9() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM codal";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher9(){
        
        ArrayList<Teacher> list = teacherList9();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList10() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM amoguiz";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher10(){
        
        ArrayList<Teacher> list = teacherList10();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList11() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM sirtagud";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher11(){
        
        ArrayList<Teacher> list = teacherList11();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    
    public ArrayList<Teacher> teacherList12() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM gabi";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher12(){
        
        ArrayList<Teacher> list = teacherList12();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList13() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM olaybar";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher13(){
        
        ArrayList<Teacher> list = teacherList13();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList14() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ruba";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher14(){
        
        ArrayList<Teacher> list = teacherList14();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList15() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM mamjean";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher15(){
        
        ArrayList<Teacher> list = teacherList15();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList16() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM ansale";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher16(){
        
        ArrayList<Teacher> list = teacherList16();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList17() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM acaso";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher17(){
        
        ArrayList<Teacher> list = teacherList17();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList18() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM malangsa";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher18(){
        
        ArrayList<Teacher> list = teacherList18();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList19() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM honrada";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher19(){
        
        ArrayList<Teacher> list = teacherList19();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList20() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM sirradaza";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher20(){
        
        ArrayList<Teacher> list = teacherList20();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList21() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM mamjan";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher21(){
        
        ArrayList<Teacher> list = teacherList21();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList22() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM dumalag";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher22(){
        
        ArrayList<Teacher> list = teacherList22();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
        }
    }
    public ArrayList<Teacher> teacherList23() {
        ArrayList<Teacher> teachersList = new ArrayList<>();
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=testdb;user=sa;password=0321";
            Connection con = DriverManager.getConnection(url);
            String query1 = "SELECT * FROM siralex";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teacher teacher;
            while(rs.next()){
                teacher = new Teacher(rs.getString("subjects"), rs.getString("schedule"));
                teachersList.add(teacher);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return teachersList;
    }
    public void show_teacher23(){
        
        ArrayList<Teacher> list = teacherList23();
        DefaultTableModel model = (DefaultTableModel)tableTeacher.getModel();
        model.setRowCount(0);
        
        Object[] row = new Object[2];
        for (int i=0; i<list.size(); i++){
            row[0] = list.get(i).getsubjects();
            row[1] = list.get(i).getschedule();
            model.addRow(row);
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
            java.util.logging.Logger.getLogger(RoomSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomSchedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomSchedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnAdd3;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete2;
    private javax.swing.JButton btnDelete3;
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnReset2;
    private javax.swing.JButton btnReset3;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnSelect2;
    private javax.swing.JButton btnSelect3;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JButton btnUpdate3;
    private javax.swing.JComboBox<String> comboCourse;
    private javax.swing.JComboBox<String> comboRoom;
    private javax.swing.JComboBox<String> comboTeacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel panelCourseID;
    private javax.swing.JPanel panelRoomSchedule;
    private javax.swing.JTable tableCourse;
    private javax.swing.JTable tableRoom;
    private javax.swing.JTable tableTeacher;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtbxCourseNum;
    private javax.swing.JTextField txtbxMTH;
    private javax.swing.JTextField txtbxS;
    private javax.swing.JTextField txtbxSchedule;
    private javax.swing.JTextField txtbxSubjects;
    private javax.swing.JTextField txtbxTF;
    private javax.swing.JTextField txtbxTime;
    private javax.swing.JTextField txtbxTitle;
    private javax.swing.JTextField txtbxW;
    // End of variables declaration//GEN-END:variables
}
