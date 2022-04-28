import java.lang.reflect.Array;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {


        Persona p1 = new Persona(); //instancia
        Persona p2 = new Persona();

        p1.canviarNom("Marc");
        String dades = p1.obtenirDades();
        System.out.println(dades);

        p1.canviarNom("Albert");
        dades= p1.obtenirDades();
        System.out.println(dades);

        Estudiant e = new Estudiant();
        e.posarNota(2);
        // e.posarNota(-2);
        e.canviarNom("Manuel");
        dades = e.obtenirDades();
        System.out.println(dades);

        Institut i = new Institut();
        i.afegirProfe("kenneth");
        i.afegirEstudiant();
        dades = i.imprimirInformacio();
        System.out.println(dades);

        Professor p = new Professor();
        p.canviarSou(2000);
        //p.canviarSou(-2000);
        //p.canviarSou(6000);
        p.canviarNom("Professor");
        dades = p.obtenirDades();
        System.out.println(dades);

        ProfessorSubstitut ps = new ProfessorSubstitut();
        Date dataInici = new Date(2021, 11, 1);
        Date dataFi = new Date(2022, 6, 30);
        ps.assignarSubstitucio(dataInici ,dataFi);
        ps.obtenirDades();
        dades = ps.obtenirDades();
        System.out.println(dades);







    }
}
