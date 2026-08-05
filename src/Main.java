public class Main {
    public static void main(String[] args) {
        SuperHeroi h = new SuperHeroi("Gianluca", Sexo.HOMEM, 22, 2, true);
        IO.println(h.apresentar());
        h.getIdentidade();
        h.revelerarIdentidade();
        h.setHabilidades("fogo");
        h.setHabilidades("agua");
        IO.println(h.getHabilidades());
    }
}