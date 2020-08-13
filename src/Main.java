public class Main {

    public static void main(String[] args) {

       dayOfWeek(3);
        dayOWIfElse(6);
    }

    public static void dayOfWeek(int day) {

        switch (day) {

            case 0:
                System.out.println("Day is Sunday");
                break;
            case 1:
                System.out.println("Day is Monday");
                break;
            case 2:
                System.out.println("Day is Tuesday");
                break;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Thursday");
                break;
            case 5:
                System.out.println("Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }

    }

    public static void dayOWIfElse(int day) {

        if (day > 6 || day < 0) {
            System.out.println("Invalid Day");
        }
        else if (day == 0){
            System.out.println("Day is Sunday");
        }
        else if (day == 1){
            System.out.println("Day is Monday");
        }
        else if (day == 2){
            System.out.println("Day is Tuesday");
        }
        else if (day == 3){
            System.out.println("Day is Wednesday");
        }
        else if (day == 4){
            System.out.println("Day is Thursday");
        }
        else if (day == 5){
            System.out.println("Day is Friday");
        }
        else {
            System.out.println("Day is Saturday");
        }
    }
}


