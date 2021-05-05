public class Client extends Persoana{

    private String genC;
    private String problemaC;

    Client ( String nume, int varsta, String genClient, String problemaClient){

        this.nume = nume;
        this.varsta = varsta;
        this.genC = genClient;
        this.problemaC = problemaClient;

    }

    public String getProblemaClient(){

        return problemaC;

    }

    public String toString(){

        return ( nume + " " + varsta + " " + genC + " " + problemaC);

    }

}
