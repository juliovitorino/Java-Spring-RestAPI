package br.com.juliovitorino.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.juliovitorino.model.Cliente;
import br.com.juliovitorino.repository.ClienteRepository;

/**
 * Criação dos EndPoints
 * @author Julio
 *
 */
@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	// Injeta uma instancia para acesso aos metodos que vao dar acesso a tabela
	@Autowired
	private ClienteRepository cr;
	
	@GetMapping
	public List<Cliente> listar()
	{
		return cr.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente adicionar(@RequestBody Cliente cliente)
	{
		return cr.save(cliente);
	}
}
