//Create a string variable named colonyName, and set it equal to your desired name
//Create an int variable named shipPopulation, and set it equal to 300
//Create a double variable named meals, and set it equal to 4000.00
//Create a boolean variable named landing, and set it equal to true



//Outside the main method, create a public static function called landingCheck that returns a boolean value and takes in an int parameter called minutesLeft. This method will print “directions” to the console based on minutes left until touchdown.
//Inside landingCheck, create a for loop that initializes an int variable called minute which is set to 0. The loop should increment by 1 until it reaches the number of minutesLeft.
//Inside the loop, create an if statement. If the number of minutes is even print “Right”, if the number of minutes is divisible by 3 print “Left”, if the number is divisible by both 2 and 3 print “Keep Center”. If the number isn’t divisible by any of those factors, print “Calculating”.
//Call Thread.sleep(250) after the conditional but before the end of the loop to slow down the console on each loop – it will add to the game ambience.
//Print “Landed” after the for loop. And then return the boolean false – we’ll save this to the landing variable in the main method since landing will be complete once this function completes.
//Back inside the main method, reassign the value of landing to be the invocation of the landingCheck() method passing in any integer for the number of minutes left until landing.

public class Mars{

    public static void main(String[] args) {

        String colonyName = "ZYX";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The plain";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }
        boolean landed = landingCheck(23);
    }

    public static boolean landingCheck(int minutesLeft) {
        for (int minute = 0; minute <= minutesLeft; minute++) {
            if(minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Keep Center");
            } else if (minute % 2 == 0){
                System.out.println("Right");
            } else if (minute % 3 == 0){
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Landed");
        return false;
    }

}