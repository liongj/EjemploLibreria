package service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import model.Libro;

	@Service
	public class LibroService {

	    private Map<Integer, Libro> libros = new HashMap<>();

	    public LibroService() {
	        libros.put(1, new Libro("El Quijote", "Cervantes", 1605));
	        libros.put(2, new Libro("Cien años de soledad", "García Márquez", 1967));
	    }

	    @Cacheable("libros") 
	    public Libro obtenerLibroPorId(int id) {
	        System.out.println("Consultando libro desde servicio (sin caché)...");
	        return libros.get(id);
	    }
	}


