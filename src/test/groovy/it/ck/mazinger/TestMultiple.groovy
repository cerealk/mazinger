package it.ck.mazinger

import org.junit.Test

/**
 * Created by cerealk on 25/03/14.
 */
class TestMultiple extends BaseMazingerTest {


    @Test
    def void doubleTest(){
        suite("Double Test"){

            a = 0;

            test("test 1"){
                assert true
                assert a==0
                a++
            }
            test("test 2"){
                assert a==1
                a++
                assert true
            }
        }


    }
}
