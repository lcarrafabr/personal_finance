/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jFUsuarios.java
 *
 * Created on 21/06/2014, 21:38:43
 */

package personalfinance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import personalfinance.classes.ClassConecta;
import personalfinance.classes.ColorRenderer;
import personalfinance.classes.EncriptaSenha;
import personalfinance.classes.Funcoes;
import personalfinance.classes.Usuarios;

/**
 *
 * @author Luciano Carrafa Benfica
 */
public class jFUsuarios extends javax.swing.JDialog {

    /** Creates new form jFUsuarios */
    public jFUsuarios() {
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
        jSeparator1 = new javax.swing.JToolBar.Separator();
        alterarjButton = new javax.swing.JButton();
        excluirjButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        historicojButton = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        sairjButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        codigoUsuariojSpinner = new javax.swing.JSpinner();
        usuariojTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        senhajPasswordField = new javax.swing.JPasswordField();
        reSenhajPasswordField = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gradeUsuariosjTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(personalfinance.PersonalFinanceApp.class).getContext().getResourceMap(jFUsuarios.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setName("Form"); // NOI18N
        setResizable(false);
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

        historicojButton.setBackground(resourceMap.getColor("historicojButton.background")); // NOI18N
        historicojButton.setIcon(resourceMap.getIcon("historicojButton.icon")); // NOI18N
        historicojButton.setText(resourceMap.getString("historicojButton.text")); // NOI18N
        historicojButton.setFocusable(false);
        historicojButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        historicojButton.setName("historicojButton"); // NOI18N
        historicojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(historicojButton);

        jSeparator3.setName("jSeparator3"); // NOI18N
        jToolBar1.add(jSeparator3);

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

        jPanel1.setBackground(resourceMap.getColor("jPanel1.background")); // NOI18N
        jPanel1.setName("jPanel1"); // NOI18N

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        jPanel2.setBackground(resourceMap.getColor("jPanel2.background")); // NOI18N
        jPanel2.setName("jPanel2"); // NOI18N

        jPanel3.setBackground(resourceMap.getColor("jPanel3.background")); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setName("jPanel3"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        codigoUsuariojSpinner.setFocusable(false);
        codigoUsuariojSpinner.setName("codigoUsuariojSpinner"); // NOI18N
        codigoUsuariojSpinner.setRequestFocusEnabled(false);

        usuariojTextField.setText(resourceMap.getString("usuariojTextField.text")); // NOI18N
        usuariojTextField.setName("usuariojTextField"); // NOI18N

        jLabel2.setBackground(resourceMap.getColor("jLabel2.background")); // NOI18N
        jLabel2.setFont(resourceMap.getFont("jLabel2.font")); // NOI18N
        jLabel2.setForeground(resourceMap.getColor("jLabel2.foreground")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(resourceMap.getFont("jLabel3.font")); // NOI18N
        jLabel3.setForeground(resourceMap.getColor("jLabel3.foreground")); // NOI18N
        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        senhajPasswordField.setText(resourceMap.getString("senhajPasswordField.text")); // NOI18N
        senhajPasswordField.setName("senhajPasswordField"); // NOI18N

        reSenhajPasswordField.setText(resourceMap.getString("reSenhajPasswordField.text")); // NOI18N
        reSenhajPasswordField.setName("reSenhajPasswordField"); // NOI18N

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setForeground(resourceMap.getColor("jLabel4.foreground")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoUsuariojSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(usuariojTextField)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(reSenhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {reSenhajPasswordField, senhajPasswordField});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoUsuariojSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reSenhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setName("jPanel4"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        gradeUsuariosjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#ID", "Pessoa", "Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gradeUsuariosjTable.setName("gradeUsuariosjTable"); // NOI18N
        gradeUsuariosjTable.setSelectionForeground(resourceMap.getColor("gradeUsuariosjTable.selectionForeground")); // NOI18N
        gradeUsuariosjTable.getTableHeader().setReorderingAllowed(false);
        gradeUsuariosjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradeUsuariosjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(gradeUsuariosjTable);
        gradeUsuariosjTable.getColumnModel().getColumn(0).setResizable(false);
        gradeUsuariosjTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        gradeUsuariosjTable.getColumnModel().getColumn(0).setHeaderValue(resourceMap.getString("gradeUsuariosjTable.columnModel.title0")); // NOI18N
        gradeUsuariosjTable.getColumnModel().getColumn(1).setResizable(false);
        gradeUsuariosjTable.getColumnModel().getColumn(1).setPreferredWidth(280);
        gradeUsuariosjTable.getColumnModel().getColumn(1).setHeaderValue(resourceMap.getString("gradeUsuariosjTable.columnModel.title1")); // NOI18N
        gradeUsuariosjTable.getColumnModel().getColumn(2).setResizable(false);
        gradeUsuariosjTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        gradeUsuariosjTable.getColumnModel().getColumn(2).setHeaderValue(resourceMap.getString("gradeUsuariosjTable.columnModel.title2")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab(resourceMap.getString("jPanel2.TabConstraints.tabTitle"), jPanel2); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
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

    int cod_pessoa_usuario; //Id# quevem do form pessoas

    int cod_usuario; //Id usuario ao clicar na grade


    public void getGrandeUsuario() throws ParseException{
       //Consultar USUARIOS
        Usuarios oUsuario = new Usuarios();

        ResultSet resultSet = null;

        String[] colunasTabela = new String[]{"Id#", "Pessoa", "Usuário"};
        DefaultTableModel modeloTabela = new DefaultTableModel(null, colunasTabela) {

            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        gradeUsuariosjTable.setModel(modeloTabela);
        gradeUsuariosjTable.getColumnModel().getColumn(0).setPreferredWidth(5);
        gradeUsuariosjTable.getColumnModel().getColumn(1).setPreferredWidth(280);
        gradeUsuariosjTable.getColumnModel().getColumn(2).setPreferredWidth(80);

        gradeUsuariosjTable.setDefaultRenderer(Object.class, new ColorRenderer()); // DEIXA A GRADE ZEBRADA

try {
            oUsuario.setCod_pessoa(cod_pessoa_usuario);

            resultSet = oUsuario.getConsultar();

            if (resultSet.getRow() == 1){
             resultSet.first();
            }


        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            while (resultSet.next()) {

                modeloTabela.addRow(new String[]{
                    Funcoes.getCodigoFormat(resultSet.getInt("COD_PESSOA")),
                    resultSet.getString("PESSOA"),
                    resultSet.getString("USUARIO") ,
                });

            }

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

           }

    public void getFieldUsuario(int cod_pessoa_usuario) throws ParseException{

        Usuarios oUsuario = new Usuarios();
        ResultSet rs = null;
        oUsuario.setCod_pessoa(cod_pessoa_usuario);

        try {
            rs = oUsuario.getConsultar();
            rs.next();

            //Pegar campos
            codigoUsuariojSpinner.setValue(rs.getInt("COD_PESSOA"));
            usuariojTextField.setText(rs.getString("USUARIO"));

        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }




    private void sairjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairjButtonActionPerformed
        // TODO add your handling code here:
        if (!novojButton.isEnabled()){
                Object[] options = {"Sim", "Não"};
                int sd = JOptionPane.showOptionDialog(null, "Deseja realmente SAIR?\n As informações não salvas serão perdidas."
                        , "Confirmação do Sistema!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
                if (sd != 0) {
                    return;
                }

                this.dispose();

            }else{

                this.dispose();

            }
    }//GEN-LAST:event_sairjButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        salvarjButton.setEnabled(false);
        alterarjButton.setEnabled(false);
        excluirjButton.setEnabled(false);
        editarjButton.setEnabled(false);
        novojButton.setEnabled(true);
        historicojButton.setEnabled(false);
        usuariojTextField.grabFocus();

        ClassConecta.conecta();
        try {
            getGrandeUsuario();
        } catch (ParseException ex) {
            Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void novojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novojButtonActionPerformed
        // TODO add your handling code here:
        novojButton.setEnabled(false);
        alterarjButton.setEnabled(false);
        editarjButton.setEnabled(false);
        excluirjButton.setEnabled(false);
        buscarjButton.setEnabled(true);
        salvarjButton.setEnabled(true);
        usuariojTextField.grabFocus();

        try {
            ClassConecta.con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }


        usuariojTextField.setText("");
        senhajPasswordField.setText("");
        reSenhajPasswordField.setText("");
        codigoUsuariojSpinner.setValue(0);
    }//GEN-LAST:event_novojButtonActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        // TODO add your handling code here:
        salvarjButton.setEnabled(false);
        alterarjButton.setEnabled(false);
        excluirjButton.setEnabled(false);
        novojButton.setEnabled(true);
        editarjButton.setEnabled(true);

        Usuarios oUsuario = new Usuarios();
        EncriptaSenha oEncriptaSenha = new EncriptaSenha();


        String usuario;
        usuario = usuariojTextField.getText();


        if (usuariojTextField.getText().equals("")
                || senhajPasswordField.getText().length() == 0
                || reSenhajPasswordField.getText().length() == 0){

            JOptionPane.showMessageDialog(null, "Atenção, TODOS os campos são obrigatórios", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            novojButtonActionPerformed(null);
            usuariojTextField.setText(usuario);
        }else{

            if (senhajPasswordField.getText().length() != reSenhajPasswordField.getText().length()){

            JOptionPane.showMessageDialog(null, "Atenção, as senhas não conferem", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            novojButtonActionPerformed(null);
            usuariojTextField.setText(usuario);

            }else{

                oUsuario.setCod_pessoa(cod_pessoa_usuario);
                oUsuario.setUsuario(usuariojTextField.getText().trim().toUpperCase());

                // CRIPTOGRAFA SENHA
                String senha = new String(senhajPasswordField.getPassword()); //CRIA UMA VARIAVEL TIPO STRING E PEGA A PASSWORD
                oEncriptaSenha.encripta(senha);                           //ENVIA A SENHA DA VARIAVEL SENHA PARA A CLASSE ENCRIPTA SENHA E REALIZAA CRIPTOGRAFIA
                System.out.println(oEncriptaSenha.encripta(senha));
                oUsuario.setSenha(oEncriptaSenha.encripta(senha));       //ENVIA A SENHA CRIPTOGRAFADA PARA A CLASSE
                oUsuario.setCadastrar();

                try {
                    ClassConecta.con.commit();
                    ClassConecta.con.setAutoCommit(true);
                } catch (SQLException ex) {
                    Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    getGrandeUsuario();
                } catch (ParseException ex) {
                    Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            
        }


    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void buscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjButtonActionPerformed
        try {
            // TODO add your handling code here:
            getGrandeUsuario();
        } catch (ParseException ex) {
            Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarjButtonActionPerformed

    private void gradeUsuariosjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeUsuariosjTableMouseClicked
        // TODO add your handling code here:
        editarjButton.setEnabled(true);
            cod_pessoa_usuario = Integer.parseInt(gradeUsuariosjTable.getValueAt(gradeUsuariosjTable.getSelectedRow(), 0).toString());
            if (cod_pessoa_usuario == 0) {
                return;
            }
        try {
            getFieldUsuario(cod_pessoa_usuario);
        } catch (ParseException ex) {
            Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gradeUsuariosjTableMouseClicked

    private void alterarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarjButtonActionPerformed
        // TODO add your handling code here:
        alterarjButton.setEnabled(false);
        editarjButton.setEnabled(true);
        excluirjButton.setEnabled(false);
        novojButton.setEnabled(true);

        Usuarios oUsuario = new Usuarios();
        EncriptaSenha oEncriptaSenha = new EncriptaSenha();

        String usuario;
        usuario = usuariojTextField.getText();


        if (usuariojTextField.getText().equals("")
                || senhajPasswordField.getText().length() == 0
                || reSenhajPasswordField.getText().length() == 0){

            JOptionPane.showMessageDialog(null, "Atenção, TODOS os campos são obrigatórios", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            novojButtonActionPerformed(null);
            usuariojTextField.setText(usuario);
        }else{

            if (senhajPasswordField.getText().length() != reSenhajPasswordField.getText().length()){

            JOptionPane.showMessageDialog(null, "Atenção, as senhas não conferem", "ATENÇÃO Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
            novojButtonActionPerformed(null);
            usuariojTextField.setText(usuario);

            }else{

                oUsuario.setCod_pessoa(cod_pessoa_usuario);
                oUsuario.setUsuario(usuariojTextField.getText().trim().toUpperCase());

                // CRIPTOGRAFA SENHA
                String senha = new String(senhajPasswordField.getPassword()); //CRIA UMA VARIAVEL SENHA DO TIPO STRING E PEGA A PASSWORD
                oEncriptaSenha.encripta(senha);                           //ENVIA A SENHA DA VARIAVEL SENHA PARA A CLASSE ENCRIPTA SENHA E REALIZAA CRIPTOGRAFIA
                System.out.println(oEncriptaSenha.encripta(senha));
                oUsuario.setSenha(oEncriptaSenha.encripta(senha));       //ENVIA A SENHA CRIPTOGRAFADA PARA A CLASSE
                oUsuario.setAlterar(conecta);

                try {
                    ClassConecta.con.commit();
                    ClassConecta.con.setAutoCommit(true);
                } catch (SQLException ex) {
                    Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try {
                getGrandeUsuario();
            } catch (ParseException ex) {
                Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_alterarjButtonActionPerformed

    private void editarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarjButtonActionPerformed
        // TODO add your handling code here:
        novojButton.setEnabled(false);
        salvarjButton.setEnabled(false);
        editarjButton.setEnabled(false);
        alterarjButton.setEnabled(true);
        excluirjButton.setEnabled(true);
        try {
            ClassConecta.con.setAutoCommit(false);
        } catch (SQLException ex) {
            Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editarjButtonActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        Object[] options = {"Sim", "Não"};
        int sd =
                JOptionPane.showOptionDialog(null, "Deseja realmente EXCLUIR esse registro?", "Confirmação do Sistema!", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (sd != 0) {
            return;
        }
        alterarjButton.setEnabled(false);
        editarjButton.setEnabled(true);
        excluirjButton.setEnabled(false);
        novojButton.setEnabled(true);

        Usuarios oUsuario = new Usuarios();
        oUsuario.setCod_pessoa(cod_pessoa_usuario);

        oUsuario.setExcluir(conecta);
        try {
            ClassConecta.con.commit();
            ClassConecta.con.setAutoCommit(true);
        } catch (SQLException ex) {
            Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }

        usuariojTextField.setText("");
        senhajPasswordField.setText("");
        reSenhajPasswordField.setText("");
        codigoUsuariojSpinner.setValue(0);
        try {
            getGrandeUsuario();
        } catch (ParseException ex) {
            Logger.getLogger(jFUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluirjButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarjButton;
    private javax.swing.JButton buscarjButton;
    private javax.swing.JSpinner codigoUsuariojSpinner;
    private javax.swing.JButton editarjButton;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JTable gradeUsuariosjTable;
    private javax.swing.JButton historicojButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton novojButton;
    private javax.swing.JPasswordField reSenhajPasswordField;
    private javax.swing.JButton sairjButton;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JPasswordField senhajPasswordField;
    private javax.swing.JTextField usuariojTextField;
    // End of variables declaration//GEN-END:variables

}