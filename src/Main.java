public class Main {
    public static void main(String[] args){
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
        e.canviarNom("Manuel");
        dades = e.obtenirDades();
        System.out.println(dades);

        Professor p = new Professor();
        p.canviarSou(2000);
        p.canviarNom("Professor");
        dades = p.obtenirDades();
        System.out.println(dades);

        ProfessorSubstitut ps = new ProfessorSubstitut();
        ps.assignarSubstitucio();
        dades = ps.obtenirDades();






    }
}
