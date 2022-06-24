package efan.hackerrank.challange;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionTest {

	@Test
	void faktorialTest() {
		System.out.println(Result.faktorial(3));
	}

	@Test
	void kombinasiTest() {
		Assertions.assertEquals(10, Result.kombinasi(5, 2));
		Assertions.assertEquals(84, Result.kombinasi(9, 3));
		Assertions.assertEquals(1, Result.kombinasi(3, 3));
	}

	@Test
	void kombinasiTeamTest() {
		//Assertions.assertArrayEquals(new int[] {60, 60}, Result.kombinasiTeam(11,6,15));
		Result.kombinasiTeam(11,6,12).forEach((e) -> {
			System.out.print(e + ", ");
		});
	}

	@Test
	void testCase1() {
		System.out.println(Result.kombinasiTeam(5, 3, 4));
		System.out.println(Result.kombinasiTeam(3, 7, 12));
		System.out.println(Result.kombinasiTeam(6, 9, 8));
		System.out.println(Result.kombinasiTeam(7, 11, 4));
		System.out.println(Result.kombinasiTeam(12, 9, 3));
		System.out.println(Result.kombinasiTeam(12, 8, 6));
	}
}
