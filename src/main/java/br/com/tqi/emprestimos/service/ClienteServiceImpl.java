package br.com.tqi.emprestimos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.tqi.emprestimos.dao.ClienteDao;
import br.com.tqi.emprestimos.domain.Cliente;

@Service
@Transactional(readOnly = false)
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteDao dao;

	@Override
	public void salvar(Cliente cliente) {
		dao.save(cliente);
		
	}

	@Override
	public void editar(Cliente cliente) {
		dao.update(cliente);
		
	}
	
	@Override
	@Transactional(readOnly = true)
	public Cliente buscarPorId(Long id) {
		return dao.findById(id);
	}

}
