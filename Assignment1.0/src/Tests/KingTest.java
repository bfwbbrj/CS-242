package Tests;
import Main.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by yutong on 9/7/16.
 */
public class KingTest {
    Board board;
    @Test
    public void test() {
        board = new Board();
        King k1 = new King(0, 4, true);
        King k2 = new King(7, 4, false);
        assertTrue(k1.equals(board.getPiece(0, 4)));
        assertTrue(k2.equals(board.getPiece(7, 4)));
    }

    @Test
    public void isValid() {
        King k1 = new King(4, 4, true);
        assertTrue("Move success", k1.validMove(5, 5));
        assertFalse("Move fail", k1.validMove(5, 6));
        assertFalse("Move fail", k1.validMove(7, 7));
    }
}