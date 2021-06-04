package com.homework.task

import org.scalatest.flatspec.AnyFlatSpec

class ConsolePokerRunnerTest extends AnyFlatSpec {

  "ConsolePokerEvaluator" should "correctly evaluate input #4" in {
    val input = "five-card-draw 7h4s4h8c9h Tc5h6dAc5c Kd9sAs3cQs Ah9d6s2cKh 4c8h2h6c9c"
    val expectedEvaluation = "4c8h2h6c9c Ah9d6s2cKh Kd9sAs3cQs 7h4s4h8c9h Tc5h6dAc5c"
    val actualEvaluation = ConsolePokerRunner.process(input)

    assert(actualEvaluation == expectedEvaluation)
  }

  "ConsolePokerEvaluator" should "correctly evaluate input #5" in {
    val input = "five-card-draw 8h6sAcAhJh Qh6hQdKsKh"
    val expectedEvaluation = "8h6sAcAhJh Qh6hQdKsKh"
    val actualEvaluation = ConsolePokerRunner.process(input)

    assert(actualEvaluation == expectedEvaluation)
  }
}
