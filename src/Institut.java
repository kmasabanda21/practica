import java.util.ArrayList;

public class Institut {
    private String nom;
    //public ArrayList <Persona> profe;
    private String profe;
    private String estudiant;

    public Institut(){
    }

    public void afegirProfe(String profe) {
        this.profe = profe;

    }
    public void afegirEstudiant(String estudiant){
        this.estudiant = estudiant;
    }


    public String imprimirInformacio(){
        return "El Professor es diu " + this.profe  +" i el alumne es diu "+  this.estudiant;
    }
}
