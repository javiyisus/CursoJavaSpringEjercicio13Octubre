package test.jperera.ejercicio13o.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.DatosDevueltosDTO;
import com.example.demo.dtos.DatosDevueltosSinID;
import com.example.demo.dtos.DatosListDTO;
import com.example.demo.models.DatosDevueltos;
import com.example.demo.services.DatoDevueltoService;

import test.jperera.ejercicio13o.models.Cliente;
import test.jperera.ejercicio13o.services.ClienteService;

@RestController 
public class ClienteController {
	
	@Autowired
    private ClienteService service;
	
//	+Crea un Controlador rest (@RestController) llamado ClienteController que tenga 
//	las típicas operaciones,
//	CRUD (listado, create, read, update, delete) con las urls típicas: 
//	Listado: Get /api/clientes -> listado, 
//	Create: Post /api/clientes  (Cliente) -> Cliente, 
//	Read: Get /api/clientes/{id}  (id) -> Cliente, 
//	update: Put /api/clientes/{ID} (id, Cliente) -> Cliente, 
//	delete: Delete /api/clientes/{id} (id) ->cliente
	
	//Aquí es donde me he quedado atascado, 
	//en hacer los métodos post, get, put y delete
	
	@GetMapping("/api/clientes")
	public Listado getAll() {
		
	}
	
	@PostMapping("/api/clientes")
	public Cliente Create(Cliente cliente) {
		
	}
	
	@GetMapping("/api/clientes/{id}")
	public Cliente getClienteById(Integer id) {
		
	}
	
	@PutMapping("/api/clientes/{id}")
	public Cliente newCliente(Integer id, Cliente cliente) {
		
	}
	
	@DeleteMapping("/api/clientes/{id}")
	public Cliente removeCliente(Integer id) {
		
	}
	
	
	

}
