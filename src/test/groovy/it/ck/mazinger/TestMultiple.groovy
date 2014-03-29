package it.ck.mazinger

import org.junit.Test

/**
 * Created by cerealk on 25/03/14.
 */
class TestMultiple extends BaseMazingerTest {

    def variabile = 1

    @Test
    def void doubleTest() {
        suite("Double Test") {

            //TODO: considerato come un before implicito atualmente:
            // a tendere i valori definiti qui dovranno essere considerati degli "static" per la suite
            // si potrebbe generare un contesto gerarchico per gestire delle inizializzazioni a livello di suite comuni
            // missingMethod si va a cercare la proprietà nel contesto padre....
            // equivalente dello @shared in spock?
            a = 0;

            test("test 1") {
                assert a == 0
                a++
            }
            test("test 2") {
                assert a == 0
                a++
            }
        }

    }

    @Test
    def void doubleTestWithBefore() {
        suite("two tests in a suite should be independent") {

            a = 0;

            before() {
                a++
                b = 0
            }

            test("test 1") {
                assert a == 1
                assert b == 0
                a++
                b++

                println "test 1"
            }

            test("test 2") {
                assert a == 1
                assert b == 0
                a++
            }
        }

    }


    @Test
    def void doubleTestWithBeforeAndAfter() {
        suite("test with before and after") {
            a = 0;

            before() {
                a++
                b = 0
            }

            test("test 1") {
                assert a == 1
                assert b == 0
                a++
                b++

                println "test 1"
            }

            test("test 2") {
                assert a == 1
                assert b == 0
                a++
                b++

            }
            after() {
                assert a == 2
                assert b == 1
            }

        }

    }

}