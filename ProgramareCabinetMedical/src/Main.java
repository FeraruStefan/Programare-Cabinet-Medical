import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Servicii servicii = new Servicii();
        
        
        while(true){
            Scanner sc = new Scanner(System.in);
            String command = sc.nextLine();
            if(command.equals("exit"))
                break;
            if(command.equals("Adauga medic")){
                System.out.println("Nume= ");
                String nume = sc.nextLine();
                System.out.println("Varsta= ");
                int varsta = sc.nextInt();
                sc.nextLine();
                System.out.println("Specialitate= ");
                String specialitate = sc.nextLine();
                Medic new_med= null;
                if(specialitate.equals("chirurg"))
                {
                    System.out.println("Rata de succes a operatiilor :");
                    int RataSucces = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Spital : ");
                    String spital = sc.nextLine();
                    System.out.println("Ani experienta : ");
                    int ani = sc.nextInt();
                    MedicChirurg new_medc = new MedicChirurg(nume,varsta,specialitate,RataSucces,spital,ani );
                    
                    
                }
                if(specialitate.equals("dentist"))
                {
                    System.out.println("Clienti : ");
                    String clienti = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Spital : ");
                    String spital = sc.nextLine();
                    System.out.println("Ani experienta : ");
                    int ani = sc.nextInt();
                    MedicDentist new_medd = new MedicDentist(nume,varsta,specialitate,clienti,spital,ani );

                }
                System.out.println("Nu exista");
                
                servicii.adaugaMedic(new_med);
            }
            
        }

    }
}
