import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun `1 + 2 = 3`() {
        assertEquals(3, calculator.add(1, 2))
    }

    @Test
    fun `2 + 2 = 4`() {
        assertEquals(4, calculator.add(2, 2))
    }
}