/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jFCentroCusto.java
 *
 * Created on 01/10/2014, 20:32:04
 */

package personalfinance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import personalfinance.classes.CentroCusto;
import personalfinance.classes.ClassConecta;
import personalfinance.classes.ColorRenderer;
import personalfinance.classes.Funcoes;

/**
 *
 * @author Luciano Carrafa Benfica
 */
public class jFCentroCusto extends javax.swing.JDialog {

    /** Creates new form jFCentroCusto */
    public jFCentroCusto() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        buscarjButton = new javax.swing.JButton();
        novojButton = new javax.swing.JButton();
        editarjButton = new javax.swing.JButton();
        salvarjButton = new javax.swing.JButton();
        salvarMaisjButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        alterarjButton = new javax.swing.JButton();
        excluirjButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        sairjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cod_centro_custojSpinner = new javax.swing.JSpinner();
        nomeCentroCustojTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacaojTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gradeCentroCustojTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(personalfinance.PersonalFinanceApp.class).getContext().getResourceMap(jFCentroCusto.class);
        setBackground(resourceMap.getColor("Form.background")); // NOI18N
        setName("Form"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setBackground(resourceMap.getColor("jToolBar1.background")); // NOI18N
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1"); // NOI18N

        buscarjButton.setBackground(resourceMap.getColor("buscarjButton.background")); // NOI18N
        buscarjButton.setIcon(resourceMap.getIcon("buscarjButton.icon")); // NOI18N
        buscarjButton.setText(resourceMap.getString("buscarjButton.text")); // NOI18N
        buscarjButton.setFocusable(false);
        buscarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buscarjButton.setName("buscarjButton"); // NOI18N
        buscarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(buscarjButton);

        novojButton.setBackground(resourceMap.getColor("novojButton.background")); // NOI18N
        novojButton.setIcon(resourceMap.getIcon("novojButton.icon")); // NOI18N
        novojButton.setText(resourceMap.getString("novojButton.text")); // NOI18N
        novojButton.setFocusable(false);
        novojButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novojButton.setName("novojButton"); // NOI18N
        novojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novojButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(novojButton);

        editarjButton.setBackground(resourceMap.getColor("editarjButton.background")); // NOI18N
        editarjButton.setIcon(resourceMap.getIcon("editarjButton.icon")); // NOI18N
        editarjButton.setText(resourceMap.getString("editarjButton.text")); // NOI18N
        editarjButton.setFocusable(false);
        editarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editarjButton.setName("editarjButton"); // NOI18N
        editarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(editarjButton);

        salvarjButton.setBackground(resourceMap.getColor("salvarjButton.background")); // NOI18N
        salvarjButton.setIcon(resourceMap.getIcon("salvarjButton.icon")); // NOI18N
        salvarjButton.setText(resourceMap.getString("salvarjButton.text")); // NOI18N
        salvarjButton.setFocusable(false);
        salvarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salvarjButton.setName("salvarjButton"); // NOI18N
        salvarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(salvarjButton);

        salvarMaisjButton.setBackground(resourceMap.getColor("salvarMaisjButton.background")); // NOI18N
        salvarMaisjButton.setIcon(resourceMap.getIcon("salvarMaisjButton.icon")); // NOI18N
        salvarMaisjButton.setText(resourceMap.getString("salvarMaisjButton.text")); // NOI18N
        salvarMaisjButton.setFocusable(false);
        salvarMaisjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salvarMaisjButton.setName("salvarMaisjButton"); // NOI18N
        salvarMaisjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salvarMaisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarMaisjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(salvarMaisjButton);

        jSeparator1.setName("jSeparator1"); // NOI18N
        jToolBar1.add(jSeparator1);

        alterarjButton.setBackground(resourceMap.getColor("alterarjButton.background")); // NOI18N
        alterarjButton.setIcon(resourceMap.getIcon("alterarjButton.icon")); // NOI18N
        alterarjButton.setText(resourceMap.getString("alterarjButton.text")); // NOI18N
        alterarjButton.setFocusable(false);
        alterarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alterarjButton.setName("alterarjButton"); // NOI18N
        alterarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alterarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(alterarjButton);

        excluirjButton.setBackground(resourceMap.getColor("excluirjButton.background")); // NOI18N
        excluirjButton.setIcon(resourceMap.getIcon("excluirjButton.icon")); // NOI18N
        excluirjButton.setText(resourceMap.getString("excluirjButton.text")); // NOI18N
        excluirjButton.setFocusable(false);
        excluirjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excluirjButton.setName("excluirjButton"); // NOI18N
        excluirjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(excluirjButton);

        jSeparator2.setName("jSeparator2"); // NOI18N
        jToolBar1.add(jSeparator2);

        sairjButton.setBackground(resourceMap.getColor("sairjButton.background")); // NOI18N
        sairjButton.setIcon(resourceMap.getIcon("sairjButton.icon")); // NOI18N
        sairjButton.setText(resourceMap.getString("sairjButton.text")); // NOI18N
        sairjButton.setFocusable(false);
        sairjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sairjButton.setName("sairjButton"); // NOI18N
        sairjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        sairjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairjButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(sairjButton);

        jPanel1.setName("jPanel1"); // NOI18N

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        cod_centro_custojSpinner.setName("cod_centro_custojSpinner"); // NOI18N

        nomeCentroCustojTextField.setText(resourceMap.getString("nomeCentroCustojTextField.text")); // NOI18N
        nomeCentroCustojTextField.setName("nomeCentroCustojTextField"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        observacaojTextArea.setColumns(20);
        observacaojTextArea.setRows(5);
        observacaojTextArea.setName("observacaojTextArea"); // NOI18N
        jScrollPane1.setViewportView(observacaojTextArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cod_centro_custojSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(143, 143, 143))
                            .addComponent(nomeCentroCustojTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod_centro_custojSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeCentroCustojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setName("jPanel3"); // NOI18N

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        gradeCentroCustojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id#", "Centro custo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gradeCentroCustojTable.setName("gradeCentroCustojTable"); // NOI18N
        gradeCentroCustojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradeCentroCustojTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(gradeCentroCustojTable);
        gradeCentroCustojTable.getColumnModel().getColumn(0).setResizable(false);
        gradeCentroCustojTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        gradeCentroCustojTable.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("gradeCentroCustojTable.columnModel.title0")); // NOI18N
        gradeCentroCustojTable.getColumnModel().getColumn(1).setResizable(false);
        gradeCentroCustojTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        gradeCentroCustojTable.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("gradeCentroCustojTable.columnModel.title1")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ClassConecta conecta = new ClassConecta();

    int cod_centro_custo;
    int cod_acesso_CentroCusto;

    public void getGradeCentroCusto() throws ParseException{
       //Consultar Centro Custo
        CentroCusto oCentroCusto = new CentroCusto();

        ResultSet resultSet = null;

        String[] colunasTabela = new String[]{"Id#", "Centro Custo"};
        DefaultTableModel modeloTabela = new DefaultTableModel(null, colunasTabela) {

            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        gradeCentroCustojTable.setModel(modeloTabela);
        gradeCentroCustojTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        gradeCentroCustojTable.getColumnModel().getColumn(1).setPreferredWidth(200);


        gradeCentroCustojTable.setDefaultRenderer(Object.class, new ColorRenderer()); // DEIXA A GRADE ZEBRADA


try {
            resultSet = oCentroCusto.getConsultar();

            if (resultSet.getRow() == 1){
             resultSet.first();
            }


        } catch (SQLException ex) {
            Logger.getLogger(CentroCusto.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            while (resultSet.next()) {

                modeloTabela.addRow(new String[]{
                    Funcoes.getCodigoFormat(resultSet.getInt("COD_CENTRO_CUSTO")),
                    resultSet.getString("NOME_CENTRO_CUSTO"),
                });

            }

        } catch (SQLException ex) {
            Logger.getLogger(CentroCusto.class.getName()).log(Level.SEVERE, null, ex);
        }

           }// FIM DA GRADE


    public void getFieldContas(int cod_centro_custo) throws ParseException{

        CentroCusto oCentroCusto = new CentroCusto();
        ResultSet rs = null;
        oCentroCusto.setCod_centro_custo(cod_centro_custo);

        try {
            rs = oCentroCusto.getConsultar();
            rs.next();

            //Pegar campos
            cod_centro_custojSpinner.setValue(rs.getInt("COD_CENTRO_CUSTO"));
            nomeCentroCustojTextField.setText(rs.getString("NOME_CENTRO_CUSTO"));
            observacaojTextArea.setText(rs.getString("OBSERVACAO"));

        } catch (SQLException ex) {
            Logger.getLogger(CentroCusto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }





    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        salvarjButton.setEnabled(false);
        salvarMaisjButton.setEnabled(false);
        alterarjButton.setEnabled(false);
        excluirjButton.setEnabled(false);
        editarjButton.setEnabled(false);
        novojButton.setEnabled(true);
        nomeCentroCustojTextField.grabFocus();

        ClassConecta.conecta();

        buscarjButtonActionPerformed(null);

    }//GEN-LAST:event_formWindowOpened

    private void sairjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairjButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_sairjButtonActionPerformed

    private void novojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novojButtonActionPerformed
        // TODO add your handling code here:
        novojButton.setEnabled(false);
        alterarjButton.setEnabled(false);
        editarjButton.setEnabled(false);
        excluirjButton.setEnabled(false);
        buscarjButton.setEnabled(true);
        salvarjButton.setEnabled(true);
        salvarMaisjButton.setEnabled(true);
        nomeCentroCustojTextField.grabFocus();

        try {
            ClassConecta.con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(jFContas.class.getName()).log(Level.SEVERE, null, ex);
        }

        cod_centro_custojSpinner.setValue(0);
        nomeCentroCustojTextField.setText("");
        observacaojTextArea.setText("");
    }//GEN-LAST:event_novojButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        salvarjButton.setEnabled(false);
        salvarMaisjButton.setEnabled(false);
        alterarjButton.setEnabled(false);
        excluirjButton.setEnabled(false);
        novojButton.setEnabled(true);
        editarjButton.setEnabled(true);

        CentroCusto oCentroCusto = new CentroCusto();


        if (nomeCentroCustojTextField.getText().equals("")){

           JOptionPane.showMessageDialog(null, "O campo NOME CENTRO DE CUSTO é obrigatório", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            novojButtonActionPerformed(evt);

        }else{

            oCentroCusto.setNome_centro_custo(nomeCentroCustojTextField.getText().trim().toUpperCase());
            oCentroCusto.setObservacao(observacaojTextArea.getText());
            oCentroCusto.setCadastrar();

            try {
                ClassConecta.con.commit();
                ClassConecta.con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(jFCentroCusto.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                getGradeCentroCusto();
            } catch (ParseException ex) {
                Logger.getLogger(jFCentroCusto.class.getName()).log(Level.SEVERE, null, ex);
            }




        }//fim else

    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void buscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjButtonActionPerformed
        try {
            // TODO add your handling code here:
            getGradeCentroCusto();
        } catch (ParseException ex) {
            Logger.getLogger(jFCentroCusto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarjButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:
        novojButton.setEnabled(false);
        salvarjButton.setEnabled(false);
        salvarMaisjButton.setEnabled(false);
        editarjButton.setEnabled(false);
        alterarjButton.setEnabled(true);
        excluirjButton.setEnabled(true);
        try {
            ClassConecta.con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(jFPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void gradeCentroCustojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeCentroCustojTableMouseClicked
        // TODO add your handling code here:
        editarjButton.setEnabled(true);
            cod_centro_custo = Integer.parseInt(gradeCentroCustojTable.getValueAt(gradeCentroCustojTable.getSelectedRow(), 0).toString());
            if (cod_centro_custo == 0) {
                return;
            }
        try {
            getFieldContas(cod_centro_custo);
        } catch (ParseException ex) {
            Logger.getLogger(jFContas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gradeCentroCustojTableMouseClicked

    private void salvarMaisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarMaisjButtonActionPerformed
        // TODO add your handling code here:
        salvarjButtonActionPerformed(evt);
        novojButtonActionPerformed(evt);
    }//GEN-LAST:event_salvarMaisjButtonActionPerformed

    private void alterarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarjButtonActionPerformed
        // TODO add your handling code here:
        salvarjButton.setEnabled(false);
        salvarMaisjButton.setEnabled(false);
        alterarjButton.setEnabled(false);
        excluirjButton.setEnabled(false);
        novojButton.setEnabled(true);
        editarjButton.setEnabled(true);

        CentroCusto oCentroCusto = new CentroCusto();


        if (nomeCentroCustojTextField.getText().equals("")){

            JOptionPane.showMessageDialog(null, "O campo NOME CENTRO DE CUSTO é obrigatório", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);

        }else{

            oCentroCusto.setCod_centro_custo(cod_centro_custo);
            oCentroCusto.setNome_centro_custo(nomeCentroCustojTextField.getText().trim().toUpperCase());
            oCentroCusto.setObservacao(observacaojTextArea.getText());
            oCentroCusto.setAlterar(conecta);

            try {
                ClassConecta.con.commit();
                ClassConecta.con.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(jFCentroCusto.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                getGradeCentroCusto();
            } catch (ParseException ex) {
                Logger.getLogger(jFCentroCusto.class.getName()).log(Level.SEVERE, null, ex);
            }


        }




    }//GEN-LAST:event_alterarjButtonActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        // TODO add your handling code here:

        Object[] options = {"Sim", "Não"};
        int sd =
                JOptionPane.showOptionDialog(null, "Deseja realmente EXCLUIR esse registro?", "Confirmação!", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (sd != 0) {
            return;
        }
        alterarjButton.setEnabled(false);
        editarjButton.setEnabled(true);
        excluirjButton.setEnabled(false);
        novojButton.setEnabled(true);

        int codContaDelete = 0;
        codContaDelete = Integer.parseInt(gradeCentroCustojTable.getValueAt(gradeCentroCustojTable.getSelectedRow(), 0).toString());

        CentroCusto oCentroCusto = new CentroCusto();
        oCentroCusto.setCod_centro_custo(codContaDelete);
        oCentroCusto.setExcluir(conecta);
        try {
            ClassConecta.con.commit();
            ClassConecta.con.setAutoCommit(true);
        }catch (SQLException ex) {
            Logger.getLogger(jFPessoas.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            getGradeCentroCusto();
        } catch (ParseException ex) {
            Logger.getLogger(jFCentroCusto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluirjButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFCentroCusto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarjButton;
    private javax.swing.JButton buscarjButton;
    private javax.swing.JSpinner cod_centro_custojSpinner;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JTable gradeCentroCustojTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField nomeCentroCustojTextField;
    private javax.swing.JButton novojButton;
    private javax.swing.JTextArea observacaojTextArea;
    private javax.swing.JButton sairjButton;
    private javax.swing.JButton salvarMaisjButton;
    private javax.swing.JButton salvarjButton;
    // End of variables declaration//GEN-END:variables

}