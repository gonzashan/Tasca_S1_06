package n2exercici2;

import java.util.*;

public class N2exercici2 {

    public static double preu = 230.0;
    public static String festival = "Primavera Sound";
    public static Persona persona = new Persona("Rajoy");
    public static int telefono = 652214478;

    public static void main(String[] args) {

        GenericMethods<Object> genericMethods = new GenericMethods<Object>();

        List<Persona> personaList = new ArrayList<>(List.of(
                new Persona("Rafa"),
                new Persona("Djokovic"),
                new Persona("Carlitos")
        ));

        HashSet<Boolean> booleanHashSet = new HashSet<>(List.of(
                true, false
        ));

        TreeMap<Object,Object> mapeando = new TreeMap<Object, Object>();
        mapeando.put("Melón",  new Persona("LLuis"));
        mapeando.put("Nabos",  new Persona("Pablo"));
        mapeando.put("Acelga", new Persona("Anna"));
        mapeando.put("Berza",  new Persona("Helena"));


        // sending List<Persona>
        genericMethods.acceptArguments(Collections.singleton(personaList));
        // Sending HashSet<Boolean>
        genericMethods.acceptArguments(Collections.singleton(booleanHashSet));
        // Sending TreeMap<Object,Object>
        genericMethods.acceptArguments(Collections.singleton(mapeando));

    }
}
