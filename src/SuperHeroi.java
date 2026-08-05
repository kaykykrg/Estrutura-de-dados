import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends Personagem {
    private String nomeDeGuerra;
    private boolean identidadeSecreta;
    private List<String> habilidades = new ArrayList<>();

    public SuperHeroi(String nome, Sexo sexo, int idade, double altura, String nomeDeGuerra, boolean identidadeSecreta) {
        super(nome, sexo, idade, altura);
        this.nomeDeGuerra = nomeDeGuerra;
        this.identidadeSecreta = identidadeSecreta;
    }

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

    public List<String> getHabilidades() {
        return new ArrayList<>(this.habilidades);
    }

    public void setHabilidades(String habilidade) {
        this.habilidades.add(habilidade);
    }

    @Override
    public String apresentar() {
        String texto = "Eu sou o herói " + nomeDeGuerra + "!\n";
        texto += "Dados: " + getNome() + " - " + getSexo() + " - " + getAltura() + "m\n";
        texto += "Habilidades:";

        for (String x : habilidades) {
            texto += "\n-" + x;
        }
        return texto;
    }
}