package at.mikemitterer.kotlin.c3

/**
 *
 *
 * @since   04.12.17, 18:22
 */

enum class Day {
    Montag, Dienstag, Mittwoch, Donnerstag, Freitag, Samstag, Sonntag
}

enum class Planet(val radius:Double) {
    Merkur(3.3),
    Venus(4.8),
    Erde(5.9)
}

interface Person {
    fun printString() : String
}

enum class SpecificPerson(firstname:String) : Person {

    GERDA("Gerda") {
        override fun printString(): String {
            return "My name is $firstname"
        }
    },

    MIKE("Mike") {
        override fun printString() :String {
            return "Ich bin $firstname"
        }
    };

    // Muss protected sein da sonst kein Zugriff
    // vom "Super-Type" (GERDA, MIKE usw.) möglich ist
    protected val firstname : String = firstname
}