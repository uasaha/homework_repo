
public class Main {
    public static void main(String[] args){
        addNumber add = new addNumber();
        Multi multi = new Multi();
        divNumber div = new divNumber();
        SubNumber sub = new SubNumber();

        final int a = 10;
        final int b = 2;

        System.out.println(add.add(a, b));
        System.out.println(multi.Multi(a, b));
        System.out.println(div.divNum(a, b));
        System.out.println(sub.subNumber(a, b));

    }
}
