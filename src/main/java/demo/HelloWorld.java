package demo;

import kdemo.HelloWorldKt;
import kdemo.KotlinGreetingJoiner;

public class HelloWorld {

    public static void main(String[] args) {

        final KotlinGreetingJoiner example = new KotlinGreetingJoiner(
                new Greeter("Hi")
        );

        example.addName("Harry");
        example.addName("Ron");
        example.addName(null);
        example.addName("Hermione");

        HelloWorldKt.showMyName("Mike2");
        System.out.println(example.getJoinedGreeting());
    }
}
