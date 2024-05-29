/**
    Classe représentant une opération de soustraction.
*/
public class Soustraction extends Operation 
{

    /**
        Constructeur de la classe Soustraction.
    */
    public Soustraction(Expression operande1, Expression operande2) 
    {
        // Appelle le constructeur de la classe mère avec les opérandes donnés.
        super(operande1, operande2);
    }

    /**
        Méthode permettant de calculer la valeur de la soustraction.
    */
    public double valeur() 
    {
        // Soustrait la valeur du deuxième opérande à la valeur du premier opérande.
        return getOperande1().valeur() - getOperande2().valeur();
    }

    /**
        Méthode permettant de représenter l'opération de soustraction sous forme de chaîne de caractères.
    */
    public String toString() 
    {
        // Utilise les valeurs des opérandes et le résultat de la soustraction pour créer une chaîne descriptive.
        return "La soustraction de " + getOperande1().valeur() + " par " + getOperande2().valeur() + " est égal à " + this.valeur();
    }
}
