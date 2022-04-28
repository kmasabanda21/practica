public class Professor extends Persona {
    private double sou;

    public void canviarSou( double sou) throws Exception{

        if (sou >= 3000) {
            throw new Exception("Error");
        } else if (sou < 0) {
            throw new Exception("peor error");
        }

        this.sou = sou;


    }

    public String obtenirDades(){
        return super.obtenirDades() + " amb nou sou " + this.sou;
    }

}
