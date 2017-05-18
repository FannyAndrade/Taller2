package Cuenta;


	public abstract class CuentaBancaria {
		private String nombreCuenta;
		protected double saldo;
		//private double interesDeposito;
		abstract  double getInteresDeposito();
		public void deposito(double deposito){
			double totalInteres = 0;
			if (deposito<1000)
				totalInteres = deposito * getInteresDeposito();
			
	        this.saldo += deposito + totalInteres;
		 }
		/* public double getInteresDeposito() {
			return interesDeposito;
		}
		public void setInteresDeposito(double interesDeposito) {
			this.interesDeposito = interesDeposito;
		}*/
		public String getNombreCuenta() {
			return nombreCuenta;
		}
		public void setNombreCuenta(String nombreCuenta) {
			this.nombreCuenta = nombreCuenta;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		 public void retiro(double retiro){
			 this.saldo -= retiro;
		 }

}
