package it.ck.mazinger

/**
 * Created by cerealk on 3/15/14.
 */
class MazingerStack {

    def context = [:]
    def testStrip = []

    def currentStrip = new TestStrip();

    def test(Closure c) {
        currentStrip.test = c
        testStrip << currentStrip
        currentStrip == new TestStrip()
    }

    def run() {
        testStrip.each(){
            it.context = context
            it.run()
        }
    }

    def before(Closure c) {
        currentStrip.before = c
    }

    def after (Closure c){
        currentStrip.after = c
    }
}
