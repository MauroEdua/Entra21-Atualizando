package br.senac.estudantil.modelo.excecao.pessoa;

public class CpfInvalidoException extends Exception {
	public CpfInvalidoException(String cpf) {
		super("O CPF" + cpf + " é invalido");
	}
}
