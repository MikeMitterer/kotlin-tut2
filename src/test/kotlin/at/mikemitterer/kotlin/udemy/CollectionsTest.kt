package at.mikemitterer.kotlin.udemy

import org.junit.Test
import java.util.*
import kotlin.test.assertEquals

/**
 *
 *
 * @since   10.03.18, 19:31
 */
class CollectionsTest {

    private data class Person(val name:String, val age:Int)

    @Test
    fun testFindOddNumbers() {
        val numbers = listOf(1,2,3,4,5,6,7,8,9)
        var odds = numbers.filter { it % 2 != 0 }

        assertEquals(5, odds.size)
    }

    @Test
    fun testMap() {
        val words = "Dies ist ein Test für eine Wortliste".split(Regex("""\s+"""))
        val wordLength = words.map { it.length }

        assertEquals(7,wordLength.size)
        assertEquals(9,wordLength.max())

        val wordWithLenght = words.map { Pair<Int, String>(it.length, it) }

        val(length, word) = wordWithLenght[1]
        assertEquals(3,length)
        assertEquals("ist",word)
    }

    @Test
    fun testAssociate() {
        val words = "Dies ist ein Test für eine Wortliste".split(Regex("""\s+"""))

        // Associate bzw. to erstellt auch ein Pair
        val wordWithLength = words.associate { it to it.length }.toList()

        assertEquals("ist",wordWithLength[1].first)
    }

    @Test
    fun testFlatMap() {
        val sequence = listOf("red,gree,blue", "orange", "white,pink")
        val allWords = sequence.flatMap { it.split(",") }

        assertEquals(6,allWords.size)
    }

    @Test
    fun testFilter() {
        val seq = generateSequence( 1, {it + 1} )
        val numbers = seq.take(10).toList()

        val evenNumbers = numbers.filter { it % 2 == 0 }
        assertEquals(2,evenNumbers.first())

        val notDivBy3 = numbers.filterNot { it % 3 == 0 }
        assertEquals(7,notDivBy3.size)

        val moreValues = arrayOf<Any?>(1,2,"Mike",null,4)
        val result = moreValues.filterNotNull()
        assertEquals(4,result.size)
    }

    @Test
    fun testPartitioning() {
        val seq = arrayOf(-2,-1, 0, 1, 2)
        val (neg, others) = seq.partition { it < 0 }
        assertEquals(2, neg.size)

        val numbers = arrayOf(3,3,2,1,1,2,2,3,3)
    }

    @Test
    fun testDrop() {
        assertEquals("Mitt","Mitterer".dropLast(4))
    }

    @Test
    fun testSorting() {
        val rand = Random()
        val randomValues = generateSequence { rand.nextInt(10) - 5}

        val numbers = randomValues.take(10).toList()
        println(numbers.sorted())
        println(numbers.sortedDescending())
    }

    @Test
    fun testSortNames() {
        val peoples = listOf<Person>(
                Person("Mike", 52),
                Person("Gerda", 54),
                Person("Sarah", 22)
        )

        println(peoples)
        val byName = peoples.sortedBy { it.name }
        assertEquals("Gerda", byName.first().name)

        val byAge = peoples.sortedWith(compareBy(Person::age))
        assertEquals("Sarah", byAge.first().name)

    }

    @Test
    fun testSingle() {
        val numbers = arrayOf(-2,-1, 0, 1, 2)

        assertEquals(2, numbers.single { it == 2 })
    }

    @Test
    fun testDistinctBy() {
        val persons = listOf<Person>(
                Person("Mike",51),
                Person("Gerda", 53),
                Person("Mike", 55)
        )

        assertEquals(2,persons.distinctBy { it.name }.size)
    }
}