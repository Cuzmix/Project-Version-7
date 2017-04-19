
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ifeanyi/Documents/YourMAMAv7/StrengthFromWithin/conf/routes
// @DATE:Wed Apr 19 14:15:20 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
