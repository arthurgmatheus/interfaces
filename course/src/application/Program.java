package application;

import entities.OldTv;
import entities.SmartTv;

public class Program {

	public static void main(String[] args) {
		
		OldTv old = new OldTv();
		SmartTv smart = new SmartTv();
		
		old.ligar();
		old.desligar();
		old.alterarCanal();
		old.alterarVolume();
		System.out.println();
		smart.ligar();
		smart.desligar();
		smart.alterarCanal();
		smart.alterarVolume();
		smart.internet();
		smart.baixarApp();

	}

}
