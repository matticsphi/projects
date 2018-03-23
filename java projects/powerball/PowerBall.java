/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerball;

//import static powerball.PowerBall.sort;

/**
 *
 * @author venka
 */
public class PowerBall {
 static    int[] winningNumber ;
 int[] n;
//  private int[] win ;
//  private int[] tic;
   long cash ;
  static private IntUtil u = new IntUtil();
  int u1 = 0;
    //WRITE CODE HERE

  
 public static int[] sort(int[]n)
 {
int max = n[0];
 System.out.println("Sequence Generated: ");
//  sorting for ascending order
                for (int i = 0; i < n.length-1; i++) 
        {
           // System.out.print(n[i]+",");
        }
        // System.out.print("after sort");
        for (int i = 0; i < n.length-1; i++) 
        {
            for (int j = i + 1; j < n.length-1; j++) 
            {
                if (n[i] > n[j]) 
                {
                   int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        // anna last number ni sort chaiyat ledu constant ga unchesa 5 numbers chesa last number 
        for (int i = 0; i < n.length-1 ; i++) 
        {
            System.out.print(n[i] + ",");
            
                  }
         return n;
    }
  ///////////////////////checkmethod////////////////
    public static int cash(int[]a,int[]b){
      int u1 = 0;
      int x=a.length;
      int y=b.length;
      
      for(int i=0;i<x-1;i++)
      {
          for(int j=0;j<y-1;j++)
          {
              
          }
      }
      
         if(a[0]!=b[0] && a[1]!=b[1] && a[2]!=b[2] && a[3]!=b[3]&& a[4]!=b[4]&& b[5]==10){
           
            u1=4;
          
        }
        else if(a[0]==b[0] &&a[1]!=b[1] && a[2]!=b[2] &&a[3]!=b[3]&& a[4]!=b[4]&&b[5]==10) {
            
            u1=4;
           
        }  
        else if(a[0]==b[0] && a[1]==b[1] && a[2]!=b[2] &&a[3]!=b[3]&& a[4]!=b[4]&&b[5]==10) {
           
             u1=7;
             
        }  
         else if(a[0]==b[0] &&a[1]==b[1] && a[2]==b[2] &&a[3]!=b[3]&& a[4]!=b[4]&&b[5]!=10) {
             u1=7;
            
        } 
          else if(a[0]==b[0] &&a[1]==b[1] && a[2]==b[2] &&a[3]!=b[3]&& a[4]!=b[4]&&b[5]==10) {
            
             u1=100;
            
        } 
           else if(a[0]==b[0] &&a[1]==b[1] && a[2]==b[2] &&a[3]==b[3]&& a[4]!=b[4]&&b[5]!=10) {
           
             u1=100;
            
        } 
            else if(a[0]==b[0] &&a[1]==b[1] && a[2]==b[2] &&a[3]==b[3]&& a[4]!=b[4]&&b[5]==10) {
          
            u1=50000;
           
        } 
            else if(a[0]==b[0] &&a[1]==b[1] && a[2]==b[2] &&a[3]==b[3]&& a[4]==b[4]&&b[5]!=10) {
         
             u1=1000000;
             
        } 
            else if(a[0]==b[0] &&a[1]==b[1] && a[2]==b[2] &&a[3]==b[3]&& a[4]==b[4]&&b[5]==10) {
      
             u1=10000000;
             
        }       
       return u1;               
 }


 PowerBall(int []w,int[]n)
 {
     
 }
  private static void test1() {
    int[] w = {4,8,19,27,24,10} ;
    {
      int [] n= {4,8,19,27,24,10} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {24,27,19,8,4,10} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {24,27,19,8,4,5} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,127,119,18,14,10} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,127,119,18,14,5} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,127,119,18,14} ;
      PowerBall x = new PowerBall(w,n);
    }
    {
      int [] n= {124,124,19,119,18,14} ;
      PowerBall x = new PowerBall(w,n);
    }  
  }
 
  public static void testRandom()
  {  
    int[] w = {4,8,19,24,27,10} ;
    int max = 10000 ;
   long  c = 0 ;
    for (int i = 0; i < max; ++i) {    
      int [] n = u.generateRandomNumber(6,true,1,99);
      PowerBall x = new PowerBall(w,n);
          n=sort(n);
          
     c=c+PowerBall.cash(w,n);
      System.out.println("");
     if(w==n &&cash(w,n)==1000000){
          System.out.println("jackpot");
     }
     else if(w!=n &&cash(w,n)==1000000)
     {
          System.out.println(" Bug in sequence ");
     }
    }
    System.out.println("Out of " + max +" times you win " + c + "$") ;
  }
  
  
  private static void testBench() {
    test1() ;
   testRandom() ;
  }
  
  public static void main(String[] args) {
      

      
    System.out.println("PowerBall.java");
    testBench();
    System.out.println("Done");
  }
  
}


