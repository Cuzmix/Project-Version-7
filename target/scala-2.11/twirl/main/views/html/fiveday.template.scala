
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object fiveday_Scope0 {
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

     object fiveday_Scope1 {
import helper._

class fiveday extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addFiveDayForm: play.data.Form[models.Product],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.75*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("ConfirmLoan", user)/*8.27*/ {_display_(Seq[Any](format.raw/*8.29*/("""
	"""),format.raw/*9.2*/("""<h3>Five Day Loan</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.FiveDayLoan(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*12.110*/ {_display_(Seq[Any](format.raw/*12.112*/("""
		"""),format.raw/*13.3*/("""<!-- Hidden ID field - required for product updates -->	
		"""),_display_(/*14.4*/inputText(addFiveDayForm("stock"), '_label -> "", 'style -> "display: none")),format.raw/*14.80*/("""
		"""),_display_(/*15.4*/inputText(addFiveDayForm("id"), '_label -> "", 'style -> "display: none")),format.raw/*15.77*/("""
		"""),_display_(/*16.4*/inputText(addFiveDayForm("name"), '_label -> "", 'style -> "display: none")),format.raw/*16.79*/("""

        """),format.raw/*18.9*/("""<p> Five Day loan </p>
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

  def render(addFiveDayForm:play.data.Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addFiveDayForm,user)

  def f:((play.data.Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addFiveDayForm,user) => apply(addFiveDayForm,user)

  def ref: this.type = this

}


}
}

/**/
object fiveday extends fiveday_Scope0.fiveday_Scope1.fiveday
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 17:10:47 IST 2017
                  SOURCE: /home/ifeanyi/Documents/Project Version 7/Project Version 7/app/views/fiveday.scala.html
                  HASH: 73f902f681cfb0c9ea3537b7aca98b0ec14ffd4b
                  MATRIX: 838->109|1006->182|1036->285|1064->288|1097->313|1136->315|1164->317|1281->408|1398->515|1439->517|1469->520|1555->580|1652->656|1682->660|1776->733|1806->737|1902->812|1939->822|2115->971|2130->977|2173->999|2233->1032|2248->1038|2292->1060|2322->1061|2409->1118|2437->1119|2498->1150|2526->1151
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|44->13|45->14|45->14|46->15|46->15|47->16|47->16|49->18|53->22|53->22|53->22|53->22|53->22|53->22|53->22|56->25|56->25|58->27|58->27
                  -- GENERATED --
              */
          