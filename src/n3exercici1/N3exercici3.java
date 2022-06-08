package n3exercici1;

public class N3exercici3 {

    public static void main(String[] args) {


        Smartphone smartphone = new Smartphone();
        Gondola gondola = new Gondola();

        Generica.genericUn(smartphone);
        Generica.genericDos(smartphone);

        Generica.genericUn(gondola);
        Generica.genericTres(gondola);

        // Below sentence, doesn't let put another object if
        // this has not its method included at its class
        //Generica.genericTres(smartphone);


    }
}
