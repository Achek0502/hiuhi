import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choix;


        do {


            System.out.println("1 : Exo1");
            System.out.println("2 : Exo2");
            System.out.println("3 : Exo3");
            System.out.println("4 : Exo4");
            System.out.println("5 : Exo5");
            System.out.println("6 : Exo6");
            System.out.println("7 : Exo7");
            System.out.println("8 : Exo8");
            System.out.println("0 : Quitter");
            System.out.print(" votre choix : ");
            choix = input.nextInt();
        } while (choix < 0 || choix > 8);
        switch (choix) {
            case 1:
                int nbKms;
                double frais;
                do {


                    System.out.println("Nombre de kilometres");
                    nbKms = input.nextInt();
                } while (nbKms <= 0);
                if (nbKms <= 25000) {
                    frais = nbKms * 0.32;
                } else {
                    frais = nbKms * 0.22;
                }
                System.out.println("Votre frais" + frais);
                break;
            case 2:
                int AnRelv;
                int noRelv;
                int conso;
                double montant;
                do {
                    System.out.println("ancien relevé");
                    AnRelv = input.nextInt();
                }while (AnRelv < 0);
                do {
                    System.out.println("Nouveau relevé");
                    noRelv = input.nextInt();
                }while (noRelv < AnRelv);
                conso = noRelv-AnRelv;

                if(conso<100)
                {
                    montant= 100 * 0.83;
                }
                else if(conso<=200)
                {
                   montant = 100 * 0.083 + (conso - 100) * 0.076;
                }
                else
                {
                   montant = 100 * 0.083 + 100 * 0.076 + (conso - 200) * 0.06;
                }
                System.out.println("Votre montant" + conso);
                break;
            case 3:
                int nb;
                int somme=0;
                do {


                    System.out.print("Quel est votre nombre ?");
                    nb = input.nextInt();
                }while (nb < 0);

                for(int i=1;i<=100;i++)
                {
                    somme= somme + i;

                }
                System.out.println("La somme est de: " + somme);

                break;
            case 4:
                int valeur;
                int facto = 1;
                do {
                    System.out.print("Quel est votre nombre ?");
                    valeur = input.nextInt();
                }while (valeur < 0);
                for(int i=1;i<=100;i++)
                {
                    facto = facto * i;
                }
                System.out.println("La factorielle est de: " + facto);









                break;


            case 5:
                int nombre;
                do {
                    System.out.print("Quel est votre nombre ?");
                    nombre = input.nextInt();
                }while (nombre < 0);
                for(int i=1;i<= nombre;i++)
                {
                    System.out.print("*");
                }
                System.out.println();


                break;

            case 6:
                int lignes;
                int colonnes;
                do {
                    System.out.print("nombre de lignes");
                    lignes = input.nextInt();
                }while( lignes < 0);

                    do {
                        System.out.print("nombre de colonnes");
                        colonnes  = input.nextInt();
                    }while (colonnes < 0);

                for(int i=1;i<=lignes;i++)
                {
                    for(int j=1;j<=colonnes;j++)
                    {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.println();

                break;

            case 8:


                int nbpropose;
                int nbrechercher;
                int nbCoups = 1;
                nbrechercher = 1 + (int)(Math.random()*100);

                nbrechercher = 1 + (int)(Math.random()*100);
                System.out.println("Nombre a trouver :  " + nbrechercher);

                do {
                    System.out.println("Quelle est votre nombre  :  ");
                    nbpropose = input.nextInt();
                }while(nbpropose < 0);

                while(nbpropose != nbrechercher)
                {

                    if(nbpropose < nbrechercher)
                    {
                        System.out.println(" Trop grand ");
                    }
                    else {
                        System.out.println(" Trop petit ");
                    }

                    do {
                        System.out.print("Quelle est votre nombre :  ");
                        nbpropose = input.nextInt();
                    }while(nbpropose < 0);
                    nbCoups++;
                }
                if(nbpropose == nbrechercher) {

                    System.out.println("Bravo ! Vous avez trouver le nombre :  " + nbrechercher );
                }
                else
                {
                    System.out.println("Perdu : il fallait trouver " + nbrechercher);
                }
                //Sytem.out.println("Exo8");




                break;

            case 7:

                int nbDe;
                int nbA;
                do {


                    System.out.print("Du ");
                    nbDe = input.nextInt();
                }while(nbDe < 0);

                do {
                    System.out.print("jusqu'à");
                    nbA = input.nextInt();
                }while(nbA < 0);
                for(int i=1;i<=nbA;i++)
                {
                    System.out.println(i+"*"+nbDe+"="+i*nbDe);
                }






                break;

            case 0:

                break;
        }

    }
}