# Validation des logigicels 2 - exercice 9

### Exercice 9 : Increase coverage with JaCoCo

Le coverage de ```BankAccount``` est à 19%, je vais donc choisir cette classe. Dans cette classe, la méthode ```loadFromText(String)```àà un coverage de 0%, je vais rajouter un test la concernant :

```java
public void testLoadFromText_FileNotFound() {
    int result = account.loadFromText("non_existent_file.txt");
    
    assertEquals("Le nombre de comptes chargés devrait être 0 pour un fichier inexistant", 0, result);
}
```

Je réexecute la commande ```mvn test``` et sur jaCoCo, ma classe est passée à 25% de coverage et la fonction de 0% à 18%.