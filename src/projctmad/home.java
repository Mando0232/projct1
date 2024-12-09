/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projctmad;

import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;




public class home extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public home() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        main = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        j = new javax.swing.JPanel();
        d = new javax.swing.JPanel();
        n = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        mass = new javax.swing.JPanel();
        Leaverequests = new javax.swing.JPanel();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        c1 = new com.toedter.calendar.JDateChooser();
        c2 = new com.toedter.calendar.JDateChooser();
        c3 = new com.toedter.calendar.JDateChooser();
        jScrollPane7 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        حذف = new javax.swing.JButton();
        تعديل = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        m = new javax.swing.JPanel();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField6 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        searchemployees = new javax.swing.JPanel();
        showall = new javax.swing.JButton();
        search = new javax.swing.JButton();
        user1 = new javax.swing.JRadioButton();
        user = new javax.swing.JTextField();
        id1 = new javax.swing.JRadioButton();
        id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Datascreen = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(572, 464));

        main.setBackground(new java.awt.Color(0, 0, 0));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("متابعه طلبات الاجازه");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("بحث عن موظف");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("الاشعارات");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("عنا");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("طلبات الاجازات");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton5)
                .addGap(187, 187, 187))
        );

        jScrollPane6.setViewportView(main);

        j.setBackground(new java.awt.Color(51, 255, 204));
        j.setPreferredSize(new java.awt.Dimension(500, 400));

        javax.swing.GroupLayout dLayout = new javax.swing.GroupLayout(d);
        d.setLayout(dLayout);
        dLayout.setHorizontalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 585, Short.MAX_VALUE)
        );
        dLayout.setVerticalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/خدش1.jpeg"))); // NOI18N

        javax.swing.GroupLayout nLayout = new javax.swing.GroupLayout(n);
        n.setLayout(nLayout);
        nLayout.setHorizontalGroup(
            nLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        nLayout.setVerticalGroup(
            nLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addGap(0, 367, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout massLayout = new javax.swing.GroupLayout(mass);
        mass.setLayout(massLayout);
        massLayout.setHorizontalGroup(
            massLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );
        massLayout.setVerticalGroup(
            massLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        Leaverequests.setBackground(new java.awt.Color(255, 255, 255));
        Leaverequests.setPreferredSize(new java.awt.Dimension(500, 400));
        Leaverequests.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("طلبات الاجازات\n");
        Leaverequests.add(jTextArea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 150, 40));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("تاريخ بدء الاجازه");
        Leaverequests.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 91, 25));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("نوع الاجازه");
        Leaverequests.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 55, -1));

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("طلب اجازه");
        Leaverequests.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel5.setText("اسم الموظف");
        Leaverequests.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 74, -1));

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel6.setText("الحاله");
        Leaverequests.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 90, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel7.setText("تاريخ انتهاء الاجازه");
        Leaverequests.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        jTextField2.setText(" ");
        Leaverequests.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 124, -1));

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel8.setText("الاداره الخاصه بي الموظف");
        Leaverequests.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 124, 20));
        Leaverequests.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 124, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        Leaverequests.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "اختر", "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        Leaverequests.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 250, 140, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "اختر", "Item 1", "Item 2", "Item 3", "Item 4" }));
        Leaverequests.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 137, -1));

        jLabel9.setText("تاريخ تسليم طلب الاجازه");
        Leaverequests.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, 30));
        Leaverequests.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 130, -1));

        jLabel10.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel10.setText("الرصيد المتاح للموظف");
        Leaverequests.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel11.setText("ملاحظات");
        Leaverequests.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 60, -1));

        jButton1.setBackground(new java.awt.Color(51, 51, 0));
        jButton1.setText("انشاء طلب");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Leaverequests.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 120, 30));
        Leaverequests.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 110, 20));
        Leaverequests.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 120, -1));
        Leaverequests.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 20));

        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(t2);

        Leaverequests.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 630, 240));

        حذف.setText("حذف");
        حذف.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                حذفActionPerformed(evt);
            }
        });
        Leaverequests.add(حذف, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 560, 150, 30));

        تعديل.setText("تعديل");
        تعديل.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                تعديلActionPerformed(evt);
            }
        });
        Leaverequests.add(تعديل, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 120, 30));

        jScrollPane4.setViewportView(jList1);

        Leaverequests.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add_employee.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jLabel12.setToolTipText("");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Leaverequests.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -80, 660, 680));
        Leaverequests.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, 50));

        m.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("متابعه طلبات الاجازات");
        m.add(jTextArea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 190, 50));

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "طلب الاجازه", "نوع الاجازه", "نوع الاجازه", "تاريخ بدايه الاجازه", "تاريخ انتاء الاجازه", "اسم الموظف", "تاريخ الطلب", "الاداره الخاصه", "الرصيد المتاح", "ملاحظات", "الحاله"
            }
        ));
        t1.setInheritsPopupMenu(true);
        jScrollPane2.setViewportView(t1);

        jScrollPane3.setViewportView(jScrollPane2);

        m.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 670, 460));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/m.jpg"))); // NOI18N
        m.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -4, 660, 510));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "acceptable", "unacceptable" }));
        m.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 150, 30));
        m.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 580, 150, 30));

        jToggleButton1.setText("حفظ");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        m.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 120, 40));
        m.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 150, 30));
        m.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 150, 30));
        m.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 530, 150, 30));
        m.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 140, 110));

        searchemployees.setBackground(new java.awt.Color(51, 51, 0));
        searchemployees.setPreferredSize(new java.awt.Dimension(500, 400));

        showall.setText("show all");
        showall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showallActionPerformed(evt);
            }
        });

        search.setText("search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        user1.setText("user");
        user1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user1ActionPerformed(evt);
            }
        });

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        id1.setText("id");
        id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id1ActionPerformed(evt);
            }
        });

        Datascreen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Datascreen);

        javax.swing.GroupLayout searchemployeesLayout = new javax.swing.GroupLayout(searchemployees);
        searchemployees.setLayout(searchemployeesLayout);
        searchemployeesLayout.setHorizontalGroup(
            searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchemployeesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(searchemployeesLayout.createSequentialGroup()
                        .addGroup(searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(searchemployeesLayout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(search)
                                .addGap(90, 90, 90)
                                .addComponent(showall, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(searchemployeesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 136, Short.MAX_VALUE))))
        );
        searchemployeesLayout.setVerticalGroup(
            searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchemployeesLayout.createSequentialGroup()
                .addGroup(searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchemployeesLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE))
                    .addGroup(searchemployeesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(searchemployeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search)
                            .addComponent(showall))
                        .addGap(29, 29, 29)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jLayout = new javax.swing.GroupLayout(j);
        j.setLayout(jLayout);
        jLayout.setHorizontalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayout.createSequentialGroup()
                .addComponent(Leaverequests, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayout.createSequentialGroup()
                    .addComponent(m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayout.createSequentialGroup()
                    .addComponent(searchemployees, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayout.createSequentialGroup()
                    .addComponent(mass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 36, Short.MAX_VALUE)))
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(49, Short.MAX_VALUE)))
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayout.createSequentialGroup()
                    .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 76, Short.MAX_VALUE)))
        );
        jLayout.setVerticalGroup(
            jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Leaverequests, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(searchemployees, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(n, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(d, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(j, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(j, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
            .addComponent(jScrollPane6)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   j.removeAll();
        j.add(Leaverequests);
        j.repaint();
        j.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
   j.removeAll();
        j.add(m);
        j.repaint();
        j.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
   j.removeAll();
        j.add(searchemployees);
        j.repaint();
        j.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
   j.removeAll();
        j.add(n);
        j.repaint();
        j.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
   Object [] columname={"username","password","gender","bddat"};
    private void showallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showallActionPerformed
        DefaultTableModel model=new DefaultTableModel(columname, ABORT);
        Datascreen.setModel(model);
        try{
            connection.con();
            Statement x = connection.con().createStatement();
            ResultSet rs = x.executeQuery("select * from employees ;");
            if(rs.next()){

                model.addRow(new Object []{rs.getString("last_name"),rs.getInt("Salary"),rs.getString("frist_name"),rs.getDate("bddata")});
            }

        }catch(Exception p){
            JOptionPane.showMessageDialog(this,p.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_showallActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // ضبط حجم tableعلي حجم بيانات السكول
        DefaultTableModel model=new DefaultTableModel(columname, ABORT);
        Datascreen.setModel(model);
        try{
            connection.con();
            Statement x = connection.con().createStatement();
            ResultSet rs = x.executeQuery("select * from MNMN where mm_id = '"+id.getText()+",");
            if(rs.next()){

                model.addRow(new Object[]{rs.getString("username"),rs.getInt("password"),rs.getString("gender"),rs.getDate("bddata")});
            }

        }catch(Exception p){
            JOptionPane.showMessageDialog(this,p.getMessage());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void user1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user1ActionPerformed
        id1.setSelected(true);
        user1.setSelected(false);
        //r_percentage.setEnabled(false);
        id.setEnabled(false);
        user.setEditable(true);
        user.setEnabled(true);
        id.setText("");          // TODO add your handling code here:
    }//GEN-LAST:event_user1ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id1ActionPerformed
        user1.setSelected(true);
        id1.setSelected(false);
        //r_percentage.setEnabled(false);
        user.setEnabled(false);
        id.setEditable(true);
        id.setEnabled(true);
        user.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_id1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        j.removeAll();
        j.add(mass);
        j.repaint();
        j.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void حذفActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_حذفActionPerformed
         DefaultTableModel n = (DefaultTableModel)t2.getModel();
        try {
            
            
            // n.removeRow(rw); 
             Object v =  n.getValueAt(t2.getSelectedRow(), 0);
            n.removeRow(t2.getSelectedRow());
           connection.con();
            PreparedStatement x = connection.con().prepareStatement("DELETE from LIB WHERE id =?");
            x.setString(1,v.toString());
            int rd = x.executeUpdate();
            if(rd == 1){
                JOptionPane.showMessageDialog(this,"deleted");
            }else{
                JOptionPane.showMessageDialog(this,"Not deleted");
            }
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_حذفActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      try {
            
connection.con();
                
 
PreparedStatement st = connection.con().prepareStatement("insert into lap values(?,?,?,?,?)");

           st.setInt(1, Integer.parseInt(id.getText()));
            st.setString(2,user.getText());
          
            st.setInt(8, Integer.parseInt(id.getText()));

            int ra = st.executeUpdate();
            if(ra == 1){
                JOptionPane.showMessageDialog(this,"لقد تم تعديل الطلب");
            }else{
                JOptionPane.showMessageDialog(this,"لم يتم تعديل   الطلب ");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(signup2.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void تعديلActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_تعديلActionPerformed
               DefaultTableModel n = (DefaultTableModel)t2.getModel();
        try {
            
            
            // n.removeRow(rw); 
             Object v =  n.getValueAt(t2.getSelectedRow(), 0);
         
           connection.con();
            PreparedStatement x = connection.con().prepareStatement("Update from LIB WHERE id =?");
            x.setString(1,v.toString());
            int ru = x.executeUpdate();
            if(ru == 1){
                JOptionPane.showMessageDialog(this,"لقد تم تعديل حاله الطلب");
            }else{
             JOptionPane.showMessageDialog(this,"لم يتم تعديل حاله الطلب");
            }
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(this,ex.getMessage());
        }
    }//GEN-LAST:event_تعديلActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
  DefaultTableModel n = (DefaultTableModel)t1.getModel();
        try {
            
            
            // n.removeRow(rw); 
             Object v =  n.getValueAt(t1.getSelectedRow(), 0);
            n.removeRow(t1.getSelectedRow());
           connection.con();
           PreparedStatement x = connection.con().prepareStatement("INSERT INTO employees (اكتب اسم حاله الطلب الي عاملو) VALUES (?)");
            x.setString(1,v.toString());
            int ru = x.executeUpdate();
            if(ru == 1){
                JOptionPane.showMessageDialog(this,"لقد تم تعديل حاله الطلب");
            }else{
             JOptionPane.showMessageDialog(this,"لم يتم تعديل حاله الطلب");
            }
        } catch (SQLException ex) {
JOptionPane.showMessageDialog(this,ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Datascreen;
    private javax.swing.JPanel Leaverequests;
    private com.toedter.calendar.JDateChooser c1;
    private com.toedter.calendar.JDateChooser c2;
    private com.toedter.calendar.JDateChooser c3;
    private javax.swing.JPanel d;
    private javax.swing.JTextField id;
    private javax.swing.JRadioButton id1;
    private javax.swing.JPanel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel m;
    private javax.swing.JPanel main;
    private javax.swing.JPanel mass;
    private javax.swing.JPanel n;
    private javax.swing.JButton search;
    private javax.swing.JPanel searchemployees;
    private javax.swing.JButton showall;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    private javax.swing.JTextField user;
    private javax.swing.JRadioButton user1;
    private javax.swing.JButton تعديل;
    private javax.swing.JButton حذف;
    // End of variables declaration//GEN-END:variables
}
