package eserciziodispositivi;

public class Computer extends Dispositivo {
	private String marca;
	
	// Costruttore
	public Computer(String marca) {
		super("computer");
		this.marca = marca;
	};
	
	// Metodi
	super.MostraInfo();
	
	// Override
	@Override
	public void Accendi() {
		this.acceso = true;
		System.out.println("Dispositivo "+ nome + " della marca" + marca + " acceso con successo!");
	};
	
	@Override
	public void Spegni() {
		this.acceso = true;
		System.out.println("Dispositivo "+ nome + " della marca" + marca + " spento con successo!");
	};
	
};