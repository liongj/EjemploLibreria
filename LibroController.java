package gj.ejemploLibreriacontroller;

	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Libro;
import service.LibroService;

	
	@RestController
	@RequestMapping("/api")
	public class LibroController {

	    private final LibroService libroService;

	    public LibroController(LibroService libroService) {
	        this.libroService = libroService;
	    }

	    @GetMapping("/libros/{id}")
	    public Libro obtenerLibro(@PathVariable int id) {
	        return libroService.obtenerLibroPorId(id);
	    }
	}


