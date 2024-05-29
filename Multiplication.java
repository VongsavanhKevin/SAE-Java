/**
    La classe Multiplication représente une opération de multiplication entre deux nombres.
    Elle hérite de la classe Operation.
*/
public class Multiplication extends Operation
{
    /**
        Constructeur de la classe Multiplication.
    */
    public Multiplication(Nombre operande1 , Nombre operande2)
    {
        super(operande1, operande2);
    }

    /**
        Calcule et retourne la valeur de la multiplication des deux opérandes.
    */
    public int valeur()
    {
        return getOperande1().valeur() * getOperande2().valeur();
    }

    /**
        Renvoie une représentation sous forme de chaîne de caractères de l'opération de multiplication.
    */
    public String toString()
    {
        return "La multiplication de " + getOperande1().valeur() + " par " + getOperande2().valeur() + " est égale à " + this.valeur();
    }
}
