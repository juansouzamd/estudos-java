package treino.stream_api;

public class SwitchNew {
    public static void main(String[] args) {
        String day = "Tuesday";

        switch (day) {
            case "Monday", "Tuesday" -> System.out.println("It's a work day");
            case "Wednesday" -> System.out.println("Midweek day");
            case "Thursday", "Friday" -> System.out.println("Almost weekend");
            case "Saturday", "Sunday" -> System.out.println("Weekend");
            default -> System.out.println("Invalid day");
        }
    }
}
