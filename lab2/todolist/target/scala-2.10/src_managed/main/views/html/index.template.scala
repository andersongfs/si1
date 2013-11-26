
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*4.1*/("""

"""),_display_(Seq[Any](/*6.2*/main("Lista de Tarefas")/*6.26*/ {_display_(Seq[Any](format.raw/*6.28*/("""
"""),_display_(Seq[Any](/*7.2*/Collections/*7.13*/.sort(tasks))),format.raw/*7.25*/("""
    
    <h1>Tarefa(s) a ser(em) feita(s)</h1>
    
    <ul>
        """),_display_(Seq[Any](/*12.10*/for(task <- tasks) yield /*12.28*/ {_display_(Seq[Any](format.raw/*12.30*/("""

            """),_display_(Seq[Any](/*14.14*/if(!task.isDone)/*14.30*/{_display_(Seq[Any](format.raw/*14.31*/("""
                <li>
                    Nome: """),_display_(Seq[Any](/*16.28*/task/*16.32*/.label)),format.raw/*16.38*/("""<br>
                    Associacao: """),_display_(Seq[Any](/*17.34*/task/*17.38*/.association)),format.raw/*17.50*/("""<br>
                    Prioridade: """),_display_(Seq[Any](/*18.34*/task/*18.38*/.priority)),format.raw/*18.47*/("""<br>
                    Done: """),_display_(Seq[Any](/*19.28*/task/*19.32*/.done)),format.raw/*19.37*/("""<br>
                    
                    """),_display_(Seq[Any](/*21.22*/form(routes.Application.update(task.id))/*21.62*/ {_display_(Seq[Any](format.raw/*21.64*/("""
                        <input type="submit" value="Feito">
                    """)))})),format.raw/*23.22*/("""
                    """),_display_(Seq[Any](/*24.22*/form(routes.Application.deleteTask(task.id))/*24.66*/ {_display_(Seq[Any](format.raw/*24.68*/("""
                        <input type="submit" value="Deletar">
                    """)))})),format.raw/*26.22*/("""
                </li>
            """)))})),format.raw/*28.14*/("""
        """)))})),format.raw/*29.10*/("""
    </ul>

    <h1>Tarefa(s) Feita(s)</h1>
    <ul>
        """),_display_(Seq[Any](/*34.10*/for(task <- tasks) yield /*34.28*/ {_display_(Seq[Any](format.raw/*34.30*/("""
            """),_display_(Seq[Any](/*35.14*/if(task.isDone)/*35.29*/{_display_(Seq[Any](format.raw/*35.30*/("""
                <li>
                    Nome: """),_display_(Seq[Any](/*37.28*/task/*37.32*/.label)),format.raw/*37.38*/("""<br>
                    Associacao: """),_display_(Seq[Any](/*38.34*/task/*38.38*/.association)),format.raw/*38.50*/("""<br>
                    Prioridade: """),_display_(Seq[Any](/*39.34*/task/*39.38*/.priority)),format.raw/*39.47*/("""<br>
                    Done: """),_display_(Seq[Any](/*40.28*/task/*40.32*/.done)),format.raw/*40.37*/("""<br>

                    """),_display_(Seq[Any](/*42.22*/form(routes.Application.deleteTask(task.id))/*42.66*/ {_display_(Seq[Any](format.raw/*42.68*/("""
                        <input type="submit" value="Deletar">
                    """)))})),format.raw/*44.22*/("""
                </li>
            """)))})),format.raw/*46.14*/("""

        """)))})),format.raw/*48.10*/("""
    </ul>
    
    <h2>Adicionar uma nova tarefa</h2>
    
    """),_display_(Seq[Any](/*53.6*/form(routes.Application.newTask())/*53.40*/ {_display_(Seq[Any](format.raw/*53.42*/("""
        
        """),_display_(Seq[Any](/*55.10*/inputText(taskForm("label")))),format.raw/*55.38*/(""" 
        """),_display_(Seq[Any](/*56.10*/inputText(taskForm("association")))),format.raw/*56.44*/("""
        <select name="priority">
            <option value=1 >1</option>
            <option value=2 >2</option>
            <option value=3 >3</option>
        
        <input type="submit" value="Criar">
        
    """)))})),format.raw/*64.6*/("""
    
""")))})),format.raw/*66.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]): play.api.templates.HtmlFormat.Appendable = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.HtmlFormat.Appendable) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Nov 25 23:41:23 BRT 2013
                    SOURCE: /Users/andersongfs/Documents/projetosPlay/todolist/app/views/index.scala.html
                    HASH: 65c7d0574f7d33d61e4b4fa71d900b39c5a5c7c1
                    MATRIX: 789->1|940->42|968->61|1005->64|1037->88|1076->90|1112->92|1131->103|1164->115|1271->186|1305->204|1345->206|1396->221|1421->237|1460->238|1545->287|1558->291|1586->297|1660->335|1673->339|1707->351|1781->389|1794->393|1825->402|1893->434|1906->438|1933->443|2016->490|2065->530|2105->532|2219->614|2277->636|2330->680|2370->682|2486->766|2554->802|2596->812|2694->874|2728->892|2768->894|2818->908|2842->923|2881->924|2966->973|2979->977|3007->983|3081->1021|3094->1025|3128->1037|3202->1075|3215->1079|3246->1088|3314->1120|3327->1124|3354->1129|3417->1156|3470->1200|3510->1202|3626->1286|3694->1322|3737->1333|3837->1398|3880->1432|3920->1434|3975->1453|4025->1481|4072->1492|4128->1526|4380->1747|4418->1754
                    LINES: 26->1|30->1|32->4|34->6|34->6|34->6|35->7|35->7|35->7|40->12|40->12|40->12|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|51->23|52->24|52->24|52->24|54->26|56->28|57->29|62->34|62->34|62->34|63->35|63->35|63->35|65->37|65->37|65->37|66->38|66->38|66->38|67->39|67->39|67->39|68->40|68->40|68->40|70->42|70->42|70->42|72->44|74->46|76->48|81->53|81->53|81->53|83->55|83->55|84->56|84->56|92->64|94->66
                    -- GENERATED --
                */
            