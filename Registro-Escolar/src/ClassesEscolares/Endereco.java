package ClassesEscolares;

public class Endereco 
{
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco(String rua, 
			int numero, 
			String complemento, 
			String bairro, 
			String cidade, 
			String estado) 
	{
		this.setRua(rua);
		
		int verificaNumero = this.setNumero(numero);
		if(verificaNumero == 1) {
			System.out.println("ERRO: Numero informado é inválido");
			return;
		}
		
		this.setComplemento(complemento);
		
		this.setBairro(bairro);
		
		this.setCidade(cidade);
		
		int verificaEstado = this.setEstado(estado);
		if(verificaEstado == 1) {
			System.out.println("ERRO: Estado informado é inválido");
			return;
		}
		
	}
	
	//Set e get rua
	public void setRua(String rua) 
	{
		this.rua = rua;
	}
	public String getRua() 
	{
		return this.rua;
	}
	
	
	//set e get número
	public int setNumero(int numero) 
	{
		String tratandoNumero = ((Object)numero).getClass().getSimpleName();
		if(tratandoNumero.equalsIgnoreCase("integer")&&numero>-1) {
			this.numero = numero;
			return 0;
		}else {
			System.out.println("Erro: Você forneceu um número inválido!");
			return 1;
		}
	}
	public int getNumero() 
	{
		return this.numero;
	}
	
	
	//set e get de complemento
	public void setComplemento(String complemento) 
	{
		this.complemento = complemento;
	}
	public String getComplemento() 
	{
		return this.complemento;
	}
	
	//set e get de bairro
	public void setBairro(String bairro) 
	{
		this.bairro = bairro;
	}
	public String getBairro() 
	{
		return this.bairro;
	}
	
	//set e get de cidade
	public void setCidade(String cidade) 
	{
		this.cidade = cidade;
	}
	public String getCidade() 
	{
		return this.cidade;
	}
	
	//set e get de estado
	public int setEstado (String estado) 
	{
		if(estado.equalsIgnoreCase("ac") || 
				estado.equalsIgnoreCase("al") || 
				estado.equalsIgnoreCase("ap") || 
				estado.equalsIgnoreCase("am") || 
				estado.equalsIgnoreCase("ba") || 
				estado.equalsIgnoreCase("ce") || 
				estado.equalsIgnoreCase("df") || 
				estado.equalsIgnoreCase("es") || 
				estado.equalsIgnoreCase("go") || 
				estado.equalsIgnoreCase("ma") || 
				estado.equalsIgnoreCase("mt") || 
				estado.equalsIgnoreCase("ms") || 
				estado.equalsIgnoreCase("mg") || 
				estado.equalsIgnoreCase("pa") || 
				estado.equalsIgnoreCase("pb") || 
				estado.equalsIgnoreCase("pr") || 
				estado.equalsIgnoreCase("pe") || 
				estado.equalsIgnoreCase("pi") || 
				estado.equalsIgnoreCase("rj") || 
				estado.equalsIgnoreCase("rn") || 
				estado.equalsIgnoreCase("rs") || 
				estado.equalsIgnoreCase("ro") || 
				estado.equalsIgnoreCase("rr") || 
				estado.equalsIgnoreCase("sc") || 
				estado.equalsIgnoreCase("sp") || 
				estado.equalsIgnoreCase("se") || 
				estado.equalsIgnoreCase("to")) 
		{
			this.estado = estado;
			return 0;
		}else {
			System.out.println("Estado não existente");
			return 1;
		}
	}
	public String getEstado() 
	{
		return this.estado;
	}
	
	//endereço completo
	public String getEndereco() 
	{
		String enderecoCompleto = this.rua +", "+  
				this.numero +", "+
				this.complemento +", "+
				this.bairro +", "+
				this.cidade +", "+
				this.estado;
		
		return enderecoCompleto;
	}
}
