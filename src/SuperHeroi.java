public class SuperHeroi extends superAbstract {
    private int idade;
    private boolean identidadeSecreta;
    private String[] habilidades;


    public SuperHeroi(String nome,Sexo sexo,int idade, int altura, boolean identidadeSecreta){
        this.setNome(nome);
        this.setSexo(sexo);
        this.setAltura(altura);
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
        texto += getNome() + " - " + getSexo() + " - " + getAltura();
        for (int i = 0; i < habilidades.length; i++) {
            texto += habilidades[i];
        }
        return texto;
    }
}