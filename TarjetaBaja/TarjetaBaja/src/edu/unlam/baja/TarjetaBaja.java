package edu.unlam.baja;

import java.util.Objects;

public class TarjetaBaja {
	//en la carpeta test clic derecho -> coverage as -> junit ...
	public static final double VALOR_VIAJE_EN_COLECTIVO = 39.59;
	public static final double VALOR_VIAJE_EN_SUBTE = 39.59;
	private double saldo;
	private  int contadorColectivo,contadorSubte;
	
	public TarjetaBaja(double saldoInicial) {
		this.saldo = saldoInicial;
		this.contadorColectivo = 0;
		this.contadorSubte = 0;
	}
	public double obtenerSaldo() {
		return this.saldo;
	}
	public void cargar(double monto) {
		if(monto > 0)
			this.saldo += monto;
	}
	//con subte hago lo mismo
	public boolean pagarViajeEnColectivo() {
		if(pagarViaje(VALOR_VIAJE_EN_COLECTIVO)) {
			this.contadorColectivo++;
			return true;
		}
		/*
		if(this.saldo >= VALOR_VIAJE_EN_COLECTIVO) {//refractor -> extract contant-> creo en privada la constatne y le pongo nombre
			this.saldo -= VALOR_VIAJE_EN_COLECTIVO;
			this.contadorColectivo++;
			return true;
		}*/
		return false;
	}
	public boolean pagarViaje(double monto) {
		if(this.saldo >= monto) {
			this.saldo -= monto;
			return true;
		}
		return false;
		
	}
	public int contarViajesEnColectivo() {
		return this.contadorColectivo;
	}
	//alt + shift + s -> generar constructor
	public TarjetaBaja(double saldo, int contadorColectivo, int contadorSubte) {
		this.saldo = saldo;
		this.contadorColectivo = contadorColectivo;
		this.contadorSubte = contadorSubte;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contadorColectivo, contadorSubte, saldo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TarjetaBaja other = (TarjetaBaja) obj;
		return contadorColectivo == other.contadorColectivo && contadorSubte == other.contadorSubte
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}
	
	
		
	
}
