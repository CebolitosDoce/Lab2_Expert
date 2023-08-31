import java.util.ArrayList;
import java.util.List;

class Disciplina {
    private String nome;
    private String horario;
    private List<Aluno> alunos;

    public Disciplina(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunosMatriculados() {
        return alunos;
    }
}