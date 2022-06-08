package n3exercici1;


public class Smartphone implements Telefon{

    @Override
    public void trucar() {

        System.out.println("T'està sonant L'Smartphone ...");
    }

    public void ferFotos(){

        System.out.println("Pegasus t'ha fet una foto... ups!");
    }
}
