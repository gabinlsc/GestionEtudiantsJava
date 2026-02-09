# Gestion de notes 🎓

Une application console en **Java** permettant de gérer les informations d'un étudiant, de saisir ses notes et de générer la note maximale, la moyenne et la mention obtenue. Les données sont enregistrées dans un fichier .csv en local.

Ce projet a été réalisé pour mettre en pratique les concepts fondamentaux de la **Programmation Orientée Objet (POO)**.

## 🚀 Fonctionnalités

Le programme permet de manière interactive de :
- Créer un profil étudiant (Nom, Âge) via un constructeur sécurisé.
- Saisir un ensemble de notes via la console.
- Calculer automatiquement :
  - La **moyenne** générale.
  - La **meilleure note** (Max).
  - La **mention** correspondante (Très bien, Bien, Assez bien...).
- Afficher ces dernières variables.
- Sauvegarde automatique de la liste des étudiants dans un fichier etudiants.csv en fin de session.
- Calcul de la moyenne générale de la promo et désignation du major de promo.

## 🛠️ Concepts techniques abordés

Ce projet met en œuvre les piliers de la POO en Java :

- **Classes et objets** : Modélisation d'une entité `Etudiant`.
- **Encapsulation** : Utilisation des attributs `private` protégés par des **Getters** et **Setters**.
- **Constructeurs** : Initialisation cohérente des objets dès leur création.
- **Logique algorithmique** : Boucles `for`, conditions `if/else`, calcul de cumul et recherche de maximum.
- **Interaction utilisateur** : Utilisation de la classe `java.util.Scanner` pour les entrées clavier.
- **Persistance locale** : Sauvegarde automatique de la liste des étudiants dans un fichier etudiants.csv en fin de session.
- **Analyse de classe** : Calcul de la moyenne générale de la promo et désignation automatique du major de promo.
- **Gestion des flux (I/O)** : Utilisation de FileWriter et PrintWriter pour l'écriture de fichiers.
- **Gestion des exceptions** : Utilisation de blocs `try-catch` et du *try-with-resources* pour sécuriser les opérations critiques.

## 💻 Exemple d'utilisation

Voici à quoi ressemble une exécution du programme dans la console :

```text
Entrez le prénom de l'étudiant : g
Entrer l'âge de l'étudiant : 1
Entrer le nombre de notes à calculer : 1
Entrez la note obtenue n°1 : 1
Voulez-vous ajouter un autre étudiant ? (o/n) : n
Sauvegarde réussie dans etudiants.csv
Major de la promo : Etudiant : g | 1 ans
Notes obtenues par l'élève g : 1.0 | 
Pas de mention
Moyenne : 1.0
Meilleure note : 1.0

-------------------------------------------

-------------------------------------------
Moyenne générale de la classe : 1.0
