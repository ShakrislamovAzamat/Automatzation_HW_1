package HW1;

import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractTestNotRisk {

    static Player player;
    static Game game;

    @BeforeAll
    static void init() {
        player = new Player("Gamer", false);
    }
}
