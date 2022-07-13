package co.edu.utp.misiontic2022.lgutierrez.modelo;

public class Cliente extends Persona{

    private String telefono;

    public Cliente(String nombre, Integer edad) {
        this(nombre, edad, "No asignado");    
    }

    public Cliente(String nombre, Integer edad, String telefono) {
        super(nombre, edad);
        this.telefono = telefono;        
    }

    @Override
    public void mostrar() {
        System.out.printf("El cliente de nombre %s tiene %d años y su telefono es %s %n", super.getNombre(), super.getEdad(), telefono);
        
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
