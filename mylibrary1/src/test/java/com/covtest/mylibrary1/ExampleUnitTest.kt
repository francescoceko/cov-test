package com.covtest.mylibrary1

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

    private val coverallClass = Library1Foo()

    @Test
    fun testMockMethodWithInput1() {
        // Act
        val result = coverallClass.exampleMethod(1)

        // Assert
        assertEquals("A", result)
    }
//
//    @Test
//    fun testMockMethodWithInput2() {
//        // Arrange
//
//        // Act
//        val result = coverallClass.exampleMethod(2)
//
//        // Assert
//        assertEquals("B", result)
//    }
//
//    @Test
//    fun testMockMethodWithInputOther() {
//
//        // Act
//        val result = coverallClass.exampleMethod(3)
//
//        // Assert
//        assertEquals("C", result)
//    }
}