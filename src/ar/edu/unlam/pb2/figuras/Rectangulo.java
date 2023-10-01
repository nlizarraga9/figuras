package ar.edu.unlam.pb2.figuras;

public class Rectangulo {

	private Double base;
	private Double altura;
	
	public Rectangulo (Double base, Double altura) {
	this.base = base;
	this.altura = altura;
	}

	public String toString(){
		return "Rectangulo [base=" + base + ", altura=" + altura + "]";
}
