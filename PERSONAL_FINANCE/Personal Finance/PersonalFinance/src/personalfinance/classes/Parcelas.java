/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package personalfinance.classes;

import com.mysql.jdbc.PreparedStatement;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Luciano Carrafa Benfica
 */
public class Parcelas implements Serializable{

    private Integer cod_parcela;
    private int cod_pessoa;
    private int cod_centro_custo;
    private int cod_conta;
    private String natureza;
    private float quantidade;
    private Date data_vencimento;
    private float valor_documento;
    private String situacao;
    private Date data_emissao;
    private float desconto;
    private float multa;
    private float juros;
    private float acrescimo;
    private float diferenca;
    private Date data_pagamento;
    private Integer cod_documento_origem;
    private String tipo_documento_origem;
    private String observacao;
    private int anoRef;
    private int mesRef;
    private int diasRef;
    private Date datFinal;
    private Integer parcela;
    private Float valorPago;
    private String localRec;

    public Parcelas() {
    }


     /**
     *
     * @param codParcela
     */
    public Parcelas(Integer codParcela) {
        this.cod_parcela = codParcela;
    }


     /**
     *
     * @param codParcela
     * @param codPessoa
     * @param codCentroCusto
     * @param datVenc
     * @param situacao
     * @param data_emissao
     */
    public Parcelas(Integer codParcela, int codPessoa, int codCentroCusto, Date datVenc, String situacao, Date data_Emissao) {
        this.cod_parcela = codParcela;
        this.cod_pessoa = codPessoa;
        this.cod_centro_custo = codCentroCusto;
        this.data_vencimento = datVenc;
        this.situacao = situacao;
        this.data_emissao = data_Emissao;
    }

    /**
     *
     * @return
     */
    public String getNatureza() {
        return natureza;
    }

    /**
     *
     * @param natureza
     */
    public void setNatureza(String natureza) {
        String oldNatureza = this.natureza;
        this.natureza = natureza;
    }

    public Integer getAnoRef() {
        return anoRef;
    }

    /**
     *
     * @return
     */
    public Integer getMesRef() {
        return mesRef;
    }

    /**
     *
     * @param anoRef
     */
    public void setAnoRef(Integer anoRef) {
        Integer oldAnoRef = this.anoRef;
        this.anoRef = anoRef;
    }

    /**
     *
     * @param mesRef
     */
    public void setMesRef(Integer mesRef) {
        Integer oldMesRef = this.mesRef;
        this.mesRef = mesRef;
    }

    /**
     *
     * @return
     */
    public int getDiasRef() {
        return diasRef;
    }

    /**
     *
     * @param diasRef
     */
    public void setDiasRef(int diasRef) {
        this.diasRef = diasRef;
    }

    /**
     *
     * @return
     */
    public Integer getCodParcela() {
        return cod_parcela;
    }

    /**
     *
     * @param codParcela
     */
    public void setCodParcela(Integer codParcela) {
        Integer oldCodParcela = this.cod_parcela;
        this.cod_parcela = codParcela;

    }

    /**
     *
     * @return
     */
    public int getCodPessoa() {
        return cod_pessoa;
    }

    /**
     *
     * @param codCliente
     */
    public void setCodPessoa(int codPessoa) {
        int oldCodPessoa = this.cod_pessoa;
        this.cod_pessoa = codPessoa;

    }

    /**
     *
     * @return
     */
    public int getCodCentroCusto() {
        return cod_centro_custo;
    }

    /**
     *
     * @param codEmpresa
     */
    public void setCodCentroCusto(int codCentroCusto) {
        int oldCodCentroCusto = this.cod_centro_custo;
        this.cod_centro_custo = codCentroCusto;

    }

    /**
     *
     * @return
     */
    public Integer getCodConta() {
        return cod_conta;
    }

    /**
     *
     * @param codConta
     */
    public void setCodConta(Integer codConta) {
        Integer oldCodConta = this.cod_conta;
        this.cod_conta = codConta;

    }

    /**
     *
     * @return
     */
    public Float getQuantidade() {
        return quantidade;
    }

