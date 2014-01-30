/**
 * @(#)ProyectoParcial.java
 * 
 * @author (Jose Antonio Torres -A01193080 y Mario Gutierrez - A0119)
 * @version 1.00 01/29/2014
 * 
 * @licencia GPLv2
 */

import java.io.*;
import java.lang.Math;
public class ProyectoParcial
{
  private static BufferedReader stdIn=new
    BufferedReader(new InputStreamReader(System.in));
  private static PrintWriter stdOut =new
    PrintWriter(System.out, true);
  
  public static int[] generateRandom(int num){
    int[] list= new int[num];
    return list;
  }
  public static void main (String [] args) throws IOException
  {
    int num=10000;
    int[] list= new int[num];
    list=generateRandom(num);
    stdOut.println("Dame el primer valor"+list[10000]);
  }
}
