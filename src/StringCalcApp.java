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
		double doubeSum = 0.0;
		int intSum = 0;
		DecimalFormat numberFormat = new DecimalFormat("#.00");

		// zero length string
		if (number.length() == 0) {
			return "0";

			// many doubles
		} else {
			// "Number expected but '\n' found at position ."

			if (number.contains(",") && number.contains("\n")) {
				// search the array and find the index
				String[] stringNums = number.split(",");
				for (int i = 0; i < stringNums.length; i++) {

				}

			}

			else if (number.contains(".") && number.contains(",")) {
				String[] stringNums = number.split(",");
				for (String str : stringNums) {
					double doubleNum = Double.parseDouble(str);
					doubeSum += doubleNum;
				}
				String formattedSum = numberFormat.format(doubeSum);
				return formattedSum;
				// many integers, no doubles
			} else if (!number.contains(".") && number.contains(",")) {
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
				doubeSum = Double.parseDouble(number);
				return Double.toString(doubeSum);
			}

		}

	}
}
