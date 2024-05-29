/**
    Classe représentant un nombre entier.
*/
public class Nombre {
    // La valeur du nombre
    private int valeurNombre;

    /**
        Constructeur de la classe Nombre.
    */
    public Nombre(int UneValeur) 
    {
        this.valeurNombre = UneValeur;
    }

    /**
        Méthode permettant d'obtenir la valeur du nombre.
    */
    public int valeur() 
    {
        return this.valeurNombre;
    }

    /**
        Méthode permettant de représenter le nombre sous forme de chaîne de caractères.
    */
    public String toString() 
    {
        // Utilise la valeur du nombre pour créer une chaîne descriptive.
        return "La valeur du nombre est : " + this.valeur() + "\n";
    }
}

