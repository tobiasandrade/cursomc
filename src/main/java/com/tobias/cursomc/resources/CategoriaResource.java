package com.tobias.cursomc.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tobias.cursomc.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria cat1 = Categoria
				.builder()
				.id(1)
				.nome("Informática")
				.build();
		Categoria cat2 = Categoria
				.builder()
				.id(2)
				.nome("Escritório")
				.build();
		
		return Arrays.asList(cat1, cat2);
		
	}

}
