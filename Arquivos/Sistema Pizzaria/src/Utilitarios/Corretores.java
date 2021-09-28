/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

/**
 *
 * @author hugov
 */
public class Corretores {
    public static String ConverterParaSQL(String Data){
               
        return Data.substring(6, 10) + "-" + Data.substring(3, 5) + "-" + Data.substring(0, 2);
    }
    
      public static String ConverterParaJava(String Data){
               
        return Data.substring(8, 10) + "/" + Data.substring(5, 7) + "/" + Data.substring(0, 4);
    }
   
    
    public static void main (String args[]){
        System.out.println(Corretores.ConverterParaJava("2016/03/27"));
    }
}
