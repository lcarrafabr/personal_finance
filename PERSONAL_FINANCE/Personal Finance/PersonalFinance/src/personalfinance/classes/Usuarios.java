/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package personalfinance.classes;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano Carrafa Benfica
 */
public class Usuarios {

    int cod_usuario;
    Integer cod_pessoa;
    String usuario;
    String senha;

    public Integer getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Integer cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    public int getCod_usuario() {
        return cod_usuario;
    }

    public void setCod_usuario(int cod_usuario) {
        this.cod_usuario = cod_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuarios other = (Usuarios) obj;
        if (this.cod_usuario != other.cod_usuario) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.cod_usuario;
        return hash;
    }

    public void setCadastrar(){
  try{


        String comando = "INSERT INTO usuario  "+
" 	(COD_PESSOA,       "+
" 	USUARIO,            "+
" 	SENHA               "+
" 	)                   "+
" 	VALUES  "+
" 	(?,  "+     //Aqui deveria ser NULL como é uma chave primaria estrangeira que não se auto incrementa. Esta parte deve ser preenchida com um valor
" 	?,      "+
" 	?       "+
" 	); "
;

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        stmt.setInt(1, getCod_pessoa());
        stmt.setString(2, getUsuario());
        stmt.setString(3, getSenha());

        stmt.execute();

        //System.out.println("Transação Concluída");
        //JOptionPane.showMessageDialog(null, "Transação Concluída", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Esta pessoa não pode ter mais de um usuário", "ATENÇÃO MENSAGEM DO SISTEMA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet getConsultar() throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando = "select p.PESSOA, u.* " +
                    "from PESSOAS p inner join USUARIO u "+
                    "on p.COD_PESSOA = u.COD_PESSOA ";

            int quantParam = 0;

            if (getCod_pessoa() != null){
               comando = comando + " AND u.COD_PESSOA = ? ";
            }

            comando = comando + " order by u.COD_PESSOA ";
            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);


           if ( getCod_pessoa() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_pessoa());
            }

        resultSet = stmtQuery.executeQuery();


        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     return resultSet;
     }


    public void setAlterar(ClassConecta conexao){

        try{
        //ClassConecta conexao = new ClassConecta();

        //conexao.conecta();

        String comando = "UPDATE usuario "+
" 	SET "+
" 	COD_PESSOA = ?,                 "+
" 	USUARIO = ?,                        "+
" 	SENHA = ?                         "+
" 	WHERE                             "+
" 	COD_PESSOA = ?";

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        stmt.setInt(1, getCod_pessoa());
        stmt.setString(2, getUsuario());
        stmt.setString(3, getSenha());
        stmt.setInt(4, getCod_pessoa());

        stmt.executeUpdate();

        System.out.println("Transação Concluída");
        JOptionPane.showMessageDialog(null, "O REGISTRO foi salvo com sucesso.", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }


    public void setExcluir(ClassConecta conexao){

        try{
        //ClassConecta conexao = new ClassConecta();

        //conexao.conecta();

        String comando =

" DELETE FROM usuario  "+
" 	WHERE "+
" 	COD_PESSOA = ?  ";

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);
        //Formatar data Prevista

        stmt.setInt(1,getCod_pessoa());


        stmt.executeUpdate();

        //System.out.println("Transação Concluída");
        JOptionPane.showMessageDialog(null, "O REGISTRO foi excluído com sucesso.", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet getAutenticar(ClassConecta conexao) throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando = "select * " +
                      " from usuario "+
                      " where usuario = ? "+
                      " and senha = ? ";

            

            //ClassConecta conexao = new ClassConecta();

            //conexao.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);

           

            stmtQuery.setString(1, getUsuario());
            stmtQuery.setString(2, getSenha());

        resultSet = stmtQuery.executeQuery();
        resultSet.first();


        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     return resultSet;
     }

     public ResultSet getTrazerCodUsuario(ClassConecta conexao) throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando = "select * " +
                      " from usuario "+
                      " where usuario = ? "+
                      " and senha = ? ";


            int quantParam = 0;

            if (getCod_pessoa() != null){
               comando = comando + " AND COD_PESSOA = ? ";
            }
            if (getUsuario() != null){
               comando = comando + " AND USUARIO = ? ";
            }
            if (getSenha() != null) {
                comando = comando + " AND SENHA = ? ";
            }


            //ClassConecta conexao = new ClassConecta();

            //conexao.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);

             if ( getCod_pessoa() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_pessoa());
            }
            if ( getUsuario() != null){
               quantParam = quantParam +1;
               stmtQuery.setString(quantParam, getUsuario());
            }
            if ( getSenha() != null){
               quantParam = quantParam +1;
               stmtQuery.setString(quantParam, getSenha());
            }
            
        resultSet = stmtQuery.executeQuery();
        resultSet.first();


        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     return resultSet;
     }


     public ResultSet getConsultarCodPessoa() throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando = "select * " +
                      "from USUARIO "+
                      "where COD_PESSOA = COD_PESSOA ";

//            System.out.println("classe usuario =  "+pegarUsuario);

            int quantParam = 0;

            if (getUsuario() != null){
               comando = comando + " AND USUARIO = ? ";
            }
            if (getCod_pessoa() != 0){
               comando = comando + " AND COD_PESSOA = ? ";
            }
            
//            comando = comando + " order by u.USUARIO ";
            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);


               if ( getUsuario() != null){
               quantParam = quantParam +1;
               stmtQuery.setString(quantParam, getUsuario());
            }
            if ( getCod_pessoa() != 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_pessoa());
            }

        resultSet = stmtQuery.executeQuery();

        System.out.println(getUsuario());
        System.out.println(getCod_pessoa());
        System.out.println("passou do executeQuery");


        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     return resultSet;
     }




}// FIM DACLASSE
