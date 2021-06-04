package com.homework.task

import scala.io.StdIn

object ConsolePokerRunner {

  def main(args: Array[String]): Unit = Iterator.continually(Option(StdIn.readLine()))
    .takeWhile(_.nonEmpty)
    .foreach { input =>
      input
        .map(str => process(str))
        .foreach(result => println(result))
    }

  def process(input: String): String = ???

}
