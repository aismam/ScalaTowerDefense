package Enemy

import Model.Enemy.{Easy, Enemy, EnemyImpl}
import Model.Grid.Grid
import ScalaTowerDefense.App
import org.junit.Assert.{assertEquals, assertFalse, assertTrue}
import org.junit.Test
import org.junit.runner.RunWith
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class EnemyTest extends AnyFunSuite {

  val grid = new Grid(1)
  val e: Enemy = new EnemyImpl(Easy,grid)

  @Test def simpleTest(): Unit = {
    assertFalse(e.isAlive())
    e.spawn()
    assertTrue(e.isAlive())
    assertEquals((1,0),e.currentTile())
  }

  test("enemy test") {
    assertFalse(e.isAlive())
    e.spawn()
    assertTrue(e.isAlive())
    assertEquals(1,e.currentTile().xPlace)
    assertEquals(0,e.currentTile().yPlace)
  }
}
