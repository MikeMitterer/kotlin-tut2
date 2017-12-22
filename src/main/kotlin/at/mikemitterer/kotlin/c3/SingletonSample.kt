package at.mikemitterer.kotlin.c3

/**
 * Sample für Singleton
 * @since   08.12.17, 10:09
 */
object SingletonSample {
    var counter : Int = 0
        private set

    fun count() = counter++
}

