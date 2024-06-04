package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class EmailLayout {
	
	private static final String QUEBRA_DE_LINHA_DUPLA = "<br><br>";
	private static final String QUEBRA_DE_LINHA_UNICA = "<br>";
	
	public Email montarEmailAdministrador(String destinatário, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
		.append("A/C Administrador")
		.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
		.append("Solicito a alteração de senha do sistema!")
		.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		gerarRodape(texto);
		
		return new Email(destinatário, assunto, texto.toString());
	}
	
	private void gerarAssinatura(StringBuilder texto) {
		texto
		.append("Att.:")
		.append(QUEBRA_DE_LINHA_UNICA)
		.append("Operador de caixa")
		.append(QUEBRA_DE_LINHA_DUPLA);
	}
	
	private String gerarRodape(StringBuilder texto) {
		return texto.append("E-mail automático. Favor não responder a esse e-mail").toString();
	}

}
