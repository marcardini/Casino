package dominio;

import DateTimeProcessors.DateTimeProcessors;

public class UnidadReceptoraDeJuego {
    
    private int id;
    private String usuarioCreador;
    private String fechaCreacion;
    private boolean eliminada;
    
    private DateTimeProcessors fechaUtil;
    
    public UnidadReceptoraDeJuego(Jugador usuarioCreador){
        this.usuarioCreador = usuarioCreador.getNombre();
        this.fechaCreacion = fechaUtil.ObtenerFechaHoraActual();
    }
    
    public int getId() {
        return id;
    }
    
    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public boolean isEliminada() {
        return eliminada;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public void setEliminada(boolean eliminada) {
        this.eliminada = eliminada;
    }
}
