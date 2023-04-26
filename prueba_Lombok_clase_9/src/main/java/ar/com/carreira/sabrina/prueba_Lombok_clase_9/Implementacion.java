package ar.com.carreira.sabrina.prueba_Lombok_clase_9;

import java.util.Scanner;
import java.util.ArrayList;

public class Implementacion {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Las intancias de la clase Persona se guardaran en una
		//ArrayList
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		//Mientras el usuario así lo desee podrá seguir
		//ingresando datos de personas
		String continuar = ""; //s para seguir, n para terminar
		
		do {
			personas.add(entradaDeDatos(entrada));
			System.out.println("Ingrese s para continuar o n para"
					+ " terminar la carga de datos");
			continuar = entrada.nextLine();
			
		}while(continuar.equals("s") || continuar.equals("S"));
		
		//Imprimir la lista de personas
		System.out.println("Se imprimiran las personas ingresadas");
		for(Persona persona : personas) {
			System.out.println(persona.toString());
		}
		

	}//
	
	public static Persona entradaDeDatos(Scanner entrada) {

		Persona persona = null;
		
		String nombre ="";
		String apellido ="";
		String fechaNacimiento ="";
		
		
		System.out.println("Por favor ingresar nombre: ");
		nombre = entrada.nextLine();
		
		System.out.println("Por favor ingresar apellido: ");
		apellido=entrada.nextLine();
		
		System.out.println("Por favor ingresar fecha de nacimiento "
				+ "(dd/mm/aaaa): ");
		fechaNacimiento =entrada.nextLine();
		
		persona = new Persona(nombre,apellido,fechaNacimiento);
		
		return persona;
	}

}
