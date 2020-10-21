package edu.continental.listaeventos2.Entidades;

public class Evento {

    private Integer ideventos;
    private String nombre;
    private String descripcion;
    private String detalle;
    private String fotografia;
    private String fechahora;
    private String longitud;
    private String iddistrito;
    private String distrito;
    private String latitud;

    public Evento() {
    }

    public Evento(Integer ideventos, String nombre, String descripcion, String detalle, String fotografia, String fechahora, String longitud, String iddistrito, String distrito, String latitud) {
        this.ideventos = ideventos;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.fotografia = fotografia;
        this.fechahora = fechahora;
        this.longitud = longitud;
        this.iddistrito = iddistrito;
        this.distrito = distrito;
        this.latitud = latitud;
    }

    public Integer getIdeventos() {
        return ideventos;
    }

    public void setIdeventos(Integer ideventos) {
        this.ideventos = ideventos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getFechahora() {
        return fechahora;
    }

    public void setFechahora(String fechahora) {
        this.fechahora = fechahora;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(String iddistrito) {
        this.iddistrito = iddistrito;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

}
