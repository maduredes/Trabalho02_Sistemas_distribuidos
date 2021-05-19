package br.furb.funcionario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	
	@Autowired
	FuncionarioRepository funcionarioRepository;

	@Override
	public List<Funcionario> findAll() {
		return funcionarioRepository.findAll();
	}

	@Override
	public Funcionario findById(long id) {
		return funcionarioRepository.findById(id).get();
	}

	@Override
	public Funcionario save(Funcionario aluno) {
		return funcionarioRepository.save(aluno);
	}

	@Override
	public void deleteById(long id) {
		funcionarioRepository.deleteById(id);
	}
	
}
