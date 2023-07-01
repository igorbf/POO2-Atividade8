package br.edu.ifgoias.academico.config;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.edu.ifgoias.academico.entities.Curso;
import br.edu.ifgoias.academico.entities.Aluno;
import br.edu.ifgoias.academico.repositories.AlunoRepository;
import br.edu.ifgoias.academico.repositories.CursoRepository;

@Configuration
public class Config implements CommandLineRunner {

	@Autowired
	private CursoRepository cursoRep;
	
	@Autowired
	private AlunoRepository alunoRep;
	
	@Override
	public void run(String... args) throws Exception {
		
		Aluno a1 = new Aluno("Igor", "Masculino", new Date(30/05/1998));
		
		Aluno a2 = new Aluno("Viviane", "Feminino", new Date(30/05/1998));
		
		Aluno a3 = new Aluno("Italo", "Masculino", new Date(30/05/1998));
		
		alunoRep.save(a1);
		
		alunoRep.save(a2);
		
		alunoRep.save(a3);
		
		//Curso c1 = new Curso(null,"Teste1");
		
		//Curso c2 = new Curso(null,"Teste2");
		
		//cursoRep.save(c1);
		
		//cursoRep.save(c2);
		
		//cursoRep.deleteById(7);
		
		//cursoRep.deleteById(8);
		
		//System.out.println("Qtde Cursos: " + cursoRep.count()) ;
		
		System.out.println("Qtde Alunos: " + alunoRep.count()) ;
	}

}
