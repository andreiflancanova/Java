package Lista1305;

public abstract class Ex_01_Animal 
	
{
	//Atributos de Super Classe
	private String caNome;
	private String caIdade;
	
	abstract public void Som();
	abstract public void ImprimirInfo();
	
	//Método Construtor
	public Ex_01_Animal(String pNome,String pIdade)
	{
		super();
		this.caNome=pNome;
		this.caIdade=pIdade;
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

}
