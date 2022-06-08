package n1exercici2;

import java.lang.reflect.Field;
import java.util.*;

public class GenericMethods<T> {

    public GenericMethods() {
        super();
    }


    @SafeVarargs
    public final void acceptArguments(T... parameters) {

        System.out.printf("\n%-10s │ %-20s │ %s\n%s","Tipo","Valor","Nom. variable",
        "¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        Iterator<Field> loop = Arrays.stream(N1exercici2.class.getFields()).iterator();
        List<String> listNameVariables = new ArrayList<>();

        while (loop.hasNext()) {
           listNameVariables.add(loop.next().getName());
        }

        int i = 0;
        for (T parameter : parameters) {

            System.out.printf("\n%-10s │ %-20s │ %s",
                    parameter.getClass().getSimpleName(),
                    parameter,
                    listNameVariables.get(i)
            );
            i++;
        }
        System.out.println();

    }

}
