package Ejerc6;

public class Main {
    private String autor;
    private String titulo;
    private float precio;

    public Main(String autor, String titulo, float precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
