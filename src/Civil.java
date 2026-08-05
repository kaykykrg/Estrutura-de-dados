public class Civil extends Personagem {
    private String profissao;

    public Civil(String nome, Sexo sexo, int idade, double altura, String profissao) {
        super(nome, sexo, idade, altura);
        this.profissao = profissao;
    }

    @Override
    public String apresentar() {
        String texto = "Eu sou um civil chamado " + getNome() + " e trabalho como " + profissao + ". Por favor, não destruam meu carro!\n";
        texto += "Dados: " + getSexo() + " - " + getIdade() + " anos - " + getAltura() + "m";
        return texto;
    }
}