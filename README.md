# B2-Java-Algo

## 1-Comparaison

### 1.1 - Joueur 

#### Question 1.1 : Création du projet B2GNSAlgo11

#### Question 1.2 : Le résultat que l'on obtient après éxecution est "Les deux joueur sont différents" car ce sont deux objets distincts "références différentes".

#### Question 1.3 : Le résultat est aussi "Les deux joueur sont différents" car lors de la comparaison ce sont les adresse des objets "leurs références" qui sont comparer et sont unique avec "new" .

### 1.2 - Numéro de joueur en tant que critère de comparaison

#### Question 1.4 : Création de B2GNSAlgo12

#### Question 1.5 : Implémentation de la méthode equals(Joueur) de la classe Joueur
<sup>public boolean equals(Object joueur) {
		if(this == joueur) {
			return true;
		}
		else {
			Joueur autre = (Joueur) joueur;
			return this.numero == autre.numero;
		}</sup>

#### Question 1.6 : Le résultat après complition de l'expression jr1 == jr2 renvoie "Les deux joueur sont différents" car c'est toujours la réference des objets qui sont comparées

#### Question 1.7 : Le résultat après compliation de l'expression jr1.equals(jr2) renvoie ""Les deuc joueurs sont identiques car ce sont les numéros des joueurs qui sont comparées

### 1.3 - Nombre de victoires en tant que critère de comparaison

#### Question 1.8 : Implémentation de la méthode compareTo(Joueur) de la classe Joueur
<sup>
public int compareTo(Joueur autre) {
		return Integer.compare(this.nbVictoires, autre.nbVictoires);
	}
</sup>

#### Question 1.9 : Le résultat obtenu est "Watson est meilleur que Parker"

## - Comparaisons et relations d'ordre

### 2.1 - Collection d'objets dont la classe implémente l'interface Comparable<T>

#### Question 2.1 : Création du projet B2GNSAlgo21

#### Question 2.2 : 
