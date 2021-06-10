package br.furb.funcionario;

import java.util.List;

public interface FuncionarioService {
	
	List<Funcionario> findAll();
	
	Funcionario findById(long id);
	
	Funcionario save(Funcionario funcionario);
	
	void deleteById(long id);

}
