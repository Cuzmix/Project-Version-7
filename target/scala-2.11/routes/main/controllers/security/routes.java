
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ifeanyi/Documents/back up of ver7/Project Version 7/Project Version 7/conf/routes
// @DATE:Thu Apr 20 15:48:44 IST 2017

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginController LoginController = new controllers.security.ReverseLoginController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginController LoginController = new controllers.security.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
  }

}
