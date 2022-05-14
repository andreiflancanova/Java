package Ex_01_Interface;

public class Quadrado extends BaseFigura implements Figuras
{
	Quadrado(double pLado, String pNome)
	{
		super(pLado,pLado,pNome);		
		/*
		 Quando uso protected no BaseFigura, consigo pegar direto os valores da Super Classe 
		 e das Sub Classes vinculadas a ela.
		 */
		caNomeClasse = "Quadrado";
	}
	
	public double getDiagonal()
	{
		return Math.sqrt(2)*caLado1;
	}
	
}
