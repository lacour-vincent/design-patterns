package singleton

class Singleton private constructor() {
    companion object {
        @Volatile
        private lateinit var uniqueInstance: Singleton

        fun getInstance(): Singleton {
            if (!this::uniqueInstance.isInitialized) {
                synchronized(Singleton::class) {
                    uniqueInstance = Singleton()
                }
            }
            return uniqueInstance
        }
    }

    fun afficher(): String = "Je suis un singleton".also(::println)
}