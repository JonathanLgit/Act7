public class Main {
    public static void main(String[] args) {
        NumPrimo primo = new NumPrimo(20);

        System.out.println("Números primos:");
        primo.mostrarPrimos();

        System.out.println(" ");

        NumFibo fibo = new NumFibo(20);

        System.out.println("Sucesión de Fibonacci:");
        fibo.mostrarFibo();
    }
}