public class Persona {
    //atributos siempre privados
    private String  nom;
    private String dni;

    // funciones publicas o privadas

    public Persona () {
        //constructores
        // System out
    }
    public void canviarNom(String nom){
        this.nom = nom;

    }
    // Funcion retornar el nom i dni
    public String obtenirDades (){
        return "Persona que es diu " + this.nom;
    }
}
