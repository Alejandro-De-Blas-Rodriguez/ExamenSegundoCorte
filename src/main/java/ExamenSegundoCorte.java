import java.util.Scanner;

public class ExamenSegundoCorte {
    public static void main(String[] args) {
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        while (opc != 3) {
            mostarMenu ();
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    registrarCalificaciones();
                    break;
                case 2:
                    modificarEstadisticas();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("opcion invalida ");
                    break;
            }
        }
    }

    private static void mostarMenu() {
        System.out.println("=====================================");
        System.out.println("CONTROL DE CALIFICACIONES");
        System.out.println("=====================================");
        System.out.println("1. Registrar calificaciones");
        System.out.println("2. Mostrar estadísticas");
        System.out.println("3. Salir");
        System.out.println("Seleccione una opción:");
    }

    private static void modificarEstadisticas() {
        System.out.println("Modoficar estadisticas");
    }

    private static void registrarCalificaciones() {
        System.out.println("Registar calificaciones");
    }

}
