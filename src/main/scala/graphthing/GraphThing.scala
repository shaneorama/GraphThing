package graphthing

import org.graphstream.graph._
import org.graphstream.graph.implementations._

object GraphThing extends App {
  System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer")

  val graph = new MultiGraph("Test")
  graph.addAttribute("ui.quality")
  graph.addAttribute("ui.antialias")

  graph.addAttribute("ui.stylesheet", Style.node)

  graph.addNode("A")
  graph.addNode("B")
  graph.addNode("C")

  graph.addEdge("AB", "A", "B", true)
  graph.addEdge("BC", "B", "C", true)


  graph.display(true)
}
