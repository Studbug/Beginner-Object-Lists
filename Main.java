
public class Main {

    public static void main(String[] args) {

        Item book = new Item("Lord of the rings", 8);
        Item phone = new Item("Nokia 3210", 8);
        Item brick = new Item("brick", 8);

        Suitcase suitcase = new Suitcase(20);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
    }

}
