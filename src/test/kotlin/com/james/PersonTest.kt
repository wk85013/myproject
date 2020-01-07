package com.james.kotlin

import com.james.Human
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun humanBmiTest() {
        val human = Human("james", 66.5f, 1.7f)
        Assertions.assertEquals(66.5f / (1.7f * 1.7f), human.bmi())
    }

}