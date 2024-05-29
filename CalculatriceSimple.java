public class CalculatriceSimple
{
    public static void main(String[] args)
    {
        System.out.println("Début du programme");
        System.out.println("");

        /** Nombre operande1= new Nombre(5);
            Nombre operande2= new Nombre(0);
            Operation p = new Addition(operande1,operande2); 
            System.out.println(p.toString());

            Operation m = new Multiplication(operande1, operande2);
            System.out.println(m.toString());

            Operation s = new Soustraction(operande2, operande1);
            System.out.println(s.toString());

            Operation d = new Division(operande1, operande2);
            System.out.println(d.toString());
        */

        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(3) ;
        Expression dixSept = new Nombre(17) ;
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression d = new Division(s, a) ;
        System.out.println(d + " = " + d.valeur()) ; // affiche ((17 - 2) / (2 + 3)) = 3 

        System.out.println("");
        System.out.println("Fin du programme");
    }
}