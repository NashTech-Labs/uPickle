package com.example.upickle

import com.example.model.Product
import upickle.default.write
import upickle.default.read

class Pickle {

  def serialize(product: Product): Long = {

    val pickleStartTime = System.nanoTime
    val upickleJson = write(product)
    val pickleEndTime = System.nanoTime
    pickleEndTime - pickleStartTime
  }

  def deserialize(jsonString : String): Long = {

    val pickleStartTime = System.nanoTime
    val upickleJson = read[Product](jsonString)
    val pickleEndTime = System.nanoTime
    pickleEndTime - pickleStartTime
  }
}
