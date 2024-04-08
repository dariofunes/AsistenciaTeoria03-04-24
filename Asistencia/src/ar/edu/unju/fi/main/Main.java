package ar.edu.unju.fi.main;

import java.util.Scanner;
import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {
	
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el legajo: ");
		Integer legajo = sc.nextInt();
		System.out.println("Ingrese el apellido: ");
		String apellido = sc.next();
		System.out.println("Ingrese el nombre: ");
		String nombre = sc.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner sc = new Scanner(System.in);
		while(numMaterias>0) {
			//cargar materias
			System.out.println("Ingrese el codigo de la materia: ");
			String codigoMateria = sc.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = sc.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo del registro de nota: ");
			String codigoNota = sc.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = sc.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			numMaterias--;
		}
		sc.close();
	}

	public static void main(String[] args) {
		
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 2);
	}

}
