package test
import Letters
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

//import kotlin

class LetterTest {
    @Test
    fun uppercase_shouldBe_UPPERCASE(){
        val convert = Letters()
        var actual = convert.toUpperCase("uppercase")
        assertEquals("UPPERCASE",actual  )
    }
    @Test
    fun UPPERCASE_shouldBe_uppercase(){
        val convert = Letters()
        var actual = convert.toLowerCase("UPPERCASE")
        assertEquals("uppercase",actual  )
    }

}