    /**
     *
     * @param quantidade
     */
    public void setQuantidade(Float quantidade) {
        Float oldQuantidade = this.quantidade;
        this.quantidade = quantidade;

    }

    /**
     *
     * @return
     */
    public Date getDataVencimento() {
        return data_vencimento;
    }

    /**
     *
     * @param datVenc
     */
    public void setDatVenc(Date dataVencimento) {
        Date oldDataVencimento = this.data_vencimento;
        this.data_vencimento = dataVencimento;

    }

    /**
     *
     * @return
     */
    public Float getValorDoc() {
        return valor_documento;
    }

    /**
     *
     * @param valorDoc
     */
    public void setValorDoc(Float valorDoc) {
        Float oldValorDoc = this.valor_documento;
        this.valor_documento = valorDoc;

    }

    /**
     *
     * @return
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     *
     * @param situacao
     */
    public void setSituacao(String situacao) {
        String oldSituacao = this.situacao;
        this.situacao = situacao;

    }

    /**
     *
     * @return
     */
    public String getLocalRec() {
        return localRec;
    }

    /**
     *
     * @param localRec
     */
    public void setLocalRec(String localRec) {
        String oldLocalRec = this.localRec;
        this.localRec = localRec;

    }

    /**
     *
     * @return
     */
    public Float getValorPago() {
        return valorPago;
    }

    /**
     *
     * @param valorPago
     */
    public void setValorPago(Float valorPago) {
        Float oldValorPago = this.valorPago;
        this.valorPago = valorPago;

    }

    /**
     *
     * @return
     */
    public Integer getParcela() {
        return parcela;
    }

    /**
     *
     * @param parcela
     */
    public void setParcela(Integer parcela) {
        Integer oldParcela = this.parcela;
        this.parcela = parcela;

    }

    /**
     *
     * @return
     */
    public Date getDatEmissao() {
        return data_emissao;
    }

    /**
     *
     * @param datEmissao
     */
    public void setDatEmissao(Date datEmissao) {
        Date oldDatEmissao = this.data_emissao;
        this.data_emissao = datEmissao;

    }

    /**
     *
     * @return
     */
    public Float getDesconto() {
        return desconto;
    }

    /**
     *
     * @param desconto
     */
    public void setDesconto(Float desconto) {
        Float oldDesconto = this.desconto;
        this.desconto = desconto;

    }

    /**
     *
     * @return
     */
    public Float getMulta() {
        return multa;
    }

    /**
     *
     * @param multa
     */
    public void setMulta(Float multa) {
        Float oldMulta = this.multa;
        this.multa = multa;

    }

    /**
     *
     * @return
     */
    public Float getJuros() {
        return juros;
    }

    /**
     *
     * @param juros
     */
    public void setJuros(Float juros) {
        Float oldJuros = this.juros;
        this.juros = juros;

    }

    /**
     *
     * @return
     */
    public Float getAcrescimo() {
        return acrescimo;
    }

    /**
     *
     * @param acrescimo
     */
    public void setAcrescimo(Float acrescimo) {
        Float oldAcrescimo = this.acrescimo;
        this.acrescimo = acrescimo;

    }

    /**
     *
     * @return
     */
    public Float getDiferenca() {
        return diferenca;
    }

    /**
     *
     * @param diferenca
     */
    public void setDiferenca(Float diferenca) {
        Float oldDiferenca = this.diferenca;
        this.diferenca = diferenca;

    }

    /**
     *
     * @return
     */
    public Date getDatPag() {
        return data_pagamento;
    }

    /**
     *
     * @param datPag
     */
    public void setDatPag(Date datPag) {
        Date oldDatPag = this.data_pagamento;
        this.data_pagamento = datPag;

    }

    /**
     *
     * @return
     */
    public Integer getCodDocOrigem() {
        return cod_documento_origem;
    }

    /**
     *
     * @param codDocOrigem
     */
    public void setCodDocOrigem(Integer codDocOrigem) {
        Integer oldCodDocOrigem = this.cod_documento_origem;
        this.cod_documento_origem = codDocOrigem;

    }

