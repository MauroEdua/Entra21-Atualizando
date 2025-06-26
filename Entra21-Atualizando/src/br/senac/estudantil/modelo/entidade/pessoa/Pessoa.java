package br.senac.estudantil.modelo.entidade.pessoa;

import br.senac.estudantil.modelo.excecao.pessoa.CpfInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.NomeInvalidoException;
import br.senac.estudantil.modelo.excecao.pessoa.SobrenomeInvalidoException;

public abstract class Pessoa {
	private String nome;
	private String sobrenome;
	private String cpf;
	
	protected Pessoa(String nome, String sobrenome, String cpf) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException{
		super();
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);
	}
	
	private String getCpf() {
		return cpf;
	}
	private void setCpf(String cpf) throws CpfInvalidoException{
		if(cpf.isEmpty()) {
			throw new CpfInvalidoException(cpf);
		}
		this.cpf = cpf;
	}
	private String getSobrenome() {
		return sobrenome;
	}
	private void setSobrenome(String sobrenome) throws SobrenomeInvalidoException{
		if(sobrenome.isEmpty()){
			throw new SobrenomeInvalidoException(sobrenome);
		}
		this.sobrenome = sobrenome;
	}
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) throws NomeInvalidoException{
		if(nome.isEmpty()) {
			throw new NomeInvalidoException(nome);
		}
		this.nome = nome;
	}
	
	public boolean equals(Object objeto) {
		if(objeto == null) {
			return false;
		}
		if(this == objeto) {
			return true;
		}
		if(this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Pessoa pessoa = (Pessoa) objeto;
		return this.getNome().equals(pessoa.getNome());
	}
}
