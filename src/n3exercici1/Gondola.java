package n3exercici1;

import org.w3c.dom.ls.LSOutput;

public class Gondola implements Telefon{

    @Override
    public void trucar() {
        System.out.println("Sona un bonic Góndola");
    }

    public void cambiarCable(){
        System.out.println("Has de cambiar el cable!");
    }

}
