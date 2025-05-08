package Esercizio;

public abstract class Dipendente implements ChenIn {
    private String matricola;
    private double stipendio;
    private Dipartimento dipartimento ;

    //Costruttore


    public Dipendente(String matricola, double stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    // Getter e setter


    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }


    //ToString


    @Override
    public String toString() {
        return "matricola=" + matricola;
    }

    public abstract double calculateSalary(double moltiplicatore);

    @Override
    public String checkIn() {
        return "Inizio Turno";
    }
}
