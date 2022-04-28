public class Professor extends Persona {
    private double sou;

    public void canviarSou( double sou){
        this.sou = sou;

    }

    public String obtenirDades(){
        return super.obtenirDades() + " amb nou sou " + this.sou;
    }

}
