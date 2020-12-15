package nisum.problem.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import nisum.problem.Solution;

public class SolutionTest {
	
	@Test
	public void testPrintMinimumCostToConvertToMagicSquare() {
		Assertions.assertNotEquals(Solution.printMinimumCostToConvertToMagicSquare(), Integer.MAX_VALUE);
	}	
}
