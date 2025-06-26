package br.senac.estudantil.modelo.excecao.pessoa;

public class SobrenomeInvalidoException extends Exception{

	public SobrenomeInvalidoException(String sobrenome) {
		super("O sobrenome" + sobrenome + " é invalido");
	}
}
