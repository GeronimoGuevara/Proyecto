package Actividad1;

import java.util.ArrayList;

public class A1_Alumno {
    private String nombreCompleto;
    private  Long legajo;
    private ArrayList<A1_Nota> notas;

    public A1_Alumno(String nombreCompleto, long legajo) {
        this.nombreCompleto = nombreCompleto;
        this.legajo = legajo;
        this.notas = new ArrayList<>();
    }
    public void agregarNota(A1_Nota nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) return  0.0;

        double suma = 0.0;
        for (A1_Nota nota : notas) {
            suma += nota.getNotaExamen();
        }
        return suma / notas.size();

    }
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Nombre: ").append(nombreCompleto)
                .append(",Legajo: ").append(legajo)
                .append("\nNotas:\n");
        for (A1_Nota nota : notas){
            info.append(nota).append("\n");
        }
        info.append("Promedio: ").append(calcularPromedio());
        return info.toString();
    }

}

