package at.mikemitterer.kotlin.c3

/**
 *
 *
 * @since   08.12.17, 13:32
 */


interface Pet {
    val name : String
}

interface PetFactory {
    fun create(name:String) : Pet
}

class Cat private constructor(
        override val name: String) : Pet {

    companion object : PetFactory {
        override fun create(name: String) : Pet = Cat(name)
    }
}

class Dog private constructor(
        override val name: String) : Pet {

    companion object : PetFactory {
        override fun create(name: String) : Pet = Dog(name)
    }
}


