/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package personalfinance.classes;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano Carrafa Benfica
 */
public class LivroCaixa {

    Integer cod_lancamento;
    Integer cod_CentroCusto;
    Integer cod_contas;
    Integer cod_pessoas;
    Integer numero_documento;
    String tipo_documento;
    String historico;
    Double valor;
    Date data_lancamento;
    int anoRef;
    int mesRef;
    Date dataFinal;

    public Integer getCod_CentroCusto() {
        return cod_CentroCusto;
    }

    public void setCod_CentroCusto(Integer cod_CentroCusto) {
        this.cod_CentroCusto = cod_CentroCusto;
    }

    public Integer getCod_pessoas() {
        return cod_pessoas;
    }

    public void setCod_pessoas(Integer cod_pessoas) {
        this.cod_pessoas = cod_pessoas;
    }



    public int getAnoRef() {
        return anoRef;
    }

    public void setAnoRef(int anoRef) {
        this.anoRef = anoRef;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public int getMesRef() {
        return mesRef;
    }

    public void setMesRef(int mesRef) {
        this.mesRef = mesRef;
    }

    public Integer getCod_contas() {
        return cod_contas;
    }

    public void setCod_contas(Integer cod_contas) {
        this.cod_contas = cod_contas;
    }

    public Integer getCod_lancamento() {
        return cod_lancamento;
    }

    public void setCod_lancamento(Integer cod_lancamento) {
        this.cod_lancamento = cod_lancamento;
    }

    public Date getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Integer getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(Integer numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }




    public void setCadastrar(ClassConecta conexao){

        try{
        //ClassConecta conexao = new ClassConecta();

        String comando = "INSERT INTO livro_caixa "+
"	(COD_LANCAMENTO,    "+
"	COD_CENTRO_CUSTO,   "+
"	COD_PESSOA,         "+
"	COD_CONTAS,         "+
"	NUMERO_DOCUMENTO,   "+
"	TIPO_DOCUMENTO,     "+
"	HISTORICO,          "+
"	VALOR,              "+
"	DATA_LANCAMENTO     "+
"	) "+
"	VALUES "+
"	(null,  "+
"	?,  "+
"	?,  "+
"	?,  "+
"	?,  "+
"	?,  "+
"	?,  "+
"	?,  "+
"	? "+
"	) "
;



        System.out.println("Executando operação...");
        //conexao.conecta();
        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        //Formatar data
        String oDataLanc = null;
        if (getData_lancamento() != null){
          SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd");
          oDataLanc = formatoData.format(getData_lancamento());
        }

        if (getValor() == 0){
            setValor((double)0);
        }

        stmt.setInt(1,getCod_CentroCusto());
        stmt.setInt(2, getCod_pessoas());
        stmt.setInt(3,getCod_contas());
        stmt.setInt(4,getNumero_documento());
        stmt.setString(5,getTipo_documento());
        stmt.setString(6,getHistorico());
        stmt.setDouble(7,getValor());
        stmt.setString(8,oDataLanc);

        stmt.execute();

        System.out.println("Transação Concluída");
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet getConsultar() throws SQLException, ParseException
    {
        ResultSet resultSet = null;
        String datIni = null;
        String datFin = null;

        try
        {
            String comando;
            comando = "SELECT lc.*,cb.BANCO,p.PESSOA "+
                      "FROM livro_caixa lc "+
                      "left join contas cb ON (cb.COD_CONTAS = lc.COD_CONTAS ) "+
                      "left join pessoas p ON (p.COD_PESSOA = lc.COD_PESSOA) "+
                      "left join centro_de_custos c ON (c.COD_CENTRO_CUSTO = lc.COD_CENTRO_CUSTO)  "+
                      "WHERE 1 = 1 ";

            int quantParam = 0;


            if (getCod_pessoas() != null){
               comando = comando + " AND lc.COD_PESSOA = ? ";
            }
            if (getCod_CentroCusto() != null){
               comando = comando + " AND lc.COD_CENTRO_CUSTO = ? ";
            }

            if (getCod_contas() != null){
               comando = comando + " AND lc.COD_CONTAS = ? ";
            }

            if ( getData_lancamento() != null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               datIni = formato.format((Date)getData_lancamento());
               datFin = formato.format((Date)getDataFinal());
            }

            if ( getDataFinal() != null){
               comando = comando + " AND lc.DATA_LANCAMENTO between ? and ? ";
            }else{
             if ( getData_lancamento() != null){
               comando = comando + " AND lc.DATA_LANCAMENTO = ? ";
               }
            }

            if (getMesRef() > 0){
               comando = comando + " AND EXTRACT(YEAR FROM lc.DATA_LANCAMENTO) = ? ";
               comando = comando + " AND EXTRACT(MONTH FROM lc.DATA_LANCAMENTO) = ? ";
            }else{

            if ( getAnoRef() > 0  ){
               comando = comando + " AND EXTRACT(YEAR FROM lc.DATA_LANCAMENTO) = ? ";
            }

            }

            comando = comando + " order by COD_CONTAS ";
            //ClassConecta conexao = new ClassConecta();
            //conexao.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);


            if (getCod_pessoas() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_pessoas());
            }
            if (getCod_CentroCusto() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_CentroCusto());
            }

            if (getCod_contas() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_contas());
            }

            if ( getDataFinal() != null){
               quantParam = quantParam +1;
               stmtQuery.setDate(quantParam, java.sql.Date.valueOf(datIni) );
               quantParam = quantParam +1;
               stmtQuery.setDate(quantParam, java.sql.Date.valueOf(datFin) );
            }else{
             if ( getData_lancamento() != null){
               quantParam = quantParam +1;
               stmtQuery.setDate(quantParam, java.sql.Date.valueOf(datIni) );
               }
            }

            if (getMesRef() > 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getAnoRef());
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getMesRef());
            }else{
            if ( getAnoRef() > 0 ){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getAnoRef());
            }

            }


        resultSet = stmtQuery.executeQuery();


        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     return resultSet;
     }


     public double getConsultarSaldo(String valorRetorno,ClassConecta conexao) throws SQLException, ParseException
    {
        ResultSet resultSet = null;
        String datIni = null;
        String datFin = null;
        double  retorno;

        try
        {
            String comando;
            comando =   "SELECT IFNULL(SUM(valor) ,0) AS valorTotal,( "+
                        "SELECT IFNULL(SUM(valor) ,0) "+
                        " FROM livro_caixa lct "+
                        " WHERE lct.DATA_LANCAMENTO < lc.DATA_LANCAMENTO "+
                        " and lct.COD_CONTAS = lc.COD_CONTAS "+
                        " group by lct.COD_CONTAS "+
                        ") AS valorAnterior "+
                        "  FROM livro_caixa lc  "+
                        "  WHERE lc.COD_CONTAS = lc.COD_CONTAS ";

            int quantParam = 0;

            if (getCod_CentroCusto() != null){
               comando = comando + " AND lc.COD_CENTRO_CUSTO = ? ";
            }

            if (getCod_contas() != null){
               comando = comando + " AND lc.COD_CONTAS = ? ";
            }

           if ( getData_lancamento() != null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               datIni = formato.format((Date)getData_lancamento());
               datFin = formato.format((Date)getDataFinal());
           }

            if ( getDataFinal() != null){
               comando = comando + " AND lc.DATA_LANCAMENTO between ? and ? ";
            }else{
             if ( getData_lancamento() != null){
               comando = comando + " AND lc.DATA_LANCAMENTO = ? ";
               }
            }

            if (getMesRef() > 0){
               comando = comando + " AND EXTRACT(YEAR FROM lc.DATA_LANCAMENTO) = ? ";
               comando = comando + " AND EXTRACT(MONTH FROM lc.DATA_LANCAMENTO) = ? ";
            }else{

            if ( getAnoRef() > 0  ){
               comando = comando + " AND EXTRACT(YEAR FROM lc.DATA_LANCAMENTO) = ? ";
            }

            }

             comando = comando + " group by lc.COD_CONTAS ";
            //ClassConecta conexao = new ClassConecta();

            //conexao.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);

            if (getCod_CentroCusto() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_CentroCusto());
            }

            if (getCod_contas() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCod_contas());
            }

            if ( getDataFinal() != null){
               quantParam = quantParam +1;
               stmtQuery.setDate(quantParam, java.sql.Date.valueOf(datIni) );
               quantParam = quantParam +1;
               stmtQuery.setDate(quantParam, java.sql.Date.valueOf(datFin) );
            }else{
             if ( getData_lancamento() != null){
               quantParam = quantParam +1;
               stmtQuery.setDate(quantParam, java.sql.Date.valueOf(datIni) );
               }
            }

            if (getMesRef() > 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getAnoRef());
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getMesRef());
            }else{
            if ( getAnoRef() > 0 ){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getAnoRef());
            }

            }


        resultSet = stmtQuery.executeQuery();
        resultSet.first();

        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }
     if (valorRetorno.equals("anterior")){
         retorno    = resultSet.getDouble("valorAnterior");
     }else{
         retorno    = resultSet.getDouble("valorTotal");
     }

     return retorno;
     }



     public void setEstornar(ClassConecta conexao){

        try{

        String comando = "INSERT INTO livro_caixa "+
"	(COD_LANCAMENTO,    "+
"	COD_CONTAS,         "+
"	COD_PESSOA,         "+
"       COD_CENTRO_CUSTO,   "+
"	NUMERO_DOCUMENTO,   "+
"	TIPO_DOCUMENTO,     "+
"	HISTORICO,          "+
"	VALOR,              "+
"	DATA_LANCAMENTO     "+
"	) "+
" "+
"SELECT NULL AS COD_LANCAMENTO,COD_CONTAS,COD_PESSOA,COD_CENTRO_CUSTO,NUMERO_DOCUMENTO,TIPO_DOCUMENTO,CONCAT('Estorno de ',historico),(valor*-1),DATA_LANCAMENTO "+
"FROM livro_caixa "+
"WHERE COD_LANCAMENTO = ? ";



        System.out.println("Executando operação...");
        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        stmt.setInt(1,getCod_lancamento());
        stmt.execute();

        //System.out.println("Transação Concluída");
        //JOptionPane.showMessageDialog(null, "O REGISTRO foi salvo com sucesso.", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }



}
