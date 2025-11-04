import java.text.DecimalFormat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choix = 0;
        DecimalFormat df = new DecimalFormat("#.###");
        do
        {
            do
            {
                System.out.println("1 : Exercice 1");
                System.out.println("2 : Exercice 2");
                System.out.println("3 : Exercice 3");
                System.out.println("4 : Exercice 4");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = input.nextInt();

            }while(choix < 0 || choix > 4);

            switch(choix)
            {
                case 1 :
                    int jouet;
                    int livre;
                    int membre;
                    int neuf;
                    int occasion;
                    int jours;
                    int prix;
                    do {
                        System.out.print( "Nombre de jours: ");

                            jours = input.nextInt();



                    }while (jours < 0 );

                    System.out.print("CATEGORIE: ");
                        livre = input.nextInt();
                        jours = input.nextInt();
                        do {
                            System.out.print( "ETAT: ");
                            membre = input.nextInt();
                        }while (membre < 0 || membre > 1);




                    break;
                case 2 :
                    int age;
                    int licencié;
                    int assurence;
                    int carte;
                    do {
                        System.out.print( "quel est votre age: ");
                        age = input.nextInt();
                    }while(age < 0);
                    do {
                        System.out.print( "Etes vous licencié oui/non: ");
                        licencié = input.nextInt();
                    }while(licencié= oui/non);
                    do {
                        System.out.print( "Possedez vous l'assurence: ");
                        assurence = input.nextInt();
                    }while(assurence = oui/non);


                    break;
                case 3 :
                    int nbetoile;
                    break;
                case 4 :
                    int pierre=0;
                    int feuille=1;
                    int ciseaux=2;
                    int J1;
                    int J2;
                    do {
                        do {
                            System.out.print("J1: ");

                            J1 = input.nextInt();}

                        while (J1 < 0 || J1 > 2 );
                    do {
                        System.out.println("J2: ");
                        J2 = input.nextInt();
                    }while (J2 < 0 || J2 > 2);

            }while(pierre < feuille || pierre > ciseaux || ciseaux > feuille);



                    break;
                case 0 :
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
        }while(choix!=0);





    }
