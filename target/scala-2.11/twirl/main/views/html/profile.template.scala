
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
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

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.users.Users],List[models.Product],List[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Users], products: List[models.Product], Transactions: List[models.Users_library],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.134*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Users", user)/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<!-- HTML content for the index view -->
    <div class="row">
        <br>
        <br>
        <br>
        <br>
        
        <div class="col-sm-12">
            <div class="panel panel-default" style = "color: black">
                <div class="panel-heading">
                    <h4 class="SubTitles">"""),_display_(/*15.44*/user/*15.48*/.getName()),format.raw/*15.58*/(""" """),format.raw/*15.59*/("""Profile</h4>
                </div>
                <div class="panel-body">
                    """),_display_(/*18.22*/if(flash.containsKey("success"))/*18.54*/ {_display_(Seq[Any](format.raw/*18.56*/("""
                        """),format.raw/*19.25*/("""<div class="alert alert-success">
                        """),_display_(/*20.26*/flash/*20.31*/.get("success")),format.raw/*20.46*/("""
                        """),format.raw/*21.25*/("""</div>
                    """)))}),format.raw/*22.22*/("""
                    """),format.raw/*23.21*/("""<table class="table table-bordered table-hover table-condensed">
                        <thead>
                                <!-- The header row-->
                            <tr>
                                <th style = "color: black">Email</th>
                                <th style = "color: black">Name</th>
                                <th style = "color: black">Address</th>
                                <th style = "color: black">Number</th>
                                <th style = "color: black">Password</th>
                                <th style = "color: black">Points</th>
                            </tr>
                        </thead>
                        <tbody>
                                <!-- Product row(s) -->
                                <!-- Start of For loop - For each p in products add a row -->

                            <tr>
                                <td>"""),_display_(/*40.38*/user/*40.42*/.getEmail),format.raw/*40.51*/("""</td>
                                <td>"""),_display_(/*41.38*/user/*41.42*/.getName),format.raw/*41.50*/("""</td>
                                <td>"""),_display_(/*42.38*/user/*42.42*/.getAddress),format.raw/*42.53*/("""</td>
                                <td>"""),_display_(/*43.38*/user/*43.42*/.getNumber),format.raw/*43.52*/("""</td>
                                <td>"""),_display_(/*44.38*/user/*44.42*/.getPassword),format.raw/*44.54*/("""</td>
                                <td>"""),_display_(/*45.38*/user/*45.42*/.getPoints),format.raw/*45.52*/("""</td>

                                <td>
                                    <a href=""""),_display_(/*48.47*/routes/*48.53*/.HomeController.updateProfile(user.getEmail)),format.raw/*48.97*/("""" class="btn-xs btn-danger">
                                        <span class="glyphicon glyphicon-pencil"></span></a>
                                </td>

                            </tr>

                        </tbody>
                    </table>
                            <table class="table table-bordered table-hover table-condensed">
                        <thead>
                            <h1 style = "color: black;"> Items </h1>
                                <!-- The header row-->

                            <tr>
                                <th style = "color: black">ID</th>
                                <th style = "color: black">Product ID</th>
                                <th style = "color: black">User Email</th>
                                <th style = "color: black">Date Of transaction </th>
                                <th style = "color: black">Expire Date</th>
                                <th style = "color: black">Return</th>
                                <th style = "color: black;">Extend</th>

                            </tr>


                            """),_display_(/*73.30*/for(p <- Transactions) yield /*73.52*/{_display_(Seq[Any](format.raw/*73.53*/("""
                                """),_display_(/*74.34*/if(p.getUser_email.equalsIgnoreCase(user.getEmail))/*74.85*/{_display_(Seq[Any](format.raw/*74.86*/("""
                                    """),format.raw/*75.37*/("""<tr>
                                        <td>"""),_display_(/*76.46*/p/*76.47*/.getId),format.raw/*76.53*/("""</td>
                                        <td>"""),_display_(/*77.46*/p/*77.47*/.getUser_product_id),format.raw/*77.66*/("""</td>
                                        <td>"""),_display_(/*78.46*/p/*78.47*/.getUser_email),format.raw/*78.61*/("""</td>
                                        <td>"""),_display_(/*79.46*/p/*79.47*/.getDate_transaction),format.raw/*79.67*/("""</td>
                                        <td>"""),_display_(/*80.46*/p/*80.47*/.getExpiring_date),format.raw/*80.64*/("""</td>
                                        <td>"""),_display_(/*81.46*/p/*81.47*/.getReturned),format.raw/*81.59*/("""
                                            """),_display_(/*82.46*/if(p.getReturned() == "false")/*82.76*/{_display_(Seq[Any](format.raw/*82.77*/("""
                                            """),format.raw/*83.45*/("""<a href=""""),_display_(/*83.55*/routes/*83.61*/.HomeController.updateReturn(p.getId)),format.raw/*83.98*/("""" class="btn-xs btn-danger">
                                                return <span class="glyphicon glyphicon-pencil"></span></a>
                                        """)))}),format.raw/*85.42*/("""


                                        """),format.raw/*88.41*/("""</td>
                                         <td>"""),_display_(/*89.47*/p/*89.48*/.getextendable),format.raw/*89.62*/("""
                                            """),_display_(/*90.46*/if(p.getextendable() == "true")/*90.77*/{_display_(Seq[Any](format.raw/*90.78*/("""
                                            """),format.raw/*91.45*/("""<a href=""""),_display_(/*91.55*/routes/*91.61*/.HomeController.updateTransaction(p.getId)),format.raw/*91.103*/("""" class="btn-xs btn-danger">
                                                Extend <span class="glyphicon glyphicon-pencil"></span></a>
                                        """)))}),format.raw/*93.42*/("""


                                        """),format.raw/*96.41*/("""</td>
                                    </tr>
                                """)))}),format.raw/*98.34*/("""
                            """)))}),format.raw/*99.30*/("""

                        """),format.raw/*101.25*/("""</thead>
                    
                    </table>
                </div>
            </div>


