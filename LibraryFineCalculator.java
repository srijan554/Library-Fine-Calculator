package Projects;
import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] id = new int[n];
        int[] days = new int[n];
        int[] fine = new int[n];
        String[] name = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Book ID: ");
            id[i] = sc.nextInt();

            System.out.print("Enter Book Name: ");
            name[i] = sc.next();

            System.out.print("Enter Late Days: ");
            days[i] = sc.nextInt();

            fine[i] = days[i] * 5;
        }

        System.out.print("\nEnter Book ID to Search: ");
        int search = sc.nextInt();

        for (int i = 0; i < n; i++) {

            if (id[i] == search) {
                System.out.println("Book Found");
                System.out.println("Book Name: " + name[i]);
                System.out.println("Late Days: " + days[i]);
                System.out.println("Fine: Rs. " + fine[i]);
                break;
            }

            if (i == n - 1) {
                System.out.println("Book Not Found");
            }
        }

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (id[j] > id[j + 1]) {

                    int temp = id[j];
                    id[j] = id[j + 1];
                    id[j + 1] = temp;

                    temp = days[j];
                    days[j] = days[j + 1];
                    days[j + 1] = temp;

                    temp = fine[j];
                    fine[j] = fine[j + 1];
                    fine[j + 1] = temp;

                    String t = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = t;
                }
            }
        }
        System.out.println();
        System.out.println("Sorted Book Records:");
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println(id[i] + " " + name[i] + " " + days[i] + " Rs." + fine[i]);
        }
    }
}

