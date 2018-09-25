package com.dimbo.zavodman

import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

//@RunWith(SpringRunner::class)
//@SpringBootTest
class ZavodmanApplicationTests {

    @Before
    fun contextLoads() {

    }

    @Test
    fun shouldReturnEven() {
        fun even(num: Int) = num % 2 == 0
        assertTrue(even(2))
    }

    @Test
    fun shouldReturnOdd() {
        fun odd(num: Int) = num % 2 == 1
        assertTrue(odd(3))
    }

    @Test
    fun seqTest() {
        val seq = generateSequence(1) { it * 2 }
        print(seq.take(5).toList())
    }

}
