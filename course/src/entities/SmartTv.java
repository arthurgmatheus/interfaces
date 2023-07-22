package entities;

public class SmartTv implements Televisao, Smart{

	@Override
	public void ligar() {
		System.out.println("SmartTV ligada");
	}
	
	@Override
	public void desligar() {
		System.out.println("SmartTV desligada");
	}
	
	@Override
	public void alterarVolume() {
		System.out.println("Volume da SmartTV alterado");
	}
	
	@Override
	public void alterarCanal() {
		System.out.println("Canal da SmartTV alterado");
	}
	
	@Override
	public void internet() {
		System.out.println("Internet da SmartTV conectada");
	}
	
	@Override
	public void baixarApp() {
		System.out.println("App instalado na SmartTV");
	}
	
}
