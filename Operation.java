/** Classe abstraite représentant une opération mathématique. */
public abstract class Operation {
    // Les opérandes de l'opération
    private Nombre operande1;
    private Nombre operande2;

    /** Constructeur de la classe Operation. */
    public Operation(Nombre UneOperande1, Nombre UneOperande2) {
        this.operande1 = UneOperande1;
        this.operande2 = UneOperande2;
    }

    /** Méthode abstraite représentant le calcul de la valeur de l'opération.*/
    public abstract int valeur();

    /** Getter pour obtenir le premier opérande de l'opération.*/
    public Nombre getOperande1() {
        return this.operande1;
    }

    /** Getter pour obtenir le deuxième opérande de l'opération.*/
    public Nombre getOperande2() {
        return this.operande2;
    }
}
