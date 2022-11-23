import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClazzAction action = new ClazzAction();
        ArrayList<Clazz> clazzes = new ArrayList<>();
        Clazz clazz =action.inputClazz(scanner);
        clazzes.add(clazz);
        System.out.println(clazzes.toString());
    }
}
