package io.pello.codewars.bitcoin_statistics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BitcoinStatisticsTest {

	@Test
	public void testGetMinAvgMax() {
		int discard = 2;
		double[][] data = { { 800, 1200, 2100, 4100, 1300, 700 }, { 1000, 1500, 4500, 5000, 5800, 2000, 1500 } };
		double[][] expect = { { 2100, 3100, 4100 }, { 4500, 5100, 5800 }, { 2100, 4300, 5800 } };
		double[][] actual = BitcoinStatistics.getMinAvgMax(discard, data);
		assertArrayEquals(expect, actual);
	}

}
