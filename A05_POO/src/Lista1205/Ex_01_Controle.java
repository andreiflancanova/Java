package Lista1205;

public class Ex_01_Controle 
{
	public static void main(String[] args) 
	{
		//Cachorro
		System.out.println("\nCONTROLE DE C�ES - GENERATION");
		System.out.println("\n****************************************");
		
		Ex_01_Cachorro[] Lista01=new Ex_01_Cachorro[2];
		
		Lista01[0]=new Ex_01_Cachorro("Trakina","12","Auuuu Auuuu","Devagar");
		Lista01[1]=new Ex_01_Cachorro("Lobinha","8","Au Au","R�pido");
				
			//For it
		for(Ex_01_Cachorro Roda:Lista01)
		{
			Roda.ImprimirInfo();
			System.out.println("----------------------------------------");
		}

		//Cavalos
		System.out.println("\nCONTROLE DE EQUINOS - GENERATION");
		System.out.println("\n****************************************");
		
		Ex_01_Cavalo[] Lista02=new Ex_01_Cavalo[2];
		Lista02[0]=new Ex_01_Cavalo("Princesa","5","Riiiiin","Muito r�pido");
		Lista02[1]=new Ex_01_Cavalo("Alaz�o","4","Rin Riiin","R�pido");
				
		//For it
		for(Ex_01_Cavalo Roda:Lista02)
		{
			Roda.ImprimirInfo();
			System.out.println("----------------------------------------");	
		}
		//Pregui�as
				System.out.println("\nCONTROLE DE BICHOS-PREGUI�A - GENERATION");
				System.out.println("\n****************************************");
				
				Ex_01_Preguica[] Lista03=new Ex_01_Preguica[2];
				Lista03[0]=new Ex_01_Preguica("Jerusa","20","uuuuuhn","Altas");
				Lista03[1]=new Ex_01_Preguica("Julio","40","uuhn uuhn","M�dias");
						
				//For it
				for(Ex_01_Preguica Roda:Lista03)
				{
					Roda.ImprimirInfo();
					System.out.println("----------------------------------------");	
				}
	}

}
