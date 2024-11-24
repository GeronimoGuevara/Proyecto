package Actividad2;

import java.util.ArrayList;

public class Plato {
    private String nombrePlato;
    private double precio;
    private boolean esBebida;
    private ArrayList<Ingrediente> ingredientes;

    public Plato(String nombrePlato, double precio, boolean esBebida) {
        this.nombrePlato = nombrePlato;
        this.precio = precio;
        this.esBebida = esBebida;
        this.ingredientes = new ArrayList<>();
    }

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEsBebida() {
        return esBebida;
    }

    public void setEsBebida(boolean esBebida) {
        this.esBebida = esBebida;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void agregarIngredientes(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append(nombrePlato).append("\n")
                .append("Precio: $").append(precio).append("\n");
        if(!esBebida) {
            info.append("Ingredientes:\n");
            for(Ingrediente ingrediente : ingredientes) {
                info.append(ingrediente).append("\n");
            }
        }
        return info.toString();

    }

}