    /**
     *
     * @return
     */
    public String getTipoDocOrigem() {
        return tipo_documento_origem;
    }

    /**
     *
     * @param tipoDocOrigem
     */
    public void setTipoDocOrigem(String tipoDocOrigem) {
        String oldTipoDocOrigem = this.tipo_documento_origem;
        this.tipo_documento_origem = tipoDocOrigem;

    }

    /**
     *
     * @return
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     *
     * @param obs
     */
    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;

    }


    /**
     *
     * @return
     */
    public Date getDatFinal() {
        return datFinal;
    }

    /**
     *
     * @param datFinal
     */
    public void setDatFinal(Date datFinal) {
        this.datFinal = datFinal;
    }

        /**
     *
     * @return
     */
//    public Date getDatFinal() {
//        return datFinal;
//    }
//
//    /**
//     *
//     * @param datFinal
//     */
//    public void setDatFinal(Date datFinal) {
//        this.datFinal = datFinal;
//    }

public void setCadastrar(){

        try{
        //ClassConecta conexao = new ClassConecta();

        String comando = " INSERT INTO parcelas  "+
" 	(COD_PARCELA,           "+
" 	COD_PESSOA,             "+
" 	COD_CENTRO_CUSTO,       "+
" 	COD_CONTAS,             "+
" 	QUANTIDADE,             "+
" 	DATA_VENCIMENTO,        "+
" 	VALOR_DOCUMENTO,        "+
" 	SITUACAO,               "+
" 	LOCAL_RECEBIMENTO,      "+
" 	VALOR_PAGO,             "+
" 	PARCELA,                "+
" 	DATA_EMISSAO,           "+
" 	DESCONTO,               "+
" 	MULTA,                  "+
" 	JUROS,                  "+
" 	ACRESCIMO,              "+
" 	DIFERENCA,              "+
" 	DATA_PAGAMENTO,         "+
" 	COD_DOCUMENTO_ORIGEM,   "+
" 	TIPO_DOCUMENTO_ORIGEM,  "+
" 	OBSERVACAO,             "+
" 	NATUREZA                "+
" 	) "+
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
" 	? "+
" 	) ";



        System.out.println("Executando operação...");
        //ClassConecta.conecta();
        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        //Formatar data
        String oDatPag = null;
        if (getDatPag() != null){
          SimpleDateFormat oDatPagOut = new SimpleDateFormat("yyyy-MM-dd");
          oDatPag = oDatPagOut.format(getDatPag());
        }

        //Formatar data
        String oDatEmissao = null;
        if (getDatEmissao() != null){
          SimpleDateFormat oDatEmissaoOut = new SimpleDateFormat("yyyy-MM-dd");
          oDatEmissao = oDatEmissaoOut.format(getDatEmissao());
        }

        //Formatar data
        String oDatVenc = null;
        if (getDataVencimento() != null){
          SimpleDateFormat oDatVencOut = new SimpleDateFormat("yyyy-MM-dd");
          oDatVenc = oDatVencOut.format(getDataVencimento());
        }

        if (getDesconto() == null){
            setDesconto((float) 0);
        }

        if (getValorDoc() == null){
            setValorDoc((float) 0);
        }

        if (getValorPago() == null){
            setValorPago((float) 0);
        }

        if (getJuros() == null){
            setJuros((float) 0);
        }

        if (getMulta() == null){
            setMulta((float) 0);
        }

        if (getAcrescimo() == null){
             setAcrescimo((float) 0);
        }

        if (getDiferenca() == null){
            setDiferenca((float) 0);
        }

        stmt.setInt(1,getCodPessoa());
        stmt.setInt(2,getCodCentroCusto());
        stmt.setInt(3, getCodConta());
        stmt.setFloat(4,getQuantidade());
        stmt.setString(5,oDatVenc);
        stmt.setFloat(6,getValorDoc());
        stmt.setString(7,getSituacao());
        stmt.setString(8,getLocalRec());
        stmt.setFloat(9,getValorPago());
        stmt.setInt(10,getParcela());
        stmt.setString(11,oDatEmissao);
        stmt.setFloat(12,getDesconto());
        stmt.setFloat(13,getMulta());
        stmt.setFloat(14,getJuros());
        stmt.setFloat(15,getAcrescimo());
        stmt.setFloat(16,getDiferenca());
        stmt.setString(17,oDatPag);
        stmt.setInt(18,getCodDocOrigem());
        stmt.setString(19,getTipoDocOrigem());
        stmt.setString(20,getObservacao());
        stmt.setString(21,getNatureza());


        stmt.execute();

        System.out.println("Transação Concluída");
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }

    }

