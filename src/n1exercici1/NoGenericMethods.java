package n1exercici1;

public class NoGenericMethods {

    private Festival festival1;
    private Festival festival2;
    private Festival festival3;

    //Constructor
    public NoGenericMethods(Festival f1, Festival f2, Festival f3) {
        super();
        this.festival1 = f1;
        this.festival2 = f2;
        this.festival3 = f3;
    }

    //Getters and Setters
    public Festival getFestival1() {
        return festival1;
    }

    public void setFestival1(Festival festival1) {
        this.festival1 = festival1;
    }

    public Festival getFestival2() {
        return festival2;
    }

    public void setFestival2(Festival festival2) {
        this.festival2 = festival2;
    }

    public Festival getFestival3() {
        return festival3;
    }

    public void setFestival3(Festival festival3) {
        this.festival3 = festival3;
    }

    @Override
    public String toString() {
        return
                "\n Festival 1 : " + festival1 +
                "\n Festival 2 : " + festival2 +
                "\n Festival 3 : " + festival3;
    }
}
