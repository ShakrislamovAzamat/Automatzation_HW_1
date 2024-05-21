package HW1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GameNotRiskTest extends AbstractNotRiskTest {

    static List<Door> doors;

    @BeforeEach
    void initDoors(){
        doors = new ArrayList<>();
        doors.add(new HW1.Door(true));
        doors.add(new HW1.Door(false));
        doors.add(new HW1.Door(false));
    }

    @Test
    void testGamerWinNotRisk(){
        //given
        game = new Game(player, doors);
        //when

        //then
        Assertions.assertTrue(game.round(0).isPrize());
    }

    @Test
    void testGamerLoseNotRisk(){
        //given
        game = new Game(player, doors);
        //when

        //then
        Assertions.assertFalse(game.round(1).isPrize());
    }
}
