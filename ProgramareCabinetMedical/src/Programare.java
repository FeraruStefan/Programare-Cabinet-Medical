
public class Programare {
    private String data;
    private String ora;
    private String nume;
    private String spital;
    private String problema;
    private String medic;

    Programare()
    {
        this.ora="";
        this.nume="";
        this.spital="";
        this.problema="";
        this.medic="";
    }
    Programare(String ora, String nume, String spital, String problema, String medic)
    {
        this.ora=ora;
        this.nume=nume;
        this.spital=spital;
        this.problema=problema;
        this.medic=medic;
    }

}
