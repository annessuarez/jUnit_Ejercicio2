package org.cuatrovientos.ed.GeneradorIp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeneradorIpTest {
	GeneradorIp generador = new GeneradorIp();

	@Test
	void testGenerarNumero() {
		for (int i = 0; i < 1000; i++) {
			int resultado = generador.generarNumero(0, 254);
			assertTrue(resultado >= 0 && resultado <= 254, 
					"Error en la vuelta " + i + ": el número " + resultado + " está fuera de rango");
		}
	}
	
	@Test
	void testGenerarIp(){
		String ip = generador.generarIp();
		
		assertFalse(ip.startsWith("0"), "La ip " + ip + " no puede empezar por 0.");
		assertFalse(ip.endsWith("0"), "La ip " + ip + " no puede terminar por 0.");
	}


}
