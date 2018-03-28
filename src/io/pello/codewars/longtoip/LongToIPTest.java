package io.pello.codewars.longtoip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongToIPTest {

    @Test
    public void testLongToIp() {
        assertEquals("128.114.17.104", LongToIP.longToIP(2154959208L));
        assertEquals("0.0.0.0", LongToIP.longToIP(0));
        assertEquals("128.32.10.1", LongToIP.longToIP(2149583361L));
    }

    @Test
    public void testLongToBin() {
        assertEquals("110", LongToIP.longToBin(6));
        assertEquals("10000000", LongToIP.longToBin(128));
        assertEquals("1111111", LongToIP.longToBin(127));

    }

    @Test
    public void testBinToLong() {
        assertEquals(6, LongToIP.binToLong("110"));
        assertEquals(128, LongToIP.binToLong("10000000"));
        assertEquals(127, LongToIP.binToLong("1111111"));
    }
}
