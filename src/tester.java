public class tester {



    public static void main(String[] args) {

/**
 * create an object to call the methods of his class
 * assignin the "world" string to the word variable
 * calling the method addHelloWord to pass the string parameter
 */
        WordGames hello = new WordGames();
        hello.word = "World!";
        hello.name= "Andrea";
        hello.surname= " Bottino";


        hello.addHelloWorld(hello.word);
        System.out.println ("Hallo " + hello.word);


    hello.getFullName(hello.name, hello.surname);

        System.out.println(hello.name + hello.surname);
    }
}
