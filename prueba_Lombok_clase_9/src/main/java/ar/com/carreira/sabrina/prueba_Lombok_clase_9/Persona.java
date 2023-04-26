package ar.com.carreira.sabrina.prueba_Lombok_clase_9;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Persona {
	public String nombre;
	public String apellido;
	public String fechaNacimiento;

}
