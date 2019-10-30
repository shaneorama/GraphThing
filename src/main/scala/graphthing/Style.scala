package graphthing

object Style {
  val node =
    """
      |graph {
      | padding: 100px;
      |}
      |
      |node {
      | shape: box;
      | size: 150px, 60px;
      | fill-color: white;
      | stroke-mode: plain;
      | stroke-width: 3px;
      |}
      |
      |edge {
      | arrow-size: 20px, 10px;
      | size: 3px;
      |}
      |""".stripMargin
}
