package n1exercici2;

public class Persona {

    private String nom;
    private String cognom;
    private byte edat;

    public Persona(String nom) {
        super();
        this.nom = nom;
    }

    //Getters
    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public byte getEdat() {
        return edat;
    }

    //Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setEdat(byte edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return nom;
    }
}
