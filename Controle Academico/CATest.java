import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class CATest {
    private ControleAcademico CA;
    private Professor professor1;
    private Professor professor2;
    private Aluno aluno1;
    private Aluno aluno2;

    @Before
    public void setUp() {
        CA = new ControleAcademico();

        professor1 = new Professor(1, "Sabrina");
        professor2 = new Professor(2, "Misael");

        aluno1 = new Aluno(101, "Rodrigo");
        aluno2 = new Aluno(102, "Carlos");

        Disciplina disciplina1 = new Disciplina("Metodos Avancados de Programacao", "Segunda-feira, 16:00 - 18:00");
        Disciplina disciplina2 = new Disciplina("Organizacao e Arquitetura de Computadores", "Segunda-feira, 07:00 - 09:00");
        Disciplina disciplina3 = new Disciplina("Linguagem de Programacao II", "Terça-feira, 09:00 - 11:00");
        Disciplina disciplina4 = new Disciplina("Laboratorio de Linguagem de Programacao II", "Terça-feira, 11:00 - 13:00");

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
    }

    @Test
    public void testeDisciplinasDoProfessor() {
        List<Disciplina> disciplinasDoProfessor1 = CA.obterDisciplinasProfessor(professor1);
        assertEquals(2, disciplinasDoProfessor1.size());
        assertEquals("Metodos Avancados de Programacao", disciplinasDoProfessor1.get(0).getNome());
    }

    @Test
    public void testeHorarioDoProfessor() {
        String horarioDoProfessor1 = CA.obterHorarioProfessor(professor1);
        assertTrue(horarioDoProfessor1.contains("Segunda-feira, 16:00 - 18:00"));
    }

    @Test
    public void testeDisciplinasDoAluno() {
        List<Disciplina> disciplinasDoAluno2 = CA.obterDisciplinasAluno(aluno2);
        assertEquals(4, disciplinasDoAluno2.size());
        assertTrue(disciplinasDoAluno2.stream().anyMatch(disciplina -> disciplina.getNome().equals("Linguagem de Programacao II")));
        assertTrue(disciplinasDoAluno2.stream().anyMatch(disciplina -> disciplina.getNome().equals("Laboratorio de Linguagem de Programacao II")));
    }

    @Test
    public void testeHorarioDoAluno() {
        String horarioDoAluno1 = CA.obterHorarioAluno(aluno1);
        assertTrue(horarioDoAluno1.contains("Linguagem de Programacao II: Terça-feira, 09:00 - 11:00"));
        assertTrue(horarioDoAluno1.contains("Laboratorio de Linguagem de Programacao II: Terça-feira, 11:00 - 13:00"));
    }
}



