package br.senac.estudantil.modelo.entidade.turma;

import java.util.ArrayList;
import java.util.List;

import br.senac.estudantil.modelo.entidade.pessoa.aluno.Aluno;
import br.senac.estudantil.modelo.entidade.pessoa.empregado.professor.Professor;

public class Turma {
	
	private String codigo;
	private byte cargaHoraria;
	private Professor professor;
	private List<Aluno> alunos;
	
	public Turma(String codigo, byte cargaHoraria, Professor professor) {
		getCodigo(codigo);
		setCargaHoraria(cargaHoraria);
		setProfessor(professor);
		alunos = new ArrayList<>();
	}
	public Turma(String codigo, byte cargaHoraria) {
		getCodigo(codigo);
		setCargaHoraria(cargaHoraria);
		alunos = new ArrayList<>();
	}
	
	public Turma(String codigo) {
		getCodigo(codigo);
	}
	public String getCodigo() {
		return codigo;
	}
	public void getCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public byte getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(byte cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor=professor;
	}
	
	public boolean adicionarAluno(Aluno aluno) {
		return alunos.add(aluno);
	}
	public boolean removeAluno(Aluno aluno) {
		return alunos.remove(aluno);
	}
	
	
}
