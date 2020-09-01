package br.com.tqi.emprestimos.dao;

import br.com.tqi.emprestimos.domain.Usuario;

public interface UsuarioDao {

	public void save(Usuario cliente);

	public void update(Usuario cliente);

	Usuario findById(Long id);
}
