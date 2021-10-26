import java.io.*;

import java.util.*;



public class Main {



  public static void main(String[] args) throws Exception {
  
      Scanner scn = new Scanner(System.in);
      
          int n = scn.nextInt();
          
          
          
              ArrayList<String>ans = getStairPaths(n);
              
                  System.out.println(ans);
                  
                    }
                    
                    
                    
                      public static ArrayList<String> getStairPaths(int n) {
                      
                          if (n == 0)
                          
                              {
                              
                                    ArrayList<String>bres = new ArrayList<>();
                                    
                                          bres.add("");
                                          
                                                return bres;
                                                
                                                    } else if (n < 0)
                                                    
                                                        {
                                                        
                                                              ArrayList<String>bres = new ArrayList<>();
                                                              
                                                                    return bres;
                                                                    
                                                                        }
                                                                        
                                                                        
                                                                        
                                                                            ArrayList<String>pathFromnm1 = getStairPaths(n - 1);
                                                                            
                                                                                ArrayList<String>pathFromnm2 = getStairPaths(n - 2);
                                                                                
                                                                                    ArrayList<String>pathFromnm3 = getStairPaths(n - 3);
                                                                                    
                                                                                    
                                                                                    
                                                                                        ArrayList<String>pathFromnmN = new ArrayList<>();
                                                                                        
                                                                                            for (String path1 : pathFromnm1)
                                                                                            
                                                                                                {
                                                                                                
                                                                                                      pathFromnmN.add(1 + path1);
                                                                                                      
                                                                                                          }
                                                                                                          
                                                                                                          
                                                                                                          
                                                                                                              for (String path2 : pathFromnm2)
                                                                                                              
                                                                                                                  {
                                                                                                                  
                                                                                                                        pathFromnmN.add(2 + path2);
                                                                                                                        
                                                                                                                            }
                                                                                                                            
                                                                                                                            
                                                                                                                            
                                                                                                                                for (String path3 : pathFromnm3)
                                                                                                                                
                                                                                                                                    {
                                                                                                                                    
                                                                                                                                          pathFromnmN.add(3 + path3);
                                                                                                                                          
                                                                                                                                              }
                                                                                                                                              
                                                                                                                                                  return pathFromnmN;
                                                                                                                                                  
                                                                                                                                                    }
                                                                                                                                                    
                                                                                                                                                    
                                                                                                                                                    
                                                                                                                                                    }
