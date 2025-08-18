import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }
    
    public static Map<String, List<Aluno>> agruparPorFaixaDeNota(List<Aluno> alunos) {
        Map<String, List<Aluno>> grupo = new HashMap<>();
        grupo.put("Aprovados", new ArrayList<>());
        grupo.put("Recuperação", new ArrayList<>());
        grupo.put("Reprovados", new ArrayList<>());
        for (Aluno aluno : alunos) {
            double nota = aluno.getNota();
            if (nota >= 7.0) {
            	grupo.get("Aprovados").add(aluno);
            } else if (nota >= 5.0) {
            	grupo.get("Recuperação").add(aluno);
            } else {
            	grupo.get("Reprovados").add(aluno);
            }
        }
        return grupo;
    }

    @Override
    public String toString() {
        return nome + " " + nota;
    }
}