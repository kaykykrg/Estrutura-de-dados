public abstract class Personagem {
    private Sexo sexo;
    private String nome;
    private int idade;
    private double altura;

    public Personagem(String nome, Sexo sexo, int idade, double altura) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }
        if (altura < 0.5 || altura > 3.0) {
            throw new IllegalArgumentException("Altura deve estar entre 0,5 e 3,0 metros");
        }
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

    public abstract String apresentar();

    public String getNome() {
        return nome;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
}