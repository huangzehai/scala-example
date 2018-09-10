package example

object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  def fileMatching(query: String, matcher: ( String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName))
      yield file
  }

  def filesEnding(query: String) = {
    fileMatching(query, _.endsWith(query))
  }

}
