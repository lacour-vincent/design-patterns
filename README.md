# Design-patterns

## Principes OO

```
- Encapsulez ce qui varie.

- Préférer la composition à l'héritage.

- Programmer des interfaces, non des implémentations.

- Efforcez-vous de coupler faiblement les objets qui interagissent.

- Les classes doivent être ouvertes à l'extension mais fermées à la modification.

- Dépendez des abstractions. Ne dépendez pas des classes concrêtes.
```

## Patterns OO

__Observateur__ <br/>
Définit une relation entre objets de type un-à-plusieurs, de façon que, lorsque un objet change d'état, tous ceux qui en dépendent en soient notifiés et soient mis à jour automatiquement.

__Décorateur__ <br/>
Attache des responsabilités supplémentaires à un objet de façon dynamique. Il permet une solution alternative pratique à la dérivation pour étendre les fonctionnalités.

__Fabrication__ <br/>
Définit une interface pour la création d'un objet, mais en laissant aux sous-classes le choix des classes à instancier. Fabrication permet à une classe de déléguer l'instanciation à des sous-classes.

__Singleton__ <br/>
Garantit qu'une classe n'a qu'une seule instance et fournit un point d'accès de type global à cette instance.

