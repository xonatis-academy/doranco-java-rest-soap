# Développement d'un service de suivi de tâches

Dans ce projet, il vous est demandé de réaliser un service de suivi de tâches accessible par le terminal.

### 1. L'interface IHM

L'interface IHM sera le terminal de l'ordinateur. Jusqu'à ce que l'utilisateur entre la lettre "x", ce qui lui permet de quitter l'application, il voit tout d'abord la liste des tâches à faire et ensuite, il peut renseigner le numéro de la tâche à marquer comme effectuée.

Par exemple :

```
Liste des taches a effectuer :
1: Développer un robot magique
2: Acheter une licorne
3: Partir vivre dans une tasse
4: Ajouter des enceintes a la bouteille d'eau

Quelle tache voulez-vous marquer comme effectuee ? 2

Liste des taches a effectuer :
1: Développer un robot magique
3: Partir vivre dans une tasse
4: Ajouter des enceintes a la bouteille d'eau

Quelle tache voulez-vous marquer comme effectuee ? 4

Liste des taches a effectuer :
1: Développer un robot magique
3: Partir vivre dans une tasse

Quelle tache voulez-vous marquer comme effectuee ? x

Bye !

```

### 2. Conseils d'implémentation

Cette application gère des données, il convient de dévelooper les couches adaptées. En particulier :

1. Créez d'abord les packages
2. Travaillez en bottom-up

Je vous rappelle qu'un provider gére l'accès aux données en CRUD. C'est-à-dire qu'il devra permettre la modification.

L'URI du projet pourra être `tasks.xonatis.com`.

