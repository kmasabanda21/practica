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
    public void assignarDni(String dni) throws Exception{

        if(this.dni == null){
            this.dni = dni;
        } else{
            throw new Exception("Error DNI");
        }

    }

    public String obtenirDades() throws Exception{
        if(this.dni == null || this.nom == null ){
            throw new Exception ("Sense DNI o Nom");
        }else {
           return "Persona que es diu " + this.nom + " amb dni " + this.dni;
        }
    }
}
