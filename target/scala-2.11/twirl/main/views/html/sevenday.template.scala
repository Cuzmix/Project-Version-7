
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object sevenday_Scope0 {
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

     object sevenday_Scope1 {
import helper._

class sevenday extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addSevenDayForm: play.data.Form[models.Product],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.76*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Confirm Reservation", user)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
	"""),format.raw/*9.2*/("""<h3>Reservation</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.SevenDayLoan(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*12.111*/ {_display_(Seq[Any](format.raw/*12.113*/("""
		"""),format.raw/*13.3*/("""<!-- Hidden ID field - required for product updates -->	
		"""),_display_(/*14.4*/inputText(addSevenDayForm("stock"), '_label -> "", 'style -> "display: none")),format.raw/*14.81*/("""
		"""),_display_(/*15.4*/inputText(addSevenDayForm("id"), '_label -> "", 'style -> "display: none")),format.raw/*15.78*/("""
		"""),_display_(/*16.4*/inputText(addSevenDayForm("name"), '_label -> "", 'style -> "display: none")),format.raw/*16.80*/("""

        """),format.raw/*18.9*/("""<p> Seven Day loan </p>
	<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*22.14*/routes/*22.20*/.HomeController.rent()),format.raw/*22.42*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*25.3*/(""" """),format.raw/*25.4*/("""<!-- End Form definition -->

""")))}),format.raw/*27.2*/(""" """),format.raw/*27.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addSevenDayForm:play.data.Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addSevenDayForm,user)

  def f:((play.data.Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addSevenDayForm,user) => apply(addSevenDayForm,user)

  def ref: this.type = this

}


}
}

/**/
object sevenday extends sevenday_Scope0.sevenday_Scope1.sevenday
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 14:15:21 IST 2017
                  SOURCE: /home/ifeanyi/Documents/YourMAMAv7/StrengthFromWithin/app/views/sevenday.scala.html
                  HASH: 0c964b933a0116455d0f337a5887b33e20d428c0
                  MATRIX: 841->109|1010->183|1040->286|1068->289|1109->322|1148->324|1176->326|1291->415|1409->523|1450->525|1480->528|1566->588|1664->665|1694->669|1789->743|1819->747|1916->823|1953->833|2136->989|2151->995|2194->1017|2295->1088|2323->1089|2384->1120|2412->1121
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|53->22|53->22|53->22|56->25|56->25|58->27|58->27
                  -- GENERATED --
              */
          