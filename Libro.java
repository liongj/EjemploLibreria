package model;

	public class Libro {

		    private String titulo;
		    private String autor;
		    private int anio;
		    private boolean prestado;

		    public Libro(String titulo, String autor, int anio) {
		        this.titulo = titulo;
		        this.autor = autor;
		        this.anio = anio;
		        this.prestado = false;
		    }

		    public String getTitulo() { return titulo; }
		    public String getAutor() { return autor; }
		    public int getAnio() { return anio; }
		    public boolean isPrestado() { return prestado; }

		    public void prestar() {
		        if (!prestado) prestado = true;
		    }

		    public void devolver() {
		        if (prestado) prestado = false;
		    }

		    @Override
		    public String toString() {
		        return "Libro{" +
		                "titulo='" + titulo + '\'' +
		                ", autor='" + autor + '\'' +
		                ", año=" + anio +
		                ", prestado=" + prestado +
		                '}';
		    }
		}


