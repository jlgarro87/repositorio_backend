package com.ar.movies;

public class Pelicula {

    private Integer idPelicula; /*privado es el tipo de encapsulamiento */
    private String titulo;
    private String duracion;
    private String imagen;
    private String synopsis;
    private Integer idActor;
    private Integer idDirector;
    private Integer idGenero;   

    //metodo CONSTRUCTOR
    public Pelicula(Integer idPelicula, String titulo, String duracion, String imagen, String synopsis, Integer idActor, Integer idDirector, Integer idGenero){

        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.duracion = duracion;
        this.imagen = imagen;
        this.synopsis = synopsis;
        this.idActor=idActor;
        this.idDirector=idDirector;
        this.idGenero=idGenero;

    }

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDuracion() {
        return duracion;
    }
    
    public String getImagen() {
        return imagen;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Integer getIdActor() {
        return idActor;
    }
    
    public Integer getIdDirector() {
        return idDirector;
    }

    public Integer getIdGenero() {
        return idGenero;
    }
//-----------------------------------------------------------------------setters
    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setIdActor(Integer idActor) {
        this.idActor = idActor;
    }

    public void setIdDirector(Integer idDirector) {
        this.idDirector = idDirector;
    }

    public void setidGenero(Integer idGenero) {
        this.idGenero = idGenero;
    }

}

