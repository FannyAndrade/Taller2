package Cuenta;

	public  class CuentaCorriente extends CuentaBancaria {

		@Override
		double getInteresDeposito() {
			return 0.02;
		}
	         /*@Override
	        
		public void deposito (double deposito){
	        	 double interes = 0;
	        	 if(deposito < 1000)
	        		 interes = deposito * 0.01;
	        	this.saldo =this.saldo + deposito + interes;
	         }*/
	}


