package com.ceko.coverall

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }



    @Test
    fun testMockMethodWithInput1() {
        // Arrange
        val coverallClass = CoverallClass()

        // Act
        val result = coverallClass.mockMethod(1)

        // Assert
        assertEquals("A", result)
    }

    @Test
    fun testMockMethodWithInput2() {
        // Arrange
        val coverallClass = CoverallClass()

        // Act
        val result = coverallClass.mockMethod(2)

        // Assert
        assertEquals("B", result)
    }

    @Test
    fun testMockMethodWithInputOther() {
        // Arrange
        val coverallClass = CoverallClass()

        // Act
        val result = coverallClass.mockMethod(3)

        // Assert
        assertEquals("C", result)
    }
}