import java.util.Locale;

public class ExercicioVariaveis {
    public static void main(String[] args) {

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        int age = 30;
        int code = 5290;
        char gender = 'F';

        String product1 = "Computer";
        String product2 = "Office desk";

        System.out.println("Products:" );
        System.out.print(product1 + ", wich price is $ ");
        System.out.printf("%.2f%n" , price1);

        System.out.print(product2 + ", wich price is $ ");
        System.out.printf("%.2f%n" , price2, "\n");

        System.out.println("Record: " + age + " years old, code " + code +" and gender: " + gender + "\n");

        System.out.printf(Locale.of("pt", "BR"), "Measue with eight decimal places: %.8f%n", measure);

        System.out.print("Rouded (three decimal places): ");
        System.out.printf("%.3f%n", measure);

        System.out.print("US decimal point: ");
        Locale.setDefault(Locale.US);
        System.out.printf("%.3f%n", measure);







    }
}
