package org.cuatrovientos.ed.GeneradorIp;

import java.util.Random;

public class GeneradorIp {

	Random rnd = new Random();
	int num;
	public int generarNumero(int min, int max) {

		num = rnd.nextInt(max - min + 1) + min;
		return num;
	}

	public String generarIp() {
		String ip = "";

		for (int i = 0; i < 4; i++) {
			ip += generarNumero(0, 255);
			if (i < 3) {
				ip += ".";
			}
		}
		return ip;
	}

}
