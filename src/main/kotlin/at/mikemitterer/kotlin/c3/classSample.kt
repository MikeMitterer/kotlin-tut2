package at.mikemitterer.kotlin.c3

/**
 * Beispiel für die Zuweisung von Variablen
 *
 * @since   05.11.17, 18:32
 */
class InternalTest(
        val name: String, age: Int) {

    private val firstName: String = "undefined"
    private val internalAge: Int


    init {
        internalAge = age
    }


    val myAge: Int
        get() = internalAge * 2;
}


class InnerClassSample(val name: String, namePartner: String) {
    val partner = Partner(namePartner)
    val pet = Pet("Miau")

    // class ohne 'inner' ist das selbe wie eine statische Klasse
    // Kann also unabhängig von der Eltern-Klasse erzeugt werden
    class Pet(val sound: String)

    // A class may be marked as inner to be able to access members of outer class.
    // Inner classes carry a reference to an object of an outer class:
    inner class Partner(val name: String) {
        val relation: String
            get() = "${this@InnerClassSample.name} + ${this.name}, Cat makes ${pet.sound}"
    }
}

class PrivateVarsSample(name: String) {
    val myName = name
}

interface MySpecialClass {
    fun giveName(): String
}


fun halloCallback(mySpecialClass: MySpecialClass): String {
    return mySpecialClass.giveName()
}


class MultipleCTORs(
        firstName: String,
        lastName: String = "<default>") {

    val name: String

    // Der Init-Block ist Teil des primären Konstruktors
    // Es kann auch mehrere init-Blöcke geben
    init {
        name = "$firstName $lastName / ${addAge(52)}"
    }

    constructor(_firstName: String)
            : this(_firstName, "unknown")


    private fun addAge(age: Int) = "$age"
}

open class Vehicle(val wheels: Int)

class Car : Vehicle {
    val name: String

    constructor(_name: String) : super(wheels = 4) {
        name = _name
    }
}

class Motorcycle : Vehicle(wheels = 2)