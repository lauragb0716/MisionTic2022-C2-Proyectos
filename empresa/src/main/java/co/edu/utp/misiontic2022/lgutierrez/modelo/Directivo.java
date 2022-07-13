package co.edu.utp.misiontic2022.lgutierrez.modelo;

import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado{

    private static final String CATEGORIA_POR_DEFECTO = "No asignado";
    private String categoria;
    private List<Empleado> subordinados;

    public Directivo(String nombre, Integer edad) {
        this(nombre, edad, SUELDO_POR_DEFECTO);
    }

    public Directivo(String nombre, Integer edad, Double sueldoBruto) {
        this(nombre, edad, sueldoBruto, CATEGORIA_POR_DEFECTO);
    }

    public Directivo(String nombre, Integer edad, String categoria) {
        this(nombre, edad, 0d, categoria);
    }


    public Directivo(String nombre, Integer edad, Double sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;

        this.subordinados = new ArrayList<>();
    }  

    public void agregarSubordinado(Empleado empleado){
        subordinados.add(empleado);
    }

    @Override
    public void mostrar() {
        System.out.printf("El directivo de nombre %s tiene %d años y un sueldo de %,.2f y su categoria es %s %n", super.getNombre(), super.getEdad(), super.getSueldoBruto(), categoria);
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Empleado> getSubordinados() {
        return subordinados;
    }    
}
