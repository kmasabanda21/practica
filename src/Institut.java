import java.util.ArrayList;
import java.util.List;

public class Institut {
    private String nom;
    private String profe;
    private String  estudiant;
    public Institut(String nom){
    this.nom = nom;
    System.out.println(nom);

    }
    // Codigo que no hace falta
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
