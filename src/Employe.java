public class Employe extends Personne{
    private String dateDembauche;
    public Employe(){}
    public Employe(String nom,String prenom,String date){
        super(nom,prenom);
        this.dateDembauche=date;
    }

    public String getDateDembauche() {
        return dateDembauche;
    }

    public void setDateDembauche(String dateDembauche) {
        this.dateDembauche = dateDembauche;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+
                "dateDembauche='" + dateDembauche;
    }
}
