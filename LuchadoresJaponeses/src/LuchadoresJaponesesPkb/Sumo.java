package LuchadoresJaponesesPkb;

import java.util.Objects;

public class Sumo {
	private int peso;
	private int altura;
	private int cantidadDominada;
	
	public Sumo(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
		this.cantidadDominada = 0;
	}
	
	public static void evaluarLucha(Sumo a, Sumo b) {
		if(a.peso == b.peso && a.altura == b.altura) 
			throw new RuntimeException("Error, no puede haber dos luchadores con el mismo peso y altura");
		if(a.peso >= b.peso && a.altura >= b.altura)
			a.cantidadDominada++;
		else if(b.peso >= a.peso && b.altura >= a.altura)
			b.cantidadDominada++;
	}
	
	public int getCantidadDominada() {
		return this.cantidadDominada;
	}

	@Override
	public int hashCode() {
		return Objects.hash(altura, cantidadDominada, peso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sumo other = (Sumo) obj;
		return /*altura == other.altura && peso == other.peso &&*/ cantidadDominada == other.cantidadDominada ;
	}
	
	void setCantidadDominada(int cantidadDominada) {
		this.cantidadDominada = cantidadDominada;
	}
	
}
