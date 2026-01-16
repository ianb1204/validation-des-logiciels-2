# Validation des logigicels 2 - exercice 8

### Exercice 8 : Write unit tests for the bank domain

L'exécution de la suite de tests unitaires a permis d'identifier plusieurs défauts de conception dans la logique métier de la classe BankAccount. Voici la synthèse des bugs relevés :

**1. Méthode ```withdrawMoney``` (Retrait)**
* Erreur aux limites : Une erreur de comparaison (< au lieu de <=) empêchait le retrait d'une somme exactement égale à la limite autorisée (```withdrawLimit```).
* Absence de contrôle sur le montant nul : Le système autorise des retraits de 0, marquant la transaction comme réussie sans modifier l'état du compte, ce qui est une incohérence métier.
* Vulnérabilité aux types de données : L'absence de validation des valeurs flottantes spéciales (Infinity, NaN) permet des opérations corrompant l'intégrité du solde.

**2. Méthode ```depositMoney``` (Dépôt)**
* Validation des montants : La fonction accepte des dépôts de 0, ce qui devrait être rejeté pour éviter des écritures inutiles en base de données ou dans les logs.
* Gestion des valeurs extrêmes : Le code ne protège pas contre les dépassements de capacité (Double.MAX_VALUE) ou les valeurs invalides (Infinity, NaN), risquant de rendre le solde du compte inutilisable après l'opération.

------

**Conclusion de l'exercice :**

Ces tests ont démontré l'importance de la couverture des cas limites (edge cases). La correction de ces bugs nécessite l'ajout de structures conditionnelles de contrôle (if) pour valider les paramètres d'entrée avant toute modification d'attribut.