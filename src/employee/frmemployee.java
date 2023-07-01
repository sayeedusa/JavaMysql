/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import com.sun.glass.events.KeyEvent;
import static java.lang.System.exit;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sayee
 */
public class frmemployee extends javax.swing.JFrame {
    Connection con=DBUtil.getConnection();
    Statement stmt;
    ResultSet rs=null;
  
    
    public frmemployee() {
        initComponents();
        txtempno.requestFocusInWindow();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        rbGroup = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        txtempno = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        rbFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        //DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
        txtdob = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        txtdeptno = new javax.swing.JTextField();
        txtfirstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsalary = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Mytable = new javax.swing.JTable();
        lbldeleted = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 200));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255))));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.setToolTipText("Enter Employee Number");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDisplay.setMnemonic('D');
        btnDisplay.setText("Display Employee");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnAdd.setMnemonic('A');
        btnAdd.setText("Add Employee");
        btnAdd.setAutoscrolls(true);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Record");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnTable.setText("Display in Table");
        btnTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClear)
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAdd)
                .addComponent(btnDisplay)
                .addComponent(btnSearch)
                .addComponent(btnDelete)
                .addComponent(btnClear)
                .addComponent(btnTable)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 3));

        jLabel8.setBackground(new java.awt.Color(102, 255, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Department No");
        jLabel8.setAlignmentX(1.0F);
        jLabel8.setAlignmentY(1.5F);

        jLabel6.setBackground(new java.awt.Color(102, 255, 102));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        jLabel6.setAlignmentX(1.0F);
        jLabel6.setAlignmentY(1.5F);

        lblgender.setBackground(new java.awt.Color(102, 255, 102));
        lblgender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblgender.setText("Gender");
        lblgender.setAlignmentX(1.0F);
        lblgender.setAlignmentY(1.5F);

        txtempno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempnoActionPerformed(evt);
            }
        });
        txtempno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtempnoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtempnoKeyTyped(evt);
            }
        });

        txtemail.setText("smith@gmail.com");
        txtemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtemailFocusLost(evt);
            }
        });
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        rbFemale.setText("Female");
        rbGroup.add(rbFemale);

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("YYYY-MM-DD");

        jLabel3.setBackground(new java.awt.Color(102, 255, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Last Name");
        jLabel3.setAlignmentX(1.0F);
        jLabel3.setAlignmentY(1.5F);

        jLabel4.setBackground(new java.awt.Color(102, 255, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date of Birth");
        jLabel4.setAlignmentX(1.0F);
        jLabel4.setAlignmentY(1.5F);

        jLabel7.setBackground(new java.awt.Color(102, 255, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Salary");
        jLabel7.setAlignmentX(1.0F);
        jLabel7.setAlignmentY(1.5F);

        //txtdob.add(DateChooser);
        //txtdob=new JFormattedTextField(dateFormat);
        txtdob.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdobFocusLost(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 255, 102));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Employee No");
        jLabel1.setAlignmentX(1.0F);
        jLabel1.setAlignmentY(1.5F);

        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });
        rbGroup.add(rbMale);

        txtdeptno.setText("20");

        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        txtfirstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfirstnameKeyPressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(102, 255, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("First Name");
        jLabel2.setAlignmentX(1.0F);
        jLabel2.setAlignmentY(1.5F);

        txtsalary.setText("888.88");
        txtsalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsalaryKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(rbMale)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(rbFemale))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtempno, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblgender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdeptno, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel6, jLabel7, jLabel8, lblgender});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfirstname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtempno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdeptno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel6, jLabel7, jLabel8, lblgender});

        Mytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Emp id", "Name", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        Mytable.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(Mytable);
        Mytable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        lbldeleted.setBackground(new java.awt.Color(255, 255, 0));
        lbldeleted.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbldeleted.setForeground(new java.awt.Color(255, 0, 51));
        lbldeleted.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldeleted.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(lbldeleted, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbldeleted, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(377, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
  try{
        stmt=con.createStatement();
   rs=stmt.executeQuery("select * from emp");
   String str="";
   while(rs.next()){
      String empno=Integer.toString(rs.getInt(1));
      String firstname=rs.getString(2);
      String lastname=rs.getString(3);
       Date dob=rs.getDate(4);
      String gender=rs.getString(5);
      String email=rs.getString(6);
      String salary=Double.toString(rs.getDouble(7));
      String deptno=Integer.toString(rs.getInt(8));
      
      
      
      str+=empno+"    "+firstname+"   "+lastname+"   "+"  "+dob+"  "+gender+"   "+email+"   "+
              salary+"   " +deptno+"\n";
   }
   
   stmt.close();
  // con.close();
   txtArea.setText(str);
   //JOptionPane.showMessageDialog(null, "test");
  }catch(SQLException sqle){
      sqle.printStackTrace();
  }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
     // Connection con=DBUtil.getConnection();
      Statement stmt;
      //ResultSet rs;
      
      int strint=Integer.parseInt(txtempno.getText());
      String strfirstname=txtfirstname.getText();
      String strlastname=txtlastname.getText();
      String strdob=txtdob.getText();
      String str="";
      if (rbMale.isSelected()){
          str="M";
        
    }
      if(rbFemale.isSelected()){
          str="F";
      }
      String strgender=str;//txtgender.getText();
      
      String stremail=txtemail.getText();
      String strsalary=txtsalary.getText();
      String strdeptno=txtdeptno.getText();
      
      
      String insertData="INSERT into emp(empno,first_name,last_name,dob,gender,email,salary,dept_no)"
              + " values('"+strint+"','"+strfirstname+"','"+strlastname+"','"+strdob+"'"
              + ",'"+strgender+"','"+stremail+"','"+strsalary+"','"+strdeptno+"')";
try{
      stmt=con.createStatement();
      stmt.executeUpdate(insertData);
      stmt.close();
      //con.close();stremail
      
}catch(SQLException sqle){
    sqle.printStackTrace();
}



    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
 txtArea.setText("");
   String str="";
   String str1="";
   str1=txtempno.getText();
   if (str1.trim().isEmpty()){JOptionPane.showMessageDialog(null,"Enter Value");
txtempno.requestFocus(); }
   try{
   stmt=con.createStatement();
 rs=stmt.executeQuery("select * from emp where empno='"+str1+"'");
 
 if(rs !=null){
     
    while(rs.next()){
      String empno=Integer.toString(rs.getInt(1));
      String firstname=rs.getString(2);
      String lastname=rs.getString(3);
       Date dob=rs.getDate(4);
      String strgender =rs.getString(5);
      String email=rs.getString(6);
      String salary=Double.toString(rs.getDouble(7));
      String deptno=Integer.toString(rs.getInt(8));
      txtfirstname.setText(firstname);
      txtlastname.setText(lastname);
      txtdob.setText(dob.toString());
      txtemail.setText(email);
      txtdeptno.setText(deptno);
      txtsalary.setText(salary);
      String gender=strgender.trim();
      if (gender.equals("male")){
          rbMale.setSelected(true);
      }else{
          rbFemale.setSelected(true);
      }
      
      
      
      
      str+=empno+"    "+firstname+"   "+lastname+"   "+"  "+dob+"  "+gender+"   "+email+"   "+
              salary+"   " +deptno+"\n";
   }
 
 }
 /*else{
     JOptionPane.showMessageDialog(null, "No Record Found");
     System.out.println("Empty");
            
 }*/
   stmt.close();
  // con.close();
   txtArea.setText(str);
   }catch(SQLException sqle){
       
   }
   
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
txtempno.setText("");
txtfirstname.setText("");
txtlastname.setText("");
txtdob.setText("");
//txtgender.setText("");
txtemail.setText("");
txtsalary.setText("");
txtdeptno.setText("");
txtArea.setText("");

txtempno.requestFocus();
       // JOptionPane.showMessageDialog(null,"", "Doy you like to delete", JOptionPane.INFORMATION_MESSAGE);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        String txtid=txtempno.getText();
        try{
PreparedStatement st=con.prepareStatement("delete from emp where empno="+ txtid +";");
st.executeUpdate();
        }catch( SQLException ex){
            ex.printStackTrace();
        }
        lbldeleted.setText("Record Deleted");
       /* try{
            Thread.sleep(10000);
        }catch(Exception e){
            
        }*/
        //lbldeleted.setText("");
        // TODO add your"Record handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtsalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsalaryKeyTyped
if(evt.getSource()==txtsalary){
    int iLoc=0;
    iLoc=txtsalary.getText().indexOf(".");
    if(iLoc>0){
        if(txtsalary.getText().substring(iLoc).length()>2){
            JOptionPane.showMessageDialog(null,"Two Decimal Place");
            //txtsalary.requestFocus();
            evt.consume();
        }
    }
}

        // TODO add your handling code here:
    }//GEN-LAST:event_txtsalaryKeyTyped

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void txtempnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtempnoKeyTyped
        // TODO add your handling code here:
        char onechar=evt.getKeyChar();
        if(!(Character.isDigit(onechar) || (onechar==KeyEvent.VK_BACKSPACE))){
            System.out.println("Number Only");
           JOptionPane.showMessageDialog(rootPane, "number only");
            evt.consume();
        
    }//GEN-LAST:event_txtempnoKeyTyped
    }
    private void txtempnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtempnoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempnoKeyPressed

    private void txtfirstnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfirstnameKeyPressed
        // TODO888 add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)|| c==KeyEvent.VK_BACKSPACE) && c==KeyEvent.VK_SHIFT){
        
            JOptionPane.showMessageDialog(rootPane,"Character only");
            evt.consume();
        }
    }//GEN-LAST:event_txtfirstnameKeyPressed

    private void txtempnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempnoActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtemailFocusLost
