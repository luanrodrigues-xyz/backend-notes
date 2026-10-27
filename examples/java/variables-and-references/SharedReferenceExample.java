public class SharedReferenceExample {
    public static void main(String[] args) {
        Stock original = new Stock();
        Stock draft = original;

        draft.quantity -= 1;

        System.out.println(original.quantity); // 9
        System.out.println(draft.quantity);    // 9
        System.out.println(original == draft); // true
    }
}
