class AberturaConta {
	public static void main (String[]args) {
		//Conta c = new Conta();
		//c.titular = "Kim";
		//c.agencia = 7;
		//c.numero = 1234;
		//c.saldo = 10000;

		//c.deposita (100);
		//System.out.println(c.getTitular());
		//System.out.println(c.saldo);
		//System.out.println(c.getRendimento());
		//System.out.println(c.recuperaDadosParaImpressao());

		//Conta c2 = new Conta();
		//c2.titular = "Silva";
		//c2.saldo = 1000;

		//Conta c3 = new Conta();
		//c3.titular = "Pereira";
		//c3.saldo = 2000;

		//if (c2 == c3) {
			//System.out.println("iguais");
		//} else {
			//System.out.println("diferentes");
		//}

		Conta d = new Conta("Carlos");

		System.out.println(d.getTitular());

		Conta e = new Conta("João", 2000);

		System.out.println(e.getTitular());
		System.out.println(e.getSaldo());
		System.out.println(e.getId());
		
	}

}
