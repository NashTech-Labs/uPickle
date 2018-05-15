package com.example.argonaut

import argonaut._, Argonaut._
import com.example.model.Product
class Argonaut {

  def serialize(product: Product): Long = {

    val argonautStartTime = System.nanoTime
    val argonautJson: Json = product.asJson
    val argonautEndTime = System.nanoTime
    argonautEndTime - argonautStartTime
  }

  def deserialize(jsonString : String): Long = {

    val argonautStartTime = System.nanoTime
    val parsed: Option[Product] = jsonString.decodeOption[Product]
    val argonautEndTime = System.nanoTime
    argonautEndTime - argonautStartTime
  }
}
