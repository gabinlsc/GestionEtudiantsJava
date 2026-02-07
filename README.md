# Gestion de notes 🎓

Une application console en **Java** permettant de gérer les informations d'un étudiant, de saisir ses notes et de générer la note maximale, la moyenne et la mention obtenue.

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

## 🛠️ Concepts techniques abordés

Ce projet met en œuvre les piliers de la POO en Java :

- **Classes et objets** : Modélisation d'une entité `Etudiant`.
- **Encapsulation** : Utilisation des attributs `private` protégés par des **Getters** et **Setters**.
- **Constructeurs** : Initialisation cohérente des objets dès leur création.
- **Logique algorithmique** : Boucles `for`, conditions `if/else`, calcul de cumul et recherche de maximum.
- **Interaction utilisateur** : Utilisation de la classe `java.util.Scanner` pour les entrées clavier.

## 💻 Exemple d'utilisation

Voici à quoi ressemble une exécution du programme dans la console :

```text
Entrer le prénom de l'étudiant :
Thomas
Entrer l'âge de l'étudiant :
20
L'étudiant se nomme Thomas, il a 20 ans

Entrez la note obtenue n°1 :
15,5
Entrez la note obtenue n°2 :
18
...

Notes obtenues : 10.0 | 10.0 | 15.0 | 20.0 | 20.0 |
Mention bien
Moyenne : 15.8
Meilleure note : 18.0
