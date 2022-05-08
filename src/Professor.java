public class Professor extends Persona {
    public double sou;

    public void canviarSou( double nouSou) throws Exception{
        if (nouSou > 3000.0) {
            throw new Exception("El sou no compleix els parametres");
        } else if (nouSou < 0) {
            throw new Exception("El sou ha de complir els requisits");
        } else{
            this.sou =nouSou;
        }



    }

    public String obtenirDades() throws Exception {
        return super.obtenirDades() + "(Profe amb sou: " + this.sou + ")";
    }

}
