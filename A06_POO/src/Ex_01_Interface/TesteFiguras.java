package Ex_01_Interface;

public class TesteFiguras 
{
	public static void main(String[] args)
	{
		Quadrado Q1= new Quadrado(10,"Quadrado 1");
		Retangulo R1=new Retangulo(3,4,"Retângulo 1");
		
		System.out.printf("\n %s : %.2f",Q1.getCaNome() ,Q1.getDiagonal());
		System.out.printf("\n %s : %.2f",R1.getCaNome() ,R1.getDiagonal());
	}
}
