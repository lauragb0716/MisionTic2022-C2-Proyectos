package co.edu.utp.misiontic2022.lgutierrez.modelo;

public class Alfil extends Ficha{

    public Alfil(Color color) {
        super(color);
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar como se mueve el Alfil

        return true;
        
    }

    @Override
    public String toString() {
        return "A"+ (getColor() == Color.BLANCO ? "B" : "N");
    }
}
