package Esercizio;

public class DipendenteFullTime extends Dipendente{

    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }


    @Override
    public double calculateSalary(double moltiplicatore) {
        return this.getStipendio() * moltiplicatore;
    }


}
