package co.edu.utp.misiontic2022.lgutierrez.modelo;

public class Empleado extends Persona {

    private Double sueldoBruto;

    public Empleado(String nombre, Integer edad) {
        this(nombre, edad, SUELDO_POR_DEFECTO);
    }
    
    public Empleado(String nombre, Integer edad, Double sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public void mostrar() {
        System.out.printf("El empleado de nombre %s tiene %d años y un sueldo de $%,.2f %n", super.getNombre(), super.getEdad(), sueldoBruto);
    }

    public Double calcularSalarioNeto(){
        Double porcentajeSalud = 4d;
        Double porcentaje = 4d;
        return getSueldoBruto();
    }

    public Double getSueldoBruto(){
        return sueldoBruto;
    }

    public void setSueldoBruto(Double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
   
}
