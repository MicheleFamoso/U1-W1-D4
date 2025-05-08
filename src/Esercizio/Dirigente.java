package Esercizio;

public class Dirigente extends Dipendente {

    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary( double vendite) {
        return this.getStipendio() *  vendite;
    }



}
