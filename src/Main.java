import java.util.List;

public class Main {
    public static void main(String[] args) {
        SuperHeroi h = new SuperHeroi("Gianluca", Sexo.HOMEM, 22, 2.0, true);

        h.setHabilidades("fogo");
        h.setHabilidades("agua");

        System.out.println("Identidade atual: " + h.getIdentidade());
        System.out.println("Identidade revelada: " + h.revelarIdentidade());

        List<String> listaHacker = h.getHabilidades();
        listaHacker.add("voar");
        listaHacker.clear();

        System.out.println("\nLista modificada fora do objeto: " + listaHacker);
        System.out.println("Lista protegida dentro do objeto: " + h.getHabilidades());
    }
}