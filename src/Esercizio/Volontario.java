package Esercizio;

public class Volontario implements ChenIn {
    private String nome;
    private int eta;
    private boolean CV;

   //Costruttore


    public Volontario(String nome, int eta, boolean CV) {
        this.nome = nome;
        this.eta = eta;
        this.CV = CV;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public boolean isCV() {
        return CV;
    }

    public void setCV(boolean CV) {
        this.CV = CV;
    }

    @Override
    public String checkIn() {
        return "Inizio Servizio";
    }
}
