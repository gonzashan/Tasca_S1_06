package n1exercici1;

public class N1exercici1 {

    public static void main(String[] args) {

        Festival festival1 = new Festival("PrimaveraSound");
        Festival festival2 = new Festival("Cruïlla");
        Festival festival3 = new Festival("VidaFestival");

        NoGenericMethods noGenericMethods
                = new NoGenericMethods(festival1,festival2,festival3);
        NoGenericMethods noGenericMethods1
                = new NoGenericMethods(festival3,festival1,festival2);

        System.out.println(noGenericMethods);
        System.out.println(noGenericMethods1);
    }
}
