package efan.hackerrank.challange;

import java.io.*;
import java.util.ArrayList;

class Result {

	public static Integer faktorial(int num) {
		if (num == 0) {
			return 1;
		} else {
			return num * faktorial(num - 1);
		}
	}

	public static Integer kombinasi(int n, int r) {
		return faktorial(n) / (faktorial(r) * faktorial(n - r));
	}

	public static ArrayList<Integer> kombinasiTeam(int kelasA, int kelasB, int kelasC) {

		// Constraints
		if (kelasA >= 3 && kelasA <= 12) {
			if (kelasB >= 3 && kelasB <= 12) {
				if (kelasC >= 3 && kelasC <= 12) {
					ArrayList<Integer> result = new ArrayList<Integer>(2);

					// team Matematika (5 orang) syarat: 1 orang kelas A, 2 orang kelas B, 2 orang kelas C.
					result.add(0, kombinasi(kelasA, 1) * kombinasi(kelasB, 2) * kombinasi(kelasC, 2));

					// team Kimia (6 orang) syarat : 2 orang kelas A, 3 orang kelas B, 1 orang kelas C.
					result.add(1, kombinasi(kelasA, 2) * kombinasi(kelasB, 3) * kombinasi(kelasC, 1));

					return result;
				}
			}
		}

		return new ArrayList<>();
	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int kelasA = Integer.parseInt(bufferedReader.readLine().trim());
		int kelasB = Integer.parseInt(bufferedReader.readLine().trim());
		int kelasC = Integer.parseInt(bufferedReader.readLine().trim());

		ArrayList<Integer> result = new ArrayList<>(2);
		result = Result.kombinasiTeam(kelasA, kelasB, kelasC);

		bufferedWriter.write("Matematika: " + result.get(0) + " team\n" +
				"Kimia: " + result.get(1));

		bufferedReader.close();
		bufferedWriter.close();
	}
}



