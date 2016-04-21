package dominio;

import java.math.BigDecimal;
import java.util.Objects;

public class CasilleroRuleta {
    
    private int id;
    private int numeroEnMesa;
    private Color colorOriginal;
    private BigDecimal montoApostado;
    private Jugador jugadorAposto;
    private MesaRuleta mesa;
    
    public CasilleroRuleta(){}
    
    public CasilleroRuleta(MesaRuleta mesa, int numeroEnMesa, Color colorOriginal)
    {
        this.mesa = mesa;
        this.numeroEnMesa = numeroEnMesa;
        this.colorOriginal = colorOriginal;
        this.montoApostado = BigDecimal.ZERO;
    }
    
    public boolean ValidarCasilleroRuleta()
    {
        return this.numeroEnMesa >= 0 && this.numeroEnMesa <= 36
                && (this.colorOriginal.equals(Color.ROJO) || this.colorOriginal.equals(Color.NEGRO));
    }
    
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CasilleroRuleta))
            return false;
        CasilleroRuleta that = (CasilleroRuleta) other;
	return this.getMesa().equals(that.getMesa()) 
                && this.getNumeroEnMesa() == that.getNumeroEnMesa() 
                && this.getColorOriginal().equals(that.getColorOriginal());
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.numeroEnMesa;
        hash = 23 * hash + Objects.hashCode(this.colorOriginal);
        hash = 23 * hash + Objects.hashCode(this.mesa);
        return hash;
    }
    
    @Override
    public String toString() {
        return this.colorOriginal + " el " + this.numeroEnMesa;
    }

    public int getId(){
        return id;
    }
    
    public MesaRuleta getMesa(){
        return mesa;
    }
    
    public int getNumeroEnMesa() {
        return numeroEnMesa;
    }

    public Color getColorOriginal() {
        return colorOriginal;
    }

    public BigDecimal getMontoApostado() {
        return montoApostado;
    }

    public Jugador getJugadorAposto() {
        return jugadorAposto;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setMesa(MesaRuleta mesa){
        this.mesa = mesa;
    }
    
    public void setNumeroEnMesa(int numeroEnMesa) {
        this.numeroEnMesa = numeroEnMesa;
    }

    public void setColorOriginal(Color colorOriginal) {
        this.colorOriginal = colorOriginal;
    }

    public void setMontoApostado(BigDecimal montoApostado) {
        this.montoApostado = montoApostado;
    }

    public void setJugadorAposto(Jugador jugadorAposto) {
        this.jugadorAposto = jugadorAposto;
    }

}
