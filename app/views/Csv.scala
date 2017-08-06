package views

import scala.collection.immutable
import play.twirl.api.BufferedContent
import play.twirl.api.Format

/**
 * This is just a dummy format called CSV.
 */
class Csv private (elements: immutable.Seq[Csv], text: String) extends BufferedContent[Csv](elements, text) {
  def this(text: String) = this(Nil, if (text eq null) "" else text)
  def this(elements: immutable.Seq[Csv]) = this(elements, "")

  /**
   * Content type of CSV.
   */
  def contentType = "text/csv"
}

/**
 * Helper for CSV utility methods.
 */
object Csv {

  /**
   * Creates an CSV fragment with initial content specified.
   */
  def apply(text: String): Csv = {
    new Csv(text)
  }

}

/**
 * Formatter for CSV content.
 */
object CsvFormat extends Format[Csv] {

  /**
   * Creates a CSV fragment.
   */
  def raw(text: String) = Csv(text)

  /**
   * Creates an escaped CSV fragment.
   */
  def escape(text: String) = Csv(text)

  /**
   * Generate an empty CSV fragment
   */
  val empty: Csv = new Csv("")

  /**
   * Create a CSV Fragment that holds other fragments.
   */
  def fill(elements: immutable.Seq[Csv]): Csv = new Csv(elements)
}