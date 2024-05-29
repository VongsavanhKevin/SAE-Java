/**
    Classe représentant une opération d'addition.
    Cette classe étend la classe abstraite Operation.
*/
public class Addition extends Operation {

    /** 
        Constructeur de la classe Addition.
    */
    public Addition(Nombre operande1, Nombre operande2) {
        
        super(operande1, operande2); // Appelle le constructeur de la classe mère avec les opérandes donnés.
    }

    /**
        Méthode permettant de calculer la valeur de l'addition.
    */
    public int valeur() {
        
        return getOperande1().valeur() + getOperande2().valeur(); // Additionne les valeurs des deux opérandes.
    }

    /**
        Méthode permettant de représenter l'opération d'addition sous forme de chaîne de caractères.
    */
    public String toString() {
        // Utilise les valeurs des opérandes et le résultat de l'addition pour créer une chaîne descriptive.
        return "L'addition de " + getOperande1().valeur() + " par " + getOperande2().valeur() + " est égal à " + this.valeur();
    }
}