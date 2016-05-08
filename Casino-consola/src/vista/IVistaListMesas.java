package vista;

import dominio.ruleta.MesaRuleta;
import java.util.ArrayList;

public interface IVistaListMesas {
     void mostrar(ArrayList<MesaRuleta> lista);
     void mostrarMesa(MesaRuleta mesa);
     void errorCreandoMesa();
     void listaMesasVacias();
     void nombreInvalido();
}
