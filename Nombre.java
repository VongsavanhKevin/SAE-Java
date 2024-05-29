/**
    Classe représentant un nombre entier.
*/
public class Nombre extends Expression{
    // La valeur du nombre
    private int valeurNombre;

    /**
        Constructeur de la classe Nombre.
    */
    public Nombre(Nombre uneValeur) 
    {
        this.valeurNombre = uneValeur.valeurNombre;
    }
    
    public Nombre(int uneValeur) 
    {
        this.valeurNombre = uneValeur;
    }
    /**
        Méthode permettant d'obtenir la valeur du nombre.
    */
    public double valeur() 
    {
        return this.valeurNombre;
    }

    /**
        Méthode permettant de représenter le nombre sous forme de chaîne de caractères.
    */
    public String toString() 
    {
        // Utilise la valeur du nombre pour créer une chaîne descriptive.
        return "" + this.valeurNombre;

        /* return "La valeur du nombre est : " + this.valeur() + "\n";*/
    }
}

