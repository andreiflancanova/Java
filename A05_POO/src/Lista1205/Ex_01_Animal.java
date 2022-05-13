package Lista1205;

public class Ex_01_Animal 
	
{
	//Atributos de Super Classe
	private String caNome;
	private String caIdade;
	private String caSom;
	
	//Método Construtor
	public Ex_01_Animal(String pNome,String pIdade,String pSom)
	{
		super();
		this.caNome=pNome;
		this.caIdade=pIdade;
		this.caSom=pSom;
	}

	public String getCaNome() 
	{
		return caNome;
	}

	public void setCaNome(String caNome) 
	{
		this.caNome = caNome;
	}

	public String getCaIdade() 
	{
		return caIdade;
	}

	public void setCaIdade(String caIdade) 
	{
		this.caIdade = caIdade;
	}

	public String getCaSom() 
	{
		return caSom;
	}

	public void setCaSom(String caSom) 
	{
		this.caSom = caSom;
	}
}
