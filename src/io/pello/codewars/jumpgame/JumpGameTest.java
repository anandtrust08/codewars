package io.pello.codewars.jumpgame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JumpGameTest {

    @Test
    void testCanJump() {
        assertEquals(JumpGame.canJump(new int[] { 2, 3, 1, 1, 4 }), true);
    }

    @Test
    void testCannotJump() {
        assertEquals(JumpGame.canJump(new int[] { 3, 2, 1, 0, 4 }), false);
    }

}
