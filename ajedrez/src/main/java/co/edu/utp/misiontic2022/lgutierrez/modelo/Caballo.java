package co.edu.utp.misiontic2022.lgutierrez.modelo;

public class Caballo extends Ficha{

    public Caballo(Color color) {
        super(color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public Boolean mover(Casilla destino) {
        // TODO: Falta implementar como se mueve rl caballo
        
        return true;
    }
    
    @Override
    public String toString() {
        return "C"+ (getColor() == Color.BLANCO ? "B" : "N");
    }
}
