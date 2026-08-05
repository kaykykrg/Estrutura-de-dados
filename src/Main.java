import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** SUPER-HERÓI ****");
        SuperHeroi h = new SuperHeroi("Gianluca", Sexo.HOMEM, 22, 2.0, "Super-Gian", true);
        h.setHabilidades("fogo");
        h.setHabilidades("agua");

        System.out.println(h.apresentar());
        System.out.println("Identidade atual: " + h.getIdentidade());
        System.out.println("Identidade revelada: " + h.revelarIdentidade());

        List<String> listaHacker = h.getHabilidades();
        listaHacker.add("voar");
        listaHacker.clear();

        System.out.println("\nLista modificada fora do objeto: " + listaHacker);
        System.out.println("Lista protegida dentro do objeto: " + h.getHabilidades());

        System.out.println("\n**** VILÃO ****");
        Vilao vilao = new Vilao("Coringa", Sexo.HOMEM, 45, 1.85, 9);
        System.out.println(vilao.apresentar());

        System.out.println("\n**** CIVIL ****");
        Civil civil = new Civil("Artur", Sexo.HOMEM, 20, 1.75, "Desenvolvedor");
        System.out.println(civil.apresentar());
    }
}