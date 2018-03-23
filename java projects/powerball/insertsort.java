/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerball;

/**
 *
 * @author venka
 */
// testing insert sorting
public class insertsort {
    
    public static void main(String[] args) 
    {
        int[] n={1,9,8,4,5}; //, temp;
        
        for (int i = 0; i < n.length; i++) 
        {
            System.out.print(n[i]);
        }
        for (int i = 0; i < n.length; i++) 
        {
            for (int j = i + 1; j < n.length; j++) 
            {
                if (n[i] > n[j]) 
                {
                   int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < n.length; i++) 
        {
            System.out.print(n[i] + ",");
        }
     
    }
}
  
  
  /*
//        System.out.println("\n");
// for (int j = 1; j < y.length; j++) {
//            int key = y[j];
//            int i = j-1;
//            while ( (i > -1) && ( y[i] > key ) ) {
//                y [i+1] = y [i];
//                i--;
//            }
//            y[i+1] = key;
//            System.out.print(y);
//    }
}
}
*/