package br.furb.folhapagamento;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class FolhaPagamentoController {

	@Autowired
	FolhaPagamentoRepository folhaPagamentoRepository;
	RestTemplate restTemplate = new RestTemplate();
	Funcionario funcionario = restTemplate.getForObject("http://localhost:8080/funcionario/3", Funcionario.class);
	
	@RequestMapping(value = "/folhapagamento", method = RequestMethod.POST)
	
	public ResponseEntity CalculoDaFolhaPagamento(@RequestBody double salario) {
		try {
			FolhaPagamento folhapagamento=new FolhaPagamento();
			folhapagamento.calculoFolhaPagamento(salario);
			//salva para determinado funcionario
			folhapagamento.setFuncionarioId(funcionario.getId());
			
			return ResponseEntity.ok(folhaPagamentoRepository.save(folhapagamento));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	@RequestMapping(value = "/folhapagamento/{id}", method = RequestMethod.GET)
	public ResponseEntity<Optional<FolhaPagamento>> ValorFolhaPagamento(@PathVariable("Id") long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(folhaPagamentoRepository.findById(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	
}
