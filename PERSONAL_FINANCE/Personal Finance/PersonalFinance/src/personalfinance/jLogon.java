/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jLogon.java
 *
 * Created on 21/05/2010, 20:44:52
 */

package personalfinance;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jdesktop.application.SingleFrameApplication;
import personalfinance.classes.ClassConecta;
import personalfinance.classes.EncriptaSenha;
import personalfinance.classes.Usuarios;



/**
 *
 * @author Vitiazze
 */
public class jLogon extends javax.swing.JFrame {

    /** Creates new form jLogon */
    public jLogon(SingleFrameApplication app) {
        initComponents();
        this.getRootPane().setDefaultButton(okjButton);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        senhajPasswordField = new javax.swing.JPasswordField();
        conexaojButton = new javax.swing.JButton();
        okjButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        usuariojTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(personalfinance.PersonalFinanceApp.class).getContext().getResourceMap(jLogon.class);
        setTitle(resourceMap.getString("Form.title")); // NOI18N
        setMinimumSize(new java.awt.Dimension(100, 100));
        setName("Form"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jDesktopPane1.setBackground(resourceMap.getColor("jDesktopPane1.background")); // NOI18N
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jDesktopPane1.setName("jDesktopPane1"); // NOI18N
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(492, 258));

        senhajPasswordField.setText(resourceMap.getString("senhajPasswordField.text")); // NOI18N
        senhajPasswordField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        senhajPasswordField.setName("senhajPasswordField"); // NOI18N
        senhajPasswordField.setBounds(170, 150, 200, 30);
        jDesktopPane1.add(senhajPasswordField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        conexaojButton.setIcon(resourceMap.getIcon("conexaojButton.icon")); // NOI18N
        conexaojButton.setText(resourceMap.getString("conexaojButton.text")); // NOI18N
        conexaojButton.setContentAreaFilled(false);
        conexaojButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        conexaojButton.setName("conexaojButton"); // NOI18N
        conexaojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conexaojButtonActionPerformed(evt);
            }
        });
        conexaojButton.setBounds(20, 190, 105, 30);
        jDesktopPane1.add(conexaojButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        okjButton.setFont(resourceMap.getFont("okjButton.font")); // NOI18N
        okjButton.setIcon(resourceMap.getIcon("okjButton.icon")); // NOI18N
        okjButton.setText(resourceMap.getString("okjButton.text")); // NOI18N
        okjButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        okjButton.setName("okjButton"); // NOI18N
        okjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okjButtonActionPerformed(evt);
            }
        });
        okjButton.setBounds(170, 190, 100, 31);
        jDesktopPane1.add(okjButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(resourceMap.getFont("jButton1.font")); // NOI18N
        jButton1.setIcon(resourceMap.getIcon("jButton1.icon")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(280, 190, 60, 30);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        usuariojTextField.setFont(resourceMap.getFont("usuariojTextField.font")); // NOI18N
        usuariojTextField.setForeground(resourceMap.getColor("usuariojTextField.foreground")); // NOI18N
        usuariojTextField.setText(resourceMap.getString("usuariojTextField.text")); // NOI18N
        usuariojTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        usuariojTextField.setName("usuariojTextField"); // NOI18N
        usuariojTextField.setBounds(170, 90, 200, 29);
        jDesktopPane1.add(usuariojTextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N
        jLabel1.setBounds(170, 70, 50, 14);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(resourceMap.getIcon("jLabel2.icon")); // NOI18N
        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N
        jLabel2.setBounds(10, 60, 120, 130);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N
        jLabel3.setBounds(170, 130, 30, 14);
        jDesktopPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(resourceMap.getFont("jLabel4.font")); // NOI18N
        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N
        jLabel4.setBounds(150, 30, 160, 30);
        jDesktopPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(350, 200, 40, 23);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ClassConecta conecta = new ClassConecta();

    int cod_usuario_entra_sistema;
    String usuario_entra_sistema;

    private JDialog aboutBox;

    private void okjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okjButtonActionPerformed
        // TODO add your handling code here:
 this.setAlwaysOnTop(false);

        if ( (usuariojTextField.getText().length() == 0) || (senhajPasswordField.getText().length() == 0) ){
          JOptionPane.showMessageDialog(null,"Os campos de usuário e senha são obrigatórios.","ATENÇÃO",JOptionPane.WARNING_MESSAGE);
          return;
        }

        //Guardar preferencia de dominio
        Preferences prefs = Preferences.userRoot().node(""); //this.getClass().getName()
        //Definir classe conecta
        ClassConecta.url                = "jdbc:mysql://"+ prefs.get("ipMySQL", "127.0.0.1") +":"+ prefs.get("portaMySQL", "3306") +"/"+prefs.get("bancoMySQL", "apolo");
        ClassConecta.user               = prefs.get("usuarioMySQL", "root");
        ClassConecta.pwd                = prefs.get("senhaMySQL", "" );


        ClassConecta.conecta();

        //Consultar usuário e senha
        Usuarios oUsuario = new Usuarios();
        EncriptaSenha oEncriptaSenha = new EncriptaSenha();
        oUsuario.setUsuario(usuariojTextField.getText().trim().toUpperCase());
        String senha = new String(senhajPasswordField.getPassword()); //CRIA UMA VARIAVEL TIPO STRING E PEGA A PASSWORD
        EncriptaSenha.encripta(senha);                           //ENVIA A SENHA DA VARIAVEL SENHA PARA A CLASSE ENCRIPTA SENHA E REALIZAA CRIPTOGRAFIA
        oUsuario.setSenha(EncriptaSenha.encripta(senha));        //ENVIA A SENHA CRIPTOGRAFADA PARA A CLASSE

        PersonalFinanceApp.usuario = oUsuario.getUsuario();
        PersonalFinanceApp.senha = oUsuario.getSenha();
        PersonalFinanceApp.codigo_do_usuario = oUsuario.getCod_pessoa();
        System.out.println(PersonalFinanceApp.codigo_do_usuario);

        

        try {
            ResultSet rs = oUsuario.getAutenticar(conecta);
            //Se autenticar abrir tela principal
            if (rs.getRow() == 1){
              //JApoloApp.launch(JApoloApp.class, null);
                System.out.println(rs = oUsuario.getAutenticar(conecta));
                Integer cod_usuario;
                cod_usuario = oUsuario.getCod_usuario();
                System.out.println(cod_usuario);


              //JApoloView oForm = new JApoloView(JApoloApp.getApplication());
              //JApoloApp.getApplication().show(oForm);

        PersonalFinanceView main = new PersonalFinanceView(PersonalFinanceApp.getApplication());

        //Definir o status
        //main.setStatus();


        JFrame frame = main.getFrame();
        frame.setLocationRelativeTo(null);
        frame.pack();


        //Definindo o Tamanho do Padrão do Formulario de Acordo com Tamanho da Tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setMinimumSize(new Dimension((screenSize.width - 50), (screenSize.height - 100)));
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //Quando restaurar nãõ va para o canto direito e sim para o esquerdo.
        frame.setLocation(10, 10);
        

        PersonalFinanceApp.getApplication().show(main);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

      
        



              this.dispose();
            }else{
              usuariojTextField.setText("");
              senhajPasswordField.setText("");
              JOptionPane.showMessageDialog(null, "O usuário e senha digitados não conferem, favor tente novamente.", "Aviso!", JOptionPane.WARNING_MESSAGE);
              return;
            }



        } catch (SQLException ex) {
            Logger.getLogger(jLogon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        



    }//GEN-LAST:event_okjButtonActionPerformed

    private void conexaojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conexaojButtonActionPerformed
        // TODO add your handling code here:
        jFConexao oFormConexao = new jFConexao();
        oFormConexao.pack();
        oFormConexao.setModal(true);
        oFormConexao.setVisible(true);
}//GEN-LAST:event_conexaojButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
        usuariojTextField.grabFocus();
        senhajPasswordField.setText("");

        //recuperar preferencia
        Preferences prefs = Preferences.userRoot().node(""); //this.getClass().getName()

        //Recuperar parametros
        //Para usar os parâmetros é necessário que não haja preferencias armazendas
        if ( (PersonalFinanceApp.ipMySQL.length() > 0) && ( prefs.get("ipMySQL", "" ).length() == 0 )  ){

          //Definir classe conecta
          prefs.put("ipMySQL", PersonalFinanceApp.ipMySQL );
          prefs.put("usuarioMySQL", PersonalFinanceApp.usuarioBancoMySQL );
          prefs.put("senhaMySQL", PersonalFinanceApp.senhaBancoMySQL );
          prefs.put("portaMySQL", PersonalFinanceApp.portaMySQL );
          prefs.put("bancoMySQL", PersonalFinanceApp.bancoMySQL );

        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        jFPessoas oFormPessoas = new jFPessoas();

        oFormPessoas.conecta = conecta;
        oFormPessoas.setTitle("Cadastro Pessoas");
        oFormPessoas.pack();
        oFormPessoas.setLocationRelativeTo(null);
        oFormPessoas.setModal(true);
        oFormPessoas.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new jLogon(PersonalFinanceApp.getApplication()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton conexaojButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton okjButton;
    private javax.swing.JPasswordField senhajPasswordField;
    private javax.swing.JTextField usuariojTextField;
    // End of variables declaration//GEN-END:variables

}