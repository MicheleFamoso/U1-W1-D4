package Esercizio;

public class MainDipendenti {
    public static void main(String[] args) {
//        //Dipendenti
//        Dipendente d1 = new Dipendente("1a",2010,Dipartimento.PRODUZIONE);
//        Dipendente d2 = new Dipendente("2a",1300,Dipartimento.VENDITE);
//        Dipendente d3 = new Dipendente("1c",3208,Dipartimento.AMMINISTRAZIONE);
//        //Array di dipendenti
//        Dipendente[] dipendenti = new Dipendente[3];
//        dipendenti[0]= d1;
//        dipendenti[1]= d2;
//        dipendenti[2]= d3;
//        // Ciclo di dipendenti
//        for (int i = 0; i < dipendenti.length; i++) {
//            System.out.println(dipendenti[i]);
//        }

        Dipendente d1 = new DipendenteFullTime("36",2000,Dipartimento.PRODUZIONE);
        Dipendente d2 = new DipendentePartTime("d34",9,Dipartimento.PRODUZIONE);
        Dipendente d3 = new Dirigente("d01",4500,Dipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0]= d1;
        dipendenti[1]=d2;
        dipendenti[2]=d3;


        double cont = 0;
        for (int i = 0; i < dipendenti.length; i++) {
           double stip = dipendenti[i].getStipendio();
            cont += stip;

        }
        System.out.println(cont);


        Volontario v1 = new Volontario("jojo",19,true);
        Volontario v2 = new Volontario("guts",29,false);



        System.out.println(v1.checkIn());
        System.out.println(d1.checkIn());








    }
}
