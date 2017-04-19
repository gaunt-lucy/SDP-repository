package visitor

case class CssClassVisitor() extends Visitor {
  override def visit(element: HtmlElement): Unit = {
    var startTag = element.getStartTag()
    startTag = startTag.dropRight(1)
    val newTag = startTag + " class=’visitor’>"
    element.setStartTag(newTag)
  }
  override def visit(parentElement: HtmlParentElement): Unit = {
    var startTag = parentElement.getStartTag()
    startTag = startTag.dropRight(1)
    val newTag = startTag + " class=’visitor’>"
    parentElement.setStartTag(newTag)

    val kids = parentElement.getChildren()

    for (kid <- kids) {
      var startTag = kid.getStartTag()
      startTag = startTag.dropRight(1)
      val newTag = startTag + " class=’visitor’>"
      kid.setStartTag(newTag)
    }
  }
}