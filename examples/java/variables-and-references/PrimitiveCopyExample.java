public class PrimitiveCopyExample {
    public static void main(String[] args) {
        int available = 10;
        int draft = available;

        draft -= 1;

        System.out.println(available); // 10
        System.out.println(draft);     // 9
    }
}
