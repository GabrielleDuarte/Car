package Car;

public class Carro {
	
	private String chassi;
	
	private String cor;
	
	private String placa;
	
	private String modelo;
	
	private String marca;
	
	private  Motor motor;
	
	private boolean estado;
	
	private double velocidade;
	
	private int marcha; 
	
	private boolean freio;
	
	private double tanque;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	
		
	public boolean isEstado() {
		return estado;
	}

	public void liga(boolean estado) {
		this.estado = estado;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void acelera(double velocidade) {
		if(estado) {
		this.velocidade = velocidade;
		}
		else {
			System.out.println("O carro está desligado");
		}
	}

	public int getMarcha() {
		return marcha;
	}

	public void passaMarcha(int marcha) {
		if(estado) {
		this.marcha = marcha;
		}
		else {
			System.out.println("O carro está desligado");
		}
	}

	public boolean isFreio() {
		return freio;
	}

	public void freio(boolean freio) {
		if(estado) {
		this.freio = freio;
		}
		else {
			System.out.println("O carro está desligado");
		}
	}

	public double getTanque() {
		return tanque;
	}

	public void setTanque(double tanque) {
		this.tanque = tanque;
	}
	
	public void abastecer(double abastecimento) {
		setTanque(getTanque()+abastecimento);
	}

	
}
