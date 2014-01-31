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
      list[i]=(int)(Math.random()*num);
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
    }
    
  }
   public static void imprimir (int[] list) {
      for (int i = 0; i < list.length; i++)
        stdOut.println(list[i]);
   }
  public static void main (String [] args) throws IOException
  {
    long startgenerar, generarDatos;//Declara variables para contar el tiempo.
    long startDownUp = 0;
    long startUpDown = 0;
    long sortDownUp = 0;
    long sortUpDown = 0;
    int num=10000;//Numero de elementos en el arreglo.
    int a=0;
    int[] list= new int[num];
    stdOut.println("Bienvenido, generando lista.");
    startgenerar = System.nanoTime();//Tiempo en el que empezo
    list=generateRandom(num);
    generarDatos = System.nanoTime();//Tiempo el que termino de generar los datos
    stdOut.println("Listo, desa ordenar:");
    while (a!=1 && a!=2){
      stdOut.println("(1) mayor a menor");
      stdOut.println("(2) menor a mayor");
      stdOut.println("Selecciona un numero ->");
      a=Integer.parseInt(stdIn.readLine());
      if (a!=1 && a!=2)
        stdOut.println("Error: Numero no valido");
    }
    if (a==1){
      startDownUp = System.nanoTime();//Tiempo en el que empezo
      selectionSortDownUp(list);
      sortDownUp = System.nanoTime();//Tiempo el que termino de generar los datos
    } if (a==2){
    startUpDown = System.nanoTime();//Tiempo en el que empezo
    selectionSortUpDown(list);
    sortUpDown = System.nanoTime();//Tiempo el que termino de generar los datos
    }
    stdOut.println("Total de numeros: "+list.length);
    stdOut.println("Tiempo en Generar los datos: "+(generarDatos-startgenerar)+" nano-segundos.");
    if (a==1) 
      stdOut.println("Tiempo Sort de Menor a Mayor: "+(sortDownUp-startDownUp)+" nano-segundos.");
    if (a==2) 
      stdOut.println("Tiempo Sort de Mayor a Menor: "+(sortUpDown-startUpDown)+" nano-segundos.");
    a=0;
    while (a!=1 && a!=2){
      stdOut.println("Imprimir ordenado? 1=si o 2=no");
      a=Integer.parseInt(stdIn.readLine());
      if (a!=1 && a!=2)
        stdOut.println("Error: Numero no valido");
    }
    if (a==1)
      imprimir(list);
    stdOut.println("Gracias por usar el programa");
  }
}
