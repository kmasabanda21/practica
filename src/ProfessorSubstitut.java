import java.util.Date;

public class ProfessorSubstitut extends  Professor {
    private Date dataInici;
    private Date dataFi;

    public void ProfessorSubstitut(){}

    public void posarDataInicial(Date dataInici){
        this.dataInici = dataInici;
    }
    public void posarDataFi (Date dataFi) {
        this.dataFi = dataFi;
    }

    public String obtenirDades(){
        return super.obtenirDades();
    }

}
