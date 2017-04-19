package visitor

case class StyleVisitor() extends Visitor {
  override def visit(element: HtmlElement): Unit = {
    var startTag = element.getStartTag()
    startTag = startTag.dropRight(1)
    val newTag = startTag + " style=’width:46px;’>"
    element.setStartTag(newTag)
  }
  override def visit(parentElement: HtmlParentElement): Unit = {
    var startTag = parentElement.getStartTag()
    startTag = startTag.dropRight(1)
    val newTag = startTag + " style=’width:58px;’>"
    parentElement.setStartTag(newTag)

    val kids = parentElement.getChildren()

    for (kid <- kids) {
      var startTag = kid.getStartTag()
      startTag = startTag.dropRight(1)
      val newTag = startTag + " style=’width:46px;’>"
      kid.setStartTag(newTag)
    }
  }
}
