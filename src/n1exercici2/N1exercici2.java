package n1exercici2;

public class N1exercici2 {

    public static double preu = 230.0;
    public static String festival = "Primavera Sound";
    public static Persona persona = new Persona("Rajoy");
    public static int telefono = 652214478;

    public static void main(String[] args) {


        GenericMethods<Object> genericMethods = new GenericMethods<Object>();

        genericMethods.acceptArguments(preu,festival,persona,telefono);

    }
}
