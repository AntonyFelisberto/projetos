/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxadecrescimento;

import java.util.Scanner;

/**
 *
 * @author VP
 */
public class TaxaDeCrescimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float taxaInicial,taxaFinal,taxa;
        Scanner ler=new Scanner(System.in);
        System.out.println("digite a taxa inicial");
        taxaInicial=ler.nextFloat();
        System.out.println("digite a taxa final");
        taxaFinal=ler.nextFloat();
        taxa=(taxaInicial-taxaFinal)/taxaInicial;
        System.out.printf("a taxa é :%.2f\n",taxa);
    }
    
}
