# Validation des logigicels 2 - exercice 7

### Exercice 7 : Cycle de vie Maven et Dépendances

1. Analyse des commandes et phases exécutées :
    * ```mvn clean``` : Exécute la phase de nettoyage en supprimant le dossier /target.
    * ```mvn test``` : Compile les sources et les tests, puis exécute les tests unitaires.
    * ```mvn package``` : Compile, teste et génère l'archive du projet (fichier JAR). Chaque commande exécute automatiquement les phases précédentes de son cycle.

2. Contenu du dossier ```/target``` : 
    * ```classes/``` et ```test-classes/``` (fichiers compilés).
    * ```surefire-reports/``` (résultats des tests).
    * ```archive.jar``` (le livrable final).
    * ```maven-archiver/``` et ```maven-status/``` (métadonnées Maven).

3. ```verify``` : La commande mvn test se limite à valider la logique du code via des tests unitaires. mvn package transforme ce code en un artefact (JAR). mvn verify va plus loin : il examine l'archive générée et exécute souvent des tests d'intégration pour confirmer que le projet respecte tous les critères de qualité avant d'être considéré comme prêt pour le déploiement.