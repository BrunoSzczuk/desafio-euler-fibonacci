package br.com.bruno.desafioeuler

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

internal class DesafioTest {

    @ParameterizedTest
    @CsvSource(
        "1415926535, 8979323846, 35, 9",
        "1234, 5678, 6, 6",
        "12345, 67890, 10, 0",
        "1234, 56789, 14, 9",
        "1234, 56789, 24, 5",
        "1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679, 8214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196, 104683731294243150, 8"
    )
    fun fibonacciWordsTest(wordA: String, wordB: String, index: Long, expected: String) {
        val result = Desafio.fibonacciWords(wordA, wordB, index)
        assertEquals(expected, result)
    }
}






/*


 */