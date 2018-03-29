package io.pello.codewars.massubarray;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxSubarraySumTest {

    @Test
    public void testEmptyArray() throws Exception {
        assertEquals("Empty arrays should have a max of 0", 0, MaxSubarraySum.sequence(new int[] {}));
    }

    @Test
    public void testExampleArray1() throws Exception {
        assertEquals("Example array should have a max of 6", 6, MaxSubarraySum.sequence(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }
    
    @Test
    public void testExampleArray2() throws Exception {
        assertEquals("Example array should have a max of 21", 21, MaxSubarraySum.sequence(new int[] {6,5,4,-2,7,-8,9,-4 }));
    }
    
    @Test
    public void testExampleArray3() throws Exception {
        assertEquals("Example array should have a max of 139", 139, MaxSubarraySum.sequence(new int[] {5, 13, -4, 19, 15, -18, 7, 0, 24, 5, -17, -5, 24, 21, 3, -19, 21, -18, -18, -17, -1, 24, 0, 8, 12, 4, 16, 18, 17, -17, -8, -19, -29, -15, -16, -26, 4, 7, -18, 0, -17, 0, 3, 0, 15, 5, 4, -19, -20, 1 }));
    }
    
    @Test
    public void testExampleArray4() throws Exception {
        assertEquals("Example array should have a max of negatives", 0, MaxSubarraySum.sequence(new int[] {-2, -1, -3, -4, -1, -2, -1, -5, -4}));
    }
    
    @Test
    public void testExampleArray5() throws Exception {// got 186 - [15-50]
        /**
         * 0:-6, 1:-29, 2:-8, 3:-31, 4:-5, 5:14, 6:18, 7:18, 8:-2, 9:-1, 10:-4, 11:-4, 12:8, 13:4, 14:17, 15:0, 16:26, 17:38, 18:65, 19:72, 20:48, 21:59, 22:39, 23:53, 24:80, 25:94, 26:94, 27:88, 28:88, 29:99, 30:101, 31:94, 32:100, 33:126, 34:140, 35:168, 36:154, 37:141, 38:155, 39:131, 40:116, 41:97, 42:100, 43:104, 44:117, 45:146, 46:133, 47:151, 48:169, 49:191, 50:203, 51:197, Numbers:
-6, -23, 21, -23, 26, 19, 4, 0, -20, 1, -3, 0, 12, -4, 13, -17, 26, 12, 27, 7, -24, 11, -20, 14, 27, 14, 0, -6, 0, 11, 2, -7, 6, 26, 14, 28, -14, -13, 14, -24, -15, -19, 3, 4, 13, 29, -13, 18, 18, 22, 12, -6, 15 to 50
         */
        assertEquals("Example array should have a max of 234 ", 234, MaxSubarraySum.sequence(new int[] {-6, -23, 21, -23, 26, 19, 4, 0, -20, 1, -3, 0, 12, -4, 13, -17, 26, 12, 27, 7, -24, 11, -20, 14, 27, 14, 0, -6, 0, 11, 2, -7, 6, 26, 14, 28, -14, -13, 14, -24, -15, -19, 3, 4, 13, 29, -13, 18, 18, 22, 12, -6}));
    }

    @Test
    public void testExampleArray6() throws Exception { // got 83
        /**
         * 0:-10, 1:-24, 2:-50, 3:-48, 4:-25, 5:-1, 6:1, 7:27, 8:55, 9:82, 10:53, 11:24, 12:8, 13:-18, 14:-41, 15:-12, 16:4, 17:2, 18:-16, 19:-14, 20:-30, 21:-7, 22:7, 23:26, 24:33, 25:21, 26:13, 27:32, 28:34, 29:5, 30:14, 31:6, 32:-22, 33:4, 34:-2, 35:-6, 36:-13, 37:-11, 38:-18, 39:-37, 40:-24, 41:-35, 42:-20, 43:-44, 44:-36, 45:-39, 46:-18, 47:-13, 48:-21, 49:2, 50:27, 51:43, 52:21, 53:1, 54:-5, 55:13, 56:-1, 57:-23, Numbers:
-10, -14, -26, 2, 23, 24, 2, 26, 28, 27, -29, -29, -16, -26, -23, 29, 16, -2, -18, 2, -16, 23, 14, 19, 7, -12, -8, 19, 2, -29, 9, -8, -28, 26, -6, -4, -7, 2, -7, -19, 13, -11, 15, -24, 8, -3, 21, 5, -8, 23, 25, 16, -22, -20, -6, 18, -14, -22, 6 to 9
         */
        assertEquals("Example array should have a max of 132", 132, MaxSubarraySum.sequence(new int[] {-10, -14, -26, 2, 23, 24, 2, 26, 28, 27, -29, -29, -16, -26, -23, 29, 16, -2, -18, 2, -16, 23, 14, 19, 7, -12, -8, 19, 2, -29, 9, -8, -28, 26, -6, -4, -7, 2, -7, -19, 13, -11, 15, -24, 8, -3, 21, 5, -8, 23, 25, 16, -22, -20, -6, 18, -14, -22}));
    }
    
    @Test
    public void testExampleArray7() throws Exception { // got 35
        /**
         * 0:3, 1:-24, 2:-28, 3:-3, 4:-20, 5:-10, 6:3, 7:9, 8:10, 9:25, 10:25, 11:35, 12:21, 13:-4, 14:-6, 15:-15, 16:-18, 17:-29, 18:-37, 19:-59, 20:-54, 21:-61, 22:-80, 23:-88, 24:-100, 25:-87, 26:-110, 27:-102, 28:-95, 29:-97, 30:-118, 31:-138, 32:-121, 33:-94, 34:-101, 35:-81, 36:-69, 37:-63, 38:-84, 39:-59, 40:-38, 41:-45, 42:-51, 43:-66, 44:-89, 45:-108, 46:-80, 47:-81, 48:-104, 49:-115, 50:-104, 51:-103, 
        Numbers:
        3, -27, -4, 25, -17, 10, 13, 6, 1, 15, 0, 10, -14, -25, -2, -9, -3, -11, -8, -22, 5, -7, -19, -8, -12, 13, -23, 8, 7, -2, -21, -20, 17, 27, -7, 20, 12, 6, -21, 25, 21, -7, -6, -15, -23, -19, 28, -1, -23, -11, 11, 1,
         0 to 11
         */
        assertEquals("Example array should have a max of 100", 100, MaxSubarraySum.sequence(new int[] {3, -27, -4, 25, -17, 10, 13, 6, 1, 15, 0, 10, -14, -25, -2, -9, -3, -11, -8, -22, 5, -7, -19, -8, -12, 13, -23, 8, 7, -2, -21, -20, 17, 27, -7, 20, 12, 6, -21, 25, 21, -7, -6, -15, -23, -19, 28, -1, -23, -11, 11, 1}));
    }
}
