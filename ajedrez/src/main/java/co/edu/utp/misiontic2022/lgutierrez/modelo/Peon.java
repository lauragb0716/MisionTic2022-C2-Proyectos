package co.edu.utp.misiontic2022.lgutierrez.modelo;

public class Peon extends Ficha{

    public Peon(Color color) {
        super(color);
    }

    private Boolean coronar(){
        return false;
    }

    @Override
    public Boolean comer() {
        // TODO: Falta implementar como come el peon
        return super.comer();
    }

    public Boolean comerAlPAso(){
        return false;
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar como se mueve el peon
        
        return true;
    }

    @Override
    public String toString() {
        return "P"+ (getColor() == Color.BLANCO ? "B" : "N");
    }
    
}
