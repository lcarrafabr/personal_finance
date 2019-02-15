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
public class CentroCusto {

    public Integer cod_centro_custo;
    public String nome_centro_custo;
    public String observacao;

    public Integer getCod_centro_custo() {
        return cod_centro_custo;
    }

    public void setCod_centro_custo(Integer cod_centro_custo) {
        this.cod_centro_custo = cod_centro_custo;
    }

    public String getNome_centro_custo() {
        return nome_centro_custo;
    }

    public void setNome_centro_custo(String nome_centro_custo) {
        this.nome_centro_custo = nome_centro_custo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


     public void setCadastrar(){
  try{

    String comando = "INSERT INTO centro_de_custos "+
" 	(COD_CENTRO_CUSTO,          "+
" 	NOME_CENTRO_CUSTO,          "+
"       OBSERVACAO          "+
" 	)                    "+
" 	VALUES "+
" 	(null,  "+
" 	?,  "+
" 	?  "+
" 	); "
;
        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        stmt.setString(1, getNome_centro_custo());
        stmt.setString(2, getObservacao());

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
            comando = "select * " +
                    "from centro_de_custos "+
                    "where COD_CENTRO_CUSTO = COD_CENTRO_CUSTO ";

            int quantParam = 0;

            if (getNome_centro_custo() != null) {
                comando = comando + "AND NOME_CENTRO_CUSTO like ? ";
            }
            if (getCod_centro_custo() != null){
               comando = comando + " AND COD_CENTRO_CUSTO = ? ";
            }

            comando = comando + " order by COD_CENTRO_CUSTO ";
            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);


           if (getNome_centro_custo() != null){
               quantParam = quantParam +1;
               stmtQuery.setString(quantParam, getNome_centro_custo()+"%");
            }
            if (getCod_centro_custo() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_centro_custo());

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

        String comando = "UPDATE centro_de_custos "+
" 	SET "+
" 	NOME_CENTRO_CUSTO = ?,          "+
"       OBSERVACAO = ?                  "+
" 	WHERE "+
" 	COD_CENTRO_CUSTO = ?";

        System.out.println("Executando operação...");

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        stmt.setString(1, getNome_centro_custo());
        stmt.setString(2, getObservacao());
        stmt.setInt(3, getCod_centro_custo());

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

" DELETE FROM centro_de_custos  "+
" 	WHERE "+
" 	COD_CENTRO_CUSTO = ?  ";

        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);
        //Formatar data Prevista

        stmt.setInt(1,getCod_centro_custo());


        stmt.executeUpdate();

        //System.out.println("Transação Concluída");
        JOptionPane.showMessageDialog(null, "O REGISTRO foi excluído com sucesso.", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }

    }



}//Fim da classe
