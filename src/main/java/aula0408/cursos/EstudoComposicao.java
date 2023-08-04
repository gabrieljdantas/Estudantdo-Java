package aula0408.cursos;

import java.util.ArrayList;
import java.util.List;

public class EstudoComposicao {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Thais", "1");
        Aluno aluno2 = new Aluno("Pedro", "2");
        Aluno aluno3 = new Aluno("Guilherme", "3");
        List<Aluno> alunos = new ArrayList<>(List.of(aluno1, aluno2, aluno3));

        Professor professor = new Professor("Almir", "558732234");

        Curso curso = new Curso("Java", 200.0F, professor, alunos);

        System.out.println(curso.getProfessor().getNome());
        System.out.println(curso);
        System.out.println(curso.getAlunos().get(2).getNome());
    }



}
