
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/ifeanyi/Documents/YourMAMAv7/StrengthFromWithin/conf/routes
// @DATE:Wed Apr 19 14:15:20 IST 2017

package controllers.security;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.security.ReverseLoginController LoginController = new controllers.security.ReverseLoginController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.security.javascript.ReverseLoginController LoginController = new controllers.security.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
  }

}
