class Conta {
	private String titular;
	private int agencia;
	private int numero;
	private double saldo;
	static int id = 0;

	//void getTotalIds(int id) {
	//	id += id;
	//}


	void saca (double valor) {
		saldo -= valor;
	}

	void deposita (double valor) {
		saldo += valor;
	}

	double getRendimento () {
		return saldo * 0.02;
	
	}

	String getTitular () {
		//String titular = this.titular;
		return titular;
	}

	String recuperaDadosParaImpressao() {
		String dados = "Titular: " + this.titular;
		dados += "\nSaldo: " + this.saldo;
		return dados;
	}

	int getId() {
		return id;
	}

	double getSaldo () {
		return saldo;
	}

	

	public Conta(String titular) {
		this();
		this.titular = titular;
	}

	public Conta(String titular, double valor) {
	
		this(titular);		
		this.deposita(valor);
	}

	public Conta() {
		id++;
	}

	
}
