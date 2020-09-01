package br.com.tqi.emprestimos.web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.tqi.emprestimos.domain.Cliente;
import br.com.tqi.emprestimos.service.ClienteService;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/cliente/cadastrar")
	public String cadastrar() {
		return "cliente/cadastro";
	}
	
	@PostMapping("/salvar")
	public String salvar(Cliente cliente, BindingResult result, RedirectAttributes attr) {
		
		
		service.salvar(cliente);
		attr.addFlashAttribute("success", "Funcionário inserido com sucesso.");
		return "redirect:/funcionarios/cadastrar";
	}

}
