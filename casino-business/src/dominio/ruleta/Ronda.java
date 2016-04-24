package dominio.ruleta;

import java.math.BigDecimal;
import java.util.List;

public class Ronda  {
    
    List<ApuestaRuleta> listaApuestas;
    
    public BigDecimal calcularTotalApostadoEnRonda(){
        BigDecimal retorno = BigDecimal.ZERO;
        
        for(ApuestaRuleta a : listaApuestas){
            retorno.add(a.getMontoTotal());
        }
        return retorno;
    }
    
}