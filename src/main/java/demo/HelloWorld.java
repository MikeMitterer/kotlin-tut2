package demo;

import at.mikemitterer.kotlin.c4.RegularFunctionsKt;
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

        System.out.println(example.getJoinedGreeting());

        at.mikemitterer.kotlin.c4.RegularFunctionsKt.showBinValue(0b10);
        RegularFunctionsKt.showCharacters("Mike");

        at.mikemitterer.kotlin.c4.RegularFunctionsKt.printList();
        at.mikemitterer.kotlin.c4.RegularFunctionsKt.printAtoZ();
        at.mikemitterer.kotlin.c4.RegularFunctionsKt.printControlFlowAsExpression();
        at.mikemitterer.kotlin.c4.RegularFunctionsKt.printZeroOrOne(5);
        at.mikemitterer.kotlin.c4.RegularFunctionsKt.printUntilStop();

        at.mikemitterer.kotlin.c4.RegularFunctionsKt.testNullPointer("Mike");
        //testNullPointer(null);

        at.mikemitterer.kotlin.c4.RegularFunctionsKt.showMyName("Mike");
        at.mikemitterer.kotlin.c4.RegularFunctionsKt.showMyName("Mike",45);

    }}


