package Task_14_Mar;

public class Inc_Dec_operator2 {
    public static void main(String[] args) {
    int a = 10;
        System.out.println(++a + a++ + a++);
        //Exp1=10 -> 11
        //Exp2=11 -> 11+11 =22
        //Exp3=12 -> 12+22 = 34
        System.out.println(a);
    }
}
