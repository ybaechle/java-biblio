# java-biblio

Exercice d'apprentissage **Java / POO** : modélisation d'une petite bibliothèque.

> Projet pédagogique centré sur la conception des classes métier
> (encapsulation, immutabilité des identifiants, gestion d'état).

## Contenu

- **`Book`** — un livre caractérisé par un titre, un auteur, un ISBN (immuables)
  et un état d'emprunt (`isBorrowed`).
- **`Member`** — un membre de la bibliothèque.
- **`Main`** — point d'entrée du programme.

## Concepts travaillés

- Encapsulation (attributs privés, getters/setters)
- Champs `final` pour les données identifiantes
- Modélisation d'un domaine simple en amont d'une logique d'emprunt

## Exécution

Prérequis : JDK 17+.

```bash
javac -d out src/*.java src/model/*.java
java -cp out Main
```

## Licence

Distribué sous licence MIT. Voir [LICENSE](LICENSE).
