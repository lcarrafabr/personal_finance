/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package personalfinance.classes;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano Carrafa Benfica
 */
public class Pessoas {

    Integer cod_pessoa;
    String pessoa;
    Date data_cadastro;
    String status;
    String tipo_pessoa;
    String observacao;


    public Integer getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Integer cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo_pessoa() {
        return tipo_pessoa;
    }

    public void setTipo_pessoa(String tipo_pessoa) {
        this.tipo_pessoa = tipo_pessoa;
    }


    public void setCadastrar(){
  try{


        String comando = "INSERT INTO pessoas  "+
" 	(COD_PESSOA,        "+
" 	PESSOA,             "+
" 	DATA_CADASTRO,      "+
" 	STATUS,             "+
"       TIPO_PESSOA,        "+
"       OBSERVACAO          "+
" 	)                   "+
" 	VALUES "+
" 	(null,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?  "+
" 	); "
;

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        String oDataCadastro = null;
        if (getData_cadastro() != null){
          SimpleDateFormat oDatOut = new SimpleDateFormat("yyyy-MM-dd");
          oDataCadastro = oDatOut.format(getData_cadastro());
        }

        stmt.setString(1, getPessoa());
        stmt.setString(2, oDataCadastro);
        stmt.setString(3, getStatus());
        stmt.setString(4, getTipo_pessoa());
        stmt.setString(5,getObservacao());

        stmt.execute();

        //System.out.println("Transação Concluída");
        //JOptionPane.showMessageDialog(null, "Transação Concluída", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }


    public ResultSet getConsultar() throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando =   "select * "+
                        "from pessoas "+
                         "where COD_PESSOA = COD_PESSOA ";

            int quantParam = 0;

            if (getPessoa() != null) {
                comando = comando + "AND PESSOA like ?";
            }
            if (getCod_pessoa() != null){
               comando = comando + " AND COD_PESSOA = ?";
            }
            if (getTipo_pessoa() != null){
               comando = comando + " AND TIPO_PESSOA = ?";
            }

            comando = comando + " order by COD_PESSOA, PESSOA ";
            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);


//            if ( tipoPessoa == null ) //Filtrar empresas
//            if ( (ClassConecta.tipoPessoa.equals("Cliente")) && (ClassConecta.codFunc > 0)   ){
//              comando = comando + " AND codPessoa = "+ ClassConecta.codFunc;
//            }
            if (getPessoa() != null){
               quantParam = quantParam +1;
               stmtQuery.setString(quantParam, getPessoa()+"%");
            }
            if (getCod_pessoa() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_pessoa());
            }
            if (getTipo_pessoa() != null){
               quantParam = quantParam +1;
               stmtQuery.setString(quantParam, getTipo_pessoa());
            }

        resultSet = stmtQuery.executeQuery();

        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql \n" + sqlex);

        }

     return resultSet;
     }


    public void setAlterar(ClassConecta conexao){

        try{
        //ClassConecta conexao = new ClassConecta();

        //conexao.conecta();

        String comando = "UPDATE PESSOAS "+
" 	SET "+
" 	PESSOA = ?,         "+
" 	DATA_CADASTRO = ?,  "+
" 	STATUS = ?,         "+
"       TIPO_PESSOA = ?,   "+
"       OBSERVACAO = ?      "+
" 	WHERE "+
" 	COD_PESSOA = ?";

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        String oDataCadastro = null;
        if (getData_cadastro() != null){
          SimpleDateFormat oDatOut = new SimpleDateFormat("yyyy-MM-dd");
          oDataCadastro = oDatOut.format(getData_cadastro());
        }

        stmt.setString(1, getPessoa());
        stmt.setString(2, oDataCadastro);
        stmt.setString(3, getStatus());
        stmt.setString(4, getTipo_pessoa());
        stmt.setString(5, getObservacao());
        stmt.setInt(6, getCod_pessoa());

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

" DELETE FROM pessoas  "+
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




}//FIM DA CLASSE

