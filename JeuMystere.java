package JAVA2;
import java.util.*;
import java.lang.System.*;
public class JeuMystere {

    public static void main(String[] args) {
        System.out.println("-------- Bienvenue au jeux du mystère --------");
        System.out.println("-------- Veuillez choisir le niveaux : --------\n-------- 1: Niveau Facile --------"
                + "\n-------- 2: Niveau Moyen --------\n-------- 3: Niveau Difficile --------"
                + "\n-------- 4: Quitter --------");
        Scanner sc=new Scanner(System.in);
        int choix=sc.nextInt();
        int nbr=0;
        int compt=1;
        switch(choix){
            case 1:
                int result=(int) (Math.random() *101);
                do{

                    System.out.println("--->Donner le nombre entre 0 est 100");
                    nbr=sc.nextInt();
                    if(nbr<0 || nbr>100 ){
                        System.out.println("Choix incorrect !!!");
                        System.exit(0);
                    }
                    else{
                        if(nbr==result){
                            System.out.println("Bravo ! vous avez gagne au bout de "+(compt)+" tentatives");
                            return;
                        }
                        else if(nbr<result){
                            System.out.println("C'est plus, Il vous reste "+(15-compt)+" tentatives");
                        }
                        else{
                            System.out.println("C'est moins, Il vous reste "+(15-compt)+" tentatives");
                        }
                    }
                    compt ++;
                }while((compt)!=16);
                //System.out.println(result);
            case 2:
                int result1=(int) (Math.random() *1001);
                nbr=0;
                compt=1;
                do{

                    System.out.println("--->Donner le nombre entre 0 est 1000");
                    nbr=sc.nextInt();
                    if(nbr<0 || nbr>1000 ){
                        System.out.println("Choix incorrect !!!");
                        System.exit(0);
                    }
                    else{
                        if(nbr==result1){
                            System.out.println("Bravo ! vous avez gagne au bout de "+(compt)+" tentatives");
                            return;
                        }
                        else if(nbr<result1){
                            System.out.println("C'est plus, Il vous reste "+(10-compt)+" tentatives");
                        }
                        else{
                            System.out.println("C'est moins, Il vous reste "+(10-compt)+" tentatives");
                        }
                    }
                    compt ++;
                }while((compt)!=11);
            case 3:
                int result2=(int) ((Math.random() * (100 - 10)) + 10);
                Random r = new Random();
                char result3 = (char)(r.nextInt(26) + 'a');
                String result4=result3+"ab";
                nbr=0;
                compt=1;
                do{
                    System.out.println("--->Donner le nombre entre 10 est 100");
                    nbr=sc.nextInt();
                    Scanner sc1=new Scanner(System.in);
                    System.out.println("--->Donner le caractere entre 'a' est 'z'");
                    String choixString=sc1.nextLine().toLowerCase();
                    if((nbr<10 || nbr>100 )||(choixString.charAt(0)<'a' && choixString.charAt(0) > 'z')){
                        System.out.println("Choix incorrect !!!");
                        System.exit(0);
                    }
                    else{
                        if(nbr==result2 && result4.charAt(0)==choixString.charAt(0)){
                            System.out.println("Le nombre est correct : "+nbr);
                            System.out.println("Le caractere est correct : "+choixString);
                            System.out.println("Bravo ! vous avez gagne au bout de "+(compt)+" tentatives");
                            return;
                        }
                        else if(nbr==result2 && result4.charAt(0)>choixString.charAt(0)){
                            System.out.println("Le nombre est correct : "+nbr);
                            System.out.println("Le caractere est aprés : "+choixString);
                            System.out.println(" Il vous reste "+(10-compt)+" tentatives");
                        }
                        else if(nbr==result2 && result4.charAt(0)<choixString.charAt(0)){
                            System.out.println("Le nombre est correct : "+nbr);
                            System.out.println("Le caractere est avant : "+choixString);
                            System.out.println(" Il vous reste "+(10-compt)+" tentatives");
                        }
                        else if(nbr<result2 && result4.charAt(0)==choixString.charAt(0)){
                            System.out.println("c'est plus pour le nombre : "+nbr);
                            System.out.println("Le caractere est correct : "+choixString);
                            System.out.println(" Il vous reste "+(10-compt)+" tentatives");
                        }
                        else if(nbr>result2 && result4.charAt(0)==choixString.charAt(0)){
                            System.out.println("c'est moins pour le nombre : "+nbr);
                            System.out.println("Le caractere est correct : "+choixString);
                            System.out.println(" Il vous reste "+(10-compt)+" tentatives");
                        }
                        else if(nbr>result2 && result4.charAt(0)>choixString.charAt(0)){
                            System.out.println("c'est moins pour le nombre : "+nbr);
                            System.out.println("Le caractere est aprés : "+choixString);
                            System.out.println(" Il vous reste "+(10-compt)+" tentatives");
                        }
                        else if(nbr>result2 && result4.charAt(0)<choixString.charAt(0)){
                            System.out.println("c'est moins pour le nombre : "+nbr);
                            System.out.println("Le caractere est avant : "+choixString);
                            System.out.println(" Il vous reste "+(10-compt)+" tentatives");
                        }
                        else if(nbr<result2 && result4.charAt(0)<choixString.charAt(0)){
                            System.out.println("c'est plus pour le nombre : "+nbr);
                            System.out.println("Le caractere est avant : "+choixString);
                            System.out.println(" Il vous reste "+(10-compt)+" tentatives");
                        }
                        else if(nbr<result2 && result4.charAt(0)>choixString.charAt(0)){
                            System.out.println("c'est plus pour le nombre : "+nbr);
                            System.out.println("Le caractere est apres : "+choixString);
                            System.out.println(" Il vous reste "+(10-compt)+" tentatives");
                        }
                    }
                    compt ++;
                }while((compt)!=11);
            case 4:
                break;
            default:
                System.out.println("choix incorrect");
        }
    }

}