package Cuenta;

public class Main {

	public static void main(String[] args) {
		CuentaBancaria cta1= new CuentaCorriente();
		CuentaBancaria cta2= new CuentaAhorro();
		CuentaAhorro cta3 = new CuentaAhorro();
		
		cta1.setNombreCuenta("cta1");
		cta2.setNombreCuenta("cta2");
		cta3.setNombreCuenta("cta3");
		
		cta1.setSaldo(100);
		cta2.setSaldo(200);
		cta3.setSaldo(300);
		
		
		imprimirSaldo(cta1);
		imprimirSaldo(cta2);
		imprimirSaldo(cta3);
		
		CuentaCorriente cta4= new CuentaCorriente();
		cta4.setNombreCuenta("cta4");
		cta4.setSaldo(10);
		cta4.deposito(100);
		imprimirSaldo(cta4);
		
		
	}
	public static void imprimirSaldo(CuentaBancaria cta){
		System.out.println("Cuenta: " + cta.getNombreCuenta() + ", Saldo: " + cta.getSaldo());
		
	}
}



