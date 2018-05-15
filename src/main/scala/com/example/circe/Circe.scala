package com.example.circe

import com.example.model.Product
import io.circe._, io.circe.generic.auto._, io.circe.parser._, io.circe.syntax._

class Circe {

  def serialize(product: Product): Long = {

    val circeStartTime = System.nanoTime
    val circeJson = product.asJson.noSpaces
    val circeEndTime = System.nanoTime
    circeEndTime - circeStartTime
  }

  def deserialize(jsonString : String): Long = {

    val circeStartTime = System.nanoTime
    val myPickle = decode[Product](jsonString)
    val circeEndTime = System.nanoTime
    circeEndTime - circeStartTime
  }
}
