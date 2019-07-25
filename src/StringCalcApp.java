import java.text.DecimalFormat;

/**
 * Copyright (c) 2019. This program and the accompanying materials are made
 * available under my granted permission provided that this note is kept intact,
 * unmodified and unchanged. @ Author: Baraa Ali - API and implementation. All
 * rights reserved.
 */

public class StringCalcApp {

	// Jacqueline Townsend & Baraa Ali

	public String add(String number) {
		double doubleSum = 0.0;
		int intSum = 0;
		DecimalFormat numberFormat = new DecimalFormat("#.00");

		// zero length string
		if (number.length() == 0) {
			return "0";

			// many doubles
		} else {

			if (number.contains("\n")) {
				// search the array and find the index of the new line characterS.
				char[] numbers = number.toCharArray();
				// System.out.println(Arrays.toString(numbers));
				for (char character : numbers) {
					// System.out.print(character + " ");
					if (character == '\n') {
						int indexOfNewLine = number.indexOf(character);
						if (numbers[indexOfNewLine + 1] == ',' || numbers[indexOfNewLine - 1] == ',') {
							return "Number expected but '\n' found at position " + indexOfNewLine + " .";
						}
					}
				}
				String[] stringNums = number.split(",|\n");
				for (String str : stringNums) {
					double doubleNum = Double.parseDouble(str);
					doubleSum += doubleNum;
				}
				String formattedSum = numberFormat.format(doubleSum);
				return formattedSum;
			}

			else if (number.contains(".") && number.contains(",")) {
				String[] stringNums = number.split(",");
				for (String str : stringNums) {
					double doubleNum = Double.parseDouble(str);
					doubleSum += doubleNum;
				}
				String formattedSum = numberFormat.format(doubleSum);
				return formattedSum;
				// many integers, no doubles
			} else if (!number.contains(".") && number.contains(",")) {

				char[] numbers = number.toCharArray();
				if (numbers[numbers.length - 1] == ',') {
					return "Number expected but EOF found.";
				}

				String[] stringNums = number.split(",");
				for (String str : stringNums) {
					int intNum = Integer.parseInt(str);
					intSum += intNum;
				}
				return Integer.toString(intSum);
				// one integer only
			} else if (!number.contains(".") && !number.contains(",")) {
				return Integer.toString(Integer.parseInt(number));
				// one double
			} else {
				doubleSum = Double.parseDouble(number);
				return Double.toString(doubleSum);
			}

		}

	}
}
