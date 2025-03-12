package ex_01_Java_Basic;

public class CubeRoot {
   public static void main(String[] args) {
        int x=10;
        int y=10;
        int z=10;
        double a = Math.pow(x,2);
        double b=Math.pow(y,2);
        double c=Math.abs(z);

      double Cube_Root = Math.cbrt(a+b-c);
        System.out.println(Cube_Root);
    }

}
