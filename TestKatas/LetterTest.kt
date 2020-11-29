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



}