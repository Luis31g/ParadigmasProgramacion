package Manejodeerrores;

public class ErroresArchivo {

    public static void main (String [] args) {

        int a = 8;

        int b = 0;

        try {
            int i = a / b;
        }
        catch
        (ArithmeticException e) {
        }
        System.out.println("Error, la division entre cero no se puede");
    }

}
