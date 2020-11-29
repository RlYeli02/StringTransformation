package test
import Letters
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LetterTest {
    @Test
    fun Upper_case_shouldBe_UpperCase(){
        val convert = Letters()
        var actual = convert.toCamelCase("Upper case")
        assertEquals("UpperCase", actual)
    }
}