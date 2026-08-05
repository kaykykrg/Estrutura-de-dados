public abstract class superAbstract{
    private Sexo sexo;
    private String nome;
    private double altura;

    public abstract String apresentar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }

        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < 0.5 || altura> 3) {
            throw new IllegalArgumentException("Nome não pode ser vazio");
        }

        this.altura = altura;
    }
}

