public class ProfessorSubstitut extends  Professor {
    private String dataInici;
    private String dataFi;



    public void assignarSubstitucio (){
    this.dataFi = dataFi;
    this.dataInici = dataInici;

    }

    public String obtenirDades(){
        return super.obtenirDades();
    }

}
