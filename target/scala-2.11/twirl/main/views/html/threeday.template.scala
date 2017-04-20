
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object threeday_Scope0 {
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

     object threeday_Scope1 {
import helper._

class threeday extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addThreeDayForm: play.data.Form[models.Product],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.76*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Confirm Loan", user)/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
	"""),format.raw/*9.2*/("""<h3>Three Day Loan</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.ThreeDayLoan(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*12.111*/ {_display_(Seq[Any](format.raw/*12.113*/("""
		"""),format.raw/*13.3*/("""<!-- Hidden ID field - required for product updates -->	
		"""),_display_(/*14.4*/inputText(addThreeDayForm("stock"), '_label -> "", 'style -> "display: none")),format.raw/*14.81*/("""
		"""),_display_(/*15.4*/inputText(addThreeDayForm("id"), '_label -> "", 'style -> "display: none")),format.raw/*15.78*/("""
		"""),_display_(/*16.4*/inputText(addThreeDayForm("name"), '_label -> "", 'style -> "display: none")),format.raw/*16.80*/("""

        """),format.raw/*18.9*/("""<p> Three Day loan </p>
	<!-- Add a submit button -->
	<div class="actions">
		<input type="submit" value="Save" class="btn btn-primary">
		<a href=""""),_display_(/*22.13*/routes/*22.19*/.HomeController.rent()),format.raw/*22.41*/(""""><button  type="button" value= """),_display_(/*22.74*/routes/*22.80*/.HomeController.rent()),format.raw/*22.102*/(""" """),format.raw/*22.103*/("""class="btn btn-warning">Cancel</button>
		</a>
	</div>
	""")))}),format.raw/*25.3*/(""" """),format.raw/*25.4*/("""<!-- End Form definition -->

""")))}),format.raw/*27.2*/(""" """),format.raw/*27.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addThreeDayForm:play.data.Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addThreeDayForm,user)

  def f:((play.data.Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addThreeDayForm,user) => apply(addThreeDayForm,user)

  def ref: this.type = this

}


}
}

/**/
object threeday extends threeday_Scope0.threeday_Scope1.threeday
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 17:10:47 IST 2017
                  SOURCE: /home/ifeanyi/Documents/Project Version 7/Project Version 7/app/views/threeday.scala.html
                  HASH: d96fedda7d0952c546e399566e80310cd4074505
                  MATRIX: 841->109|1010->183|1040->286|1068->289|1102->315|1141->317|1169->319|1287->411|1405->519|1446->521|1476->524|1562->584|1660->661|1690->665|1785->739|1815->743|1912->819|1949->829|2126->979|2141->985|2184->1007|2244->1040|2259->1046|2303->1068|2333->1069|2420->1126|2448->1127|2509->1158|2537->1159
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|53->22|53->22|53->22|53->22|53->22|53->22|53->22|56->25|56->25|58->27|58->27
                  -- GENERATED --
              */
          