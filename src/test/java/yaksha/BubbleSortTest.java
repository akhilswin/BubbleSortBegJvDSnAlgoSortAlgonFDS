package yaksha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static yaksha.TestUtils.businessTestFile;
import static yaksha.TestUtils.currentTest;
import static yaksha.TestUtils.yakshaAssert;
import java.util.Arrays;

class BubbleSortTest {

	@Test
	public void testExceptionConditon() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.boundaryTestFile);
	}

	@Test
	public void testBoundaryCondition() throws Exception {

		TestUtils.yakshaAssert(TestUtils.currentTest(), true, TestUtils.exceptionTestFile);
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testBubbleSortMockito() throws Exception {
		int sizeOfArray = 7;
		int[] array = { 64, 34, 25, 12, 22, 11, 90 };
		int expectedResult[] = { 11, 12, 22, 25, 34, 64, 90 };
		BubbleSort bubbleSort = new BubbleSort(sizeOfArray, array);
		BubbleSortBO test = mock(BubbleSortBO.class);
		Mockito.when(test.bubbleSort(bubbleSort)).thenReturn(expectedResult);
		int actualResult[] = test.bubbleSort(bubbleSort);
		yakshaAssert(currentTest(), (Arrays.equals(expectedResult, actualResult) ? true : false), businessTestFile);
	}
}
