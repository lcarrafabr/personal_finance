/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package personalfinance.classes;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cmtj
 */
public class ReciboFormasPK implements Serializable {
    private int codRecibo;
    private String forma;
    private Float valorForma;

    /**
     *
     */
    public ReciboFormasPK() {
    }

    /**
     *
     * @param codRecibo
     * @param forma
     */
    public ReciboFormasPK(int codRecibo, String forma) {
        this.codRecibo = codRecibo;
        this.forma = forma;
    }

    /**
     *
     * @return
     */
    public Float getValorForma() {
        return valorForma;
    }

    /**
     *
     * @param valorForma
     */
    public void setValorForma(Float valorForma) {
        this.valorForma = valorForma;
    }

    /**
     *
     * @return
     */
    public int getCodRecibo() {
        return codRecibo;
    }

    /**
     *
     * @param codRecibo
     */
    public void setCodRecibo(int codRecibo) {
        this.codRecibo = codRecibo;
    }

    /**
     *
     * @return
     */
    public String getForma() {
        return forma;
    }

    /**
     *
     * @param forma
     */
    public void setForma(String forma) {
        this.forma = forma;
    }

    /**
     *
     * @param conexao
     * @return
     * @throws SQLException
     */
    public ResultSet getConsultar(ClassConecta conexao) throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando = "SELECT * "+
                      "FROM recibos_formas "+
                      " WHERE COD_RECIBO = COD_RECIBO ";
            
            int quantParam = 0;

            if (getCodRecibo() > 0){
               comando = comando + " AND COD_RECIBO = ? ";
            }

            if (getForma() != null){
               comando = comando + " AND FORMA = ? ";
            }

            //ClassConecta conexao = new ClassConecta();

            //conexao.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = conexao.con.prepareStatement(comando);

            if (getCodRecibo() > 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodRecibo());
            }
            if (getForma() != null){
               quantParam = quantParam +1;
               stmtQuery.setString(quantParam, getForma());
            }

        resultSet = stmtQuery.executeQuery();


        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     return resultSet;
     }

    public void setCadastrar(ClassConecta conexao){

        try{
        //ClassConecta conexao = new ClassConecta();

        String comando = "INSERT INTO recibos_formas "+
"	(COD_RECIBO,  "+
"	FORMA,  "+
"	VALOR_FORMA "+
"	) "+
"	VALUES "+
"	(?,  "+
"	 ?,  "+
"	? "+
"	) "
;



        System.out.println("Executando operação...");
        //conexao.conecta();
        PreparedStatement stmt = (PreparedStatement) conexao.con.prepareStatement(comando);
        
        if (getValorForma() == null){
            setValorForma((float) 0);
        }

        stmt.setInt(1,getCodRecibo());
        stmt.setString(2,getForma());
        stmt.setFloat(3,getValorForma());

        stmt.execute();

        System.out.println("Transação Concluída");
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setAlterar(ClassConecta conexao){

        try{
        //ClassConecta conexao = new ClassConecta();

        //conexao.conecta();

        String comando = "UPDATE recibos_formas "+
                         "	SET "+
"	COD_RECIBO = ? ,  "+
"	FORMA = ? ,  "+
"	VALOR_FORMA = ? "+
"	 "+
"	WHERE "+
"	COD_RECIBO = ? "+
"       AND FORMA = ?  ";


        System.out.println("Executando operação...");
        PreparedStatement stmt = (PreparedStatement) conexao.con.prepareStatement(comando);


        if (getValorForma() == null){
            setValorForma((float) 0);
        }


        stmt.setInt(1,getCodRecibo());
        stmt.setString(2,getForma());
        stmt.setFloat(3,getValorForma());
        stmt.setInt(4,getCodRecibo());
        stmt.setString(5,getForma());


        stmt.execute();

        System.out.println("Transação Concluída");
        //JOptionPane.showMessageDialog(null, "O REGISTRO foi salvo com sucesso.", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codRecibo;
        hash += (forma != null ? forma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReciboFormasPK)) {
            return false;
        }
        ReciboFormasPK other = (ReciboFormasPK) object;
        if (this.codRecibo != other.codRecibo) {
            return false;
        }
        if ((this.forma == null && other.forma != null) || (this.forma != null && !this.forma.equals(other.forma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "japolo.ReciboFormasPK[COD_RECIBO=" + codRecibo + ", FORMA=" + forma + "]";
    }

}
