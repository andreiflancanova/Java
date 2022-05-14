package Aula1305;

//Definir uma Classe Abstrata
public abstract class Ex_01_Telefone 
{
	private String caTipo;
	
	abstract public void Dial (String pNumero);
	abstract public void Ring (int pNumToques);
	
	//Método Construtor
	public Ex_01_Telefone(String pTipo)
	{
		this.caTipo=pTipo;
	}
	public String getCaTipo() {
		return caTipo;
	}
	public void setCaTipo(String caTipo) {
		this.caTipo = caTipo;
	}	
}
