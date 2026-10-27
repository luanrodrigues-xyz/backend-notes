public class ReassignmentExample {
    public static void main(String[] args) {
        Stock original = new Stock();
        Stock draft = original;

        draft = new Stock();
        draft.quantity = 3;

        System.out.println(original.quantity); // 10
        System.out.println(draft.quantity);    // 3
        System.out.println(original == draft); // false
    }
}
