public class NumPrimo {

    private int cantidadPrimos;

    public NumPrimo(int cantidadPrimos) {
        this.cantidadPrimos = cantidadPrimos;
    }



    public static int[] obtenerPrimos(int n) {
        int[] primos = new int[n]; // Crear un arreglo para almacenar los números primos
        int contador = 0; // Contador para la cantidad de primos encontrados
        int numero = 2; // Número a partir del cual se buscarán los primos

        // Bucle para encontrar y almacenar 'n' números primos
        while (contador < n) {
            if (esPrimo(numero)) {
                primos[contador] = numero; // Almacenar el número primo encontrado
                contador++; // Incrementar el contador de primos
            }
            numero++; // Pasar al siguiente número para verificar
        }

        return primos; // Devolver el arreglo de números primos
    }



    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // El número 1 no se considera primo
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si es divisible por algún número aparte de 1 y sí mismo, no es primo
            }
        }
        return true; // Si no se encontraron divisores, es primo
    }



    public void mostrarPrimos(){
        for (int primo : obtenerPrimos(cantidadPrimos)) {
            System.out.print(primo + ", ");
        }
    }

}


