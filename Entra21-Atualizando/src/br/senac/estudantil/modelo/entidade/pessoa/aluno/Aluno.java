package br.senac.estudantil.modelo.entidade.pessoa.aluno;

import br.senac.estudantil.modelo.entidade.pessoa.Pessoa;
import br.senac.estudantil.modelo.entidade.turma.Turma;
import br.senac.estudantil.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Aluno extends Pessoa{
	private int matricula;
	private Turma turma;
	
	public Aluno (String nome, String sobrenome, String cpf, int matricula, Turma turma) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException{
		super(nome, sobrenome, cpf);
		setMatricula(matricula);
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public void responderChamada() {
		System.out.println(" está presente, professor!");
	}
}
