public abstract class Compte {
    private float solde;
    private int numero;

    public Compte(){}
    public Compte(float solde,int numero){
        this.solde=solde;
        this.numero=numero;
    }

    public float getSolde() {
        return solde;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "numero : "+numero+"\n"+
                "solde : "+solde;
    }
}
