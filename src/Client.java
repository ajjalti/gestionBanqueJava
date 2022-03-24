import java.util.ArrayList;

public class Client extends Personne{
    private ArrayList<Compte> listeComptes = new ArrayList<Compte>();
    private Agence agence = new Agence();
    private Employe conseiller = new Employe();
    public Client(){}
    public Client(String nom,String prenom,Agence agence,Employe conseiller){
        super(nom,prenom);
        this.agence=agence;
        this.agence.addClient(this);
        this.conseiller=conseiller;
    }

    public Agence getAgence() {
        return agence;
    }

    public ArrayList<Compte> getListeComptes() {
        return listeComptes;
    }

    public Employe getConseiller() {
        return conseiller;
    }

    public void setConseiller(Employe conseiller) {
        this.conseiller = conseiller;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
    public void addCompte(Compte compte){
        this.listeComptes.add(compte);
    }

    @Override
    public String toString() {
        return "listeComptes = " + listeComptes +
                "\nadress d'agence = " + agence.getAdressAgence() +
                "\nconseiller = " + conseiller.getNom()+" "+conseiller.getPrenom();
    }
}
