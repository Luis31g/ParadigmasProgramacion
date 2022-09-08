package Ejercicios;

public class Principal {
    public static void main(String[] args) {
        Persona p1=new Persona("Estephany",19,"F","Atlacomulco");
        Estudiante e1=new Estudiante("Luis",19,"M","Atlacomulco",
                "0123","Paradigmas","B+");

        e1.mostrarInfo();
        p1.mostrarInfo();

    }
}

