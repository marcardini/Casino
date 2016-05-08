package dominio;

import java.math.BigDecimal;

public class Estadistica {
    
    private int id;
    private BigDecimal sumaHistoricoGanado;
    private BigDecimal sumaHistoricoPerdido;

    public Estadistica()
    {
        this.sumaHistoricoGanado = BigDecimal.ZERO;
        this.sumaHistoricoPerdido = BigDecimal.ZERO;
    }
    
    public int getId() {
        return id;
    }
    
    public BigDecimal getSumaHistoricoGanado() {
        return sumaHistoricoGanado;
    }

    public BigDecimal getSumaHistoricoPerdido() {
        return sumaHistoricoPerdido;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setSumaHistoricoGanado(BigDecimal sumaHistoricoGanado) {
        this.sumaHistoricoGanado = sumaHistoricoGanado;
    }
     
    public void setSumaHistoricoPerdido(BigDecimal sumaHistoricoPerdido) {
        this.sumaHistoricoPerdido = sumaHistoricoPerdido;
    }
   
}
