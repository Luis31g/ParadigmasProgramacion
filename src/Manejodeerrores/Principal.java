package Manejodeerrores;

public class Principal {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3};

        System.out.println("Valor ");
        try {

            System.out.println(numeros[3]);

            System.out.println("final");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("error: " +e.getMessage());
        }

    }
}
