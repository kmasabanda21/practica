public class Estudiant extends Persona {
    //clase extendida de Persona

    private double nota;

    public Estudiant(){


    }
    public void posarNota (double nota){
        this.nota = nota;

    }
    public String obtenirDades(){
        //datos de persona mas nota
        return super.obtenirDades() + " que te nota " + this.nota;

    }

}
