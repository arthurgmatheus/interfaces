package entities;

public class OldTv implements Televisao{

	@Override
	public void ligar() {
		System.out.println("OldTV ligada");
	}
	
	@Override
	public void desligar() {
		System.out.println("OldTV desligada");
	}
	
	@Override
	public void alterarCanal() {
		System.out.println("Canal da OldTV alterado");
	}
	
	@Override
	public void alterarVolume() {
		System.out.println("Volume da OldTV alterado");
	}
	
}
