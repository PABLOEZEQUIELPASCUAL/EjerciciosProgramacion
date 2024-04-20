package LuchadoresJaponesesPkb;

import java.util.Arrays;
import java.util.Objects;

public class Torneo {
	private Sumo sumos[];
	private int cantidadSumos;
	
	public Torneo(int cantidadParticipantes) {
		this.sumos = new Sumo[cantidadParticipantes];
		this.cantidadSumos = 0;
	}
	
	public boolean agregarSumo(Sumo sumo) {
		if(this.sumos.length == this.cantidadSumos)
			return false;
		this.sumos[this.cantidadSumos] = sumo;
		this.cantidadSumos++;
		return true;
	}
	
	public void simularTorneo() {
		//Si no tengo sumos o tengo uno solo, no hago nada
		if(this.cantidadSumos < 2)
			return;
		//Evaluo el primero con todos los que le siguen,
		// el segundo tambien, ... , 
		// hasta el anteultimo, porque el ultimo ya se habra evaluado con todos cuando termine el anteultimo
		for(int i = 0; i<this.cantidadSumos-1; i++) {
			for(int j=i+1; j<this.cantidadSumos; j++) {
				Sumo.evaluarLucha(this.sumos[i], this.sumos[j]);
			}
		}
	}
	
	public int getCantidadDominada(int i) {
		return this.sumos[i].getCantidadDominada();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(sumos);
		result = prime * result + Objects.hash(cantidadSumos);
		return result;
	}
	public int getCantidadSumos() {
		return this.cantidadSumos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Torneo other = (Torneo) obj;
		return cantidadSumos == other.cantidadSumos && Arrays.equals(sumos, other.sumos);
	}
	
	
}
