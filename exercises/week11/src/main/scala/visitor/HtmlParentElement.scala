package visitor

import scala.collection.mutable.ListBuffer

case class HtmlParentElement(var tagName: String) extends HtmlTag {
  var startTag: String = ""
  var endTag: String = ""

  private var childrenTag: ListBuffer[HtmlTag] = ListBuffer[HtmlTag]()

  override def addChildTag(htmlTag: HtmlTag): Unit = {
    childrenTag += htmlTag
  }
  override def removeChildTag(htmlTag: HtmlTag): Unit = {
    childrenTag -= htmlTag
  }
  override def getChildren(): List[HtmlTag] = childrenTag.toList
  override def generateHtml(): Unit = {
    println(startTag)
    val kids = this.getChildren()
    for (kid <- kids) {
      kid.generateHtml
    }
    println(endTag)
  }
  override def accept(visitor: Visitor): Unit = {
    visitor.visit(this)
  }

  def getEndTag(): String = this.endTag
  def getStartTag(): String = this.startTag
  def getTagName(): String = this.tagName
  def setEndTag(tag: String): Unit = this.endTag = tag
  def setStartTag(tag: String): Unit = this.startTag = tag
}
