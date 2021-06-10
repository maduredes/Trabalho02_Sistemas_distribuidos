package br.furb.funcionario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.furb.funcionario.model.Funcionario;
@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
