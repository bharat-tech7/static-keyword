//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
MathUtil m1=new MathUtil();
        System.out.println(m1.Square(5));

    }
}
class MathUtil{
    int Square(int number)
    {
        return number* number;
    }
}