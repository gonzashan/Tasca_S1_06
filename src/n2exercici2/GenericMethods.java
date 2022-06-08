package n2exercici2;

import java.util.*;

public class GenericMethods<T> {

    public GenericMethods() {
        super();
    }


    public final void acceptArguments(Collection<T> listFromMain) {

        Iterator<T> iterable = listFromMain.stream().iterator();

        while (iterable.hasNext()) {

            System.out.println(iterable.next());

        }

    }

}
