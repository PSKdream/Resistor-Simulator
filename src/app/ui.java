package app;
//Dream
//bio
import java.awt.Color;
import java.util.ArrayList;

public class ui extends javax.swing.JFrame {

    public ui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        closeProgram = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        ComboBox1 = new javax.swing.JComboBox<>();
        ComboBox3 = new javax.swing.JComboBox<>();
        ComboBox2 = new javax.swing.JComboBox<>();
        ComboBox4 = new javax.swing.JComboBox<>();
        ComboBox5 = new javax.swing.JComboBox<>();
        ResistanceTextField = new javax.swing.JFormattedTextField();
        ErrorTextField = new javax.swing.JFormattedTextField();
        MinTextField = new javax.swing.JFormattedTextField();
        MaxTextField = new javax.swing.JFormattedTextField();
        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        Panel4 = new javax.swing.JPanel();
        Panel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        CheckBoxTeb5 = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resistor Simulator");
        setLocation(new java.awt.Point(500, 150));
        setMaximumSize(new java.awt.Dimension(1080, 720));
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setPreferredSize(new java.awt.Dimension(1080, 720));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 15, 50));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/icons8-resistor-40.png"))); // NOI18N

        closeProgram.setBackground(new java.awt.Color(0, 15, 50));
        closeProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/power-xxl-1.png"))); // NOI18N
        closeProgram.setBorderPainted(false);
        closeProgram.setFocusPainted(false);
        closeProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closeProgramMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(closeProgram)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 537, Short.MAX_VALUE)
                .addComponent(closeProgram, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(310, 310, 310))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, -1));

        jPanel2.setBackground(new java.awt.Color(32, 47, 90));

        ComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White" }));
        ComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox1ItemStateChanged(evt);
            }
        });

        ComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White" }));
        ComboBox3.setEnabled(false);
        ComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox3ItemStateChanged(evt);
            }
        });

        ComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White" }));
        ComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox2ItemStateChanged(evt);
            }
        });

        ComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White", "Gold", "Silver" }));
        ComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox4ItemStateChanged(evt);
            }
        });

        ComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Brown", "Red", "Green", "Blue", "Violet", "Grey", "Gold", "Silver" }));
        ComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox5ItemStateChanged(evt);
            }
        });

        ResistanceTextField.setEditable(false);
        ResistanceTextField.setToolTipText("");

        ErrorTextField.setEditable(false);

        MinTextField.setEditable(false);

        MaxTextField.setEditable(false);

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        Panel3.setBackground(new java.awt.Color(32, 47, 90));

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Panel4Layout = new javax.swing.GroupLayout(Panel4);
        Panel4.setLayout(Panel4Layout);
        Panel4Layout.setHorizontalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        Panel4Layout.setVerticalGroup(
            Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        Panel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Panel5Layout = new javax.swing.GroupLayout(Panel5);
        Panel5.setLayout(Panel5Layout);
        Panel5Layout.setHorizontalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 85, Short.MAX_VALUE)
        );
        Panel5Layout.setVerticalGroup(
            Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Resistance :");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tolerance :");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Maximun :");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Minimum :");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ω");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ω");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ω");
        jLabel9.setToolTipText("");

        CheckBoxTeb5.setBackground(new java.awt.Color(32, 47, 90));
        CheckBoxTeb5.setForeground(new java.awt.Color(255, 255, 255));
        CheckBoxTeb5.setText("3 Band");
        CheckBoxTeb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxTeb5ActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("1 Band");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("2 Band");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Multiplier");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tolerance");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel15)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel16)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(ComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(ComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CheckBoxTeb5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17)
                                        .addGap(134, 134, 134)
                                        .addComponent(jLabel18)
                                        .addGap(58, 58, 58))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(MaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(MinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(ResistanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CheckBoxTeb5)
                        .addComponent(jLabel17)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ResistanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ErrorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MinTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MaxTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 980, 570));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Avenir Next", 0, 48)); // NOI18N
        jLabel1.setText("Resistor Simulator");

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/app/Logo_PIM.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Avenir", 0, 18)); // NOI18N
        jLabel11.setText("by Reimagine inc.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(136, 136, 136))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 1110, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBoxTeb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxTeb5ActionPerformed
        if (CheckBoxTeb5.isSelected()) {
            ComboBox3.enable();
            ComboBox3.requestFocus();
            Panel3.setBackground(new Color(255, 255, 255));
        } else {
            ComboBox3.disable();
            ComboBox3.requestFocus();
            Panel3.setBackground(new Color(32, 47, 90));
        }
    }//GEN-LAST:event_CheckBoxTeb5ActionPerformed

    private void closeProgramMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeProgramMousePressed
        System.exit(0); //close program
    }//GEN-LAST:event_closeProgramMousePressed

    private void ComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox1ItemStateChanged
        String color = "";
        if (evt.getStateChange() == 1) {
            color = evt.getItem().toString();
            calculat();
        }
        switch (color) {
            case "Black":
                Panel1.setBackground(Color.black);
                break;
            case "Brown":
                Panel1.setBackground(new Color(51, 0, 0));
                break;
            case "Red":
                Panel1.setBackground(Color.red);
                break;
            case "Orange":
                Panel1.setBackground(Color.orange);
                break;
            case "Yellow":
                Panel1.setBackground(Color.yellow);
                break;
            case "Green":
                Panel1.setBackground(Color.green);
                break;
            case "Blue":
                Panel1.setBackground(Color.blue);
                break;
            case "Violet":
                Panel1.setBackground(new Color(238, 130, 238));
                break;
            case "Grey":
                Panel1.setBackground(Color.gray);
                break;
            case "White":
                Panel1.setBackground(Color.white);
                break;
        }
    }//GEN-LAST:event_ComboBox1ItemStateChanged

    private void ComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox2ItemStateChanged
        String color = "";
        if (evt.getStateChange() == 1) {
            calculat();
            //System.out.println(evt.getItem());
            color = evt.getItem().toString();
        }
        switch (color) {
            case "Black":
                Panel2.setBackground(Color.black);
                break;
            case "Brown":
                Panel2.setBackground(new Color(51, 0, 0));
                break;
            case "Red":
                Panel2.setBackground(Color.red);
                break;
            case "Orange":
                Panel2.setBackground(Color.orange);
                break;
            case "Yellow":
                Panel2.setBackground(Color.yellow);
                break;
            case "Green":
                Panel2.setBackground(Color.green);
                break;
            case "Blue":
                Panel2.setBackground(Color.blue);
                break;
            case "Violet":
                Panel2.setBackground(new Color(238, 130, 238));
                break;
            case "Grey":
                Panel2.setBackground(Color.gray);
                break;
            case "White":
                Panel2.setBackground(Color.white);
                break;
        }
    }//GEN-LAST:event_ComboBox2ItemStateChanged

    private void ComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox3ItemStateChanged
        String color = "";
        if (evt.getStateChange() == 1) {
            calculat();
            //System.out.println(evt.getItem());
            color = evt.getItem().toString();
        }
        switch (color) {
            case "Black":
                Panel3.setBackground(Color.black);
                break;
            case "Brown":
                Panel3.setBackground(new Color(51, 0, 0));
                break;
            case "Red":
                Panel3.setBackground(Color.red);
                break;
            case "Orange":
                Panel3.setBackground(Color.orange);
                break;
            case "Yellow":
                Panel3.setBackground(Color.yellow);
                break;
            case "Green":
                Panel3.setBackground(Color.green);
                break;
            case "Blue":
                Panel3.setBackground(Color.blue);
                break;
            case "Violet":
                Panel3.setBackground(new Color(238, 130, 238));
                break;
            case "Grey":
                Panel3.setBackground(Color.gray);
                break;
            case "White":
                Panel3.setBackground(Color.white);
                break;
        }
    }//GEN-LAST:event_ComboBox3ItemStateChanged

    private void ComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox4ItemStateChanged
        String color = "";
        if (evt.getStateChange() == 1) {
            calculat();
            //System.out.println(evt.getItem());
            color = evt.getItem().toString();
        }
        switch (color) {
            case "Black":
                Panel4.setBackground(Color.black);
                break;
            case "Brown":
                Panel4.setBackground(new Color(51, 0, 0));
                break;
            case "Red":
                Panel4.setBackground(Color.red);
                break;
            case "Orange":
                Panel4.setBackground(Color.orange);
                break;
            case "Yellow":
                Panel4.setBackground(Color.yellow);
                break;
            case "Green":
                Panel4.setBackground(Color.green);
                break;
            case "Blue":
                Panel4.setBackground(Color.blue);
                break;
            case "Violet":
                Panel4.setBackground(new Color(238, 130, 238));
                break;
            case "Gold":
                Panel4.setBackground(new Color(255, 223, 0));
                break;
            case "Silver":
                Panel4.setBackground(new Color(196, 202, 206));
                break;
        }
    }//GEN-LAST:event_ComboBox4ItemStateChanged

    private void ComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox5ItemStateChanged
        String color = "";
        if (evt.getStateChange() == 1) {
            calculat();
            //System.out.println(evt.getItem());
            color = evt.getItem().toString();
        }
        
        switch (color) {
            case "Brown":
                Panel5.setBackground(new Color(51, 0, 0));
                break;
            case "Red":
                Panel5.setBackground(Color.red);
                break;
            case "Green":
                Panel5.setBackground(Color.green);
                break;
            case "Blue":
                Panel5.setBackground(Color.blue);
                break;
            case "Violet":
                Panel5.setBackground(new Color(238, 130, 238));
                break;
            case "Grey":
                Panel5.setBackground(Color.gray);
                break;
            case "Gold":
                Panel5.setBackground(new Color(255, 223, 0));
                break;
            case "Silver":
                Panel5.setBackground(new Color(196, 202, 206));
                break;
        }
    }//GEN-LAST:event_ComboBox5ItemStateChanged

   private void calculat() {
       calculat cal = new calculat();
        String[] ColorTab = new String[5];
        double sum = 0;
        double error = 0;
        if (CheckBoxTeb5.isSelected()) {
            ColorTab[0] = ComboBox1.getSelectedItem().toString();
            ColorTab[1] = ComboBox2.getSelectedItem().toString();
            ColorTab[2] = ComboBox3.getSelectedItem().toString();
            ColorTab[3] = ComboBox4.getSelectedItem().toString();
            ColorTab[4] = ComboBox5.getSelectedItem().toString();
            
            sum = cal.var_Resitor(ColorTab);
            error = cal.error(ColorTab);
            
            ResistanceTextField.setValue(sum);
            ErrorTextField.setValue("+- " + error + " %");
            MinTextField.setValue(cal.Min_Error(sum, error));
            MaxTextField.setValue(cal.Max_Error(sum, error));
        } else {
            System.out.println("22222222");
            ColorTab[0] = ComboBox1.getSelectedItem().toString();
            ColorTab[1] = ComboBox2.getSelectedItem().toString();
            ColorTab[2] = null;
            ColorTab[3] = ComboBox4.getSelectedItem().toString();
            ColorTab[4] = ComboBox5.getSelectedItem().toString();

            sum = cal.var_Resitor(ColorTab);
            error = cal.error(ColorTab);
            
            ResistanceTextField.setValue(sum);
            ErrorTextField.setValue("+- " + error + " %");
            MinTextField.setValue(cal.Min_Error(sum, error));
            MaxTextField.setValue(cal.Max_Error(sum, error));
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxTeb5;
    private javax.swing.JComboBox<String> ComboBox1;
    private javax.swing.JComboBox<String> ComboBox2;
    private javax.swing.JComboBox<String> ComboBox3;
    private javax.swing.JComboBox<String> ComboBox4;
    private javax.swing.JComboBox<String> ComboBox5;
    private javax.swing.JFormattedTextField ErrorTextField;
    private javax.swing.JFormattedTextField MaxTextField;
    private javax.swing.JFormattedTextField MinTextField;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    private javax.swing.JPanel Panel4;
    private javax.swing.JPanel Panel5;
    private javax.swing.JFormattedTextField ResistanceTextField;
    private javax.swing.JToggleButton closeProgram;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
