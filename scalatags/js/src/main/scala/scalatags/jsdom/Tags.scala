
package scalatags
package jsdom
import acyclic.file
import org.scalajs.dom
import scalatags.generic.Util
trait Tags extends generic.Tags[dom.Element, dom.Element, dom.Node] with TagFactory{
  // Root Element
  lazy val html = typedTag[dom.html.Html]("html")
  // Document Metadata
  lazy val head = typedTag[dom.html.Head]("head")
  lazy val base = typedTag[dom.html.Base]("base", void = true)
  lazy val link = typedTag[dom.html.Link]("link", void = true)
  lazy val meta = typedTag[dom.html.Meta]("meta", void = true)
  // Scripting
  lazy val script = typedTag[dom.html.Script]("script")
  // Styling
  lazy val style = typedTag[dom.html.Style]("style")
  // Sections
  lazy val body = typedTag[dom.html.Body]("body")
  lazy val h1 = typedTag[dom.html.Heading]("h1")
  lazy val h2 = typedTag[dom.html.Heading]("h2")
  lazy val h3 = typedTag[dom.html.Heading]("h3")
  lazy val h4 = typedTag[dom.html.Heading]("h4")
  lazy val h5 = typedTag[dom.html.Heading]("h5")
  lazy val h6 = typedTag[dom.html.Heading]("h6")
  lazy val header = typedTag[dom.html.Element]("header")
  lazy val footer = typedTag[dom.html.Element]("footer")
  // Grouping content
  lazy val p = typedTag[dom.html.Paragraph]("p")
  lazy val hr = typedTag[dom.html.HR]("hr", void = true)
  lazy val pre = typedTag[dom.html.Pre]("pre")
  lazy val blockquote = typedTag[dom.html.Quote]("blockquote")
  lazy val ol = typedTag[dom.html.OList]("ol")
  lazy val ul = typedTag[dom.html.UList]("ul")
  lazy val li = typedTag[dom.html.LI]("li")
  lazy val dl = typedTag[dom.html.DList]("dl")
  lazy val dt = typedTag[dom.html.DT]("dt")
  lazy val dd = typedTag[dom.html.DD]("dd")
  lazy val figure = typedTag[dom.html.Element]("figure")
  lazy val figcaption = typedTag[dom.html.Element]("figcaption")
  lazy val div = typedTag[dom.html.Div]("div")
  // Text-level semantics
  lazy val a = typedTag[dom.html.Anchor]("a")
  lazy val em = typedTag[dom.html.Element]("em")
  lazy val strong = typedTag[dom.html.Element]("strong")
  lazy val small = typedTag[dom.html.Element]("small")
  lazy val s = typedTag[dom.html.Element]("s")
  lazy val cite = typedTag[dom.html.Element]("cite")
  lazy val code = typedTag[dom.html.Element]("code")
  lazy val sub = typedTag[dom.html.Element]("sub")
  lazy val sup = typedTag[dom.html.Element]("sup")
  lazy val i = typedTag[dom.html.Element]("i")
  lazy val b = typedTag[dom.html.Element]("b")
  lazy val u = typedTag[dom.html.Element]("u")
  lazy val span = typedTag[dom.html.Span]("span")
  lazy val br = typedTag[dom.html.BR]("br", void = true)
  lazy val wbr = typedTag[dom.html.Element]("wbr", void = true)
  // Edits
  lazy val ins = typedTag[dom.html.Mod]("ins")
  lazy val del = typedTag[dom.html.Mod]("del")
  // Embedded content
  lazy val img = typedTag[dom.html.Image]("img", void = true)
  lazy val iframe = typedTag[dom.html.IFrame]("iframe")
  lazy val embed = typedTag[dom.html.Embed]("embed", void = true)
  lazy val `object` = typedTag[dom.html.Object]("object")
  lazy val param = typedTag[dom.html.Param]("param", void = true)
  lazy val video = typedTag[dom.html.Video]("video")
  lazy val audio = typedTag[dom.html.Audio]("audio")
  lazy val source = typedTag[dom.html.Source]("source", void = true)
  lazy val track = typedTag[dom.html.Track]("track", void = true)
  lazy val canvas = typedTag[dom.html.Canvas]("canvas")
  lazy val map = typedTag[dom.html.Map]("map")
  lazy val area = typedTag[dom.html.Area]("area", void = true)
  // Tabular data
  lazy val table = typedTag[dom.html.Table]("table")
  lazy val caption = typedTag[dom.html.TableCaption]("caption")
  lazy val colgroup = typedTag[dom.html.TableCol]("colgroup")
  lazy val col = typedTag[dom.html.TableCol]("col", void = true)
  lazy val tbody = typedTag[dom.html.TableSection]("tbody")
  lazy val thead = typedTag[dom.html.TableSection]("thead")
  lazy val tfoot = typedTag[dom.html.TableSection]("tfoot")
  lazy val tr = typedTag[dom.html.TableRow]("tr")
  lazy val td = typedTag[dom.html.TableCell]("td")
  lazy val th = typedTag[dom.html.TableHeaderCell]("th")
  // Forms
  lazy val form = typedTag[dom.html.Form]("form")
  lazy val fieldset = typedTag[dom.html.FieldSet]("fieldset")
  lazy val legend = typedTag[dom.html.Legend]("legend")
  lazy val label = typedTag[dom.html.Label]("label")
  lazy val input = typedTag[dom.html.Input]("input", void = true)
  lazy val button = typedTag[dom.html.Button]("button")
  lazy val select = typedTag[dom.html.Select]("select")
  lazy val datalist = typedTag[dom.html.DataList]("datalist")
  lazy val optgroup = typedTag[dom.html.OptGroup]("optgroup")
  lazy val option = typedTag[dom.html.Option]("option")
  lazy val textarea = typedTag[dom.html.TextArea]("textarea")
}
