package com.espark.adarsh.lambdawithinterface;

/**
 * Created by Adarsh on 6/22/15.
 */
public class LambdaExpressionWithInterface {

    public static void main(String[] args) {

        /*- without lambda expression -*/
        final MyMessage myMessage = new MyMessage() {
            @Override
            public String getMessage(String userName) {
                return userName + " Welcome ".toLowerCase();
            }
        };
        System.out.println(myMessage.getMessage(System.getProperty("user.name")));

         /*- without lambda expression -*/
        System.out.println(new MyMessage() {
            @Override
            public String getMessage(String userName) {
                return userName + " Welcome ".toLowerCase();
            }
        }.getMessage(System.getProperty("user.name")));


         /*- with lambda expression -*/
        final MyMessage myMessage1 = (String userName) -> {
            return userName + " Welcome ".toLowerCase();
        };
        System.out.println(myMessage1.getMessage(System.getProperty("user.name")));

        System.out.println(MyMessage.message());
    }
}

@FunctionalInterface
interface MyMessage {

    public String getMessage(final String userName);

    public static String message(){
        return "Welcome "+System.getProperty("user.name");
    }

    default String getWishMessage(final String userName) {
        return userName.toUpperCase() + " Hello";
    }

}
