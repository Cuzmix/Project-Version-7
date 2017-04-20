
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ifeanyi/Documents/back up of ver7/Project Version 7/Project Version 7/conf/routes
// @DATE:Thu Apr 20 15:48:44 IST 2017


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