</div>
""")))}))
      }
    }
  }

  def render(users:List[models.users.Users],products:List[models.Product],Transactions:List[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(users,products,Transactions,user)

  def f:((List[models.users.Users],List[models.Product],List[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (users,products,Transactions,user) => apply(users,products,Transactions,user)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 14:15:21 IST 2017
                  SOURCE: /home/ifeanyi/Documents/YourMAMAv7/StrengthFromWithin/app/views/profile.scala.html
                  HASH: ccf6c12ef2c27890697dac4578412a500614f885
                  MATRIX: 834->1|1062->133|1090->135|1150->168|1178->169|1224->188|1252->189|1280->190|1327->212|1354->231|1393->233|1424->238|1763->550|1776->554|1807->564|1836->565|1961->663|2002->695|2042->697|2095->722|2181->781|2195->786|2231->801|2284->826|2343->854|2392->875|3350->1806|3363->1810|3393->1819|3463->1862|3476->1866|3505->1874|3575->1917|3588->1921|3620->1932|3690->1975|3703->1979|3734->1989|3804->2032|3817->2036|3850->2048|3920->2091|3933->2095|3964->2105|4081->2195|4096->2201|4161->2245|5316->3373|5354->3395|5393->3396|5454->3430|5514->3481|5553->3482|5618->3519|5695->3569|5705->3570|5732->3576|5810->3627|5820->3628|5860->3647|5938->3698|5948->3699|5983->3713|6061->3764|6071->3765|6112->3785|6190->3836|6200->3837|6238->3854|6316->3905|6326->3906|6359->3918|6432->3964|6471->3994|6510->3995|6583->4040|6620->4050|6635->4056|6693->4093|6902->4271|6973->4314|7052->4366|7062->4367|7097->4381|7170->4427|7210->4458|7249->4459|7322->4504|7359->4514|7374->4520|7438->4562|7647->4740|7718->4783|7830->4864|7891->4894|7946->4920
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|46->15|46->15|46->15|46->15|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|53->22|54->23|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|79->48|79->48|79->48|104->73|104->73|104->73|105->74|105->74|105->74|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|112->81|112->81|112->81|113->82|113->82|113->82|114->83|114->83|114->83|114->83|116->85|119->88|120->89|120->89|120->89|121->90|121->90|121->90|122->91|122->91|122->91|122->91|124->93|127->96|129->98|130->99|132->101
                  -- GENERATED --
              */
          