/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package personalfinance.classes;

import java.io.Serializable;

/**
 *
 * @author cmtj
 */
public class ReciboFormas implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    protected ReciboFormasPK reciboFormasPK;
    private Float valorForma;

    /**
     *
     */
    public ReciboFormas() {
    }

    /**
     *
     * @param reciboFormasPK
     */
    public ReciboFormas(ReciboFormasPK reciboFormasPK) {
        this.reciboFormasPK = reciboFormasPK;
    }

    /**
     *
     * @param codRecibo
     * @param forma
     */
    public ReciboFormas(int codRecibo, String forma) {
        this.reciboFormasPK = new ReciboFormasPK(codRecibo, forma);
    }

    /**
     *
     * @return
     */
    public ReciboFormasPK getReciboFormasPK() {
        return reciboFormasPK;
    }

    /**
     *
     * @param reciboFormasPK
     */
    public void setReciboFormasPK(ReciboFormasPK reciboFormasPK) {
        this.reciboFormasPK = reciboFormasPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reciboFormasPK != null ? reciboFormasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReciboFormas)) {
            return false;
        }
        ReciboFormas other = (ReciboFormas) object;
        if ((this.reciboFormasPK == null && other.reciboFormasPK != null) || (this.reciboFormasPK != null && !this.reciboFormasPK.equals(other.reciboFormasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "japolo.ReciboFormas[reciboFormasPK=" + reciboFormasPK + "]";
    }

}
