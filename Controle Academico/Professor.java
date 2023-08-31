import java.util.ArrayList;
import java.util.List;

class Professor {
    private int matricula;
    private String nome;
    private List<Disciplina> disciplinas;

    public Professor(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinas;
    }
}