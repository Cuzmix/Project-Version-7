
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reserve_Scope0 {
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

     object reserve_Scope1 {
import helper._

class reserve extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Product],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(addProductForm: play.data.Form[models.Product],user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.75*/("""

"""),format.raw/*6.102*/("""

"""),_display_(/*8.2*/main("Confirm Reservation", user)/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
	"""),format.raw/*9.2*/("""<h3>Reservation</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*12.3*/form(action = routes.HomeController.addReserveSubmit(), 'class -> "form-horizontal", 'role->"form")/*12.102*/ {_display_(Seq[Any](format.raw/*12.104*/("""
		"""),format.raw/*13.3*/("""<!-- Hidden ID field - required for product updates -->	
		"""),_display_(/*14.4*/inputText(addProductForm("stock"), '_label -> "", 'style -> "display: none")),format.raw/*14.80*/("""
		"""),_display_(/*15.4*/inputText(addProductForm("id"), '_label -> "", 'style -> "display: none")),format.raw/*15.77*/("""
		"""),_display_(/*16.4*/inputText(addProductForm("name"), '_label -> "", 'style -> "display: none")),format.raw/*16.79*/("""
	"""),format.raw/*17.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*20.14*/routes/*20.20*/.HomeController.rent()),format.raw/*20.42*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*23.3*/(""" """),format.raw/*23.4*/("""<!-- End Form definition -->

""")))}),format.raw/*25.2*/(""" """),format.raw/*25.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:play.data.Form[models.Product],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm,user)

  def f:((play.data.Form[models.Product],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm,user) => apply(addProductForm,user)

  def ref: this.type = this

}


}
}

/**/
object reserve extends reserve_Scope0.reserve_Scope1.reserve
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 15:11:26 IST 2017
                  SOURCE: /home/ifeanyi/Documents/Project Version 7/Project Version 7/app/views/reserve.scala.html
                  HASH: a11871afdca3ac87d40a4cd2e1081cd0af765d24
                  MATRIX: 838->109|1006->182|1036->285|1064->288|1105->321|1144->323|1172->325|1287->414|1396->513|1437->515|1467->518|1553->578|1650->654|1680->658|1774->731|1804->735|1900->810|1929->812|2087->943|2102->949|2145->971|2246->1042|2274->1043|2335->1074|2363->1075
                  LINES: 30->4|35->4|37->6|39->8|39->8|39->8|40->9|43->12|43->12|43->12|44->13|45->14|45->14|46->15|46->15|47->16|47->16|48->17|51->20|51->20|51->20|54->23|54->23|56->25|56->25
                  -- GENERATED --
              */
          