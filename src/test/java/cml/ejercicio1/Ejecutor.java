package cml.ejercicio1;

import java.util.Scanner;
import cml.ejercicio1.metodos.Opciones;

public class Ejecutor {

	public static void main(String[] args) {
		Opciones options = new Opciones();	
		Scanner in = new Scanner(System.in);  
		
        System.out.print("--------Elija una de las siguientes opciones:--------");
        System.out.println("1 - Añadir Paciente");
        System.out.println("2 - Modificar Paciente");
        System.out.println("3 - Eliminar Paciente");
        
        String n = in.next();
        in.close();
        
        options.opcion(n);       
	}
}
