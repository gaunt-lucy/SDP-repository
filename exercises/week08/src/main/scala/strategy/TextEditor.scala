package strategy

/**
  *
  * @param formatter
  *
  */
//noinspection ScalaStyle

case class TextEditor(formatter: TextFormatter) {
  def publishText(s: String) = {
    formatter.format(s)
  }

}
