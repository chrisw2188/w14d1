import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MonsterTest {

Monster monster;

  @Before
  public void setup(){
    monster = new Monster("Deamon", 7);
  }

  @Test
  public void hasName(){
    assertEquals("Deamon", monster.getName());
  }

  @Test
  public void hasHp(){
    assertEquals(7, monster.getHp());
  }



}