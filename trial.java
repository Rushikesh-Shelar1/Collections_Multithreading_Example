package javaprojects;

import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
    	  int k, count,s,i;
          for(s=1;s<=5000;s++) {
              k=s;
              count=0;
              for (i = 1; i <= k; i++) {
                  if (k % i == 0) {
                      count++;
                  }
              }
              if (count == 2) {
                  System.out.println("prime no= " + k);
              }
          }
    }
    }
