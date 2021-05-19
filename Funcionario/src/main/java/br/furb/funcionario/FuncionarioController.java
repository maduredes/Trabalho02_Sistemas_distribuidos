package br.furb.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {

	@Autowired
	FuncionarioService funcionarioService;

	@RequestMapping(value = "/funcionario", method = RequestMethod.POST)
	public ResponseEntity save(@RequestBody Funcionario funcionario) {
		try {
			return ResponseEntity.ok(funcionarioService.save(funcionario));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@RequestMapping(value = "/funcionario", method = RequestMethod.GET)
	public ResponseEntity findAll() {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.findAll());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@RequestMapping(value = "/funcionario/{id}", method = RequestMethod.GET)
	public ResponseEntity<Funcionario> findById(@PathVariable("id") long id) {
		try {
			return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.findById(id));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@RequestMapping(value = "/funcionario/{id}", method = RequestMethod.PUT)
	public ResponseEntity update(@PathVariable(value = "id") long id, @RequestBody Funcionario funcionario) {
		try {
			Funcionario funcionarioAnterior = funcionarioService.findById(id);
			funcionarioAnterior.setCargo(funcionario.getCargo());
			funcionarioAnterior.setCodigo(funcionario.getCodigo());
			funcionarioAnterior.setNome(funcionario.getNome());
			return ResponseEntity.ok(funcionarioService.save(funcionarioAnterior));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@RequestMapping(value = "/funcionario/{id}", method = RequestMethod.DELETE)
	public ResponseEntity deleteById(@PathVariable("id") long id) {
		try {
			funcionarioService.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body(null);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
