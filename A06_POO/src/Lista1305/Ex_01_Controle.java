package Lista1305;

public class Ex_01_Controle 
{
	public static void main(String[] args) 
	{
				Ex_01_Cachorro Cachorro01=new Ex_01_Cachorro("Trakina","12","Devagar");
				Ex_01_Cavalo Cavalo01=new Ex_01_Cavalo("Princesa","5","Muito rápido");
				Ex_01_Preguica Preguica01=new Ex_01_Preguica("Jerusa","20","Altas");
				
				
				Ex_01_Animal Animal01=null;
				
				int n= (int)(Math.random()*3.0);
				System.out.println("\nNúmero Sorteado foi: "+n);
				
				switch(n)
				{
				case 0: Animal01=Cachorro01;break;
				case 1: Animal01=Cavalo01;break;
				case 2: Animal01=Preguica01;break;
				default: System.out.println("\nErro Inesperado");
				}
				
				Animal01.ImprimirInfo();
				Animal01.Som();
				
				
	}

}
