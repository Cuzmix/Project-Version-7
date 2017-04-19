
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object rent_Scope0 {
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

class rent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[models.Product],List[models.Category],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products", user)/*4.24*/ {_display_(Seq[Any](format.raw/*4.26*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
    <section id="wrapper">

        <section id="products" class="wrapper spotlight style3">
            <div class="content">
                <div class="row">
                    <div class="col-sm-2">
                        <h4>Categories</h4>
                        <div class="list-group">
                                <!-- A link to display all products -->
                            <a href=""""),_display_(/*15.39*/routes/*15.45*/.HomeController.rent(0)),format.raw/*15.68*/("""" class="list-group-item">All categories</a>

                                <!-- Start of For loop - For each c in categories add a list item -->
                                <!-- Also show the number of products in each category -->
                            """),_display_(/*19.30*/for(c <- categories) yield /*19.50*/ {_display_(Seq[Any](format.raw/*19.52*/("""
                                """),format.raw/*20.33*/("""<a href=""""),_display_(/*20.43*/routes/*20.49*/.HomeController.rent(c.getId)),format.raw/*20.78*/("""" class="list-group-item">"""),_display_(/*20.105*/c/*20.106*/.getName),format.raw/*20.114*/("""
                                """),format.raw/*21.33*/("""<span class="badge">"""),_display_(/*21.54*/c/*21.55*/.getProducts.size()),format.raw/*21.74*/("""</span>
                                </a>
                            """)))}),format.raw/*23.30*/("""
                        """),format.raw/*24.25*/("""</div>
                    </div>
                    <div class="col-sm-10">

                        """),_display_(/*28.26*/if(flash.containsKey("success"))/*28.58*/ {_display_(Seq[Any](format.raw/*28.60*/("""
                            """),format.raw/*29.29*/("""<div class="alert alert-success">
                            """),_display_(/*30.30*/flash/*30.35*/.get("success")),format.raw/*30.50*/("""
                            """),format.raw/*31.29*/("""</div>
                        """)))}),format.raw/*32.26*/("""
                            """),format.raw/*33.29*/("""<!-- Two -->
                        <section id="two" class="wrapper alt spotlight style2">
                            <div class="inner">
                                <a href="#" class="image"><img src="images/pic02.jpg" alt="" /></a>
                                <div class="content">
                                    <table>
                                        <thead>
                                                <!-- The header row-->
                                            <tr>
                                                <th>ID</th>
                                                <th>Name</th>
                                                <th>Description</th>
                                                <th>Stock</th>
                                                <th>Price</th>
                                                <th>Reserve</th>
                                                <th>loan length</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                                <!-- Product row(s) -->
                                                <!-- Start of For loop - For each p in products add a row -->
                                            """),_display_(/*54.46*/for(p <- products) yield /*54.64*/ {_display_(Seq[Any](format.raw/*54.66*/("""
                                                """),format.raw/*55.49*/("""<tr>
                                                    <td>"""),_display_(/*56.58*/p/*56.59*/.getId),format.raw/*56.65*/("""</td>
                                                    <td>"""),_display_(/*57.58*/p/*57.59*/.getName),format.raw/*57.67*/("""</td>
                                                    <td>"""),_display_(/*58.58*/p/*58.59*/.getDescription),format.raw/*58.74*/("""</td>
                                                    <td>"""),_display_(/*59.58*/p/*59.59*/.getStock),format.raw/*59.68*/("""</td>
                                                    <td>&euro; """),_display_(/*60.65*/("%.2f".format(p.getPrice))),format.raw/*60.92*/("""</td>
                                                    <td>
                                                        <a href=""""),_display_(/*62.67*/routes/*62.73*/.HomeController.updateReserve(p.getId)),format.raw/*62.111*/("""" class="btn-xs btn-danger">
                                                            <span class="glyphicon glyphicon-pencil"></span></a>
                                                    </td>

                                                    <td>
                                                            <li>  <a href=""""),_display_(/*67.77*/routes/*67.83*/.HomeController.updateThreeDayLoan(p.getId)),format.raw/*67.126*/("""" class="btn btn-danger" role="button">3 Days</a> </li>
                                                            <li>  <a href=""""),_display_(/*68.77*/routes/*68.83*/.HomeController.updateFiveDayLoan(p.getId)),format.raw/*68.125*/("""" class="btn btn-danger" role="button">5 Days</a> </li>
                                                             <li> <a href=""""),_display_(/*69.77*/routes/*69.83*/.HomeController.updateSevenDayLoan(p.getId)),format.raw/*69.126*/("""" class="btn btn-danger" role="button">7 Days</a> </li>
                                                    </td>


                                                </tr>
                                            """)))}),format.raw/*74.46*/(""" """),format.raw/*74.47*/("""<!-- End of For loop -->
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </section>


                    </div>
                </div>
            </div>
        </section>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*89.27*/("""{"""),format.raw/*89.28*/("""
        """),format.raw/*90.9*/("""return confirm('Are you sure?');
    """),format.raw/*91.5*/("""}"""),format.raw/*91.6*/("""
  """),format.raw/*92.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user)

  def f:((List[models.Product],List[models.Category],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user) => apply(products,categories,user)

  def ref: this.type = this

}


}

/**/
object rent extends rent_Scope0.rent
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 14:47:01 IST 2017
                  SOURCE: /home/ifeanyi/Documents/YourMAMAv7/StrengthFromWithin/app/views/rent.scala.html
                  HASH: 0852b6aaaf6db7e387125d05f659fa0480e778ee
                  MATRIX: 798->1|986->94|1014->96|1074->129|1102->130|1148->149|1176->150|1204->151|1251->173|1281->195|1320->197|1349->200|1824->648|1839->654|1883->677|2178->945|2214->965|2254->967|2315->1000|2352->1010|2367->1016|2417->1045|2472->1072|2483->1073|2513->1081|2574->1114|2622->1135|2632->1136|2672->1155|2777->1229|2830->1254|2961->1358|3002->1390|3042->1392|3099->1421|3189->1484|3203->1489|3239->1504|3296->1533|3359->1565|3416->1594|4775->2926|4809->2944|4849->2946|4926->2995|5015->3057|5025->3058|5052->3064|5142->3127|5152->3128|5181->3136|5271->3199|5281->3200|5317->3215|5407->3278|5417->3279|5447->3288|5544->3358|5592->3385|5748->3514|5763->3520|5823->3558|6184->3892|6199->3898|6264->3941|6423->4073|6438->4079|6502->4121|6661->4253|6676->4259|6741->4302|6987->4517|7016->4518|7477->4951|7506->4952|7542->4961|7606->4998|7634->4999|7664->5002
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|46->15|46->15|46->15|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|51->20|52->21|52->21|52->21|52->21|54->23|55->24|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|64->33|85->54|85->54|85->54|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|93->62|93->62|93->62|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|105->74|105->74|120->89|120->89|121->90|122->91|122->91|123->92
                  -- GENERATED --
              */
          