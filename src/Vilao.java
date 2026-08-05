public class Vilao extends Personagem {
    private int nivelDeAmeaca;

    public Vilao(String nome, Sexo sexo, int idade, double altura, int nivelDeAmeaca) {
        super(nome, sexo, idade, altura);
        if (nivelDeAmeaca < 1 || nivelDeAmeaca > 10) {
            throw new IllegalArgumentException("O nível de ameaça do vilão deve ser de 1 a 10.");
        }
        this.nivelDeAmeaca = nivelDeAmeaca;
    }

    @Override
    public String apresentar() {
        String texto = "Eu sou o vilão " + getNome() + " e meu nível de ameaça é " + nivelDeAmeaca + "!\n";
        texto += "Dados: " + getSexo() + " - " + getIdade() + " anos - " + getAltura() + "m";
        return texto;
    }
}