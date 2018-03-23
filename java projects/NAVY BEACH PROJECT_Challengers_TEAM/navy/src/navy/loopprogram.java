package navy;

import java.util.Random;
import java.util.Scanner;

/**
 * Team: Challengers
 * @author venka
 * version 1.5 - Final
 * Developers: Swamy, Ram, Louis
 */
public class loopprogram {
    
    //Main method

    public static void main(String[] args) {
        System.out.println("NM:NON MOVABLE MINES");
        System.out.println("NB:NON MOVABLE bUNKERS");
        System.out.println("M :MARINES");
        System.out.println("SA:SAPPERS");
        System.out.println("MA:MAJORS");
        System.out.println("SE:SERGEANTS");
        System.out.println("C :CAPTAIN");
        System.out.println("L :LIEUTENANTS");
        System.out.println("W :LAKE");
        System.out.println("B--BLUE " + "E--ENIMES  ");
        System.out.println("");
        System.out.println("");
        System.out.println(" NAVY BEACH ");
        System.out.println("");
        String[] b = new String[132];
        int c = 0;
        
        //Navy Battle Method
        b = battle_start();
        System.out.println(" Select Position To Blow Up A Brown Bunker: ");
        Scanner i = new Scanner(System.in);
        //int x = i.nextInt();
        int count = 0;
        int count1 = 0;
        int moves=0;

        ///////////////Bullet Firing Code ////////
        ////BLUE TEAM sapper for blowing up enemies
        do {
            int s = i.nextInt();
            //randomint(1,10);
            //127 implies enemies non movable bunker position
            if (s == 127) {
                
                // Calling the method
                
                battle_start();
                System.out.println("\n");
                System.out.println("Blue own the game");

                break;
            } else {
                System.out.println(4-count+ " More Sappers left");
                count++;
                
                if(count==5){
                    b[16]=null;b[17]=null;b[18]=null;b[19]=null;b[20]=null;
                }
                //System.out.println(count); 
            }
            
            

        } while (count < 5);
        /// for blowing up blue bunker
         do {
             //opposition team
             System.out.println("BROWN TEAM TURN");
            System.out.println(" Select Position To Blow Up A Blue Bunker: ");
             int s1 = i.nextInt();
            //randomint(1,10);
            // 6 represents non movable bunker position
            if (s1 == 6) {
                battle_start();
                System.out.println("\n");
                System.out.println("Brown won the game");

                break;
            } else {
                System.out.println(4-count1+ " More Sappers left");
                count1++;
                
                if(count1==5){
                    b[115]=null;b[116]=null;b[117]=null;b[118]=null;b[119]=null;
                }
                //System.out.println(count); 
            }
            
            }while (count1 < 5);
        
        ////////// To continue loop: Logic for Blue Teams Turn
        do {
            System.out.println("BLue Team Turn");
            System.out.println("Select The Postion You want to Move");
            int x = i.nextInt();
            String fil=b[x];
            //b[x]=null;
            System.out.println("Select desired position to replace "+x+ " position to : ");
             int y = i.nextInt();
            //randomint(1,10);
            if (b[x] == null) {
                
                //Selecting the positions
                
                System.out.println("\n");
                System.out.println("Postion is empty please select other postion");
            } 
            else if(b[x] !=null)  {
                if(b[y]!=null){
                    System.out.println("Position is not empty");
                }
                else{
                    
                b[y]=fil;
                b[x]=null;
                }
                
            }
            /////////////////////Now Enemy teams turn///////////////
            System.out.println(" ITS BROWN TEAM TURN ");
            System.out.println("Select The Postion You want to Move");
            int x1 = i.nextInt();
            String fill=b[x1];
            //b[x]=null;
            System.out.println("Select desired position to replace "+ x1 + " position to : ");
             int y1 = i.nextInt();
            //randomint(1,10);
            if (b[x1] == null) {
                
                System.out.println("\n");
                System.out.println("Postion is empty please select other postion");
            } 
            else if(b[x1] !=null)  {
                if(b[y1]!=null){
                    System.out.println("Position is not empty");
                }
                else{
                    
                b[y1]=fill;
                b[x1]=null;
                }
            }
           /* for(int z=0;z<110; z++){
                if(b[z+10].equals(b[z])){
                    b[z]=null;
                    b[z+10]=null;
                }    
            }*/
            for (int f = 0; f < 1; f++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(0-10)");
            System.out.println("");
        }
        for (int f = 0; f < 1; f++) {
            for (int j = 11; j < 22; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(11-22)");
            System.out.println("");
        }
        for (int f = 0; f < 1; f++) {
            for (int j = 22; j < 33; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(22-33)");
            System.out.println("");
        }
        for (int f = 0; f < 1; f++) {
            for (int j = 33; j < 44; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(33-43)");
            System.out.println("");
        }
        for (int f = 0; f < 1; f++) {
            for (int j = 44; j < 55; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(44-55)");
            System.out.println("");
        }
        for (int f = 0; f < 1; f++) {
            for (int j = 55; j < 66; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(55-66)");
            System.out.println("");
        }
        for (int f = 0; f< 1; f++) {
            for (int j = 66; j < 77; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(66-77)");
            System.out.println("");
        }
        for (int f = 0; f < 1; f++) {
            for (int j = 77; j < 88; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(77-88)");
            System.out.println("");
        }
        for (int f = 0; f < 1; f++) {
            for (int j = 88; j < 99; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(88-99)");
            System.out.println("");
        }
        for (int f = 0; f< 1; f++) {
            for (int j = 99; j < 110; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(99-109)");
            System.out.println("");
        }
        for (int f = 0; f < 1; f++) {
            for (int j = 110; j < 121; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(110-120)");
            System.out.println("");
        }
        for (int f = 0; f < 1; f++) {
            for (int j = 121; j < 132; j++) {
                System.out.print("| " + b[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(121-131)");
            System.out.println("");
        }
        /*for(int z=0;z<110; z++){
                if(b[z+11].equals(b[z])){
                    b[z]=null;
                    b[z+10]=null;
                } 
        }    */

        } while (moves < 5);
    }

    
    // Below code to be impelemented in the future
    public static String[][] initBoard() {
        String[][] shades = new String[100][100];
        // print array in rectangular form
        for (int r = 0; r < 100; r++) {
            for (int c = 0; c < 100; c++) {
                shades[r][c] = " ";//your value
            }
        }

        return shades;
    }

    //////////bullet method///////////////
    public static boolean bullet(int count) {
        boolean x = false;

        if (count == 0) {
            x = false;
        } else {
            x = true;
        }
        return x;
    }
    ////////////////////Random Number Generator///////////////

    public static int randomint(int min, int max) {

        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

    ////////////////////////Battle Start - Business Logic//////////////////////
    public static String[] battle_start() {
        String[] a = new String[132];

        //a[0]=1;a[1]=1;a[2]=1;a[3]=1;a[4]=1;
        //a[5]=1;a[6]=1;a[7]=1;a[8]=1;a[9]=1;a[10]=1;
        // a[11]=2;a[12]=2;a[13]=2;a[14]=2;a[15]=2;a[16]=2;a[17]=2;a[18]=2;a[19]=2;a[20]=2;
        //a[21]=3;a[22]=3;a[23]=3;a[24]=3;a[25]=3;a[26]=3;a[27]=3;a[28]=3;a[29]=3;a[30]=3; */
        for (int k = 0; k < 6; k++) {
            a[k] = "B-NM";
        }
        
        a[6] = "B-NB";

        for (int l = 7; l < 16; l++) {
            a[l] = "B-M ";
        }
        for (int l1 = 16; l1 < 21; l1++) {
            a[l1] = "B-SA";
        }
        
        for (int l2 = 21; l2 < 24; l2++) {
            a[l2] = "B-C ";
        }

        a[24] = "B-G ";

        for (int l2 = 25; l2 < 28; l2++) {
            a[l2] = "B-MA";
        }
        for (int l2 = 28; l2 < 36; l2++) {
            a[l2] = "B-L ";
        }
        for (int l2 = 36; l2 < 40; l2++) {
            a[l2] = "B-SE";
        }
        for (int l2 = 40; l2 < 88; l2++) {
           // a[l2] = "    ";
        }
        for (int l2 = 92; l2 < 96; l2++) {
            a[l2] = "E-SE";
        }
        for (int l2 = 96; l2 < 99; l2++) {
            a[l2] = "E-MA";
        }
        
        for (int l2 = 98; l2 < 101; l2++) {
            a[l2] = "E-C ";
        }
        a[120]="E-C ";
        for (int l2 = 101; l2 < 109; l2++) {
            a[l2] = "E-L ";
        }
        a[109] = "E-G ";
        for (int l2 = 110; l2 < 115; l2++) {
            a[l2] = "E-M ";
        }
        for (int l2 = 128; l2 <132; l2++) {
            a[l2] = "E-M ";
        }
        //a[125] = "E-NB";
        for (int l2 = 115; l2 < 120; l2++) {
            a[l2] = "E-SA";
        }
       // a[105] = "E-G ";
        for (int l2 = 121; l2 < 127; l2++) {
            a[l2] = "E-NM";
        }
        a[127]="E-NB";
         for (int l2 = 88; l2 < 92; l2++) {
           // a[l2] = "    ";
        }
        a[46] = " W  ";
        a[47] = " W  ";
        a[48] = " W  ";
        a[57] = " W  ";
        a[58] = " W  ";
        a[71] = " W  ";
        a[72] = " W  ";
        a[64] = " W  ";
        a[75] = " W  ";
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(0-10)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 11; j < 22; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(11-22)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 22; j < 33; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(22-33)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 33; j < 44; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(33-43)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 44; j < 55; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(44-55)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 55; j < 66; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(55-66)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 66; j < 77; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(66-77)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 77; j < 88; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(77-88)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 88; j < 99; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(88-99)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 99; j < 110; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(99-109)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 110; j < 121; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(110-120)");
            System.out.println("");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 121; j < 132; j++) {
                System.out.print("| " + a[j] + " ");
            }
            System.out.print("|");
            System.out.print(" " + "(121-131)");
            System.out.println("");
        }
        return a;
    }

}
