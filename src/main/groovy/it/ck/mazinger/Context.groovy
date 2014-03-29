package it.ck.mazinger

/**
 * Created by cerealk on 25/03/14.
 */
class Context {
    def _context = [:]

    def propertyMissing(String name) {
        if(_context.containsKey(name))
            _context."$name"
    }

    def propertyMissing(String name, value) {
        _context."$name" = value
    }
}
