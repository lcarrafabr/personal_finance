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
public class Contas {


    Integer cod_conta;
    Integer cod_pessoa;
    String nome_conta;
    String banco;
    Integer agencia;
    String digito_agencia;
    Integer numero_conta;
    String digito_conta;
    String numero_banco;
    String observacao;

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Integer getCod_conta() {
        return cod_conta;
    }

    public void setCod_conta(Integer cod_conta) {
        this.cod_conta = cod_conta;
    }

    public Integer getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Integer cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    public String getDigito_agencia() {
        return digito_agencia;
    }

    public void setDigito_agencia(String digito_agencia) {
        this.digito_agencia = digito_agencia;
    }

    public String getDigito_conta() {
        return digito_conta;
    }

    public void setDigito_conta(String digito_conta) {
        this.digito_conta = digito_conta;
    }

    public String getNome_conta() {
        return nome_conta;
    }

    public void setNome_conta(String nome_conta) {
        this.nome_conta = nome_conta;
    }

    public String getNumero_banco() {
        return numero_banco;
    }

    public void setNumero_banco(String numero_banco) {
        this.numero_banco = numero_banco;
    }

    public Integer getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(Integer numero_conta) {
        this.numero_conta = numero_conta;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setCadastrar(){
  try{


        String comando = "INSERT INTO contas "+
" 	(COD_CONTAS,          "+
" 	COD_PESSOA,          "+
" 	NOME_CONTA,          "+
" 	BANCO,               "+
"       AGENCIA,             "+
"       DIGITO_AGENCIA,      "+
"       NUMERO_CONTA,        "+
"       DIGITO_CONTA,        "+
"       NUMERO_BANCO,        "+
"       OBSERVACAO          "+
" 	)                    "+
" 	VALUES "+
" 	(null,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?,  "+
" 	?  "+
" 	); "
;

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        stmt.setInt(1, getCod_pessoa());
        stmt.setString(2, getNome_conta());
        stmt.setString(3, getBanco());
        stmt.setInt(4, getAgencia());
        stmt.setString(5,getDigito_agencia());
        stmt.setInt(6, getNumero_conta());
        stmt.setString(7, getDigito_conta());
        stmt.setString(8, getNumero_banco());
        stmt.setString(9, getObservacao());

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
            comando = "select c.*, p.PESSOA " +
                    "from contas c, pessoas p "+
                    "where c.COD_PESSOA = p.COD_PESSOA "+
                    "and c.COD_CONTAS = c.COD_CONTAS ";

            int quantParam = 0;

            if (getNome_conta() != null) {
                comando = comando + "AND c.NOME_CONTA like ? ";
            }
            if (getCod_conta() != null){
               comando = comando + " AND c.COD_CONTAS = ? ";
            }

            comando = comando + " order by c.COD_CONTAS ";
            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);


           if (getNome_conta() != null){
               quantParam = quantParam +1;
               stmtQuery.setString(quantParam, getNome_conta()+"%");
            }
            if (getCod_conta() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_conta());

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

        String comando = "UPDATE contas "+
" 	SET "+
" 	COD_PESSOA = ?,             "+
" 	NOME_CONTA = ?,             "+
" 	BANCO = ?,                  "+
"       AGENCIA = ?,                "+
"       DIGITO_AGENCIA = ?,         "+
"       NUMERO_CONTA = ?,           "+
"       DIGITO_CONTA = ?,           "+
"       NUMERO_BANCO = ?,           "+
"       OBSERVACAO = ?              "+
" 	WHERE "+
" 	COD_CONTAS = ?";

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        stmt.setInt(1, getCod_pessoa());
        stmt.setString(2, getNome_conta());
        stmt.setString(3, getBanco());
        stmt.setInt(4, getAgencia());
        stmt.setString(5, getDigito_agencia());
        stmt.setInt(6, getNumero_conta());
        stmt.setString(7, getDigito_conta());
        stmt.setString(8, getNumero_banco());
        stmt.setString(9, getObservacao());
        stmt.setInt(10, getCod_conta());

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

" DELETE FROM contas  "+
" 	WHERE "+
" 	COD_CONTAS = ?  ";

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);
        //Formatar data Prevista

        stmt.setInt(1,getCod_conta());


        stmt.executeUpdate();

        //System.out.println("Transação Concluída");
        JOptionPane.showMessageDialog(null, "O REGISTRO foi excluído com sucesso.", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }

    }



}
