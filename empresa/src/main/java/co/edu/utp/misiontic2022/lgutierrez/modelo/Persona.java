package co.edu.utp.misiontic2022.lgutierrez.modelo;

public abstract class Persona implements Comparable<Persona>{

    protected static final Double SUELDO_POR_DEFECTO = 1_000_000D;
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void mostrar();

    //Getter: Ayuda a obtener un valor de los objetos.
    public String getNombre(){
        return nombre;
    }

    public Integer getEdad(){
        return edad;
    }

    //Setter: 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Persona persona) {
        var comparado = getNombre().compareTo(persona.getNombre());
        if (comparado != 0) {
            return comparado;
        }
        return getEdad().compareTo(persona.getEdad());
    
        
    }
}
