package fr.gns.app;


public class Joueur {
	
	private int numero ;
	private String nom ;
	private String pays ;
	private int nbVictoires = 0 ;
	
	public Joueur(int numero, String nom, String pays, int nbVictoires) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.pays = pays;
		this.nbVictoires = nbVictoires;
	}

	public Joueur(int numero, String nom, String pays) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.pays = pays;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getNbVictoires() {
		return nbVictoires;
	}

	public void setNbVictoires(int nbVictoires) {
		this.nbVictoires = nbVictoires;
	}
	
	public boolean equals( Joueur autre ) {
		System.out.println( "Comparaison" );
		if( this.numero == autre.numero && this.nom.equals( autre.nom ) && this.pays.equals( autre.pays ) ) {
			return true ;
		}
		return false ;
	}
	
	@Override
	public boolean equals( Object other ) {
		Joueur autre = (Joueur) other ;
		if( this.numero == autre.numero && this.nom.equals( autre.nom ) && this.pays.equals( autre.pays ) ) {
			return true ;
		}
		return false ;
	}

	
	
	@Override
	public String toString() {
		return "Joueur [numero=" + numero + ", nom=" + nom + ", pays=" + pays + ", nbVictoires=" + nbVictoires + "]";
	}

}