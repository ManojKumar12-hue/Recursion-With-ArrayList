import java.io.*;

import java.util.*;



public class Main {



   public static void main(String[] args) throws Exception {
   
         Scanner scn = new Scanner(System.in);
         
               String s = scn.next();
               
                     printSS(s, "");
                     
                        }
                        
                        
                        
                           public static void printSS(String str, String ans) {
                           
                           
                           
                                 // base case
                                 
                                       if (str.length() == 0) {
                                       
                                                System.out.println(ans);
                                                
                                                         return;
                                                         
                                                               }
                                                               
                                                                     printSS(str.substring(1), ans + str.charAt(0));
                                                                     
                                                                         //   ans = ans + str.charAt(0);
                                                                         
                                                                               printSS(str.substring(1), ans);
                                                                               
                                                                                     return;
                                                                                     
                                                                                        }
                                                                                        
                                                                                        
                                                                                        
                                                                                        }
