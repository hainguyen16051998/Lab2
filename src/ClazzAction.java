import java.util.ArrayList;
import java.util.Scanner;

public class ClazzAction {

    public Clazz inputClazz(Scanner scanner) {
        System.out.print("Nhập số lượng học viên mới muốn thêm: ");
        int num = 0;
        try {
            num = Integer.parseInt(scanner.nextLine());
            StudentAction action = new StudentAction();
            ArrayList<Student> students = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                Student student = action.inputStudent(scanner);
                students.add(student);
            }
            Clazz clazz = new Clazz(students);
            return clazz;
        } catch (Exception e) {
            System.out.println("Lỗi, nhập lại");
        }
        return inputClazz(scanner);
    }

}
