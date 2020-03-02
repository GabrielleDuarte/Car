package Car;

public class Motor {

	
	private String numeracao;
	
	private double nivelOleo;

	public String getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(String numeracao) {
		this.numeracao = numeracao;
	}

	public double getNivelOleo() {
		return nivelOleo;
	}

	public void trocarOleo(double nivelOleo) {
		this.nivelOleo = nivelOleo;
	}

}
