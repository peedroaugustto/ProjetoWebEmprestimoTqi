package br.com.tqi.emprestimos.dao;

import br.com.tqi.emprestimos.domain.Cliente;

public interface ClienteDao {
	
	
	public void save(Cliente cliente) ;
	
	public void update(Cliente cliente) ;
	
	Cliente findById(Long id);
	

}
