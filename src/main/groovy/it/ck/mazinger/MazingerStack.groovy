package it.ck.mazinger

/**
 * Created by cerealk on 3/15/14.
 */
class MazingerStack {

    def context = [:]//new Context()
    def testStrip = []

    def currentStrip = new TestStrip();

    def test(Closure c) {
        currentStrip.test = c
        testStrip << currentStrip
        initNewStrip()
    }

    private void initNewStrip() {
        def newStrip = new TestStrip(before: currentStrip.before, context:[:]  << context )
        newStrip.before = currentStrip.before

        currentStrip = newStrip
    }

    def run() {
        testStrip.each(){
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
