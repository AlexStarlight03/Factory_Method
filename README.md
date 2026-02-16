Vous devez aider une compagnie à gérer leur ligne de production. Initialement, ils produisaient uniquement des pianos dans leur usine pour la compagnie Classique. Maintenant, deux nouvelles entreprises veulent faire produire leurs objets chez eux :

Compagnie Neige : production de moto-neiges
Compagnie Loud : production de systèmes de son (haut-parleurs)

Le code actuel fonctionne, mais il pose plusieurs problèmes de conception qui rendront la maintenance et l'évolution difficiles.

## Analyse du code
A) Que se passerait-il si une 4e entreprise voulait utiliser l'usine (ex: Compagnie Rock pour des guitares) ? Quelles parties du code devriez-vous modifier?

B) Observez les trois classes Piano, Snowmobile et Speakers. Qu'ont-elles en commun? Qu'est-ce qui manque pour pouvoir toutes les traiter de la même façon?

C) Identifiez les trois classes qui représentent les produits concrets. Existe-t-il actuellement une abstraction commune pour tous les produits?
  - Si non, créez une interface Product qui définit les méthodes communes à tous les produits.

D) Modifiez les classes Piano, Snowmobile et Speakers pour qu'elles implémentent l'interface Product.

E) Créez une classe abstraite CompanyFactory qui représente une entreprise de base.
```
package com.example;

public abstract class CompanyFactory {
    
    // Déclarez une méthode abstraite createProduct() qui retourne un Product
    
    // Créez une méthode concrète produceProduct() qui :
    // 1. Obtient et crée le prduit
    // 3. Appelle draw() sur le produit
}
```

F) Créez trois classes qui étendent CompanyFactory : ClassiqueCompany, NeigeCompany, LoudCompany.

G) Modifier le fichier Main pour utiliser la Factory Method; selectedCompany devient de type CompanyFactory. Dans select company, retournez les instances des compagnies. Changer ProduceProduct pour plutot appeller la methode sur la compagnie selectionnee.
