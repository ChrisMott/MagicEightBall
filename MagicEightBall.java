import java.util.*;


public class MagicEightBall {


    protected static ArrayList<String> responses = new ArrayList<String>();

    static Scanner question = new Scanner(System.in);

    public static Scanner whileBreaker = new Scanner(System.in);

    static String askTwo = "";



    public static String getRandomAnswer(ArrayList<String> responses){

        Random randAnswer = new Random();

        return responses.get(randAnswer.nextInt(responses.size()));

    }

    public MagicEightBall(){

        responses.add("As I see it, yes.");
        responses.add("Ask Again Later");
        responses.add("Better not tell you now.");
        responses.add("Cannot predict now.");
        responses.add("Concentrate and ask again");
        responses.add("Don't Count On It");
        responses.add("It is certain");
        responses.add("It is decidedly so.");
        responses.add("Most Likely.");
        responses.add("My reply is no");
        responses.add("My sources say no");
        responses.add("Outlook not so good.");
        responses.add("Outlook good.");
        responses.add("Reply hazy, try again.");
        responses.add("Signs point to yes.");
        responses.add("Very Doubtful.");
        responses.add("Without a Doubt.");
        responses.add("Yes");
        responses.add("Yes - Definitely");
        responses.add("You may rely on it.");


    }



    public static void main(String[] args){



        MagicEightBall standard = new MagicEightBall();

        System.out.println("Welcome to the Magic Eight Ball");

        System.out.println("Ask the Magic Eight Ball a question and the all knowing Magic Eight Ball will give you answers.");

        System.out.println("Enter your question below: ");

        String ask = question.nextLine();

        System.out.println(MagicEightBall.getRandomAnswer(responses));

        System.out.println("Do you wish to create your own Magic Eight Ball? Enter Y for yes or N for no.");

        String custom = question.nextLine();

        if (custom.equals("y") || custom.equals("Y")) {

            for (int i = 0; i < 20; i++) {

                System.out.println("Please enter the " + (i+1) + " response. A Magic Eight Ball has 20 responses");

                String customR = question.nextLine();

                CustomEightBall.addResponses(customR);


            }

            CustomEightBall customEightBall = new CustomEightBall(CustomEightBall.customResponses);




            while(!askTwo.contains("STOP")){


                System.out.println("Ask the Magic Eight Ball a question and the all knowing Magic Eight Ball will give you answers.");

                System.out.println("Enter your question below if you wish to stop, enter stop: ");

                askTwo = whileBreaker.nextLine().toUpperCase();

                //System.out.println(askTwo);





                    System.out.println(CustomEightBall.getRandomAnswerCustom(CustomEightBall.customResponses));

                }






        }else{

            System.out.println("Goodbye");

        }











    }






}
