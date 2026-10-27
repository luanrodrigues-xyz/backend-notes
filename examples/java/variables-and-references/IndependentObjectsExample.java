public class IndependentObjectsExample {
    public static void main(String[] args) {
        Stock original = new Stock();
        Stock draft = new Stock();

        System.out.println(original == draft);                   // false
        System.out.println(original.quantity == draft.quantity); // true

        draft.quantity -= 1;

        System.out.println(original.quantity); // 10
        System.out.println(draft.quantity);    // 9
    }
}
