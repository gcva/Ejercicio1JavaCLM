package cml.ejercicio1.metodos;
import cml.ejercicio1.entidad.Paciente;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Agregar {
	
	public static void main(String[] args) {
		Agregar.agregar();
	}

	public static void agregar(){
		InputStream is = null;
		FileWriter writer = null;
		int i;
		String c;
		StringBuilder builder = new StringBuilder();
				
		ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
		
		Scanner in = new Scanner(System.in);  
        System.out.println("--------Ingrese el Rut del paciente--------");  
        String rut = in.next();
        System.out.println("Rut: " + rut);
		
		try {
			is = new FileInputStream("./listaPacientes.txt");
      
			while((i = is.read())!=-1) {
				builder.append((char)i);
			}
			String listaP = builder.toString();
			boolean existe = listaP.contains(rut);
			if(existe) {
				System.out.println("El paciente ya se encuentra ingresado");
			}else {
				FileWriter fw = new FileWriter("./listaPacientes.txt"); 
								
				System.out.println("--------Ingrese el nombre del paciente--------");
		        String nombre = in.next();
		        System.out.println("Nombre: " + nombre);
		        
				System.out.println("--------Ingrese el apellido del paciente--------");
		        String apellido = in.next();
		        System.out.println("Apellido: " + apellido);
		        
				System.out.println("--------Ingrese la edad del paciente--------");
		        String edadS = in.next();
		        System.out.println("Edad: " + edadS);
		        int edad = Integer.parseInt(edadS);
		        
		        
				System.out.println("--------Ingrese si el paciente tiene el COVID (V/F)--------");
		        String boolCovid = in.next();
		        System.out.println("Estado Covid: " + boolCovid);
		        boolean estadoCovid = false;
		        if(boolCovid == "V" || boolCovid == "v") {
		        	estadoCovid = true;
		        }else if(boolCovid == "F" || boolCovid == "f"){
		        	estadoCovid = false;
		        }
		        
				System.out.println("--------Ingrese la fecha de contagio--------");
		        String fecha = in.next();
		        System.out.println("Fecha de contagio: " + fecha);
		        Date fechaDeContagio = new SimpleDateFormat("dd/MM/YYYY").parse(fecha);
		        
		        Paciente p = new Paciente(rut, nombre, apellido, edad, estadoCovid, fechaDeContagio);
		        pacientes.add(p);
		        
		        //writer.write(p.toString()+"\n");
		        writer.write(rut+nombre+apellido+edadS+boolCovid+fecha+"\n");
		        fw.close();	      
		        writer.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		//}finally {
		//	if(is!=null)
		//		is.close();
		}
	}
}
