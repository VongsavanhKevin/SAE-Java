/**
 * Classe abstraite représentant une expression mathématique.
 * Elle sert de base pour d'autres classes qui doivent implémenter les méthodes abstraites définies ici.
*/
public abstract class Expression
{
    /**
     * Méthode abstraite pour obtenir la valeur de l'expression
     * Cette méthode doit être implémentée par les sous-classes de Expression.
     * Retourne la valeur numérique de l'expression
    */
    public abstract double valeur();
}
