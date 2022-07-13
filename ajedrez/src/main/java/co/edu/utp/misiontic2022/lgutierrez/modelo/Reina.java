package co.edu.utp.misiontic2022.lgutierrez.modelo;

public class Reina extends Ficha{
    
    public Reina(Color color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar como se mueve la reina

        return true;
    }

    @Override
    public String toString() {
        return "Q"+ (getColor() == Color.BLANCO ? "B" : "N");
    }
}
