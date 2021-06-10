package br.furb.funcionario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.furb.funcionario.model.Funcionario;
import br.furb.funcionario.repository.FuncionarioRepository;

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
