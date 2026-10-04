package Banque;

class Compte {
	private String numero; 
	private double solde; 
	public void deposer(double montant) throws MontantInvalideException{
		if(montant <0) {
			throw new MontantInvalideException("Montant invalide");
		}
		this.solde+=montant;
		System.out.println("Ajout fait avec succes");
		
	}
		public void retirer(double montant)throws  SoldeInsuffisantException{
			if(solde - montant<0) {
				throw new SoldeInsuffisantException("Solde insuffisant");
			}
			else {
				this.solde-=montant; 
			}
		}
		
		
	}
