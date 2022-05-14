package Ex_01_Interface;

public class BaseFigura 
{
	protected double caLado1;
	protected double caLado2;
	protected String caNome;
	protected String caNomeClasse;
	
	BaseFigura(double pLado1, double pLado2, String pNome)
	{//Tem na Interface
		this.caLado1=pLado1;
		this.caLado2=pLado2;
		this.caNome=pNome;
	}
	
	public double getArea()
	{//Tem na Interface
		return caLado1*caLado2;
	}
	
	public double getPerimetro()
	{//Tem na Interface
		return (caLado1+caLado2)*2.0;
	}
	
	public String getCaNome()
	{
		return caNome;
	}
	
	public void setCaNome(String caNome)
	{
		this.caNome=caNome;
	}

	public double getCaLado1() {
		return caLado1;
	}

	public void setCaLado1(double caLado1) {
		this.caLado1 = caLado1;
	}

	public double getCaLado2() {
		return caLado2;
	}

	public void setCaLado2(double caLado2) {
		this.caLado2 = caLado2;
	}

	public String getCaNomeClasse() {
		return caNomeClasse;
	}

	public void setCaNomeClasse(String caNomeClasse) {
		this.caNomeClasse = caNomeClasse;
	}
	
	
	
	
	
}
