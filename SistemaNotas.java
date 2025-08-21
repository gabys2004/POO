 // Clase Alumno
class Alumno {
    private String nombre;
    private int edad;
    private double[] notas;

    public Alumno(String nombre, int edad, double[] notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.notas = notas;
    }

    // Método para calcular el promedio
    public double calcularPromedio() {
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return suma / notas.length;
    }

    // Método para saber si aprueba
    public boolean estaAprobado() {
        return calcularPromedio() >= 11; // aprobados con 11
    }

    // Mostrar información del alumno
    public void mostrarInfo() {
        System.out.println("Alumno: " + nombre + " | Edad: " + edad);
        System.out.println("Promedio: " + calcularPromedio());
        System.out.println("Estado: " + (estaAprobado() ? "Aprobado ✅" : "Desaprobado ❌"));
    }
}

// Clase Curso
class Curso {
    private String nombreCurso;
    private Alumno[] alumnos;

    public Curso(String nombreCurso, Alumno[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.alumnos = alumnos;
    }

    public void mostrarAlumnos() {
        System.out.println("Curso: " + nombreCurso);
        for (Alumno a : alumnos) {
            a.mostrarInfo();
            System.out.println("-------------------");
        }
    }
}

// Clase principal
public class SistemaNotas {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("Gabriel", 20, new double[]{15, 18, 12});
        Alumno a2 = new Alumno("María", 19, new double[]{9, 10, 8});
        Alumno a3 = new Alumno("José", 21, new double[]{14, 11, 16});

        Curso cursoPOO = new Curso("Programación Orientada a Objetos", new Alumno[]{a1, a2, a3});

        cursoPOO.mostrarAlumnos();
    }
}
