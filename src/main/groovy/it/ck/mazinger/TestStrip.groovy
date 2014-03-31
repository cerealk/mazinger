package it.ck.mazinger

/**
 * Created by cerealk on 3/15/14.
 */
class TestStrip {
    def before = []
    def test
    def context
    def after = []

    def run(){
        runBefore()
        runTest()
        runAfter()
    }

    def runAfter() {
        after.each {
            prepareForRun (after)
            after()
        }
    }

    def runBefore() {
        before.each {
            prepareForRun(before)
            before()
        }
    }

    def runTest() {
        prepareForRun(test)
        test()
    }

    def prepareForRun(Closure c) {
        c.delegate = context
        c.resolveStrategy = Closure.DELEGATE_FIRST
    }
}
