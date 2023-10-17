import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> lista = List.of(1,4,56,4,3);

        lista.stream().map(elemento -> elemento * 2).forEach(System.out::println);

    }
}


// Predicate
// Consumer
// Function -> Supplier     lambda de un parametro y retorna cualquier tipo de dato
