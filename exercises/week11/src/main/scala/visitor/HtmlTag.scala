package visitor

import scala.collection.mutable.ListBuffer

abstract class HtmlTag extends Element {
  private var tagBody: String = _
  private var childrenTag: ListBuffer[HtmlTag] = ListBuffer[HtmlTag]()

  def getTagName(): String
  def setStartTag(tag: String): Unit
  def getStartTag(): String
  def getEndTag(): String
  def setEndTag(tag: String): Unit

  def setTagBody(tagBody: String): Unit = this.tagBody = tagBody
  def addChildTag(htmlTag: HtmlTag): Unit = childrenTag += htmlTag
  def removeChildTag(htmlTag: HtmlTag): Unit = childrenTag -= htmlTag
  def getChildren(): List[HtmlTag] = childrenTag.toList
  def generateHtml(): Unit
}
