package Ejercicios;

public interface IntAlumno2 {
    void mostrarGrado();
    int obtenerTiempodeCarrera();
    public abstract void entrarCurso();
    default void mostrarHorario(){
        System.out.println("Horario corrido");
        
    }
}
