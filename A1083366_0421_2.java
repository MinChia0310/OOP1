import java.util.Scanner;

public class A1083366_0421_2 {
    public static void main(String[] args){
        System.out.print("請輸入日期(範例: 2023/05/05 or 05/05/2023): ");
        Scanner scanner = new Scanner(System.in);
        try (scanner) {
            String date = scanner.nextLine();
            if (isValidDate(date)) {
                System.out.println("您所輸入的日期為：" + formatDate(date));
            } else {
                System.out.println("您所輸入的日期格式錯誤。");
            }
        }
    }

    public static boolean isValidDate(String date) {
        return date.matches("\\d{4}/\\d{1,2}/\\d{1,2}") || date.matches("\\d{1,2}/\\d{1,2}/\\d{4}");
    }

    public static String formatDate(String date) {
        String[] dateArray = date.split("/");
        int year, month, day;
        if (date.matches("\\d{4}/\\d{1,2}/\\d{1,2}")) {
            year = Integer.parseInt(dateArray[0]);
            month = Integer.parseInt(dateArray[1]);
            day = Integer.parseInt(dateArray[2]);
        }else {
            year = Integer.parseInt(dateArray[2]);
            month = Integer.parseInt(dateArray[0]);
            day = Integer.parseInt(dateArray[1]);
        }

        if (month < 1 || month > 12 || day < 1 || day > getDaysInMonth(year, month)) {
            return "日期格式錯誤";
        }
        return year + "年" + month + "月" + day + "日";
    }

    public static int getDaysInMonth(int year, int month) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
