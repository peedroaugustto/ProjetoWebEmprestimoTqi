package br.com.tqi.emprestimos.service;

import br.com.tqi.emprestimos.domain.Cliente;

public interface ClienteService {
	
	void salvar(Cliente cliente);
	
	void editar(Cliente cliente);
	
	 Cliente buscarPorId(Long id) ;

}
