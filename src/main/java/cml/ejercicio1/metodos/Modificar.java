package cml.ejercicio1.metodos;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import cml.ejercicio1.entidad.Paciente;

public class Modificar {

	public void modificar() {
		InputStream is = null;
		FileWriter writer = null;
		int i;
		String c;
		StringBuilder builder = new StringBuilder();
				
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		Scanner in = new Scanner(System.in);  
        System.out.print("--------Ingrese el Rut del paciente--------");  
        String rut = in.next();
        System.out.print("Rut: " + rut);
        
        try {
        	is = new FileInputStream("./listaPacientes.txt");
            
			while((i = is.read())!=-1) {
				builder.append((char)i);
			}
			String listaP = builder.toString();
			boolean existe = listaP.contains(rut);
			if(existe) {
				
			}else {
				System.out.println("El paciente no está registrado");
			}
        	
        }catch(Exception e) {
			e.printStackTrace();
		//}finally {
		//	if(is!=null)
		//		is.close();
		}
	}
}
