/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment2;

import java.util.Scanner;

/**
 *
 * @author adaba
 */
public class salesTax {
    
    public static void main(String[] args) {
        
        //Declaration
        final double countryTax = 0.02;
        final double stateTax   = 0.04;
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter the amount of purchase");
        
        double amount = scn.nextDouble();
        double totalStateTax     = amount * stateTax;
        double totalCountryTax  = amount * countryTax;
        
        System.out.println("Purchase Amount   ===> "+amount);
        System.out.println("State Sales Tax   ===> "+ totalStateTax);
        System.out.println("Country Sales Tax ===> "+ totalCountryTax);
        
        double totalStateAndCountryTax = totalStateTax + totalCountryTax;
        System.out.println("Total Sale Tax    ===> "+ totalStateAndCountryTax);
        
        double totalSales = amount + totalStateAndCountryTax;
        
        System.out.println("Total amount      ===> " + totalSales);
        
        
    }
    
}
