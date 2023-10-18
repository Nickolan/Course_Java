// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[][] orig = {{1,2,3}, {4,5,6,7}};
        int[][] dup = orig.clone();
        int[] copy = dup[0].clone();

        System.out.println(dup[0].equals(copy));
    }

}