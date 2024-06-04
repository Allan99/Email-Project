package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	
	public Email montarEmailAdministrador(String destinatário, String assunto) {
		StringBuilder texto = new StringBuilder();
		
		
		return new Email(destinatário, assunto, texto.toString());
	}

}
