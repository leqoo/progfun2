import streams.Bloxorz._

object Levelm extends Level {
  val level =
    """--------
      |--S--T--
      |--------
      |--oo--""".stripMargin
}

Levelm.startPos
Levelm.goal
Levelm.terrain(Levelm.Pos(1,5))
val s = Levelm.from((Levelm.startBlock,List())#::Stream.empty,Set(Levelm.startBlock))
val sol=Levelm.pathsToGoal
sol.head

