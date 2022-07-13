package co.edu.utp.misiontic2022.lgutierrez.modelo;

import java.util.Set;
import java.util.TreeSet;

public class Empresa {
    private String nombre;
    private Set<Cliente> clientes;
    private Set<Empleado> empleados;
    
    public Empresa(String nombre, Set<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;

        this.clientes = new TreeSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public Set<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente){
        clientes.remove(cliente);
        
        /*var pos = this.clientes.indexOf(cliente);
        if (pos != -1) {
            clientes.remove(pos);
        } else{
            throw new RuntimeException("El cliente no pertenece a esta empresa");
        }*/
    }
}
