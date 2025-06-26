package br.senac.estudantil.modelo.entidade.pessoa.empregado.professor;

import br.senac.estudantil.modelo.entidade.pessoa.empregado.Empregado;

import br.senac.estudantil.modelo.entidade.turma.Turma;
import br.senac.estudantil.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Professor extends Empregado {
	private Turma turma;
	
	public Professor (String nome, String cpf, String sobrenome, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException{
		super(nome, sobrenome, cpf, salario);
	}
	public Professor (String nome, String sobrenome, String cpf, float salario, Turma turma) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException{
		super(nome, sobrenome, cpf, salario);
		setTurma(turma);
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public float calcularSalario() {
		return getSalario() + 500;
	}
	public void efetuarChamada() {
		System.out.println("Pessoa, vamos responder a chamada!");
	}
}
