import java.util.*;

public class Servicii {
    private List<Medic> chirurgi;
    private List<Medic> dentisti;
    private List<Medic> oftalmologi;
    private List<Medic> radiologi;
    private List<Spital> spitale;


    Servicii()
    {
        chirurgi = new ArrayList<Medic>();
        dentisti = new ArrayList<Medic>();
        oftalmologi = new ArrayList<Medic>();
        radiologi = new ArrayList<Medic>();
        spitale = new ArrayList<Spital>();
    }

    Medic AdaugaClient(Client client, Medic medic)
    {
        if(medic == null)
        {
            String problema = client.getProblemaClient();
            if(problema.equals("chirurgie"))
            {
                Random rand = new Random();
                int rand_int=rand.nextInt(chirurgi.size());
                chirurgi.get(rand_int).adaugaPacientiMedicului(client);
                return chirurgi.get(rand_int);
            }
            if(problema.equals("dentist"))
            {
                Random rand = new Random();
                int rand_int=rand.nextInt(dentisti.size());
                dentisti.get(rand_int).adaugaPacientiMedicului(client);
                return dentisti.get(rand_int);
            }
            if(problema.equals("oftalmolog"))
            {
                Random rand = new Random();
                int rand_int=rand.nextInt(oftalmologi.size());
                oftalmologi.get(rand_int).adaugaPacientiMedicului(client);
                return oftalmologi.get(rand_int);
            }
            if(problema.equals("radiolog"))
            {
                Random rand = new Random();
                int rand_int=rand.nextInt(radiologi.size());
                radiologi.get(rand_int).adaugaPacientiMedicului(client);
                return radiologi.get(rand_int);
            }

        }
        else
            medic.adaugaPacientiMedicului(client);
        return medic;
    }


    void adaugaMedic(Medic medic){
        if(medic.getSpecialitateMedic().equals("chirurg"))
            chirurgi.add(medic);
        if(medic.getSpecialitateMedic().equals("dentist"))
            dentisti.add(medic);
        if(medic.getSpecialitateMedic().equals("oftalmolog"))
            oftalmologi.add(medic);
        if(medic.getSpecialitateMedic().equals("radiolog"))
            radiologi.add(medic);
        
    }
}
