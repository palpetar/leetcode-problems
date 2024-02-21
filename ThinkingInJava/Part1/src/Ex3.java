public class Ex3 {

    public static void main(String[] args) {
        int counter = 1;
        int cost = 1;
        int result = 0;
        while (counter != 72) {
            if (counter % 10 == 0) {
                cost++;
            }
            result += cost;
            counter++;
            System.out.print(result + " ");
        }
        System.out.println(result);
    }
}
