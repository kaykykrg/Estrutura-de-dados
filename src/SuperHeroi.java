import java.util.Scanner;

public class SuperHeroi extends superAbstract {
    private int idade;
    private boolean identidadeSecreta;
    private String[] habilidades = {"fogo", "agua"};


    public SuperHeroi(String nome,Sexo sexo,int idade, double altura, boolean identidadeSecreta){
        try {

            Scanner scanner = new Scanner(System.in);
            nome = scanner.nextLine();
            altura = scanner.nextDouble();
            this.setNome(nome);
            this.setAltura(altura);
            if(nome.isEmpty() || altura < 0.5 || altura > 3){
                throw new IllegalArgumentException("caralho: ");
            }
        } catch (IllegalArgumentException e){
            IO.println(e + "nome ou altura invalidos!");
        }
        this.setSexo(sexo);
        this.identidadeSecreta = identidadeSecreta;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public String apresentar() {
        String texto = "";
        texto += getNome() + " - " + getSexo() + " - " + getAltura() + "\nHabilidades:";
        for (int i = 0; i < habilidades.length; i++) {
            texto += "\n" +"-" + habilidades[i];
        }
        return texto;
    }
}