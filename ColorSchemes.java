import java.util.Scanner;
import java.util.Arrays;

public class ColorSchemes{
  public static void givenColor(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Give an RGB color value (press enter after each individual value, which should be 0-255 and ordered R G B)")
      int r = scan.nextInt();
      int g = scan.nextInt();
      int b = scan.nextInt();
  }
  
  public static boolean inBounds(r, g, b){
    if(!(0 <= r <= 255) || !(0 <= g <= 255) || !(0 <= b <= 255)){return false;}
    return true;
  }
  
  public static void compColor(r, g, b){
    int rC = 255-r;
    int gC = 255-g;
    int bC = 255-b;
    System.out.println("(" + rC + ", " + gC + ", " + bC + ")");
  }
  
  public static void triadicColor(r, g, b){
    int rTri1 = g;
    int gTri1 = b;
    int bTri1 = r;
    int rTri2 = b;
    int gTri2 = r;
    int bTri2 = g;
    System.out.println("(" + rTri1 + ", " + gTri1 + ", " + bTri1 + ")  " + "(" + rTri2 + ", " + gTri2 + ", " + bTri2 + ")");
  }
  
  public static void tetradicColor(r, g, b){
    int[] givColor = new int[](r, g, b);
    int max = r;
    int min = r;
    for (int val : givColor){
      if(val > max){max = val;}
      if(val < min){min = val;}
    }
    for (int val : givColor){
      if(min < val < max){int mid = val;}
    }
    int M = ((max-min)/2)+min;
    
  }
  
  public static void main (String[] args){
    givenColor();
    if(!inBounds){System.out.println("values do not fit in the required bounds");}
    else if(inBounds){
      
  }
}
