public class NumFibo {

    private int cantidadFibo;

    public NumFibo(int cantidadFibo) {
        this.cantidadFibo = cantidadFibo;
    }

    public static int[] obtenerFibo(int n){
        if (n <= 0) {
            return new int[0]; // Si 'n' es menor o igual a 0, devolver un arreglo vacío
        }

        int[] fibonacci = new int[n]; // Crear un arreglo para almacenar la sucesión de Fibonacci
        fibonacci[0] = 0; // El primer número de la sucesión es 0

        if (n > 1) {
            fibonacci[1] = 1; // El segundo número de la sucesión es 1

            // Generar la sucesión de Fibonacci
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        return fibonacci; // Devolver el arreglo con la sucesión de Fibonacci
    }

    public void mostrarFibo(){
        for (int numero : obtenerFibo(cantidadFibo)) {
            System.out.print(numero + ", ");
        }
    }

}
