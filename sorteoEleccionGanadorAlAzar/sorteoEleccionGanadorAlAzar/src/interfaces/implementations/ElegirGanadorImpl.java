package interfaces.implementations;

import java.util.List;

import interfaces.IElegirGanador;
import models.Participante;

public class ElegirGanadorImpl implements IElegirGanador {

	@Override
	public Participante elegirGanador(List<Participante> participantes) {
		Integer numGanador = (Integer) (int) (Math.random()*participantes.size());
		return participantes.get(numGanador);
	}

}
