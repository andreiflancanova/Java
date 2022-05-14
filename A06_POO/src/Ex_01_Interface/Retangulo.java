package Ex_01_Interface;

public class Retangulo extends BaseFigura implements Figuras
{
	Retangulo(double pLado1, double pLado2, String pNome)
	{
		super(pLado1,pLado2,pNome);
		caNomeClasse="Retangulo";
	}
	
	public double getDiagonal()
	{
		return Math.sqrt(Math.pow(caLado1,2.0)+Math.pow(caLado2,2.0));
	}
	
}
