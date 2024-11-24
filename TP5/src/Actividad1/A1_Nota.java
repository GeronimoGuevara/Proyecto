package Actividad1;

public class A1_Nota {
    private String catedra;
    private Double notaExamen;

    public A1_Nota(String catedra, Double notaExamen) {
        this.catedra = catedra;
        this.notaExamen = notaExamen;
    }

    public String getCatedra() {
        return  catedra;
    }
    public double getNotaExamen() {
        return notaExamen;
    }
    @Override
    public String toString() {
        return  "Catedra: "+ catedra + ",Nota: "+notaExamen;
    }
}
