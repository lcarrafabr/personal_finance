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
public class Enderecos {

    Integer cod_endereco;
    Integer cod_pessoa;
    String sigla_logradouro;
    String logradouro;
    String numero;
    String bairro;
    String cidade;
    String estado;
    String pais;
    String complemento;
    String observacao;
    String cep;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getCod_endereco() {
        return cod_endereco;
    }

    public void setCod_endereco(Integer cod_endereco) {
        this.cod_endereco = cod_endereco;
    }

    public Integer getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Integer cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSigla_logradouro() {
        return sigla_logradouro;
    }

    public void setSigla_logradouro(String sigla_logradouro) {
        this.sigla_logradouro = sigla_logradouro;
    }

    public void setCadastrar(){
  try{


        String comando = "INSERT INTO enderecos "+
" 	(COD_ENDERECO,          "+
" 	COD_PESSOA,             "+
" 	SIGLA_LOGRADOURO,       "+
" 	LOGRADOURO,             "+
"       NUMERO,                 "+
"       BAIRRO,                 "+
"       CIDADE,                 "+
"       ESTADO,                 "+
"       PAIS,                   "+
"       COMPLEMENTO,            "+
"       OBSERVACAO,             "+
"       CEP                     "+
" 	)                       "+
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
" 	?,  "+
" 	?,  "+
" 	?  "+
" 	); "
;

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        stmt.setInt(1, getCod_pessoa());
        stmt.setString(2, getSigla_logradouro());
        stmt.setString(3, getLogradouro());
        stmt.setString(4, getNumero());
        stmt.setString(5,getBairro());
        stmt.setString(6, getCidade());
        stmt.setString(7, getEstado());
        stmt.setString(8, getPais());
        stmt.setString(9, getComplemento());
        stmt.setString(10, getObservacao());
        stmt.setString(11, getCep());

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
            comando =   "select e.* "+
                        "from pessoas p, enderecos e "+
                         "where e.COD_PESSOA = p.COD_PESSOA ";

            int quantParam = 0;

            if (getCod_endereco() != null){
               comando = comando + " AND e.COD_ENDERECO = ? ";
            }
            if (getCod_pessoa() != null){
               comando = comando + " AND p.COD_PESSOA = ? ";
            }

            comando = comando + " order by e.COD_ENDERECO ";
            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);

            if (getCod_endereco() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_endereco());
            }
            if (getCod_pessoa() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_pessoa());
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

        String comando = "UPDATE enderecos "+
" 	SET "+
" 	COD_PESSOA = ?,             "+
" 	SIGLA_LOGRADOURO = ?,       "+
" 	LOGRADOURO = ?,             "+
"       NUMERO = ?,                 "+
"       BAIRRO = ?,                 "+
"       CIDADE = ?,                 "+
"       ESTADO = ?,                 "+
"       PAIS = ?,                   "+
"       COMPLEMENTO = ?,            "+
"       OBSERVACAO = ?,             "+
"       CEP = ?                     "+
" 	WHERE "+
" 	COD_ENDERECO = ?";

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        stmt.setInt(1, getCod_pessoa());
        stmt.setString(2, getSigla_logradouro());
        stmt.setString(3, getLogradouro());
        stmt.setString(4, getNumero());
        stmt.setString(5, getBairro());
        stmt.setString(6, getCidade());
        stmt.setString(7, getEstado());
        stmt.setString(8, getPais());
        stmt.setString(9, getComplemento());
        stmt.setString(10, getObservacao());
        stmt.setString(11, getCep());
        stmt.setInt(12, getCod_endereco());

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

" DELETE FROM enderecos  "+
" 	WHERE "+
" 	COD_ENDERECO = ?  ";

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);
        //Formatar data Prevista

        stmt.setInt(1,getCod_endereco());


        stmt.executeUpdate();

        //System.out.println("Transação Concluída");
        JOptionPane.showMessageDialog(null, "O REGISTRO foi excluído com sucesso.", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }

    }



}
