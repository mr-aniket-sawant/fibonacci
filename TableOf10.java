public class TableOfTen {
    public static void main(String[] args) {
        int num = 10;
        
        System.out.println("Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
