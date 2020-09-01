package br.com.tqi.emprestimos.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings("serial")
@Entity
@Table(name = "USUARIOS")
public class Usuario extends AbstractEntity<Long> {
	
	@Column(name = "ativo", nullable = false, columnDefinition = "TINYINT(1)")
	private boolean ativo;
	
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	
	@JsonIgnore
	@Column(name = "senha", nullable = false)
	private String senha;
	
	@Column(name = "codigo_verificador", length = 6)
	private String codigoVerificador;

}
