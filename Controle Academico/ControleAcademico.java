import java.util.ArrayList;
import java.util.List;

class ControleAcademico {
    private List<Professor> professores;
    private List<Aluno> alunos;
    private List<Disciplina> disciplinas;

    public ControleAcademico() {
        professores = new ArrayList<>();
        alunos = new ArrayList<>();
        disciplinas = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> obterDisciplinasProfessor(Professor professor) {
        return professor.getDisciplinasMinistradas();
    }

    public String obterHorarioProfessor(Professor professor) {
        StringBuilder horario = new StringBuilder();
        for (Disciplina disciplina : professor.getDisciplinasMinistradas()) {
            horario.append(disciplina.getNome()).append(": ").append(disciplina.getHorario()).append("\n");
        }
        return horario.toString();
    }

    public List<Aluno> obterAlunosDisciplina(Disciplina disciplina) {
        return disciplina.getAlunosMatriculados();
    }

    public List<Disciplina> obterDisciplinasAluno(Aluno aluno) {
        return aluno.getDisciplinasCursadas();
    }

    public String obterHorarioAluno(Aluno aluno) {
        StringBuilder horario = new StringBuilder();
        for (Disciplina disciplina : aluno.getDisciplinasCursadas()) {
            horario.append(disciplina.getNome()).append(": ").append(disciplina.getHorario()).append("\n");
        }
        return horario.toString();
    }

    public int obterNumeroAlunosDisciplina(Disciplina disciplina) {
        return disciplina.getAlunosMatriculados().size();
    }
}