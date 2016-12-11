package br.com.projetodiamante.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
	
	@RequestMapping(value="/ola", method=RequestMethod.GET)
	String ola() {
		return "Bem-vindo!";
	}
	
	@RequestMapping(value="/ola/{nome}", method=RequestMethod.GET)
	String olaNome(@PathVariable String nome) {
		return "Ola " + nome + "!";
	}
}
