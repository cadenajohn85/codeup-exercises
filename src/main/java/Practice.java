import com.github.javafaker.Faker;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Faker faker = new Faker();

//        System.out.println("Enter Something:");
//        String userInput = input.nextLine();

//        processInput(userInput);

//        String fake1 = faker.gameOfThrones().dragon();
//        String fake2 = faker.gameOfThrones().quote();

//        processInput(fake2);

        String fakeInput;

        for (int i = 0; i < 5; ++i) {
            fakeInput = faker.gameOfThrones().quote();
            processInput(fakeInput);
            System.out.println("");
        }


    }

    public static void processInput(String someString) {
        System.out.println("You entered: \"" + someString + "\"");
        if (StringUtils.isNumeric(someString)) {
            System.out.println("\"" + someString + "\" is a number.");
        } else {
            System.out.println("\"" + someString + "\" is not a (whole) number.");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(someString));
        System.out.println("Reversed: " + StringUtils.reverse(someString));
    }
}
