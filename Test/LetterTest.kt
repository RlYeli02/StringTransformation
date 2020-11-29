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
    @Test
    fun Upper_Case_shouldBe_UpperCase(){
        val convert = Letters()
        var actual = convert.tocamelCase("Upper case")
        assertEquals("UpperCase",actual  )
    }
    @Test
    fun snake_case_ShouldBe_snake_case(){
        val convert = Letters()
        var actual = convert.toSnakeCase("snake case")
        assertEquals("snake_case",actual  )
    }
    @Test
    fun upper_Case_shouldBe_upperCase(){
        val convert = Letters()
        var actual = convert.toPascalCase("upper case")
        assertEquals("UpperCase",actual  )
    }
    @Test
    fun ___trim__n_shouldBE_trim__n(){
        val convert = Letters()
        var actual = convert.toTrim("   trim  n")
        assertEquals("trim  n",actual  )
    }
    

}