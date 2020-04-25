package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String mois = "";
        byte nbJours = 0;
        short annee;
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("De quel mois s'agit il (entrer le numéro correspondant au mois)?:");
        mois = lectureClavier.nextLine();
        mois = mois.replace("û", "u");
        mois = mois.replace("é", "e");
        mois = mois.toLowerCase();
        System.out.println("De quelle année s'agit il ?");
        annee = lectureClavier.nextShort();
        switch (mois) {
            case "janvier":
            case "mars":
            case "mai":
            case "juillet":
            case "aout":
            case "octobre":
            case "decembre":
                nbJours = 31;
                break;
            case "avril":
            case "juin":
            case "septembre":
            case "novembre":
                nbJours = 30;
                break;

            case "février":
                if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
                    nbJours = 29;
                } else {
                    nbJours = 28;
                }
                break;
            default:
                System.out.println("Impossible, ce mois n'existe pas !");
                System.exit(0);
        }
        System.out.println("En " + annee + ", le mois n°" + mois + " a " + nbJours + " jours");
    }
}
