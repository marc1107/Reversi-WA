package de.htwg

import de.htwg.Default.given
import de.htwg.aview.{GUI, TUI}
import de.htwg.controller.controllerComponent.{Controller, ControllerInterface}

object Reversi {
  val controller = Controller()
  def main(args: Array[String]): Unit = {
    println("Welcome to Reversi")
    new GUI().run
    new TUI().run
  }
}
