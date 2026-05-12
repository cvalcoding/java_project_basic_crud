import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, String> data;

    public Main() {
        data = new HashMap<>();
    }

    static void main() {
//        Map<Integer, String> data = new HashMap<>();

//        data.put(1, "toto");
//        data.put(2, "tutu");
//        System.out.println(data);
//        System.out.println(data.values().toArray()[data.size() - 1]);
//
//        data.replace(1, "tout va bien");
//        System.out.println(data);

//        data.remove(1);
//        System.out.println(data);
//        String lastKey = data.keySet().toArray()[data.size() - 1].toString();
//        System.out.println(lastKey);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter one element : ");
//
//        String element = sc.nextLine();
//        System.out.println("The element enter is : " + element);

//        menu(data);

//        while (isActive){
//            int key = data.isEmpty() ? 1 : Integer.parseInt(data.keySet().toArray()[data.size() - 1].toString()) + 1;
//            Scanner sc = new Scanner(System.in);
//
//            System.out.print("Enter one element : ");
//            String elm = sc.nextLine();
//
//            if (elm.equals("exit")) isActive = false;
//            if (!isActive) break;
//
//            data.put(key, elm);
//            System.out.println(data);
//
//        }
        new Application();
    }

    public static void menu() {

//        String menu = "=== Menu ===";
//        String select = """
//                Choose an menu selection :
//                1 - Show all element.
//                2 - Add element.
//                3 - Select element.
//                4 - Remove element.
//                5 - exit.
//                """;
//        System.out.println(menu.toUpperCase());
//        System.out.println(select);
//        System.out.println();
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your selection : ");
//        String elm = sc.nextLine();
//        selection(data, elm);
    }

    public static void selection(Map<Integer, String> data, String elm) {
        switch (elm) {
            case "1":
                System.out.println("You choose 1");
//                menu();
            case "2":
                addElement(data);
            case "3":
                System.out.println("You choose 3");
//                menu();
            case "4":
                System.out.println("You choose 4");
//                menu();
            case "5":
                System.out.println("You choose 5");
            default:
                System.out.println("Select other selection");
//                menu();
        }
    }

    protected static void addElement(Map<Integer, String> data) {
        int key = data.isEmpty() ? 1 : Integer.parseInt(data.keySet().toArray()[data.size() - 1].toString()) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element : ");
        String elm = sc.nextLine();

        data.put(key, elm);
        System.out.println("Element save");

//        menu(data);
    }
}