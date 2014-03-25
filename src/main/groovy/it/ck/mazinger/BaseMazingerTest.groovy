package it.ck.mazinger

/**
 * Created by cerealk on 3/15/14.
 */
class BaseMazingerTest {


    def stack = new MazingerStack()

    def suite(String name, Closure c){
        c.delegate = stack.context
        c.resolveStrategy= Closure.DELEGATE_FIRST
        c()

        stack.run()
    }

    def before(String name, Closure c){
        stack.before c
    }

    def test(String name, Closure c){
        stack.test c
    }

    def after(String name, Closure c){
        stack.after c
    }
}