//***********************************************************************************************************************************************************


public ResultSet getConsultar() throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando = " SELECT p.*, pe.*,pe.PESSOA as Pessoa,cb.*,(p.VALOR_DOCUMENTO+p.JUROS+p.MULTA-p.DESCONTO) AS valorTotal, "+
                      " c.NOME_CENTRO_CUSTO AS CentroCusto "+
                      " FROM parcelas p,pessoas pe,centro_de_custos c,contas cb  "+
                      " WHERE p.COD_PESSOA = pe.COD_PESSOA "+
                      " and p.COD_CENTRO_CUSTO = c.COD_CENTRO_CUSTO "+
                      " AND p.COD_CONTAS = cb.COD_CONTAS  ";


            int quantParam = 0;

            if (getCodParcela() != null){
               comando = comando + " AND p.COD_PARCELA = ? ";
            }

            if (getCodPessoa() > 0){
               comando = comando + " AND p.COD_PESSOA = ? ";
            }

            if (getCodConta() > 0){
               comando = comando + " AND p.COD_CONTAS = ? ";
            }

            if (getCodDocOrigem() != null){
               comando = comando + " AND p.COD_DOCUMENTO_ORIGEM = ? ";
            }

            if (getNatureza() != null){
               comando = comando + " AND p.NATUREZA = ? ";
            }

            if ( getSituacao() == null ? "Quitadas" == null : getSituacao().equals("Quitadas") ){
               comando = comando + " AND p.DATA_PAGAMENTO is not null ";
               comando = comando + " AND p.SITUACAO <> 'Cancelada' ";
            }

            if (  getSituacao() == null ? "Em aberto" == null : getSituacao().equals("Em aberto")){
               comando = comando + " AND p.DATA_PAGAMENTO is null ";
               comando = comando + " AND p.SITUACAO <> 'Cancelada' ";
            }

            if ( getSituacao() == null ? "Vencidas" == null : getSituacao().equals("Vencidas")){
               comando = comando + " AND DATEDIFF(CURDATE(),p.DATA_VENCIMENTO) > 0 ";
               comando = comando + " AND p.DATA_PAGAMENTO is null ";
               comando = comando + " AND p.SITUACAO <> 'Cancelada' ";
            }

            if ( getSituacao() == null ? "Canceladas" == null : getSituacao().equals("Canceladas")){
               comando = comando + " AND p.SITUACAO = 'Cancelada' ";
            }else{
               comando = comando + " AND p.SITUACAO <> 'Cancelada' ";
            }

            if (  getSituacao() == null ? "Todas do Ano" == null : getSituacao().equals("Todas do Ano")){
               comando = comando + " AND EXTRACT(YEAR FROM p.DATA_VENCIMENTO) = ? ";
            }

            if (getMesRef() > 0){
               comando = comando + " AND EXTRACT(YEAR FROM p.DATA_VENCIMENTO) = ? ";
               comando = comando + " AND EXTRACT(MONTH FROM p.DATA_VENCIMENTO) = ? ";
            }

            comando = comando + " order by p.DATA_VENCIMENTO, p.PARCELA ";
            //ClassConecta conexao = new ClassConecta();

            //ClassConecta.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);

            if (getCodParcela() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodParcela());
            }

            if (getCodPessoa() > 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodPessoa());
            }

            if (getCodConta() > 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodConta());
            }

            if (getCodDocOrigem() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodDocOrigem());
            }

            if (getNatureza() != null){
               quantParam = quantParam +1;
               stmtQuery.setString(quantParam, getNatureza());
            }

            if (getSituacao() == null ? "Todas do Ano" == null : getSituacao().equals("Todas do Ano")){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getAnoRef());
            }

            if (getMesRef() > 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getAnoRef());
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getMesRef());
            }

        resultSet = stmtQuery.executeQuery();

        if (resultSet.getRow() == 1){
           resultSet.first();
        }


        }

        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     return resultSet;
     }

