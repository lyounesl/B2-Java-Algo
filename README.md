# B2-Java-Algo


## 1-Comparaison


### 1.1 - Joueur 


#### Question 1.1 : Création du projet B2GNSAlgo11.


#### Question 1.2 : Le résultat que l'on obtient après éxecution est "Les deux joueur sont différents" car ce sont deux objets distincts "références différentes".


#### Question 1.3 : Le résultat est aussi "Les deux joueur sont différents" car lors de la comparaison ce sont les adresse des objets "leurs références" qui sont comparer et sont unique avec "new".


### 1.2 - Numéro de joueur en tant que critère de comparaison


#### Question 1.4 : Création de B2GNSAlgo12.


#### Question 1.5 : Implémentation de la méthode equals(Joueur) de la classe Joueur
```java
public boolean equals(Object joueur) {
		if(this == joueur) {
			return true;
		}
		else {
			Joueur autre = (Joueur) joueur;
			return this.numero == autre.numero;
		}
```


#### Question 1.6 : Le résultat après complition de l'expression jr1 == jr2 renvoie "Les deux joueur sont différents" car c'est toujours la réference des objets qui sont comparées.


#### Question 1.7 : Le résultat après compliation de l'expression jr1.equals(jr2) renvoie ""Les deuc joueurs sont identiques car ce sont les numéros des joueurs qui sont comparées.


### 1.3 - Nombre de victoires en tant que critère de comparaison


#### Question 1.8 : Implémentation de la méthode compareTo(Joueur) de la classe Joueur
```java
public int compareTo(Joueur autre) {
		return Integer.compare(this.nbVictoires, autre.nbVictoires);
	}
```


#### Question 1.9 : Le résultat obtenu est "Watson est meilleur que Parker"


## 2 - Comparaisons et relations d'ordre


### 2.1 - Collection d'objets dont la classe implémente l'interface Comparable<T>


#### Question 2.1 : Création du projet B2GNSAlgo21.


#### Question 2.2 : Le résultat de la compilation est le joueur 28, Parker avec 30 victoires.


#### Question 2.3 : Trier dans l'ordre croissant et afficher la liste des joueurs
```java
System.out.println( "\nListe triée des joueurs dans l'ordre croissant :\n" ) ;
		Collections.sort(joueurs);
		System.out.println(joueurs);
```


#### Question 2.4 : Création de B2GNSAlgo22.


#### Question 2.5 : Code source de la classe ComparateurParVictoires : 
```java
	public class ComparateurNbVictoires implements Comparator<Joueur> {

	@Override
	public int compare(Joueur o1, Joueur o2) {
		return Integer.compare(o1.getNbVictoires(), o2.getNbVictoires());
	}
}
```


#### Code source de la classe principale AppTrierNbVictoires :
```java
Comparator<Joueur> comparateurWin = new ComparateurNbVictoires();
		Collections.sort(joueurs,comparateurWin);
		System.out.println(joueurs);
```


## 3 - Recherche

#### Question 3.1 : Création du projet B2GNSAlgo31


#### Question 3.2 : Le résultat obtenu lors de la compilations est qu'il nous renvoie la postion du joueur dans la liste 'joueurs'.


#### Question 3.3 : Création du projet B2GNSAlgo32.


#### Question 3.4 : Le résultat de la compilation donne la position du joueur 105 qui est -1.


#### Question 3.5 : Il faut faire la surcharge de la méthode equals et changer le type Joueur en Object et faire un transtipage pour le voir comme un objet et ainsi le comparer aux autres joueur pour avoir sa position avec la methode index.of.

#### Extrait du code source de la méthode equals : 
```java
@Override
	public boolean equals( Object other ) {
		Joueur autre = (Joueur) other ;
		if( this.numero == autre.numero && this.nom.equals( autre.nom ) && this.pays.equals( autre.pays ) ) {
			return true ;
		}
		return false ;
	}
``

