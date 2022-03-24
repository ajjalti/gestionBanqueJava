public class Banque {
    private String directeur;
    private String adress;
    private int capital;

    public Banque(){}
    public Banque(String adress,int capital){
        this.adress=adress;
        this.capital=capital;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getDirecteur() {
        if(directeur==null){
            return "la banque n'a pas de directeur actuellement !";
        }
        return directeur;
    }

    public void setDirecteur(String directeur) {
        this.directeur = directeur;
    }

    @Override
    public String toString() {
        return "directeur = " + this.getDirecteur() + '\n' +
                "adress = " + this.getAdress() + '\n' +
                "capital = " + this.getCapital();
    }
}
