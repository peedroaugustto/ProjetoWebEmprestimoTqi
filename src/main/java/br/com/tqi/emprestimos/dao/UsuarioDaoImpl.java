package br.com.tqi.emprestimos.dao;

import org.springframework.stereotype.Repository;

import br.com.tqi.emprestimos.domain.Usuario;

@Repository
public class UsuarioDaoImpl extends AbstractDao<Usuario, Long> implements UsuarioDao {

}
