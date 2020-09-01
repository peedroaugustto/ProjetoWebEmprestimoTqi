package br.com.tqi.emprestimos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tqi.emprestimos.dao.UsuarioDao;
import br.com.tqi.emprestimos.domain.Usuario;

@Service
@Transactional(readOnly = false)
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	private UsuarioDao dao;

	@Override
	public void salvar(Usuario usuario) {
		dao.save(usuario);
		
	}

	@Override
	public void editar(Usuario usuario) {
		dao.update(usuario);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario buscarPorId(Long id) {
		
		return dao.findById(id);
	}
	

}
