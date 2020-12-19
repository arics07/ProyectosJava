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
		
		String respuesta = "SI";
		int totalParticipantes = 0;
		
		while (respuesta.toUpperCase().equals("SI")) {
			try {
				System.out.println("¿Cuántos participantes va a ingresar? ");
				int cantidadDeParticipantesAIngresar = sc.nextInt();
				System.out.println("Cantidad de participantes: " + cantidadDeParticipantesAIngresar);
				totalParticipantes = totalParticipantes + cantidadDeParticipantesAIngresar;
				sc.nextLine();
		
				cargar.cargarVariosParticipantes(participantes, cantidadDeParticipantesAIngresar);
			
				System.out.println("Querés agregar más participantes? \n Ingresá SI o NO ");
				respuesta = sc.nextLine();
			} catch (Exception e) {
				System.out.println("Ingresá el número de participantes que vas a agregar ");
				sc.nextLine();

			}
			
		}

		System.out.println("CANTIDAD TOTAL DE PARTICIPANTES: " + totalParticipantes);		
		System.out.println("---------- Se viene el sorteo!! ---------- ");
		System.out.println("---------- GANADOR/A ---------- ");
		Participante ganadorx = sorteo.elegirGanador(participantes);
		System.out.println(ganadorx.getNombre() + " " + ganadorx.getApellido() + "\n" + ganadorx.getDni() + "\n" + "Número de inscripción: " + ganadorx.getNumInscripto());
		sc.close();
	}

}
