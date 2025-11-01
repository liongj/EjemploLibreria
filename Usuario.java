package model;

public class Usuario {

	    private String nombre;
	    private String carnet;

	    public Usuario(String nombre, String carnet) {
	        this.nombre = nombre;
	        this.carnet = carnet;
	    }

	    public String getNombre() { return nombre; }
	    public String getCarnet() { return carnet; }

	    public void prestarLibro(Libro libro) {
	        libro.prestar();
	        System.out.println(nombre + " ha prestado el libro: " + libro.getTitulo());
	    }

	    public void devolverLibro(Libro libro) {
	        libro.devolver();
	        System.out.println(nombre + " ha devuelto el libro: " + libro.getTitulo());
	    }
	}




