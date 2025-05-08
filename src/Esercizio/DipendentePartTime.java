package Esercizio;

public class DipendentePartTime extends  Dipendente{
    public DipendentePartTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary(double ore) {
        return this.getStipendio() * ore;
    }
}
