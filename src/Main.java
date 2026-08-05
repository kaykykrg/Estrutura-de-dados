public class Main {
    public static void main(String[] args) {
        SuperHeroi h = new SuperHeroi("", Sexo.HOMEM, 22, 2, false);
        IO.println(h.apresentar());
    }
}