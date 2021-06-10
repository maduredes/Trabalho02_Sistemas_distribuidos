package br.furb.funcionario.service;

import java.util.List;

import br.furb.funcionario.model.Funcionario;

public interface FuncionarioService {
	
	List<Funcionario> findAll();
	
	Funcionario findById(long id);
	
	Funcionario save(Funcionario funcionario);
	
	void deleteById(long id);

}
