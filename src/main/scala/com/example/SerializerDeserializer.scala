package com.example

import com.example.argonaut.Argonaut
import com.example.circe.Circe
import com.example.model.Product
import com.example.playjson.PlayJson
import com.example.upickle.Pickle


object SerializerDeserializer extends App {

  val playJson = new PlayJson
  val pickle = new Pickle
  val argonaut = new Argonaut
  val circe = new Circe
  val product = Product("Samsung", "12JF3DE")
  val jsonString = "{\"brand\":\"Samsung\",\"model\":\"12JF3DE\"}"

  println(s"Play Json took ${playJson.serialize(product)} time to serialize")
  println(s"Pickle Json took ${pickle.serialize(product)} time to serialize")
  println(s"Argonaut Json took ${argonaut.serialize(product)} time to serialize")
  println(s"Circe Json took ${circe.serialize(product)} time to serialize")
  println()
  println(s"Play Json took ${playJson.deserialize(jsonString)} time to deserialize")
  println(s"Pickle Json took ${pickle.deserialize(jsonString)} time to deserialize")
  println(s"Argonaut Json took ${argonaut.deserialize(jsonString)} time to deserialize")
  println(s"Circe Json took ${circe.deserialize(jsonString)} time to deserialize")
}
