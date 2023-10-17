import java.util.List;

public class Main2 {
    static List<Estudiante> estudiantes = List.of(
            new Estudiante(1, "Arturo", 80D),
            new Estudiante(2, "Nicolas", 100D),
            new Estudiante(3, "Justin",40D),
            new Estudiante(4,"Isabela", 60D)
    );
    public static void main(String[] args) {

        List<Integer> codigosEstudiantes = List.of(2,4);

        codigosEstudiantes.stream().map(codigo ->
                Main2.obtenerNombreEstudiante(codigo)
        ).forEach(System.out::println);


//        estudiantes.forEach(estudiante-> System.out.println(estudiante));
//        estudiantes.stream().forEach(estudiante -> System.out.println(estudiante));
//
//        long ini = System.currentTimeMillis();
//        estudiantes.stream().parallel().forEach(estudiante-> procesarEstudiante(estudiante));
//        estudiantes.stream().parallel().forEach(ProgFuncPt2::procesarEstudiante);
//        long fin = System.currentTimeMillis();
//
//        System.out.println(fin - ini);
    }

    // Predicado ( un parametro ) -> Boolean
    // Consumer ( un parametro ) -> VOID
    // Suplier () -> Devuelve cualquier tipo de dato
    // Function ( un parametro ) -> CUALQUIER TIPO DE DATO



    private static String obtenerNombreEstudiante(Integer codigo) {
        return estudiantes.stream().filter(estudiante -> estudiante.codigo.equals(codigo))
                .map(estudiante -> estudiante.nombre).findFirst().orElse("No encontrado");
    }

    public static boolean isAprobado(Estudiante estudiante){
        return estudiante.nota > 50;
    }

    public static void procesarEstudiante(Estudiante estudiante) {
        try{
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(estudiante);
    }


}

//Consumer -> lamda con un parametro que no retorna nada
//Predicado -> lamda con un parametro que retorna un booleano

class Estudiante {

    Integer codigo;

    String nombre;

    Double nota;

    public Estudiante(Integer codigo, String nombre, Double nota){
        this.codigo=codigo;
        this.nombre=nombre;
        this.nota=nota;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
