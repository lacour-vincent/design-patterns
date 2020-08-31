package singleton

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class SingletonTest {

    @Test
    fun `Doit retourner la meme instance de singleton`() {
        val singleton1: Singleton = Singleton.getInstance()
        val singleton2: Singleton = Singleton.getInstance()
        Assertions.assertEquals("Je suis un singleton", singleton1.afficher())
        Assertions.assertEquals("Je suis un singleton", singleton2.afficher())
        Assertions.assertEquals(singleton1, singleton2)
    }
}
