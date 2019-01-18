public class BalancoTrimestral {
	public static void main(String[]args){
		int gastosJaneiro = 15000;
		int gastosFevereiro = 23000;
		int gastosMarco = 17000;
		int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		int trimestre = 3;
		int mediaMensal = gastosTrimestre / trimestre;
		System.out.println("Valor do gasto trimestral = " + gastosTrimestre);
		System.out.println("Valor da média mensal = " + mediaMensal);
	}

}
