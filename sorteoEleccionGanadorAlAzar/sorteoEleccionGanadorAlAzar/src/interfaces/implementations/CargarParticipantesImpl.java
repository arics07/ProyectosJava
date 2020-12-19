package interfaces.implementations;

import java.util.List;
import java.util.Scanner;
import interfaces.ICargarParticipantes;
import models.Participante;

public class CargarParticipantesImpl implements ICargarParticipantes {

	@Override
	public void cargarParticipante(List<Participante> participantes) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese el número de inscripto: ");
			Integer numInscripto = sc.nextInt();
			sc.nextLine();
			System.out.println("Ingrese el apellido: ");
			String apellido = sc.nextLine();
			System.out.println("Ingrese el nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Ingrese el mail: ");
			String mail = sc.nextLine();
			System.out.println("Ingrese el DNI: ");
			Integer dni = sc.nextInt();
			sc.nextLine();
			
			Participante participante = new Participante(numInscripto, nombre, apellido, dni, mail);
			System.out.println(participante.toString());
			participantes.add(participante);
			
		} catch (Exception e) {
			
			System.out.println("Los datos no se ingresaron correctamente.");
		
		}
		
	}

	@Override
	public void cargarVariosParticipantes(List<Participante> participantes, int cantidadDeParticipantes) {
		for (int i=0; i< cantidadDeParticipantes; i++) {
			cargarParticipante(participantes);
		}
		
	}
	
	

}
