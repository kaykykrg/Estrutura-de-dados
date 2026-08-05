import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends superAbstract {
    private int idade;
    private boolean identidadeSecreta;
    private List<String> habilidades = new ArrayList<>();

    public String getIdentidade() {
        if (identidadeSecreta) {
            return "??? (identidade protegida)";
        } else {
            return getNome();
        }
    }

    public String revelarIdentidade() {
        return getNome();
    }

    public SuperHeroi(String nome, Sexo sexo, int idade, double altura, boolean identidadeSecreta) {
        super(nome, sexo, altura);
        this.idade = idade;
        this.identidadeSecreta = identidadeSecreta;
    }

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    public void setHabilidades(String habilidades) {
        this.habilidades.add(habilidades);
    }

    @Override
    public String apresentar() {
        String texto = getNome() + " - " + getSexo() + " - " + getAltura() + "\nHabilidades:";
        for (String x : habilidades) {
            texto += "\n-" + x;
        }
        return texto;
    }
}