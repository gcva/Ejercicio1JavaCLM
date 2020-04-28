package cml.ejercicio1.metodos;

public class Opciones {
		
	public void opcion(String opc) {
		Agregar agr = new Agregar();
		Modificar mod = new Modificar();
		Eliminar elim = new Eliminar();
		
		switch(opc){
		case "1":
			agr.agregar();
			break;
		case "2":
			mod.modificar();
			break;
		case "3":
			elim.eliminar();
			break;
		}
	}
}
