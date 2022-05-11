package Lista1105_POO_01;

public class Q01_Cliente 
{
	//Declaração de atributos de Classe
	private String caNomeCliente;
	private int caIdade;
	private double caAltura;
	private double caMassa;
	
	//Declaração do Método Construtor
	public Q01_Cliente(String pNomeCliente,int pIdade,double pAltura,double pMassa)
	{
		this.caNomeCliente=pNomeCliente;
		this.caIdade=pIdade;
		this.caAltura=pAltura;
		this.caMassa=pMassa;
	}
	
	//Declaração dos demais métodos da Classe
	public void ImprimirInfo()
	{
		System.out.println("\nNome do Cliente: "+caNomeCliente);
		System.out.println("\nIdade (anos): "+caIdade);
		System.out.println("\nAltura (m): "+caAltura);
		System.out.println("\nMassa (kg): "+caMassa);
	}

	public String getCaNomeCliente() {
		return caNomeCliente;
	}

	public void setCaNomeCliente(String caNomeCliente) {
		this.caNomeCliente = caNomeCliente;
	}

	public int getCaIdade() {
		return caIdade;
	}

	public void setCaIdade(int caIdade) {
		this.caIdade = caIdade;
	}

	public double getCaAltura() {
		return caAltura;
	}

	public void setCaAltura(float caAltura) {
		this.caAltura = caAltura;
	}

	public double getCaMassa() {
		return caMassa;
	}

	public void setCaMassa(float caMassa) {
		this.caMassa = caMassa;
	}

	public static void main(String[] args)
	{
	//Instanciando um novo objeto da Classe Q01_Cliente
	Q01_Cliente Cliente01=new Q01_Cliente("Andrei F.L.",24,1.91,102.4);
	
	System.out.println("\n**********BANCO DE DADOS - CLIENTES **********");
	Cliente01.ImprimirInfo();
	}
	
}
