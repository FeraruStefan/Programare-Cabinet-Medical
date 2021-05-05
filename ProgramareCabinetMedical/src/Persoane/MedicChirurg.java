


public class MedicChirurg extends Medic{

    protected int familiiAtribuite;
    public String spital;
    private int rataDeSuccesOperatii;
    

    MedicChirurg()
    {
        this.familiiAtribuite=0;
        this.spital="";
        this.rataDeSuccesOperatii=0;
    }

    MedicChirurg(String nume, int varsta, String specialitateMedic, int rataDeSuccesOperatii, String spital, int aniExperienta){

        this.nume = nume;
        this.varsta = varsta;
        this.specialitateMedic = specialitateMedic;
        this.rataDeSuccesOperatii = rataDeSuccesOperatii;
        this.spitalApartinator = spital;
        this.aniExperienta = aniExperienta;

    }
    public String getvarsta()
    {
        return varsta;
    }

    
}