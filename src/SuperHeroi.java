import java.util.ArrayList;
import java.util.List;

public class SuperHeroi extends superAbstract {
    private int idade;
    private boolean identidadeSecreta;
    private List<String> habilidades = new ArrayList<>();


    public void getIdentidade(){
        if(identidadeSecreta){
            System.out.println("??? (identidade protegida)");
        }
        else{
            System.out.println(getNome());
        }
    }
    public void revelerarIdentidade(){
        System.out.println(getNome());
    }


    public SuperHeroi(String nome, Sexo sexo, int idade, double altura, boolean identidadeSecreta){
        this.setNome(nome);
        this.setSexo(sexo);
        this.idade = idade;
        this.setAltura(altura);
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
        String texto = "";
        texto += getNome() + " - " + getSexo() + " - " + getAltura() + "\nHabilidades:";
        for (String x: habilidades) {
            texto += "\n" +"-" + x;
        }
        return texto;
    }
}