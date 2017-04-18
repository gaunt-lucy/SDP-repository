package composite

import scala.collection.mutable.ListBuffer

abstract class HtmlTag(tagName: String) {

  var tagBod = ""
  var children = ListBuffer[HtmlTag]()

  def getTagName: String = tagName

  def setStartTag(tag: String)

  def setEndTag(tag: String)

  def setTagBody(tagBody: String): Unit = {
    tagBod = tagBody
  }

  def addChildTag(htmlTag: HtmlTag): Unit = {
     children += htmlTag
  }

  def removeChildTag(htmlTag: HtmlTag): Unit = {
    children -= htmlTag
  }

  def getChildren: List[HtmlTag] = {
    children.toList
  }

  def generateHtml
}