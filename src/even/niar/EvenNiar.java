/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package even.niar;



/**
 *
 * @author user
 */
public class EvenNiar {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static void main(String[] args) {
        new myClass();
        /*kind A;
        kind B;
        
        A = kind.even;
        B = kind.misparaim;
        
        System.out.println(evenNiarMisparaim(A, B));*/

        }
    public static int evenNiarMisparaim(kind A,kind B){
      
    if(A == B){
           return 0;
        }else if(A == kind.even){
                 if(B == kind.niar){
                    return 2;
                 }else{
                 return 1;
                 }
                 }else if(A == kind.niar){
                          if(B == kind.even){
                             return 1;
                         }else{
                         return 2;
                         }
                         }else if(B == kind.even){
                                  return 2;
                         }else{
                         return 1;
                         }
         
    
    
    }
    }
    enum kind{
    even,
    niar,
    misparaim
    }
   

