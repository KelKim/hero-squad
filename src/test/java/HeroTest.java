import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero myHero = new Hero("Superman", 32, "Super strength", "");
    assertEquals(true, myHero instanceof Hero);
  }

}