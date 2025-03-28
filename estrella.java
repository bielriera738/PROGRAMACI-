public class estrella {

        // Función para imprimir asteriscos
        public static void estrellas(int cantidad) {
            for (int i = 0; i < cantidad; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
        // Función para imprimir guiones
        public static void guiones(int cantidad) {
            for (int i = 0; i < cantidad; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    
        // Función para imprimir números
        public static void numeros(int cantidad, int numero) {
            for (int i = 0; i < cantidad; i++) {
                System.out.print(numero);
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            // Generar el output esperado
            estrellas(8);  // ********
            guiones(1);    // -
            numeros(6, 5); // 555555
            estrellas(3);  // ***
            guiones(5);    // -----
            numeros(2, 3); // 33
        }
    }
    