
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.users.Users,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String, user: models.users.Users)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.58*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

            <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

            <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

        <link rel="stylesheet" media="screen" href=""""),_display_(/*25.54*/routes/*25.60*/.Assets.versioned("assets/css/main.css")),format.raw/*25.100*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*26.59*/routes/*26.65*/.Assets.versioned("images/favicon.png")),format.raw/*26.104*/("""">
    </head>
    <body>
            <!-- Page Wrapper -->
        <div id="page-wrapper">

                <!-- Page Wrapper -->
            <div id="page-wrapper">

                """),_display_(/*35.18*/if(title == "Home")/*35.37*/{_display_(Seq[Any](format.raw/*35.38*/("""
                        """),format.raw/*36.25*/("""<!--HOMEPAGE-->
                        <!-- Header -->
                    <header id="header" class="alt">
                        <h1><a href="index.html"><span class="glyphicon glyphicon-book"></span> DUT Library</a></h1>
                        <nav>
                            <a href="#menu">Menu</a>
                        </nav>
                    </header>
                """)))}),format.raw/*44.18*/("""
                """),_display_(/*45.18*/if(title != "Home")/*45.37*/{_display_(Seq[Any](format.raw/*45.38*/("""
                        """),format.raw/*46.25*/("""<!--OTHER PAGE-->
                        <!-- Header -->
                    <header id="header">
                        <h1><a href="index.html"><span class="glyphicon glyphicon-book"></span>DUT Library</a></h1>
                        <nav>
                            <a href="#menu">Menu</a>
                        </nav>
                    </header>

                """)))}),format.raw/*55.18*/("""


            """),format.raw/*58.13*/("""<!-- Menu -->
        <nav id="menu">
            <div class="inner">
                <h2>Menu</h2>
                <ul class="links">
                    <li """),_display_(/*63.26*/if(title == "Home")/*63.45*/{_display_(Seq[Any](format.raw/*63.46*/("""class="active"""")))}),format.raw/*63.61*/("""><a href=""""),_display_(/*63.72*/routes/*63.78*/.HomeController.index()),format.raw/*63.101*/("""">Home</a></li>
                    <li """),_display_(/*64.26*/if(title == "About")/*64.46*/{_display_(Seq[Any](format.raw/*64.47*/("""class="active"""")))}),format.raw/*64.62*/("""><a href=""""),_display_(/*64.73*/routes/*64.79*/.HomeController.about()),format.raw/*64.102*/("""">About Us</a></li>
                    <li """),_display_(/*65.26*/if(title == "Products")/*65.49*/{_display_(Seq[Any](format.raw/*65.50*/("""class="active"""")))}),format.raw/*65.65*/(""">
                    """),_display_(/*66.22*/if(user != null)/*66.38*/ {_display_(Seq[Any](format.raw/*66.40*/("""
                        """),format.raw/*67.25*/("""<a href=""""),_display_(/*67.35*/routes/*67.41*/.HomeController.rent()),format.raw/*67.63*/("""">Products</a>
                        <a href="#"> Purchase Points</a>
                    """)))}/*69.23*/else/*69.28*/{_display_(Seq[Any](format.raw/*69.29*/("""
                        """),format.raw/*70.25*/("""<a href=""""),_display_(/*70.35*/routes/*70.41*/.HomeController.products()),format.raw/*70.67*/("""">Products</a>
                    """)))}),format.raw/*71.22*/("""
                    """),format.raw/*72.21*/("""</li>
                    <li """),_display_(/*73.26*/if(title == "Sign Up")/*73.48*/{_display_(Seq[Any](format.raw/*73.49*/("""class="active"""")))}),format.raw/*73.64*/(""">
                    """),_display_(/*74.22*/if(user == null)/*74.38*/ {_display_(Seq[Any](format.raw/*74.40*/("""
                        """),format.raw/*75.25*/("""<a href=""""),_display_(/*75.35*/routes/*75.41*/.HomeController.signup()),format.raw/*75.65*/("""">Sign Up</a>
                    """)))}),format.raw/*76.22*/("""
                    """),format.raw/*77.21*/("""</li>
                    <li """),_display_(/*78.26*/if(title == "Login")/*78.46*/{_display_(Seq[Any](format.raw/*78.47*/("""class="active"""")))}),format.raw/*78.62*/(""">
                    """),_display_(/*79.22*/if(user != null)/*79.38*/{_display_(Seq[Any](format.raw/*79.39*/("""
                        """),format.raw/*80.25*/("""<li ><a href=""""),_display_(/*80.40*/routes/*80.46*/.HomeController.profile()),format.raw/*80.71*/("""">Profile</a></li>
                        <li><a href=""><p class="Navbar-FontStyle">Balance: """),_display_(/*81.78*/user/*81.82*/.getPoints()),format.raw/*81.94*/(""" """),format.raw/*81.95*/("""<span class="glyphicon glyphicon-bitcoin"></span></p></a></li>
                        <li ><a href=""""),_display_(/*82.40*/controllers/*82.51*/.security.routes.LoginController.logout()),format.raw/*82.92*/(""""><p class="Navbar-FontStyle">Logout """),_display_(/*82.130*/user/*82.134*/.getName()),format.raw/*82.144*/(""" """),format.raw/*82.145*/("""<span class="glyphicon glyphicon-log-in"></span></p></a></li>
                    """)))}/*83.23*/else/*83.28*/{_display_(Seq[Any](format.raw/*83.29*/("""
                        """),format.raw/*84.25*/("""<a href=""""),_display_(/*84.35*/controllers/*84.46*/.security.routes.LoginController.login()),format.raw/*84.86*/("""">Login</a>
                    """)))}),format.raw/*85.22*/("""
                """),format.raw/*86.17*/("""</ul>
                <a href="#" class="close">Close</a>
            </div>
        </nav>
    
    <div class="container-fluid">
        """),format.raw/*93.32*/("""
        """),_display_(/*94.10*/content),format.raw/*94.17*/("""
    """),format.raw/*95.5*/("""</div>
    <footer class="container-fluid">
        <section id="footer">
            <div class="inner">
                <h2 class="major">Get in touch</h2>
                <p>Cras mattis ante fermentum, malesuada neque vitae, eleifend erat. Phasellus non pulvinar erat. Fusce tincidunt, nisl eget mattis egestas, purus ipsum consequat orci, sit amet lobortis lorem lacus in tellus. Sed ac elementum arcu. Quisque placerat auctor laoreet.</p>
                <form method="post" action="#">
                    <div class="field">
                        <label for="name">Name</label>
                        <input type="text" name="name" id="name" />
                    </div>
                    <div class="field">
                        <label for="email">Email</label>
                        <input type="email" name="email" id="email" />
                    </div>
                    <div class="field">
                        <label for="message">Message</label>
                        <textarea name="message" id="message" rows="4"></textarea>
                    </div>
                    <ul class="actions">
                        <li><input type="submit" value="Send Message" /></li>
                    </ul>
                </form>
                <ul class="contact">
                    <li class="fa-home">
                        Untitled Inc<br />
                        1234 Somewhere Road Suite #2894<br />
                        Nashville, TN 00000-0000
                    </li>
                    <li class="fa-phone">(000) 000-0000</li>
                    <li class="fa-envelope"><a href="#">information/untitled.tld</a></li>
                    <li class="fa-twitter"><a href="#">twitter.com/untitled-tld</a></li>
                    <li class="fa-facebook"><a href="#">facebook.com/untitled-tld</a></li>
                    <li class="fa-instagram"><a href="#">instagram.com/untitled-tld</a></li>
                </ul>
                <ul class="copyright">
                    <li>&copy; Untitled Inc. All rights reserved.</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
                </ul>
            </div>
        </section>
     </footer>

        </div>

    </body>

        <!-- Load JavaScript libs last -->
    <script src=""""),_display_(/*142.19*/routes/*142.25*/.Assets.versioned("assets/js/skel.min.js")),format.raw/*142.67*/(""""></script>
    <script src=""""),_display_(/*143.19*/routes/*143.25*/.Assets.versioned("assets/js/jquery.min.js")),format.raw/*143.69*/(""""></script>
    <script src=""""),_display_(/*144.19*/routes/*144.25*/.Assets.versioned("assets/js/jquery.scrollex.min.js")),format.raw/*144.78*/(""""></script>
    <script src=""""),_display_(/*145.19*/routes/*145.25*/.Assets.versioned("assets/js/util.js")),format.raw/*145.63*/(""""></script>
    <script src=""""),_display_(/*146.19*/routes/*146.25*/.Assets.versioned("assets/js/ie/respond.min.js")),format.raw/*146.73*/(""""></script>
    <script src=""""),_display_(/*147.19*/routes/*147.25*/.Assets.versioned("assets/js/main.js")),format.raw/*147.63*/(""""></script>
    <script src=""""),_display_(/*148.19*/routes/*148.25*/.Assets.versioned("https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js")),format.raw/*148.110*/(""""></script>
    <script src=""""),_display_(/*149.19*/routes/*149.25*/.Assets.versioned("https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js")),format.raw/*149.113*/(""""></script>
    <script src=""""),_display_(/*150.19*/routes/*150.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*150.66*/("""" type="text/javascript"></script>
</html>

"""))
      }
    }
  }

  def render(title:String,user:models.users.Users,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.Users) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 15:11:26 IST 2017
                  SOURCE: /home/ifeanyi/Documents/Project Version 7/Project Version 7/app/views/main.scala.html
                  HASH: 52d414650ed057fc287cb01d3868699447630934
                  MATRIX: 1021->260|1172->316|1200->318|1280->423|1316->432|1351->440|1377->445|2378->1419|2393->1425|2455->1465|2543->1526|2558->1532|2619->1571|2831->1756|2859->1775|2898->1776|2951->1801|3369->2188|3414->2206|3442->2225|3481->2226|3534->2251|3942->2628|3985->2643|4172->2803|4200->2822|4239->2823|4285->2838|4323->2849|4338->2855|4383->2878|4451->2919|4480->2939|4519->2940|4565->2955|4603->2966|4618->2972|4663->2995|4735->3040|4767->3063|4806->3064|4852->3079|4902->3102|4927->3118|4967->3120|5020->3145|5057->3155|5072->3161|5115->3183|5227->3277|5240->3282|5279->3283|5332->3308|5369->3318|5384->3324|5431->3350|5498->3386|5547->3407|5605->3438|5636->3460|5675->3461|5721->3476|5771->3499|5796->3515|5836->3517|5889->3542|5926->3552|5941->3558|5986->3582|6052->3617|6101->3638|6159->3669|6188->3689|6227->3690|6273->3705|6323->3728|6348->3744|6387->3745|6440->3770|6482->3785|6497->3791|6543->3816|6666->3912|6679->3916|6712->3928|6741->3929|6870->4031|6890->4042|6952->4083|7018->4121|7032->4125|7064->4135|7094->4136|7196->4220|7209->4225|7248->4226|7301->4251|7338->4261|7358->4272|7419->4312|7483->4345|7528->4362|7695->4591|7732->4601|7760->4608|7792->4613|10115->6908|10131->6914|10195->6956|10253->6986|10269->6992|10335->7036|10393->7066|10409->7072|10484->7125|10542->7155|10558->7161|10618->7199|10676->7229|10692->7235|10762->7283|10820->7313|10836->7319|10896->7357|10954->7387|10970->7393|11078->7478|11136->7508|11152->7514|11263->7602|11321->7632|11337->7638|11400->7679
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|55->25|55->25|55->25|56->26|56->26|56->26|65->35|65->35|65->35|66->36|74->44|75->45|75->45|75->45|76->46|85->55|88->58|93->63|93->63|93->63|93->63|93->63|93->63|93->63|94->64|94->64|94->64|94->64|94->64|94->64|94->64|95->65|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|97->67|99->69|99->69|99->69|100->70|100->70|100->70|100->70|101->71|102->72|103->73|103->73|103->73|103->73|104->74|104->74|104->74|105->75|105->75|105->75|105->75|106->76|107->77|108->78|108->78|108->78|108->78|109->79|109->79|109->79|110->80|110->80|110->80|110->80|111->81|111->81|111->81|111->81|112->82|112->82|112->82|112->82|112->82|112->82|112->82|113->83|113->83|113->83|114->84|114->84|114->84|114->84|115->85|116->86|122->93|123->94|123->94|124->95|171->142|171->142|171->142|172->143|172->143|172->143|173->144|173->144|173->144|174->145|174->145|174->145|175->146|175->146|175->146|176->147|176->147|176->147|177->148|177->148|177->148|178->149|178->149|178->149|179->150|179->150|179->150
                  -- GENERATED --
              */
          