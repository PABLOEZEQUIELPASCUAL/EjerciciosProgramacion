package edu.unlam.baja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TarjetaSubeTest {

	@Test
	void testViajeEnColectivo() {
		TarjetaBaja t = new TarjetaBaja(1000);
		t.pagarViajeEnColectivo();
		
		assertEquals(1000 - TarjetaBaja.VALOR_VIAJE_EN_COLECTIVO,t.obtenerSaldo());
		assertEquals(1,t.contarViajesEnColectivo());
		//hacer el contarViajes lo mismo
		 // hacer con subte
		 
		
		//si ejecuto con coverage me dice que no esta testeado (clic derecho en test y coverage) 
	}

}
