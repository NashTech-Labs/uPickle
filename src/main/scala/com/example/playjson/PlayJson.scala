package com.example.playjson

import com.example.model.Product
import play.api.libs.json.{JsValue, Json}

class PlayJson {

  def serialize(product: Product): Long = {
    val playJsonStartTime = System.nanoTime
    val playJson = Json.toJson(product)
    val playJsonEndTime = System.nanoTime
    playJsonEndTime - playJsonStartTime
  }

  def deserialize(jsonString: String): Long = {
    val playJsonStartTime = System.nanoTime
    val myPickle = Json.parse(jsonString).as[Product]
    val playJsonEndTime = System.nanoTime
    playJsonEndTime - playJsonStartTime
  }
}
