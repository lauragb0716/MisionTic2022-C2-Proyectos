package co.edu.utp.misiontic2022.lgutierrez.modelo;

public abstract class Ficha {

    private Color color;
    private Casilla origen;
    
    public Ficha(Color color, Casilla origen){
        this.color = color;
        this.origen = origen;
    }
    public Ficha(Color color){
        this(color, null);
    }

    public Boolean comer(){
        //TODO: Falta implementar este método
        return true;
    }

    public abstract Boolean mover(Casilla destino);

    public Color getColor(){
        return color;
    }

    public Casilla getOrigen(){
        return origen;
    }
}
