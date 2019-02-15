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
 * @author Luciano Carrafa benfica
 */
public class Historicos {

    Integer cod_historico;
    Integer cod_pessoa;
    String Historico;
    String pessoa;
    String data;
    String tipo_historico;

    public String getHistorico() {
        return Historico;
    }

    public void setHistorico(String Historico) {
        this.Historico = Historico;
    }

    public Integer getCod_historico() {
        return cod_historico;
    }

    public void setCod_historico(Integer cod_historico) {
        this.cod_historico = cod_historico;
    }

    public Integer getCod_pessoa() {
        return cod_pessoa;
    }

    public void setCod_pessoa(Integer cod_pessoa) {
        this.cod_pessoa = cod_pessoa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public String getTipo_historico() {
        return tipo_historico;
    }

    public void setTipo_historico(String tipo_historico) {
        this.tipo_historico = tipo_historico;
    }

    public void setCadastrar(){
  try{


        String comando = "INSERT INTO historicos  "+
" 	(COD_HISTORICO,     "+
" 	COD_PESSOA,         "+
" 	HISTORICO,          "+
" 	PESSOA,             "+
"       DATA,               "+
"       TIPO_HISTORICO      "+
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

//        String oDataCadastro = null;
//        if (getData() != null){
//          SimpleDateFormat oDatOut = new SimpleDateFormat("yyyy-MM-dd");
//          oDataCadastro = oDatOut.format(getData());
//        }

        stmt.setInt(1, getCod_pessoa());
        stmt.setString(2, getHistorico());
        stmt.setString(3, getPessoa());
        stmt.setString(4, getData());
        stmt.setString(5,getTipo_historico());

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
                    "from historicos "+
                    "where COD_HISTORICO = COD_HISTORICO ";

            int quantParam = 0;

            if (getCod_historico() != null){
               comando = comando + " AND COD_HISTORICO = ? ";
            }

            comando = comando + " order by COD_HISTORICO desc ";
            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);


           if ( getCod_historico() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_historico());
            }

        resultSet = stmtQuery.executeQuery();


        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     return resultSet;
     }

}
