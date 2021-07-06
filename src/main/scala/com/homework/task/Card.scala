package com.homework.task

import com.homework.task.CardFace

final case class Player(combination: List[Card])
final case class Card(face: CardFace, suit: CardSuit)

sealed case class CardFace(order: Int, name: String)
object CardFace {
  def fromString(str: String): CardFace = ???
  object TWO extends CardFace(2, "2")
  object THREE extends CardFace(3, "3")
  object FOUR extends CardFace(4, "4")
  object FIVE extends CardFace(5, "5")
  object SIX extends CardFace(6, "6")
  object SEVEN extends CardFace(7, "7")
  object EIGHT extends CardFace(8, "8")
  object NINE extends CardFace(9, "9")
  object TEN extends CardFace(10, "T")
  object JACK extends CardFace(11, "J")
  object QUEEN extends CardFace(12, "Q")
  object KING extends CardFace(13, "K")
  object ACE extends CardFace(14, "A")

}

sealed case class CardSuit(name: String)
object CardSuit {
  def fromString(str: String): CardSuit = ???
  object DIAMOND extends CardSuit("d")
  object SPADE extends CardSuit("s")
  object CLUB extends CardSuit("c")
  object HEART extends CardSuit("h")

}

sealed case class HandType(order: Int, name: String)

object HandType {
  object StraightFlush extends HandType(0, "StraightFlush")
  object FourOfKind extends HandType(1, "FourOfKind")
  object FullHouse extends HandType(2, "FullHouse")
  object Flush extends HandType(3, "Flush")
  object Straight extends HandType(4, "Straight")
  object ThreeOfKind extends HandType(5, "ThreeOfKind")
  object TwoPairs extends HandType(6, "TwoPairs")
  object Pair extends HandType(7, "Pair")
  object HighCard extends HandType(8, "HighCard")

}

sealed case class GameType(name: String)

object GameType {
  object TexasHoldem extends GameType("TexasHoldem")
  object OmahaHoldem extends GameType("OmahaHoldem")
  object FiveCardDraw extends GameType("FiveCardDraw")

}
