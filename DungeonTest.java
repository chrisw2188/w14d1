import static org.junit.Assert.assertEquals;
import org.junit.*;

public class DungeonTest {

  Dungeon dungeon;
  Monster monster;

  @Before
  public void setup(){
    dungeon = new Dungeon("Hells Gate");
    monster = new Monster("", 50);
  }

  @Test
  public void hasName(){
    assertEquals("Hells Gate", dungeon.getName());
  }

  @Test
  public void canAddMonster(){
    dungeon.addMonster(monster);
    assertEquals(1, dungeon.monsterCount());
  }

  @Test 
  public void tooManyMonsters(){
    for (int i=0; i<11; i++){
      dungeon.addMonster(monster);
    }
    assertEquals(10, dungeon.monsterCount());
  }

}