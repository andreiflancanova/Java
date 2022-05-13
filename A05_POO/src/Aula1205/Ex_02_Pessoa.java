package Aula1205;

public class Ex_02_Pessoa 
{
	private String caNome;
	private String caEndereco;
	private String caCPF;
	private int caTelefone;
	private int caIdade;
	
	//Método Construtor
	public Ex_02_Pessoa(String pNome,String pEndereco,String pCPF,int pTelefone,int pIdade)
	{
		super();
		this.caNome=pNome;
		this.caEndereco=pEndereco;
		this.caCPF=pCPF;
		this.caTelefone=pTelefone;
		this.caIdade=pIdade;
	}

	public void ValidarCPF()
	{
		if(getCaCPF().length()!=11)
		{
			System.out.println("\n--CPF Inválido!!!");
		}
		else
		{
			System.out.println("\n--CPF Válido!!!");
		}
	}
	
	public String getCaNome() {
		return caNome;
	}

	public void setCaNome(String caNome) {
		this.caNome = caNome;
	}

	public String getCaEndereco() {
		return caEndereco;
	}

	public void setCaEndereco(String caEndereco) {
		this.caEndereco = caEndereco;
	}

	public String getCaCPF() {
		return caCPF;
	}

	public void setCaCPF(String caCPF) {
		this.caCPF = caCPF;
	}

	public int getCaTelefone() {
		return caTelefone;
	}

	public void setCaTelefone(int caTelefone) {
		this.caTelefone = caTelefone;
	}

	public int getCaIdade() {
		return caIdade;
	}

	public void setCaIdade(int caIdade) {
		this.caIdade = caIdade;
	}
	
}
