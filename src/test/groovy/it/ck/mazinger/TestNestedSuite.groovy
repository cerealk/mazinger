package it.ck.mazinger

import org.junit.Test

/**
 * Created by cerealk on 30/03/14.
 */
class TestNestedSuite extends BaseMazingerTest {

    @Test
    def void simpleTestsNested() {
        spec("") {
            suite("external suite") {
                suite("hinner suite") {
                    test("hinner test") {
                        assert true
                        println "hinner test passed"
                    }
                }
            }
        }
    }
}
