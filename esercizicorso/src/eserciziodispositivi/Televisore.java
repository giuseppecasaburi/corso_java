package eserciziodispositivi;

public class Televisore extends Dispositivo {
	private String marca;
	
	// Costruttore
	public Televisore(String marca) {
		super("televisore");
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