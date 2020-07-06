/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int numero, somatorionegativo;
      somatorionegativo = 0;
      
      do{  
        numero = Integer.parseInt(JOptionPane.showInputDialog("informe um"
                 + " numero ou digite 0(zero)para sair:\n" 
                 + "digite"));
        if (numero !=0){
           if(numero < 0){
               somatorionegativo += numero;
           } else{
               JOptionPane.showMessageDialog(null, "Numeros positivos não são"
                       + " contabilizados!");
           }
        } 
      }while (numero != 0); 
        JOptionPane.showMessageDialog(null, "A soma dos numeros negativos é: "
                + somatorionegativo);
        
        
        
        
        
        
        
        
        
    }
    
}
