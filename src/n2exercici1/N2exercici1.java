package n2exercici1;

public class N2exercici1 {

    public static double preu = 230.0;
    public static String festival = "Primavera Sound";
    public static Persona persona = new Persona("Rajoy");
    public static int telefono = 652214478;

    public static void main(String[] args) {


        GenericMethods<Object> genericMethods = new GenericMethods<Object>();

        genericMethods.acceptArguments("HOLA", preu,festival,persona,telefono);
        // Gives Error if the new parameters doesn't match with the type of arguments
       // genericMethods.acceptArguments( preu,"HOLA",festival,persona,telefono);


    }
}
