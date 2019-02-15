/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package personalfinance.classes;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author cmtj
 */
public class Recibos implements Serializable {
    private Integer codRecibo;
    private int codParcela;
    private Float valorRecibo;
    private Date datRecibo;
    private int codPedido;
    private Float valorDesconto;
    private String descricao;

    /**
     *
     */
    public Recibos() {
    }

    /**
     *
     * @param codRecibo
     */
    public Recibos(Integer codRecibo) {
        this.codRecibo = codRecibo;
    }

    /**
     *
     * @param codRecibo
     * @param codParcela
     * @param codPedido
     */
    public Recibos(Integer codRecibo, int codParcela, int codPedido) {
        this.codRecibo = codRecibo;
        this.codParcela = codParcela;
        this.codPedido = codPedido;
    }

    /**
     *
     * @return
     */
    public Integer getCodRecibo() {
        return codRecibo;
    }

    /**
     *
     * @param codRecibo
     */
    public void setCodRecibo(Integer codRecibo) {
        this.codRecibo = codRecibo;
    }

    /**
     *
     * @return
     */
    public int getCodParcela() {
        return codParcela;
    }

    /**
     *
     * @param codParcela
     */
    public void setCodParcela(int codParcela) {
        this.codParcela = codParcela;
    }

    /**
     *
     * @return
     */
    public Float getValorRecibo() {
        return valorRecibo;
    }

    /**
     *
     * @param valorRecibo
     */
    public void setValorRecibo(Float valorRecibo) {
        this.valorRecibo = valorRecibo;
    }

    /**
     *
     * @return
     */
    public Date getDatRecibo() {
        return datRecibo;
    }

    /**
     *
     * @param datRecibo
     */
    public void setDatRecibo(Date datRecibo) {
        this.datRecibo = datRecibo;
    }

    /**
     *
     * @return
     */
    public int getCodPedido() {
        return codPedido;
    }

    /**
     *
     * @param codPedido
     */
    public void setCodPedido(int codPedido) {
        this.codPedido = codPedido;
    }

    /**
     *
     * @return
     */
    public Float getValorDesconto() {
        return valorDesconto;
    }

    /**
     *
     * @param valorDesconto
     */
    public void setValorDesconto(Float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * 
     * @param conexao
     * @return
     * @throws SQLException
     */
    public int getConsultarUltimoID(ClassConecta conexao) throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando = "SELECT MAX(COD_RECIBO) COD_RECIBO from recibos ";
                      //" FROM recibos ";

            //ClassConecta conexao = new ClassConecta();

            //conexao.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = conexao.con.prepareStatement(comando);


        resultSet = stmtQuery.executeQuery();



        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }
     resultSet.first();
     return resultSet.getInt("COD_RECIBO");
     }

    /**
     *
     * @param conexao
     * @return
     * @throws SQLException
     */
   

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
            comando = "SELECT r.*, p.*, pe.PESSOA "+
                      "FROM recibos r,parcelas p, pessoas pe "+
                      "WHERE r.COD_PARCELA = p.COD_PARCELA "+
                      "AND p.COD_PESSOA = .pe.COD_PESSOA ";

            int quantParam = 0;

            if (getCodRecibo() != null){
               comando = comando + " AND r.COD_RECIBO = ? ";
            }
            
            if (getCodParcela() > 0){
               comando = comando + " AND r.COD_PARCELA = ? ";
            }            


            //ClassConecta conexao = new ClassConecta();

            //conexao.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = conexao.con.prepareStatement(comando);

            if (getCodRecibo() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodRecibo());
            }
            if (getCodParcela() > 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodParcela());
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

        String comando = "INSERT INTO recibos "+
"	(COD_RECIBO,  "+
"	COD_PARCELA,  "+
"	VALOR_RECIBO,  "+
"	DATA_RECIBO,  "+
"	VALOR_DESCONTO "+
"	) "+
"	VALUES "+
"	(null,  "+
"	?,  "+
"	?,  "+
"	?,  "+
"	? "+
"	); "
;



        System.out.println("Executando operação...");
        //conexao.conecta();
        PreparedStatement stmt = (PreparedStatement) conexao.con.prepareStatement(comando);

        //Formatar data
        String oDatRecibo = null;
        if (getDatRecibo() != null){
          SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
          oDatRecibo = formatoData.format(getDatRecibo());
        }

        if (getValorDesconto() == null){
            setValorDesconto((float) 0);
        }

        if (getValorRecibo() == null){
            setValorRecibo((float) 0);
        }


        stmt.setInt(1,getCodParcela());
        stmt.setFloat(2,getValorRecibo());
        stmt.setString(3,oDatRecibo);
        stmt.setFloat(4,getValorDesconto());


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

        String comando = "UPDATE  recibos "+
"	SET "+
"	COD_RECIBO = ? ,  "+
"	COD_PARCELA = ? ,  "+
"	VALOR_RECIBO = ? ,  "+
"	DATA_RECIBO = ? ,  "+
"	VALOR_DESCONTO = ? "+
"	 "+
"	WHERE "+
"	COD_RECIBO = ?  ";


        System.out.println("Executando operação...");
        PreparedStatement stmt = (PreparedStatement) conexao.con.prepareStatement(comando);


        //Formatar data
        String oDatRecibo = null;
        if (getDatRecibo() != null){
          SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
          oDatRecibo = formatoData.format(getDatRecibo());
        }

        if (getValorDesconto() == null){
            setValorDesconto((float) 0);
        }

        if (getValorRecibo() == null){
            setValorRecibo((float) 0);
        }


        stmt.setInt(1,getCodRecibo());
        stmt.setInt(2,getCodParcela());
        stmt.setFloat(3,getValorRecibo());
        stmt.setString(4,oDatRecibo);
        stmt.setFloat(5,getValorDesconto());
        stmt.setInt(6,getCodRecibo());


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
        hash += (codRecibo != null ? codRecibo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recibos)) {
            return false;
        }
        Recibos other = (Recibos) object;
        if ((this.codRecibo == null && other.codRecibo != null) || (this.codRecibo != null && !this.codRecibo.equals(other.codRecibo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "japolo.Recibos[COD_RECIBO=" + codRecibo + "]";
    }

}
