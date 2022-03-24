public class Main {
    public static void main(String[] args){
        //partie des testes:
        CompteR cmpt=new CompteR(12.3f,23,14.3f);
        Banque banque = new Banque("rue zarqtoni ,Berkane",1000000);
        System.out.println(cmpt);
        System.out.println(banque);
        Directeur ahmed = new Directeur("ajjalti","ahmed",20000f,banque);
        System.out.println(ahmed);
        Agence agence = new Agence("agence-elwalfa","berkane, maroc");
        Employe employer = new Employe("dahmani","rabie","12/2/2022");
        Client client =new Client("ayadi","oussama",agence,employer);
        System.out.println(client);

    }
}
