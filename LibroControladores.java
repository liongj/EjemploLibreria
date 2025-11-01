package controladores;
	import org.springframework.web.bind.annotation.*;

import model.Libro;
import service.LibroService;

public class LibroControladores {
	
	@RestController
	@RequestMapping("/libros")
	public class LibroController {

	    private final LibroService libroService;

	    public LibroController(LibroService libroService) {
	        this.libroService = libroService;
	    }

	    @GetMapping("/{id}")
	    public Libro getLibro(@PathVariable Long id) {
	        return libroService.obtenerLibroPorId(id);
	    }
	}

}
