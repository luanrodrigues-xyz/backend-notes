public class FinalReferenceExample {
    public static void main(String[] args) {
        final Stock original = new Stock();
        Stock draft = original;

        original.quantity = 9;

        System.out.println(original.quantity); // 9
        System.out.println(draft.quantity);    // 9

        // Descomente para verificar o erro de compilação:
        // original = new Stock();
    }
}
