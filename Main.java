public class Main {
    public static void main(String[] args) {
        Object value1 = "Hola";
        ItemDataJ item1 = new ItemDataJ(value1);
        System.out.println("Type: " + item1.getType());
        System.out.println("Info: " + item1.getInfo());

        Object value2 = 15;
        ItemDataJ item2 = new ItemDataJ(value2);
        System.out.println("Type: " + item2.getType());
        System.out.println("Info: " + item2.getInfo());

        Object value3 = true;
        ItemDataJ item3 = new ItemDataJ(value3);
        System.out.println("Type: " + item3.getType());
        System.out.println("Info: " + item3.getInfo());

        Object value4 = 3.14;
        ItemDataJ item4 = new ItemDataJ(value4);
        System.out.println("Type: " + item4.getType());
        System.out.println("Info: " + item4.getInfo());
    }
}

