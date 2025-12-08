package fr.gns.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AppTrierParNbVictoires {

	public static void main(String[] args) {
		
		ArrayList<Joueur> joueurs = new ArrayList<>();
		
		Joueur jr1 = new Joueur( 28 , "Parker" , "France" , 30 ) ;
		Joueur jr2 = new Joueur( 28 , "Watson" , "France" , 150 ) ;
		Joueur jr3 = new Joueur( 29 , "Giorno" , "Italy", 200 );
		
		joueurs.add(jr1);
		joueurs.add(jr2);
		joueurs.add(jr3);
		
		System.out.println( "Premier joueur : " + jr1 ) ;
		System.out.println( "Second joueur  : " + jr2 ) ;
		System.out.println( "troisième joueur  : " + jr3 ) ;
		
		System.out.println( "\nAfficher le joueur qui a remporté le moins de victoires :\n" ) ;
		
		System.out.println(Collections.min(joueurs));
		
		System.out.println( "\nTrier et afficher le joueur qui a remporté le moins de victoires dans l'ordre croissant :\n" ) ;
		
		Collections.sort(joueurs);
		System.out.println(joueurs);
		
		
			
	
	}
	
}
