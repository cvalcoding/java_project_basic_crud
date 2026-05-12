import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    private final Map<Integer, String> data;

    Application() {
        String menu = "=== Menu ===";
        System.out.println(menu.toUpperCase());
        this.data = new HashMap<>();
        menu();
    }

    protected void menu() {
        String select = """
                Choose an menu selection :
                1 - Show all element.
                2 - Add element.
                3 - Select element.
                4 - Remove element.
                5 - exit.
                """;
        System.out.println(select);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your selection : ");
        String slc = sc.nextLine();

        selection(slc);
    }

    public void selection(String slc) {
        switch (slc) {
            case "1":
                show();
            case "2":
                addElement();
                menu();
            case "3":
                getElement();
                menu();
            case "4":
                System.out.println("You choose 4");
                menu();
            case "5":
                return;
            default:
                System.out.println("Select other selection");
                menu();
        }
    }

    protected void show() {
        if (this.data.keySet().toArray().length != 0) {
            for (int i = 0; i < this.data.keySet().toArray().length; i++) {
                System.out.println(parseName(this.data.keySet().toArray()[i].toString(), this.data.values().toArray()[i].toString()));
            }
        } else {
            System.out.println("This element is empty");
        }
        menu();
    }

    protected void addElement() {
        int key = this.data.isEmpty() ? 1 : Integer.parseInt(this.data.keySet().toArray()[this.data.size() - 1].toString()) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element : ");
        String slc = sc.nextLine();

        data.put(key, slc);
        System.out.println("Element save");
    }

    protected void getElement() {
        Scanner sc = new Scanner(System.in);
        if (this.data.keySet().toArray().length != 0) {
            for (int i = 0; i < this.data.keySet().toArray().length; i++) {
                System.out.println(parseName(this.data.keySet().toArray()[i].toString(), this.data.values().toArray()[i].toString()));
            }

            System.out.print("Enter key : ");
            String input = sc.nextLine();

            if (this.data.get(Integer.parseInt(input)) != null) {
                System.out.println( input + " : " + this.data.get(Integer.parseInt(input)));
            } else {
                System.out.println("No element found, try again");
                getElement();
            }
        } else {
            System.out.println("This element is empty");
        }
    }

    private String parseName(String key, String value) {
        return key + " : " + value;
    }


}
