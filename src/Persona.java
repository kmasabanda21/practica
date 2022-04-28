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
        this.dni = dni;
        if(dni == null){
            throw new Exception("sense dni");

        }
    }

    public String obtenirDades (){
        return "Persona que es diu " + this.nom +" amb dni " + this.dni;
    }
}
