import static org.junit.Assert.assertEquals;
import org.junit.*;

public class HeroTest {

  Hero hero;
  Dungeon dungeon;
  Monster monster;

  @Before
  public void setup(){
    hero = new Hero("Jeff", 300);
    dungeon = new Dungeon("Hells Gate");
    monster = new Monster("Trevor", 20);
  }

  @Test
  public void hasName(){
    assertEquals("Jeff", hero.getName());
  }

  @Test
  public void hasHp(){
    assertEquals(300, hero.getHp());
  }

  @Test
  public void dungeonRunRemoveHp(){
    dungeon.addMonster(monster);
    hero.dungeonRun(dungeon.getCounter(), dungeon);
    assertEquals(280, hero.getHp());
  }

  


}