//String st=(String)evt.getSource();
 String email=txtemail.getText();
    	boolean validate=false;
    	for(int i=0;i<email.length();i++){
    	   char onecharacter=email.charAt(i);
    		if ((onecharacter=='@')){
    			for(int x=i;x<email.length();x++){
    			   char onecharacter1=email.charAt(x);
    	   			if (onecharacter1=='.'){
    				validate=true;
    				break;
    			}
    		}
    	}
    		
   }
    if (!validate){
    	JOptionPane.showMessageDialog(rootPane, "Invalid email");
       
        //System.out.println(" Valid Email Address");
    }

   

    }//GEN-LAST:event_txtemailFocusLost

    private void btnTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableActionPerformed
    String[] columnNames={"empno","firstname","lastname","dob","gender","email","salary","deptno"};
        
        DefaultTableModel model=new DefaultTableModel();  
       model.setColumnIdentifiers(columnNames);
      
        try{
        stmt=con.createStatement();
   rs=stmt.executeQuery("select * from emp");
   String str="";
   while(rs.next()){
      String empno=Integer.toString(rs.getInt(1));
      String firstname=rs.getString(2);
      String lastname=rs.getString(3);
       Date dob=rs.getDate(4);
      String gender=rs.getString(5);
      String email=rs.getString(6);
      String salary=Double.toString(rs.getDouble(7));
      String deptno=Integer.toString(rs.getInt(8));
      
      
      
      str+=empno+"    "+firstname+"   "+lastname+"   "+"  "+dob+"  "+gender+"   "+email+"   "+
              salary+"   " +deptno+"\n";
      
      Object  dataobject[]={empno,firstname,lastname,dob,gender,email,salary,deptno};
      
      model.addRow(dataobject);
      
   }
  
            System.out.println("");
  Mytable.setModel(model);
            System.out.println("Set Model");
  model.fireTableDataChanged();
 // Mytable.repaint();
   stmt.close();
  //con.close();
  }catch(SQLException sqle){
      sqle.printStackTrace();
            System.err.println(sqle);
  }        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnTableActionPerformed

    private void txtdobFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdobFocusLost
      DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String bdate=txtdob.getText().toString();
        
        System.out.println(bdate);
        LocalDate today= LocalDate.now();
        LocalDate birthday=LocalDate.parse(bdate,format);
        Period p=Period.between(birthday,today);
        long pp=LocalDate.from(birthday).until(today, ChronoUnit.YEARS);
        System.out.println("pp " +pp);
        if (pp<=0){
            System.out.println(" Invalid Entry");
            exit(0);
        }
        if (pp>=18){
            
            System.out.println("Elegable");
        }else{
           JOptionPane.showMessageDialog(rootPane, "Not Elegable");
            System.out.println("Not Elegabe");
        }
        

