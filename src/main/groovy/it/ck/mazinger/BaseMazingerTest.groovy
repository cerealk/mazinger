package it.ck.mazinger

/**
 * Created by cerealk on 3/15/14.
 */
class BaseMazingerTest {


    def stack = new MazingerStack()
    def spec(String name, Closure c){

        c()

        stack.run()
    }
    def suite(String name, Closure c){
        c.delegate = stack.context
        c.resolveStrategy= Closure.DELEGATE_FIRST
        c()


    }

    def before(Closure c){
        stack.before c
    }

    def test(String name, Closure c){
        stack.test c
    }

    def after(Closure c){
        stack.after c
    }
}
