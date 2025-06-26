package br.senac.estudantil;
import java.util.ArrayList;
import java.util.List;

import br.senac.estudantil.modelo.entidade.pessoa.empregado.Empregado;
import br.senac.estudantil.modelo.entidade.pessoa.empregado.diretor.Diretor;
import br.senac.estudantil.modelo.entidade.pessoa.empregado.professor.Professor;
import br.senac.estudantil.modelo.entidade.pessoa.CpfInvalidoException;
import br.senac.estudantil.modelo.entidade.pessoa.NomeIvalidoException;
import br.senac.estudantil.modelo.entidade.pessoa.SobrenomeInvalidoException;

public class Principal {
	public static void main(String[]args) {
		
		List<Empregado> empregados = new ArrayList<>();
		
		try {
			empregados.add(new Professor("e", "Kubischek", "182.598.478-78", 3000));
			empregados.add(new Diretor ("Juscelino", "Kubischek", "185.232.414-45", 3000));
			empregados.add(new Professor("Juscelino", "Kubischek", "", 3000));
			
			for(Empregado empregado : empregados) {
				System.out.println(empregado.calcularSalario());
			}
		}
		catch(nomeInvalidoException e) {
			System.out.println(e.getMessage());
		}
		catch(SobrenomeIvalidoException e) {
			e.printStackTrace();
		}
		catch(CpfInvalidoException e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("Entrou");
		}
	}
}
