package br.senac.estudantil.modelo.entidade.pessoa.empregado.diretor;

import br.senac.estudantil.modelo.entidade.pessoa.empregado.Empregado;

import br.senac.estudantil.modelo.entidade.pessoa.empregado.RH;
import br.senac.estudantil.modelo.entidade.pessoa.empregado.Situacao;
import br.senac.estudantil.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Diretor extends Empregado implements RH {
	public Diretor(String nome, String sobrenome, String cpf, float salario, Situacao situacao) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException{
		super(nome, sobrenome, cpf, salario, situacao);
	}
	public Diretor(String nome, String sobrenome, String cpf, float salario) throws NomeInvalidoException. SobrenomeInvalidoException, CpfInvalidoException{ 
		super(nome, sobrenome, cpf, salario);
	}
	
	public float calcularSalario() {
		return getSalario() + 1500;
	}
	
	public void contratarEmpregado(Empregado Empregado) {
		empregado.setSituacao(Situacao.ATIVO);
	}
	public void demitirEmpregado(Empregado empregado) {
		empregado.setSituacao(Situacao.INATIVO);
	}
}
