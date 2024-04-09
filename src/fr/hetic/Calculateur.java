package fr.hetic;

public class Calculateur {
    public static void main(String[] args) {
        if (args.length != 3) {
          System.out.println("Usage: java Calculateur <nombre1> <opérateur> <nombre2>");
            System.out.println("Opérateurs valides : +, -, x.");
            return;
        }
        double nombre1, nombre2, resultat;
        try {
            nombre1 = Double.parseDouble(args[0]);
            nombre2 = Double.parseDouble(args[2]);
        } catch (NumberFormatException e) {
            System.out.println("Le premier et le troisième paramètre doivent être des nombres valides.");
            return;
        }
        String operateur = args[1];
        
        switch (operateur) {
            case "+":
                resultat = nombre1 + nombre2;
                break;
            case "-":
                resultat = nombre1 - nombre2;
                break;
            case "x":
                resultat = nombre1 * nombre2;
                break;
            default:
                System.out.println("Opérateur non pris en charge.");
                return;
        }
        System.out.println("Résultat : " + resultat);
    }
}