public ResultSet getConsultar2() throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando =   "select p.* "+
                        "from parcelas p "+
                         "where p.COD_PARCELA = p.COD_PARCELA ";

            int quantParam = 0;

            if (getCodParcela() != null){
               comando = comando + " AND p.COD_PARCELA = ? ";
            }
            if (getCodDocOrigem() != null){
               comando = comando + " AND p.COD_DOCUMENTO_ORIGEM = ? ";
            }

            comando = comando + " order by p.COD_PARCELA ";
            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);

            if (getCodParcela() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodParcela());
            }
            if (getCodDocOrigem() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodDocOrigem());
            }


        resultSet = stmtQuery.executeQuery();

        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql \n" + sqlex);

        }

     return resultSet;
     }

//******************************************************************************************************************************************************


public ResultSet getConsultarParcelas() throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando =   "select p.*, pe.PESSOA, c.* "+
                        "from parcelas p, pessoas pe, contas c "+
                         "where p.COD_PARCELA = p.COD_PARCELA "+
                         "AND p.COD_PESSOA = pe.COD_PESSOA ";

            int quantParam = 0;

            if (getCodParcela() != null){
               comando = comando + " AND p.COD_PARCELA = ? ";
            }
            if (getCodDocOrigem() != null){
               comando = comando + " AND p.COD_DOCUMENTO_ORIGEM = ? ";
            }
            if (getCodPessoa() > 0){
               comando = comando + " AND p.COD_PESSOA = ? ";
            }
            if ( getSituacao() == null ? "Quitadas" == null : getSituacao().equals("Quitadas") ){
               comando = comando + " AND p.DATA_PAGAMENTO is not null ";
               comando = comando + " AND p.SITUACAO <> 'Cancelada' ";
            }

            if (  getSituacao() == null ? "Em aberto" == null : getSituacao().equals("Em aberto")){
               comando = comando + " AND p.DATA_PAGAMENTO is null ";
               comando = comando + " AND p.SITUACAO <> 'Cancelada' ";
            }

            if ( getSituacao() == null ? "Vencidas" == null : getSituacao().equals("Vencidas")){
               comando = comando + " AND DATEDIFF(CURDATE(),p.DATA_VENCIMENTO) > 0 ";
               comando = comando + " AND p.DATA_PAGAMENTO is null ";
               comando = comando + " AND p.SITUACAO <> 'Cancelada' ";
            }

            if ( getSituacao() == null ? "Canceladas" == null : getSituacao().equals("Canceladas")){
               comando = comando + " AND p.SITUACAO = 'Cancelada' ";
            }else{
               comando = comando + " AND p.SITUACAO <> 'Cancelada' ";
            }

            if (  getSituacao() == null ? "Todas do Ano" == null : getSituacao().equals("Todas do Ano")){
               comando = comando + " AND EXTRACT(YEAR FROM p.DATA_VENCIMENTO) = ? ";
            }

            if (getMesRef() > 0){
               comando = comando + " AND EXTRACT(YEAR FROM p.DATA_VENCIMENTO) = ? ";
               comando = comando + " AND EXTRACT(MONTH FROM p.DATA_VENCIMENTO) = ? ";
            }

            comando = comando + " order by p.COD_PARCELA ";
            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);

            if (getCodParcela() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodParcela());
            }
            if (getCodDocOrigem() != null){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodDocOrigem());
            }
            if (getCodPessoa() > 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getCodPessoa());
            }
            if (getSituacao() == null ? "Todas do Ano" == null : getSituacao().equals("Todas do Ano")){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getAnoRef());
            }

            if (getMesRef() > 0){
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getAnoRef());
               quantParam = quantParam +1;
               stmtQuery.setInt(quantParam, getMesRef());
            }

        resultSet = stmtQuery.executeQuery();

        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql \n" + sqlex);

        }

     return resultSet;
     }




     public int getConsultarUltimoID() throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando = "SELECT max(COD_PARCELA) as codParcela  "+
                      " FROM parcelas ";

            //ClassConecta conexao = new ClassConecta();

            //ClassConecta.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);


        resultSet = stmtQuery.executeQuery();
        resultSet.first();


        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     return resultSet.getInt("codParcela");
     }


     public ResultSet getTotais(String lista) throws SQLException
    {
        ResultSet resultSet = null;

        try
        {
            String comando;
            comando = " SELECT sum(VALOR_DOCUMENTO) as valorTotal  "+
                      " FROM parcelas  "+
                      " where COD_PARCELA in("+lista+") ";

            ClassConecta conexao = new ClassConecta();

            ClassConecta.conecta();

            //O parâmetro resultSetType define se o ResultSet irá ser navegável e posicionado ou não:
            //ResultSet.TYPE_FORWARD_ONLY: com este parâmetro o ResultSet não poderá ser navegável, ou seja, poderemos somente avançar no objeto ResultSet para poder buscar valores.
            //ResultSet.TYPE_SCROLL_INSENSITIVE: com este parâmetro o ResultSet poderá ser navegável em qualquer direção, para frente e para trás, e será insensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            //ResultSet.TYPE_SCROLL_SENSITIVE: com este parâmetro o ResultSet poderá ser navegável para qualquer direção, e será sensível a mudanças feitas por outras transações ou por outros Statements da mesma transação.
            java.sql.PreparedStatement stmtQuery = ClassConecta.con.prepareStatement(comando);


        resultSet = stmtQuery.executeQuery();


        }
        catch (SQLException sqlex)
        {
             JOptionPane.showMessageDialog(null,"Não foi Possivél executar o comando sql" + sqlex);

        }

     resultSet.first();
     return resultSet;
     }

     public void setQuitar(String listaCodParcela){

        try{
        //ClassConecta conexao = new ClassConecta();

        //ClassConecta.conecta();

        String comando = " UPDATE parcelas  "+
" 	SET "+
" 	VALOR_PAGO = ? ,  "+
" 	DESCONTO = ?,  "+
" 	DATA_PAGAMENTO = ?,  "+
" 	COD_CONTAS = ?,  "+
" 	JUROS = ? , "+
" 	MULTA = ?,  "+
" 	DESCONTO = ?  "+
" 	WHERE "+
" 	COD_PARCELA in ("+listaCodParcela+") ";


        System.out.println("Executando operação...");
        PreparedStatement stmt = (PreparedStatement) ClassConecta.con.prepareStatement(comando);

        if (getValorPago() == null){
            setValorPago((float) 0);
        }

        if (getJuros() == null){
            setJuros((float) 0);
        }
        if (getMulta() == null){
            setMulta((float) 0);
        }


        //Formatar data
        String oDatPag = null;
        if (getDatPag() != null){
          SimpleDateFormat oDatPagOut = new SimpleDateFormat("yyyy-MM-dd");
          oDatPag = oDatPagOut.format(getDatPag());
        }else{
          oDatPag = null;
        }

        if (getDesconto() == null){
            setDesconto((float) 0);
        }

        stmt.setFloat(1,getValorPago());
        stmt.setFloat(2,getDesconto());
        stmt.setString(3,oDatPag);
        stmt.setInt(4, getCodConta());
        stmt.setFloat(5,getJuros());
        stmt.setFloat(6,getMulta());
        stmt.setFloat(7,getDesconto());


        stmt.execute();

        System.out.println("Transação Concluída");
        //JOptionPane.showMessageDialog(null, "O REGISTRO foi salvo com sucesso.", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e){
            System.err.println("Erro na Transação\n"+e);
            JOptionPane.showMessageDialog(null, "Erro na Transação", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        }
    }
    





}// FIM DA CLASSE PARCELAS
