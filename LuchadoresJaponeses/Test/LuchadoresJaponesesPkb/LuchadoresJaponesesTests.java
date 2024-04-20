package LuchadoresJaponesesPkb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LuchadoresJaponesesTests {

	@Test
	void test() {
		int resultados[]= {1,2,3,0};
		
		Sumo sumo0 = new Sumo(1,2);
		Sumo sumo1 = new Sumo(1,3);
		Sumo sumo2 = new Sumo(2,3);
		Sumo sumo3 = new Sumo(1,1);
		Torneo torneo = new Torneo(4);
		torneo.agregarSumo(sumo0);
		torneo.agregarSumo(sumo1);
		torneo.agregarSumo(sumo2);
		torneo.agregarSumo(sumo3);
		
		torneo.simularTorneo();
		
		assertEquals(torneo.getCantidadSumos(),resultados.length);
		
		for(int i = 0; i<torneo.getCantidadSumos(); i++) {
			assertEquals(torneo.getCantidadDominada(i),resultados[i]);
		}
		
	}

}
