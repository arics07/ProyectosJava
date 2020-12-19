package interfaces;

import java.util.List;

import models.Participante;

public interface ICargarParticipantes {
	
	void cargarParticipante(List<Participante> participantes);
	
	void cargarVariosParticipantes(List<Participante> participantes, int cantidadDeParticipantes);

}
