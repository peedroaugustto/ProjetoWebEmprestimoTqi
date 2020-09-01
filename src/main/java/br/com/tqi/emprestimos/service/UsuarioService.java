package br.com.tqi.emprestimos.service;

import br.com.tqi.emprestimos.domain.Usuario;

public interface UsuarioService {
	
	void salvar(Usuario usuario);
	void editar(Usuario usuario);
	Usuario buscarPorId(Long id);

}
