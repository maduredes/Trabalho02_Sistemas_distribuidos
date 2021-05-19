package br.furb.funcionario;

import java.util.List;

public interface FuncionarioService {
	
	List<Funcionario> findAll();
	
	Funcionario findById(long id);
	
	Funcionario save(Funcionario aluno);
	
	void deleteById(long id);

}
