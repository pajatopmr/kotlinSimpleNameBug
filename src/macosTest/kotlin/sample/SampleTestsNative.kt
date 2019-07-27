package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsNative {
    @Test
    fun testHello() {
        println(hello())
        assertTrue("Native" in hello() && "null" in hello())
    }
}