// TODO add your handling code here:
    }//GEN-LAST:event_txtdobFocusLost

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

         Statement stmt1;
      //ResultSet rs;
      
     // int strint=Integer.parseInt(txtempno.getText())Stri
     String strint=txtempno.getText();
      String strfirstname=txtfirstname.getText();
      String strlastname=txtlastname.getText();
      String strdob=txtdob.getText();
      String str="";
      if (rbMale.isSelected()){
          str="Male";
        
    }
      if(rbFemale.isSelected()){
          str="Female";
      }
      String strgender=str;//txtgender.getText();
      
      String stremail=txtemail.getText();
      String strsalary=txtsalary.getText();
      String strdeptno=txtdeptno.getText();
      
      
    /*  String insertData="INSERT into emp(empno,first_name,last_name,dob,gender,email,salary,dept_no)"
              + " values('"+strint+"','"+strfirstname+"','"+strlastname+"','"+strdob+"'"
              + ",'"+strgender+"','"+stremail+"','"+strsalary+"','"+strdeptno+"')";
      */
    //set SQL_SAFE_UPDATES=0;
    String strUpdate;
    String s=txtfirstname.getText();
        System.out.println("S "+s);
   strUpdate="UPDATE EMP SET first_name='"+s+"',"
           +"last_name='"+txtlastname.getText()+"',"
           +"dob='"+txtdob.getText()+"',"
           +"gender='"+strgender+"',"
           +"email='"+txtemail.getText()+"',"
           +"salary='"+txtsalary.getText()+"',"
           +"dept_no='"+txtdeptno.getText()+"'"
            + "where empno='"+txtempno.getText()+"'";
         
try{
      stmt1=con.createStatement();
      stmt1.executeUpdate(strUpdate);
      stmt1.close();
      //con.close();stremail
      
}catch(SQLException sqle){
    sqle.printStackTrace();
}




        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed




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
            java.util.logging.Logger.getLogger(frmemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmemployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Mytable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnTable;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbldeleted;
    private javax.swing.JLabel lblgender;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.ButtonGroup rbGroup;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtdeptno;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtempno;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtsalary;
    // End of variables declaration//GEN-END:variables
}
