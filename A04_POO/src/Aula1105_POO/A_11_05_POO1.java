package Aula1105_POO;

public class A_11_05_POO1 
{
	//Declara��o de atributos de Classe
		//(Para atributos, uma boa pr�tica � colocar um atributo por linha)
		//(Para atributos, uma boa pr�tica � colocar com letra min�scula)
	
	private String caNomeProprietario;
	private String caModelo;
	private String caPlaca;
	private int caAno;
	
	//Declara��o do M�todo Construtor
		//(O Nome do M�todo Construtor tem que ser o mesmo da Classe)
	public A_11_05_POO1(String pNomeProprietario,String pModelo,String pPlaca,int pAno)
		//(Dentro dos par�nteses s�o os Par�metros)
	{
		this.caNomeProprietario = pNomeProprietario;
		this.caModelo = pModelo;
		this.caPlaca = pPlaca;
		this.caAno = pAno;
	}
	
	//Declara��o dos demais m�todos da Classe
	public void ImprimirInfo()
	{
		System.out.println("\nNome do Propriet�rio: "+caNomeProprietario);
		System.out.println("\nModelo do Ve�culo: "+caModelo);
		System.out.println("\nN� Placa do Ve�culo: "+caPlaca);
		System.out.println("\nNome do Propriet�rio: "+caAno);
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
