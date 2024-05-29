/**
    La classe Multiplication représente une opération de multiplication entre deux nombres.
    Elle hérite de la classe Operation.
*/
public class Multiplication extends Operation
{
    /**
        Constructeur de la classe Multiplication.
    */
    public Multiplication(Expression operande1, Expression operande2)
    {
        super(operande1, operande2);
    }

    /**
        Calcule et retourne la valeur de la multiplication des deux opérandes.
    */
    public double valeur()
    {
        return getOperande1().valeur() * getOperande2().valeur();
    }

    /**
        Renvoie une représentation sous forme de chaîne de caractères de l'opération de multiplication.
    */
    public String toString()
    {
        /** toString pour l'affichage d'un exemple de l'exercice */
        return "(" + getOperande1().toString() + " * " + getOperande2().toString() + ")";

        /**
        Utilisation d'un toString basique  
        return "La multiplication de " + getOperande1().valeur() + " par " + getOperande2().valeur() + " donne " + this.valeur();
        */
    }
}
