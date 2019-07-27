package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsJVM {
    @Test
    fun testHelloForJVM() {
        assertTrue("JVM" in hello())
    }

    @Test
    fun testHelloForNull() {
        assertTrue("null" in hello(), "${hello()} Name should be == null!")
    }
}