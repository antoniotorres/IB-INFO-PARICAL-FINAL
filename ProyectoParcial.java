/**
 * @(#)ProyectoParcial.java
 * 
 * @author (Jose Antonio Torres -A01193080 y Mario Gutierrez - A01039315)
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
    for(int i=0; i < list.length; i++)
      list[i]=(int)(Math.random()*10000);
    return list;
  }
  public static void selectionSortDownUp (int[] list) {
    int min;
    for (int i = 0; i < list.length; i++) {
      // Asumiendo el primer arreglo es el menor
      min = i;
      for (int j = i + 1; j < list.length; j++) {
        if (list[j] < list[min]) {
          min = j;
          
        }
      }
      if (min != i) {
        final int temp = list[i];
        list[i] = list[min];
        list[min] = temp;
      }
      System.out.println(list[i]);// I print the in ascending orde
    }
    
  }
  
  public static void selectionSortUpDown (int[] list) {
    int min;
    for (int i = 0; i < list.length; i++) {
      // Asumiendo el primer arreglo es el menor
      min = i;
      for (int j = i + 1; j < list.length; j++) {
        if (list[j] > list[min]) {
          min = j;
          
        }
      }
      if (min != i) {
        final int temp = list[i];
        list[i] = list[min];
        list[min] = temp;
      }
      System.out.println(list[i]);// I print the in ascending orde
    }
    
  }
  public static void main (String [] args) throws IOException
  {
    long start, generarDatos, sortDownUp, sortUpDown;
    int num=10000;
    int[] list= new int[num];
    start = System.nanoTime();//Tiempo en el que empezo
    list=generateRandom(num);
    generarDatos = System.nanoTime();//Tiempo el que termino de generar los datos
    start = System.nanoTime();//Tiempo en el que empezo
    selectionSortDownUp(list);
    sortDownUp = System.nanoTime();//Tiempo el que termino de generar los datos
    start = System.nanoTime();//Tiempo en el que empezo
    selectionSortUpDown(list);
    sortUpDown = System.nanoTime();//Tiempo el que termino de generar los datos
    stdOut.println("Total de numeros: "+list.length);
    stdOut.println("Tiempo en Generar los datos: "+(generarDatos-start));
    stdOut.println("Tiempo Sort de Menor a Mayor: "+(sortDownUp-start));
    stdOut.println("Tiempo Sort de Mayor a Menor: "+(sortUpDown-start));
  }
}
