package com.homework.task

import scala.collection.immutable.Range.Int

object PokerCmdParser {

  def strToPlayer(str: String): Player = {

    str
      .grouped(2)
      .map(str => {
        val face = str.charAt(0)
        val suit = str.charAt(1)
        face =>
          Card(CardFace.fromString(face)) //здесь продолжило ругаться на face and suit
          suit => Card(CardSuit.fromString(suit))
      })

    //Predef.augmentString(str).grouped(2).map((face, suit) => Card(CardFace.fromString(face), CardSuit.fromString(suit)))
  }

  def strListToPlayerList(strList: List[String]): List[Player] = {
    strList.map(str => strToPlayer(str))
  }

  def parse(input: String): GameDetail = {
    input.split("\\s+").toList match {
      case "five-card-draw" :: players => GameDetail(GameType.FiveCardDraw, strListToPlayerList(players))
      case _                           => throw new RuntimeException("parse error ...")
    }
  }
  final case class GameDetail(gameType: GameType, players: List[Player])

  def flush(players: List[Player], suit: CardSuit): Unit = {

    if (suit[0] == suit[1]) {//здесь не уверен что отработает правильно
      if (suit[0] == suit[2]) {
        if (suit[0] == suit[3]) {
          if (suit[0] == suit[4]) {
            if (suit[0] == suit[5]) {
              return 65 + suit[5]
            }
          }
        }
      }
    }
    return 0
  }

  def FullHouse(player: Player, face: CardFace, suit: CardSuit): Unit = {//здесь не получилось
    // val i= Int
    //val j = Int
    val i, j, count, temp = 0

    for (i<5){
    if (count==2){
      temp = face(i-1)
    }
      count: 0
      for(j=i+1,j<5)
    }
  }

  //five-card-draw 7h4s4h8c9h Tc5h6dAc5c Kd9sAs3cQs Ah9d6s2cKh 4c8h2h6c9c

}
