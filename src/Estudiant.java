public class Estudiant extends Persona {
    //clase extendida de Persona

    private double nota;

    public Estudiant(){


    }
    public void posarNota (double nota) throws Exception{
        this.nota = nota;
        if(nota >10) {
            throw new Exception("Nota invalida");

        } else if (nota <0 ) {
            throw new Exception("Nota invalida");
        }

    }
    public String obtenirDades(){
        //datos de persona mas nota
        return super.obtenirDades() + " que te nota " + this.nota;

    }

}
