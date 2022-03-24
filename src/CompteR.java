public class CompteR extends Compte{
    private float taux;
    public CompteR(float solde,int numero,float taux){
        super(solde, numero);
        this.taux=taux;
    }

    public float getTaux() {
        return taux;
    }

    public void setTaux(float taux) {
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() +"\n"+"taux :"+taux;
    }
}
