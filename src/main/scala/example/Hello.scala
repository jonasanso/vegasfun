package example

import vegas._
import vegas.render.ShowRender._

object Hello extends  App {

  val plot = Vegas("Country Pop").
    withData(
      Seq(
        Map("country" -> "USA", "population" -> 314),
        Map("country" -> "UK", "population" -> 64),
        Map("country" -> "DK", "population" -> 80)
      )
    ).
    encodeX("country", Nom).
    encodeY("population", Quant).
    mark(Bar)

  plot.show

  //ITerm2.renderImage(chessboard.base64[Jpg](Java2dJpgWriter).value)
}
