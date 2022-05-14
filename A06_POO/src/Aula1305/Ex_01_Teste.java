package Aula1305;

public class Ex_01_Teste
{

	public static void main(String[] args) 
	{
		Ex_01_Celular Celular01 = new Ex_01_Celular();
		Ex_01_Fixo Fixo01 = new Ex_01_Fixo();
		Ex_01_Publico Publico01 = new Ex_01_Publico();
		
		Ex_01_Telefone Telefone01=null;
		
		//O Math.random só pega valores fracionários entre [0,1[
		int n= (int)(Math.random()*3.0);
		System.out.println("\nNúmero Sorteado foi: "+n);
		
		switch(n)
		{
		case 0: Telefone01=Celular01;break;
		case 1: Telefone01=Fixo01;break;
		case 2: Telefone01=Publico01;break;
		default: System.out.println("\nErro Inesperado");
		}
		
		if(Telefone01!=null)
		{
			Telefone01.Dial("92324544");
			Telefone01.Ring(2);
			
		}
	}

}
