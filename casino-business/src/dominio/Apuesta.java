/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.math.BigDecimal;

/**
 *
 * @author WT
 */


public abstract class Apuesta {
    
    private int id;
    private BigDecimal totalGanancia;
    private BigDecimal totalPerdida;

    public Apuesta() {
    }

    
    
    public Apuesta(int id, BigDecimal totalGanancia, BigDecimal totalPerdida) {
        this.id = id;
        this.totalGanancia = totalGanancia;
        this.totalPerdida = totalPerdida;
    }

    public int getId() {
        return id;
    }

    public BigDecimal getTotalGanancia() {
        return totalGanancia;
    }

    public BigDecimal getTotalPerdida() {
        return totalPerdida;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTotalGanancia(BigDecimal totalGanancia) {
        this.totalGanancia = totalGanancia;
    }

    public void setTotalPerdida(BigDecimal totalPerdida) {
        this.totalPerdida = totalPerdida;
    }
    
    
}
