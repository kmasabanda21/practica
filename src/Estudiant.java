import java.util.ArrayList;
import java.util.List;

public class Estudiant extends Persona {
    //clase extendida de Persona

    private List<Double> notas = new ArrayList<Double>();

    private Double nota;
    public Estudiant(){
    }

    public double obtenirNotaGran(List<Double> notas){
        double notaMax = 0;
            for(Double n : this.notas) {
                if(n > notaMax){
                    notaMax = n;
                }
            }
            return notaMax;
    }

    public double obtenirNotaMin(List<Double> notas){
        double notaMin = 0;
            for(Double n : this.notas){
                if(n < notaMin){
                    notaMin = n;
                }
            }
            return notaMin;
    }

    public double obtenirNotaMed(List<Double> notas){
        double notaMed = 0;
        for(Double n : this.notas){
            notaMed += n;
        }
        notaMed = notaMed/this.notas.size();
        return notaMed;
    }


    public void posarNota (Double nota) throws Exception{
       // List usar de nota this.nota = nota;
        this.nota = nota;
        if(nota >10) {
            throw new Exception("Nota invalida");

        } else if (nota <0 ) {
            throw new Exception("Nota invalida");
        }

    }
    public String obtenirDades() throws Exception{
        return super.obtenirDades() + "(Estudiant amb nota: " + this.nota +", nota mes gran " +obtenirNotaGran(this.notas)+ ", nota minima "+ obtenirNotaMin(this.notas)+ " i mitjana de las notas es "+ obtenirNotaMed(this.notas)+ ")";

    }

}
