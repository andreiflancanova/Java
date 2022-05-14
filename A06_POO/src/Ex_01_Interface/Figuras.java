package Ex_01_Interface;

public interface Figuras 
{
	public String NomeInterface = "Figuras";
	abstract public String getCaNome();
	abstract public void setCaNome(String pNome);
	public double getArea();
	public double getPerimetro();
	double getDiagonal();
}
