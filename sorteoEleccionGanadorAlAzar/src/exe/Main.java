package exe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.ICargarParticipantes;
import interfaces.IElegirGanador;
import interfaces.implementations.CargarParticipantesImpl;
import interfaces.implementations.ElegirGanadorImpl;
import models.Participante;

public class Main {

	public static void main(String[] args) {
		List<Participante> participantes = new ArrayList<Participante>();
		ICargarParticipantes cargar = new CargarParticipantesImpl();
		IElegirGanador sorteo = new ElegirGanadorImpl();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el número de participantes: ");
		int cantidadDeParticipantes = sc.nextInt();
		System.out.println("Cantidad de participantes: " + cantidadDeParticipantes);
		sc.nextLine();
//		sc.close();
		
		cargar.cargarVariosParticipantes(participantes, cantidadDeParticipantes);
		
		System.out.println("---------- Se viene el sorteo!! ---------- ");
		System.out.println("---------- GANADOR/A ---------- ");
		Participante ganadorx = sorteo.elegirGanador(participantes);
		System.out.println(ganadorx.getNombre() + " " + ganadorx.getApellido() + "\n" + ganadorx.getDni());
		sc.close();
	}

}
