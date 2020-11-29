package test
import Letters
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LetterTest {
    @Test
    fun tendencia_en_desarrollo_shouldBe_TendenciaEnDesarrollo(){
        val convert = Letters()
        var actual = convert.toCamelCase("tendencia en desarrollo")
        assertEquals("TendenciaEnDesarrollo", actual)
    }
    @Test
    fun pascal_case_shouldBe_PascalCase(){
        val convert = Letters()
        var actual = convert.toPascalCase("pascal case")
        assertEquals("PascalCase", actual)
    }
    @Test
    fun upper_case_shouldBe_UPPER_CASE(){
        val convert = Letters()
        var actual = convert.toUpperCase("upper case")
        assertEquals("UPPER CASE", actual)
    }
    @Test
    fun LOWER_CASE_shouldBe_lower_case(){
        val convert = Letters()
        var actual = convert.toLowerCase("LOWER CASE")
        assertEquals("lower case", actual)
    }
    @Test
    fun ___Trim__tendencia_shouldBe_Trim__tendencia(){
        val convert = Letters()
        var actual = convert.toTrim("   Trim  tendencia")
        assertEquals("Trim  tendencia", actual)
    }





}