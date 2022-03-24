public class Directeur extends Personne {
    private float revenu;
    private Banque banque;
    public Directeur(){}
    public Directeur(String nom,String prenom,float revenu,Banque banque){
        super(nom,prenom);
        this.revenu=revenu;
        this.banque=banque;
        banque.setDirecteur(nom+" "+prenom);
    }

    public float getRevenu() {
        return revenu;
    }

    public void setRevenu(float revenu) {
        this.revenu = revenu;
    }

    @Override
    public String toString() {
        return super.toString()+
                "revenu = " + revenu +"\n"+
                "lien de travail = " + banque.getAdress();
    }
}
