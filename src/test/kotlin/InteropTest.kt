import kotlin.test.*

class InteropTest {
    @Test fun testKotlinTestsCanInteropWithJavaClasses() {
        var dummy = Dummy()

        assertTrue(dummy.interoperable)
    }
}
