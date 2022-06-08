package n3exercici1;


public class Generica<T> {


    public static void genericUn(Telefon T){

        T.trucar();
    }

    public static void genericDos(Smartphone T){

        T.ferFotos();
    }

    public static void genericTres(Gondola T){

        T.cambiarCable();
    }

}
