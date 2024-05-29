/**
 * Classe représentant une opération de division.
 * Cette classe étend la classe abstraite Operation.
 */
public class Division extends Operation {

    /**
        Constructeur de la classe Division.
    */
    public Division(Expression operande1, Expression operande2) {
        // Appelle le constructeur de la classe mère avec les opérandes donnés.
        super(operande1, operande2);
    }

    /**
        Méthode permettant de calculer la valeur de la division.
        Return Le résultat de la division.
        ArithmeticException si le dénominateur est nul.
    */
    public double valeur() throws ArithmeticException {
        // Vérifie si le dénominateur est nul.
        if (getOperande2().valeur() == 0) {
            // Lance une exception si le dénominateur est nul.
            throw new ArithmeticException("Le dénominateur est nul");
        }
        // Effectue la division et retourne le résultat.
        return getOperande1().valeur() / getOperande2().valeur();
    }

    /**
        Méthode permettant de représenter l'opération de division sous forme de chaîne de caractères.
    */
    public String toString() {
        /** toString pour l'affichage d'un exemple de l'exercice */
        return "(" + getOperande1().toString() + " / " + getOperande2().toString() + ")";
        
        /** 
        Utilisation d'un toString basique  
        return "La divison de " + getOperande1().valeur() + " par " + getOperande2().valeur() + " donne " + this.valeur(); 
        */
    }
}
