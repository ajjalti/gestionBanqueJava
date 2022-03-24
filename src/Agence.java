import java.util.ArrayList;

public class Agence {
    private ArrayList<Client> listeClients = new ArrayList<Client>();
    private ArrayList<Employe> listeEmploye = new ArrayList<Employe>();
    private String adressAgence ;
    private String nomAgence;
    public Agence(){}
    public Agence(String nomAgence,String adressAgence){
        this.adressAgence=adressAgence;
        this.nomAgence=nomAgence;
    }

    public ArrayList<Client> getListeClients() {
        return listeClients;
    }

    public ArrayList<Employe> getListeEmploye() {
        return listeEmploye;
    }
    public void addEmployer(Employe employer){
        this.listeEmploye.add(employer);
    }
    public void addClient(Client client){
        this.listeClients.add(client);
    }

    public String getAdressAgence() {
        return adressAgence;
    }

    public String getNomAgence() {
        return nomAgence;
    }

    public void setAdressAgence(String adressAgence) {
        this.adressAgence = adressAgence;
    }

    public void setNomAgence(String nomAgence) {
        this.nomAgence = nomAgence;
    }

    @Override
    public String toString() {
        return "listeClients = " + listeClients +
                "listeEmploye = " + listeEmploye +
                "adressAgence = " + adressAgence +
                "nomAgence = " + nomAgence
                ;
    }
}
