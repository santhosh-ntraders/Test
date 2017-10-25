/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stech.start;

import java.util.Scanner;

/**
 *
 * @author Santhosh C
 */
public class Test {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a[][] = new int[n][n];
       for(int a_i=0; a_i < n; a_i++){
           for(int a_j=0; a_j < n; a_j++){
               a[a_i][a_j] = in.nextInt();
           }
       }
       
       Long dig1Total=new Long(0);
       Long dig2Total=new Long(0);
        Long dif=new Long(0);
       for(int i=0;i<n;i++){
                dig1Total=dig1Total+ new Long(a[i][i]);
           
           
       }
      System.out.println(dig1Total);
       
       int j=n-1;
       
       for(int i=0;i<n; i++){
                                  
           dig2Total=dig2Total+ new Long(a[i][j]);
           
           j--;
       }
      
       System.out.println(dig2Total);
       
       
       if(((dig1Total - dig2Total) % 2) == 0){

           dif = ((dig1Total - dig2Total));
           
           
       }else{
           dif = (-(dig1Total - dig2Total));
       }
           
       
       System.out.println(dif);
       
       
   }
}
