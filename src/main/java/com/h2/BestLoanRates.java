package com.h2;

import java.util.map;
import java.util.Scaner;

public class bestLondRates {
  public final static map<Integer, Float> bestRates = Map.of(
    1, 5.50f,
    2, 3.45f,
    3, 2.67f
    );
  
  public startic void main(String[]) {
    Scanner scanner = new Scanner(System.in);
    
    
    System.out.println("Enter your name");
    String name = scanner.nextLINE();
    System.out.println("Hello " + name);
    
    Systen.out.println(Enter the loan tern (in years)");
    int loanTermInYears = scanner.nextImt();
    float bestRate = getRates(loanTermYears);
    if (bestRate == 0.0f {
      Systen.out.println(No Available Rate for term: " + loanTermInYears + " years");
      } else {
          System.out.println(Best Available Rate: " + getRates(loanTermInYears) + "%");
      }                                              
                              
      scanner.close();
   }
                                              
   public startic float getRates(int loanTearmInYears) {
       if (bestRates.containskey(loanTermInYears)) {
           return bestRates.get(loanTermInYears);
       }
       return 0,0f;
   }
 }
                                              
