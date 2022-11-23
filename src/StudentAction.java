import java.util.Scanner;

public class StudentAction {

    public Student inputStudent(Scanner scanner) {
        System.out.print("Mời bạn nhập tên học sinh là: ");
        String name = scanner.nextLine();
        System.out.print("Mời bạn nhập điểm môn Toán: ");
        Double scoreMath;
        try {
            do {
                scoreMath = Double.parseDouble(scanner.nextLine());
                if (scoreMath >= 0 && scoreMath <= 10)
                    break;
                System.out.print("Nhập sai điểm, mời nhập lại: ");
            } while (true);
        } catch (Exception e) {
            System.out.println("Nhập sai điểm, mời nhập lại từ đầu: ");
            return inputStudent(scanner);
        }

        System.out.print("Mời bạn nhập điểm môn Vật Lý: ");
        Double scorePhysic;
        try {
            do {
                scorePhysic = Double.parseDouble(scanner.nextLine());
                if (scorePhysic >= 0 && scorePhysic <= 10)
                    break;
                System.out.print("Nhập sai điểm, mời nhập lại: ");
            } while (true);
        } catch (Exception e) {
            System.out.println("Nhập sai điểm, mời nhập lại từ đầu: ");
            return inputStudent(scanner);
        }
        System.out.print("Mời bạn nhập điểm môn Hóa Học: ");
        Double scoreChemistry;
        try {
            do {
                scoreChemistry = Double.parseDouble(scanner.nextLine());
                if (scoreChemistry >= 0 && scoreChemistry <= 10)
                    break;
                System.out.print("Nhập sai điểm, mời nhập lại: ");
            } while (true);
        } catch (Exception e) {
            System.out.println("Nhập sai điểm, mời nhập lại từ đầu: ");
            return inputStudent(scanner);
        }

        double avgscore = (scoreMath + scorePhysic + scoreChemistry) / 3;
        System.out.println("Điểm trung bình 3 môn là: " + avgscore);
        String rank;
        int demA = 0;
        int demB = 0;
        int demC = 0;
        if (avgscore >= 8) {
            rank = "A";
            demA++;
        } else if (avgscore < 8 && avgscore >= 6.5) {
            rank = "B";
            demB++;
        } else {
            rank = "C";
            demC++;
        }
        Student student = new Student(name, avgscore, rank);
        return student;
    }

}
