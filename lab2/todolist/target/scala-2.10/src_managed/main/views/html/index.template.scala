
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

<link href="assets/stylesheets/bootstrap.min.css" rel="stylesheet" media="screen">
"""),format.raw/*5.1*/("""

"""),_display_(Seq[Any](/*7.2*/main("Lista de Tarefas")/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
"""),_display_(Seq[Any](/*8.2*/Collections/*8.13*/.sort(tasks))),format.raw/*8.25*/("""
    <div class="container" color="#708090">
        <div class="panel-heading">
            <h3 class="text-center">Adicionar uma nova tarefa</h3>
        </div>
    
    """),_display_(Seq[Any](/*14.6*/form(routes.Application.newTask())/*14.40*/ {_display_(Seq[Any](format.raw/*14.42*/("""        
        <div class="text-center">    
            <input class="span3" type="text" name="label"placeholder="tarefa"> <br>
            <input class="span3" type="text" name="association" placeholder="associação"> <br>
            <select name="priority" class="span2">
                <option value=1 >1</option>
                <option value=2 >2</option>
                <option value=3 >3</option>
            </select> </br>   
            

            <input type="submit" class="btn" value="Criar">
        </div>
        
    """)))})),format.raw/*28.6*/("""


    <h3 class="text-center">Tarefa(s) a ser(em) feita(s)</h3>
    
    <ul>
        <table class="table table-striped">
            <tr>
                <th>Tarefa</th>
                <th>Projeto associado</th>
                <th>Prioridade</th>
                <th>Opções</th>
            </tr>
        """),_display_(Seq[Any](/*41.10*/for(task <- tasks) yield /*41.28*/ {_display_(Seq[Any](format.raw/*41.30*/("""

            """),_display_(Seq[Any](/*43.14*/if(!task.isDone)/*43.30*/{_display_(Seq[Any](format.raw/*43.31*/("""
 
                    <tr>
                        <th>"""),_display_(Seq[Any](/*46.30*/task/*46.34*/.label)),format.raw/*46.40*/("""</th>
                        <th>"""),_display_(Seq[Any](/*47.30*/task/*47.34*/.association)),format.raw/*47.46*/("""</th>
                        <th>"""),_display_(Seq[Any](/*48.30*/task/*48.34*/.priority)),format.raw/*48.43*/("""</th> 
                        <th>
                            """),_display_(Seq[Any](/*50.30*/form(routes.Application.update(task.id))/*50.70*/ {_display_(Seq[Any](format.raw/*50.72*/("""
                                <input type="submit" class="btn" value="Feito">
                            """)))})),format.raw/*52.30*/("""
                        
                            """),_display_(Seq[Any](/*54.30*/form(routes.Application.deleteTask(task.id))/*54.74*/ {_display_(Seq[Any](format.raw/*54.76*/("""
                                <input type="submit" class="btn" value="Deletar">
                            """)))})),format.raw/*56.30*/("""  
                        </th>                
                    </tr> 
                
            """)))})),format.raw/*60.14*/("""
        """)))})),format.raw/*61.10*/("""
        </table>
    </ul>

    <h3 class="text-center">Tarefa(s) Feita(s)</h3>
    
    <ul>
        <table class="table table-striped">
            <tr>
                <th>Tarefa</th>
                <th>Projeto associado</th>
                <th>Prioridade</th>
                <th>Opções</th>
            </tr>
            """),_display_(Seq[Any](/*75.14*/for(task <- tasks) yield /*75.32*/ {_display_(Seq[Any](format.raw/*75.34*/("""
                """),_display_(Seq[Any](/*76.18*/if(task.isDone)/*76.33*/{_display_(Seq[Any](format.raw/*76.34*/("""
                        <tr>
                            <th>"""),_display_(Seq[Any](/*78.34*/task/*78.38*/.label)),format.raw/*78.44*/("""</th>
                            <th>"""),_display_(Seq[Any](/*79.34*/task/*79.38*/.association)),format.raw/*79.50*/("""</th>
                            <th>"""),_display_(Seq[Any](/*80.34*/task/*80.38*/.priority)),format.raw/*80.47*/("""</th> 
                            <th>
                                """),_display_(Seq[Any](/*82.34*/form(routes.Application.deleteTask(task.id))/*82.78*/ {_display_(Seq[Any](format.raw/*82.80*/("""
                                    <input type="submit" class="btn" value="Deletar">
                                """)))})),format.raw/*84.34*/("""  
                            </th>                
                        </tr>                   
                """)))})),format.raw/*87.18*/("""
            """)))})),format.raw/*88.14*/("""
        </table>
    </ul>
    
    </div>

    
""")))})),format.raw/*95.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]): play.api.templates.HtmlFormat.Appendable = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.HtmlFormat.Appendable) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Nov 26 22:54:44 BRT 2013
                    SOURCE: /Users/andersongfs/Documents/projetosPlay/todolist/app/views/index.scala.html
                    HASH: 773051f7945089e18767c558792b8ca71d4939c3
                    MATRIX: 789->1|940->42|1051->144|1088->147|1120->171|1159->173|1195->175|1214->186|1247->198|1455->371|1498->405|1538->407|2112->950|2458->1260|2492->1278|2532->1280|2583->1295|2608->1311|2647->1312|2740->1369|2753->1373|2781->1379|2852->1414|2865->1418|2899->1430|2970->1465|2983->1469|3014->1478|3115->1543|3164->1583|3204->1585|3346->1695|3437->1750|3490->1794|3530->1796|3674->1908|3812->2014|3854->2024|4220->2354|4254->2372|4294->2374|4348->2392|4372->2407|4411->2408|4510->2471|4523->2475|4551->2481|4626->2520|4639->2524|4673->2536|4748->2575|4761->2579|4792->2588|4901->2661|4954->2705|4994->2707|5146->2827|5297->2946|5343->2960|5425->3011
                    LINES: 26->1|30->1|33->5|35->7|35->7|35->7|36->8|36->8|36->8|42->14|42->14|42->14|56->28|69->41|69->41|69->41|71->43|71->43|71->43|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|78->50|78->50|78->50|80->52|82->54|82->54|82->54|84->56|88->60|89->61|103->75|103->75|103->75|104->76|104->76|104->76|106->78|106->78|106->78|107->79|107->79|107->79|108->80|108->80|108->80|110->82|110->82|110->82|112->84|115->87|116->88|123->95
                    -- GENERATED --
                */
            