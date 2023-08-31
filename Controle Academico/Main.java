import java.util.List;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor(1, "Sabrina");
        Professor professor2 = new Professor(2, "Misael");

        Aluno aluno1 = new Aluno(101, "Rodrigo");
        Aluno aluno2 = new Aluno(102, "Carlos");

        Disciplina disciplina1 = new Disciplina("Métodos Avançados de Programação", "Segunda-feira, 16:00 - 18:00");
        Disciplina disciplina2 = new Disciplina("Organização e Arquitetura de Computadores", "Segunda-feira, 07:00 - 09:00");
        Disciplina disciplina3 = new Disciplina("Linguagem de Programação II", "Terça-feira, 09:00 - 11:00");
        Disciplina disciplina4 = new Disciplina("Laboratório de Linguagem de Programação II", "Terça-feira, 11:00 - 13:00");

        professor1.adicionarDisciplina(disciplina1);
        professor1.adicionarDisciplina(disciplina4);
        professor2.adicionarDisciplina(disciplina2);
        professor2.adicionarDisciplina(disciplina3);

        aluno1.adicionarDisciplina(disciplina1);
        aluno1.adicionarDisciplina(disciplina2);
        aluno1.adicionarDisciplina(disciplina3);
        aluno1.adicionarDisciplina(disciplina4);

        aluno2.adicionarDisciplina(disciplina1);
        aluno2.adicionarDisciplina(disciplina2);
        aluno2.adicionarDisciplina(disciplina3);
        aluno2.adicionarDisciplina(disciplina4);

        disciplina1.adicionarAluno(aluno1);
        disciplina1.adicionarAluno(aluno2);
        disciplina2.adicionarAluno(aluno1);
        disciplina2.adicionarAluno(aluno2);
        disciplina3.adicionarAluno(aluno1);
        disciplina3.adicionarAluno(aluno2);
        disciplina4.adicionarAluno(aluno1);
        disciplina4.adicionarAluno(aluno2);

        ControleAcademico CA = new ControleAcademico();

        CA.adicionarProfessor(professor1);
        CA.adicionarProfessor(professor2);

        CA.adicionarAluno(aluno1);
        CA.adicionarAluno(aluno2);

        CA.adicionarDisciplina(disciplina1);
        CA.adicionarDisciplina(disciplina2);
        CA.adicionarDisciplina(disciplina3);
        CA.adicionarDisciplina(disciplina4);

        System.out.printf("a. Quais disciplinas a professora %s está ministrando?\n", professor1.getNome());
        List<Disciplina> disciplinasDoProfessor1 = CA.obterDisciplinasProfessor(professor1);
        for (Disciplina disciplina : disciplinasDoProfessor1) {
            System.out.println("- " + disciplina.getNome());
        }

        System.out.printf("\nb. Qual o horário do professor %s?\n", professor2.getNome());
        String horarioDoProfessor2 = CA.obterHorarioProfessor(professor2);
        System.out.println(horarioDoProfessor2);

        System.out.printf("\nc. Quais os alunos da disciplina %s?\n", disciplina1.getNome());
        List<Aluno> alunosDaDisciplina1 = CA.obterAlunosDisciplina(disciplina1);
        for (Aluno aluno : alunosDaDisciplina1) {
            System.out.println("- " + aluno.getNome());
        }

        System.out.printf("\nd. Quais as disciplinas do aluno %s?\n", aluno1.getNome());
        List<Disciplina> disciplinasDoAluno1 = CA.obterDisciplinasAluno(aluno1);
        for (Disciplina disciplina : disciplinasDoAluno1) {
            System.out.println("- " + disciplina.getNome());
        }

        System.out.printf("\ne. Qual o horário do Aluno %s?\n", aluno2.getNome());
        String horarioDoAluno2 = CA.obterHorarioAluno(aluno2);
        System.out.println(horarioDoAluno2);

        System.out.printf("\nf. Qual o número de alunos na disciplina %s?\n", disciplina4.getNome());
        int numeroDeAlunosNadisciplina4 = CA.obterNumeroAlunosDisciplina(disciplina4);
        System.out.println("Número de alunos na disciplina Matemática: " + numeroDeAlunosNadisciplina4);
    }
}
