package Aula1105_POO;

public class A_11_05_POO1 
{
	//Declaração de atributos de Classe
		//(Para atributos, uma boa prática é colocar um atributo por linha)
		//(Para atributos, uma boa prática é colocar com letra minúscula)
	
	private String caNomeProprietario;
	private String caModelo;
	private String caPlaca;
	private int caAno;
	
	//Declaração do Método Construtor
		//(O Nome do Método Construtor tem que ser o mesmo da Classe)
	public A_11_05_POO1(String pNomeProprietario,String pModelo,String pPlaca,int pAno)
		//(Dentro dos parênteses são os Parâmetros)
	{
		this.caNomeProprietario = pNomeProprietario;
		this.caModelo = pModelo;
		this.caPlaca = pPlaca;
		this.caAno = pAno;
	}
	
	//Declaração dos demais métodos da Classe
	public void ImprimirInfo()
	{
		System.out.println("\nNome do Proprietário: "+caNomeProprietario);
		System.out.println("\nModelo do Veículo: "+caModelo);
		System.out.println("\nNº Placa do Veículo: "+caPlaca);
		System.out.println("\nNome do Proprietário: "+caAno);
	}

	public String getCaNomeProprietario() {
		return caNomeProprietario;
	}

	public void setCaNomeProprietario(String caNomeProprietario) {
		this.caNomeProprietario = caNomeProprietario;
	}

	public String getCaModelo() {
		return caModelo;
	}

	public void setCaModelo(String caModelo) {
		this.caModelo = caModelo;
	}

	public String getCaPlaca() {
		return caPlaca;
	}

	public void setCaPlaca(String caPlaca) {
		this.caPlaca = caPlaca;
	}

	public int getCaAno() {
		return caAno;
	}

	public void setCaAno(int caAno) {
		this.caAno = caAno;
	}
	
}
