
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String text = String.valueOf(scanner.nextLine());
            if(text.equals("")){
                break;
            } else {
                String[] pieces = text.split(" ");
                System.out.println(pieces[0]);
            }
        }

    }
}
