package Ejercicios;

public class Estudiante extends Persona implements IntAlumno, IntAlumno2 {
    String noCuenta;
    String curso;
    String calificacion;

    public Estudiante(String nombre, int edad, String sexo, String direccion, String noCuenta, String curso, String calificacion) {
        super(nombre, edad, sexo, direccion);
        this.noCuenta = noCuenta;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void verCalificacion(){
        System.out.println("La calificacion de "+getNombre()+" es"+calificacion);
    }
    public void verCurso(){
        System.out.println("El curso es: "+curso);
    }

    @Override
    public void mostrarCurso() {
        System.out.println("Curso: ");
    }

    @Override
    public void mostrarGrado() {

    }

    @Override
    public int obtenerTiempodeCarrera() {
        return 0;
    }

    @Override
    public void entrarCurso() {

    }
}

