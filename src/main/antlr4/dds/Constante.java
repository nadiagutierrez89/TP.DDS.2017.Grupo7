package dds;

public class Constante implements IExpresion{

	private double valor;
	
	public Constante(double valor){
		this.valor = valor;
	}
	@Override
	public double calcularResultado() {
		// TODO Auto-generated method stub
		return this.valor;
	}
	@Override
	public IOperador getOperador() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IExpresion getOperando1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
