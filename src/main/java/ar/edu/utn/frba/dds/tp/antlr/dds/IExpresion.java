package ar.edu.utn.frba.dds.tp.antlr.dds;

public interface IExpresion {

	public double calcularResultado(String empresa, Integer periodo);

	public IOperador getOperador();

	public IExpresion getOperando1();
	public IExpresion getOperando2();

	
}
