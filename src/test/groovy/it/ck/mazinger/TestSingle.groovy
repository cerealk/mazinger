package it.ck.mazinger

import org.junit.Test


class TestSingle extends BaseMazingerTest {

    @Test
    void SingleTest() {

        suite("Single Test") {

            test("titolo test") {
                assert (true)
            }
        }
    }

    @Test
    void SingleTestWithInitInSuite() {

        suite("SingleTestWithInitInSuite") {
            a = 1
            test("thisIsATest") {
                a++
                assert a == 2
                println a
            }
        }
    }

    @Test
    void SingleTestWithBeforeAndAfter() {
        suite("SingleTestWithBefore") {
            before("before") {
                assert true
                a = 1
                b = 1
            }

            test("thisIsATest") {
                a++
                assert a == 2
                assert b == 1
                b--
            }

            after("close") {
                assert b == 0
                assert a == 2
            }
        }
    }
}
