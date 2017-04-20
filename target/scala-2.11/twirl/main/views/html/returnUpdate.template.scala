
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object returnUpdate_Scope0 {
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

     object returnUpdate_Scope1 {
import helper._

class returnUpdate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Users_library],models.users.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(UsersLibraryForm: play.data.Form[models.Users_library], user: models.users.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.84*/("""

"""),format.raw/*6.102*/("""


"""),_display_(/*9.2*/main("Retun Books/Exam Paper", user)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""
	"""),format.raw/*10.2*/("""<h3>Add a new Product</h3>


	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*14.3*/form(action = routes.HomeController.addReturnSubmit(user.getEmail), 'class -> "form-horizontal", 'role->"form")/*14.114*/ {_display_(Seq[Any](format.raw/*14.116*/("""

        """),_display_(/*16.10*/inputText(UsersLibraryForm("tempo"), '_label -> "", 'style -> "display: none")),format.raw/*16.88*/("""
        """),_display_(/*17.10*/inputText(UsersLibraryForm("tempo2"), '_label -> "", 'style -> "display: none")),format.raw/*17.89*/("""
        """),_display_(/*18.10*/inputText(UsersLibraryForm("tempo3"), '_label -> "", 'style -> "display: none")),format.raw/*18.89*/("""



	"""),format.raw/*22.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Save" class="btn btn-primary">
			<a href=""""),_display_(/*25.14*/routes/*25.20*/.HomeController.returnUpdate()),format.raw/*25.50*/("""">
				
				<button class="btn btn-warning">Cancel</button>
	  		</a>

  </div>
	""")))}),format.raw/*31.3*/(""" """),format.raw/*31.4*/("""<!-- End Form definition -->
""")))}),format.raw/*32.2*/("""
"""),format.raw/*33.1*/("""-- End of page content -->"""))
      }
    }
  }

  def render(UsersLibraryForm:play.data.Form[models.Users_library],user:models.users.Users): play.twirl.api.HtmlFormat.Appendable = apply(UsersLibraryForm,user)

  def f:((play.data.Form[models.Users_library],models.users.Users) => play.twirl.api.HtmlFormat.Appendable) = (UsersLibraryForm,user) => apply(UsersLibraryForm,user)

  def ref: this.type = this

}


}
}

/**/
object returnUpdate extends returnUpdate_Scope0.returnUpdate_Scope1.returnUpdate
              /*
                  -- GENERATED --
                  DATE: Wed Apr 19 17:10:47 IST 2017
                  SOURCE: /home/ifeanyi/Documents/Project Version 7/Project Version 7/app/views/returnUpdate.scala.html
                  HASH: 93059baf548720c4355700d83c424238da36dd60
                  MATRIX: 859->109|1036->191|1066->294|1095->298|1139->334|1178->336|1207->338|1328->433|1449->544|1490->546|1528->557|1627->635|1664->645|1764->724|1801->734|1901->813|1933->818|2091->949|2106->955|2157->985|2269->1067|2297->1068|2357->1098|2385->1099
                  LINES: 30->4|35->4|37->6|40->9|40->9|40->9|41->10|45->14|45->14|45->14|47->16|47->16|48->17|48->17|49->18|49->18|53->22|56->25|56->25|56->25|62->31|62->31|63->32|64->33
                  -- GENERATED --
              */
          