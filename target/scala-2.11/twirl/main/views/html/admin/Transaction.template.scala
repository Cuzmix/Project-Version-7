
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Transaction_Scope0 {
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

class Transaction extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Transaction: List[models.Users_library], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/admin/*4.7*/.adminMain("transaction", user)/*4.38*/ {_display_(Seq[Any](format.raw/*4.40*/("""

    """),format.raw/*6.5*/("""<!-- HTML content for the index view -->
    <div class="container-fluid">
        <div class="row">
            <div class="content">
                <table class="table table-bordered table-hover table-condensed">
                    <thead>
                            <!-- The header row-->

                        <h1>Users Transactions</h1>

                        <tr>

                            <th>ID</th>
                            <th>Product ID</th>
                            <th>User Email</th>
                            <th>Date Transaction</th>
                            <th>Expire Date</th>
                        </tr>
                    </thead>
                    <tbody>
                            <!-- Product row(s) -->
                            <!-- Start of For loop - For each p in products add a row -->
                        """),_display_(/*28.26*/for(p <- Transaction) yield /*28.47*/ {_display_(Seq[Any](format.raw/*28.49*/("""
                            """),format.raw/*29.29*/("""<tr>
                                <td>"""),_display_(/*30.38*/p/*30.39*/.getId),format.raw/*30.45*/("""</td>
                                <td>"""),_display_(/*31.38*/p/*31.39*/.getUser_product_id),format.raw/*31.58*/("""</td>
                                <td>"""),_display_(/*32.38*/p/*32.39*/.getUser_email),format.raw/*32.53*/("""</td>
                                <td>"""),_display_(/*33.38*/p/*33.39*/.getDate_transaction),format.raw/*33.59*/("""</td>
                                <td>"""),_display_(/*34.38*/p/*34.39*/.getExpiring_date),format.raw/*34.56*/("""</td>


                            </tr>
                        """)))}),format.raw/*38.26*/(""" """),format.raw/*38.27*/("""<!-- End of For loop -->
                    </tbody>
                </table>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(Transaction:List[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(Transaction,user)

  def f:((List[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (Transaction,user) => apply(Transaction,user)

  def ref: this.type = this

}


}

/**/
object Transaction extends Transaction_Scope0.Transaction
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 17:18:49 IST 2017
                  SOURCE: /home/ifeanyi/Documents/Project Version 7/Project Version 7/app/views/admin/Transaction.scala.html
                  HASH: bfbe6a937f420c6770ad01135441ba57a9c2c0d0
                  MATRIX: 802->1|964->68|992->70|1052->103|1080->104|1126->123|1154->124|1182->125|1229->147|1241->152|1280->183|1319->185|1351->191|2250->1063|2287->1084|2327->1086|2384->1115|2453->1157|2463->1158|2490->1164|2560->1207|2570->1208|2610->1227|2680->1270|2690->1271|2725->1285|2795->1328|2805->1329|2846->1349|2916->1392|2926->1393|2964->1410|3062->1477|3091->1478
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|69->38|69->38
                  -- GENERATED --
              */
          