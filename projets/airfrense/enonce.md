# Développement d'un service de réservation de billets

Dans ce projet, il vous est demandé de réaliser un service de réservation de billets d'avion accessible par le terminal.

### 1. L'interface IHM

L'interface IHM sera le terminal de l'ordinateur. L'utilisateur n'a pas accès à la liste des réservations (qui sont gérées seulement en interne), mais peut faire 2 actions.

**a. Réservation d'un nouveau billet d'avion, à partir des informations suivantes (l'ensemble de ces champs pourront être considérés comme des String à des fins de simplification) :**

- nom complet du passager
- date et heure de départ
- ville de départ
- ville d'arrivée

Suite à la réservation, la nouvelle réservation s'affiche avec les éléments suivants :

- référence du billet (nombre entier généré automatiquement)
- nom complet du passager
- date et heure de départ
- ville de départ
- ville d'arrivée

**b. Annulation d'une réservation existante par la référence du billet, qui permet la suppression du billet dans le système de réservation.**

Ainsi, par ailleurs, l'utilisateur peut effectuer plusieurs réservations à la suite :

```
Que souhaitez-vous faire ? [1: reserver, 2: annuler une reservation] : 1

Veuillez saisir le nom complet du passager : Annie Versaire
Veuillez saisir la date et heure de départ : 02/04/2022 16:30
Veuillez saisir la ville de départ : Paris
Veuillez saisir la ville d'arrivée : Moscou

Votre billet est reserve :
Reference : 48749
Annie Versaire
02/04/2022 16:30
Paris -> Moscou

Que souhaitez-vous faire ? [1: reserver, 2: annuler une reservation] : 2

Veuillez saisir la référence de la reservation : 33333
La réservation n'existe pas.

Que souhaitez-vous faire ? [1: reserver, 2: annuler une reservation] : 2

Veuillez saisir la référence de la reservation : 48749
Votre billet 48749 a bien ete annule.

Que souhaitez-vous faire ? [1: reserver, 2: annuler une reservation] : x

Merci d'avoir utilise le service AirFrense
```

### 2. Conseils d'implémentation

Cette application gère des données, il convient de dévelooper les couches adaptées. En particulier :

1. Créez d'abord les packages
2. Travaillez en bottom-up

L'URI du projet pourra être airfrense.xonatis.com.