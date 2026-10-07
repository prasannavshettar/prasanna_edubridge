class LoopHelper {
    public void printNumbers(int limit) {
        int i = 1;
        while (i <= limit) {
            System.out.println("Value of i: " + i);
            i++;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LoopHelper helper = new LoopHelper();
        helper.printNumbers(5);
    }
}