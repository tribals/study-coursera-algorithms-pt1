import kotlin.test.*
import edu.princeton.cs.algs4.StdRandom

class Algs4Test {
    @Test fun testStdRandomGeneratesSomeRandomNumber() {
        assertTrue(StdRandom.uniform() < 1)
    }
}
