package br.com.tqi.emprestimos.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmprestimoController {

	@GetMapping("emprestimo/cadastro")
	public String getCadastroEmprestimo() {
		return "emprestimo/cadastro";
	}
}
