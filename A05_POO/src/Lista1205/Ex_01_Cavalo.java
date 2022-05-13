package Lista1205;

public class Ex_01_Cavalo extends Ex_01_Animal
{
	//Atributos de Sub-Classe
	private String caCorrer;
	
	//Método Construtor
	public Ex_01_Cavalo(String pNome,String pIdade,String pSom,String pCorrer)
	{
		super(pNome,pIdade,pSom);
		this.caCorrer=pCorrer;
	}
	
	public String getCaCorrer() {
		return caCorrer;
	}

	public void setCaCorrer(String caCorrer) {
		this.caCorrer = caCorrer;
	}

	public void ImprimirInfo()
	{
		System.out.println("\nNome do Cavalo: "+getCaNome());
		System.out.println("\nIdade do Cavalo: "+getCaIdade());
		System.out.println("\nSom do Cavalo: "+getCaSom());
		System.out.println("\nVelocidade da corrida: "+caCorrer);
	}
}
