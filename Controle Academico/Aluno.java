import java.util.ArrayList;
import java.util.List;

class Aluno {
    private int matricula;
    private String nome;
    private List<Disciplina> disciplinas;

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinasCursadas() {
        return disciplinas;
    }
}

