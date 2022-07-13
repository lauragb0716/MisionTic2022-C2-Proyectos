package co.edu.utp.misiontic2022.lgutierrez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import co.edu.utp.misiontic2022.lgutierrez.modelo.Cliente;
import co.edu.utp.misiontic2022.lgutierrez.modelo.Directivo;
import co.edu.utp.misiontic2022.lgutierrez.modelo.Empleado;
import co.edu.utp.misiontic2022.lgutierrez.modelo.Empresa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Empleado empleado1 = new Empleado("Laura", 28);
        empleado1.setSueldoBruto(3_000_000d);

        Cliente cliente1 = new Cliente("Maria", 30, "3105555123");

        Directivo directivo1 = new Directivo("Juan Silva", 25);
        directivo1.setCategoria("Jefe de Desarrollo");

        Directivo directivo2 = new Directivo("Jhon Betancourt", 32);

        Empleado empleado2 = new Empleado("Gustavo Briceño", 30);
        Empleado empleado3 = new Empleado("Ivan R.", 25);

        //Opcion1
        var empleados = new TreeSet<Empleado>();
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(directivo1);
        empleados.add(directivo2);

        //Opcion2 con arrays
        //var empleados = ArraCys.asList(empleado1, empleado2, empleado3, directivo1, directivo2);

        var empresa = new Empresa("Grupo 69", empleados);
        empresa.agregarCliente(cliente1);

        directivo1.agregarSubordinado(empleado1);
        directivo1.agregarSubordinado(empleado2);
        directivo1.agregarSubordinado(empleado3);
        

        //Imprimir
        System.out.printf("La empresa %s tiene los siguientes empleados: %n", empresa.getNombre());
        empresa.getEmpleados().forEach((empleado) -> {
            empleado.mostrar();
            if (empleado instanceof Directivo){
                System.out.println("Y sus subordinados son: " +
                ((Directivo) empleado).getSubordinados()
                .stream()
                .map((subordinado) -> subordinado.getNombre())
                .reduce((a, b) -> a + ", " + b)
                .orElse("Sin subordinados"));
            }
        });
        
        System.out.println("");
        System.out.println("Y sus clientes son:");
        empresa.getClientes().forEach(cliente -> cliente.mostrar());
        /*for (Empleado empleado : empresa.getEmpleados()) {
            empleado.mostrar();

            if (empleado instanceof Directivo) {
                Directivo directivo = (Directivo) empleado;
                System.out.print("Y sus subordinados son: ");
                Boolean imprimirSubordinado = false;
                for (Empleado subordinados : directivo.getSubordinados()) {
                    if (subordinados == null) {
                        break;
                    }
                    if(imprimirSubordinado){
                        System.out.print(", ");
                    }
                    System.out.print(subordinados.getNombre()) ;
                    imprimirSubordinado = true;
                }
                System.out.println();
            }
        }
        System.out.println("Y sus clientes son:");
        for (Cliente cliente : empresa.getClientes()) {
            if (cliente == null) {
                break;
            }
            System.out.println(cliente.getNombre());
        }*/
    }
}
