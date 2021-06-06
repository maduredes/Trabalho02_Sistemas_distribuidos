package br.furb.folhapagamento;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="folhapagamento")
public class FolhaPagamento {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private double totalFolhaPagamento;
	private Long FuncionarioId;
	
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public double getTotalFolhaPagamento() {
		return totalFolhaPagamento;
	}
	public void setTotalFolhaPagamento(double totalFolhaPagamento) {
		this.totalFolhaPagamento = totalFolhaPagamento;
	}
	public void calculoFolhaPagamento(double salario) {
		double imposto=0.10;
		double desconto=salario*imposto;
		salario=salario-desconto;
		setTotalFolhaPagamento(salario);
		
	}
	
	public Long getFuncionarioId() {
		return FuncionarioId;
	}
	public void setFuncionarioId(Long funcionarioId) {
		FuncionarioId = funcionarioId;
	}
	
}
