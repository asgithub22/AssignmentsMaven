package ConditionalStatementsAndLoops;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment9 {

	public static void main(String[] args) {
		// Step 1: Create a Map to store final hike percentages
        Map<String, Double> hikePercentageMap = new LinkedHashMap<>();

        // Step 2: Manually input employee details

        // --- Employee 1: Alice Johnson ---
        String name1 = "Alice Johnson";
        double salary1 = 75000.0;
        double exp1 = 5.1;
        double rating1 = 4.2;
        double varPay1 = 0, bonus1 = 0, reward1 = 0;

        if (rating1 >= 4.0) {
            varPay1 = 15.0;
            bonus1 = 1500;
        } else if (rating1 >= 3.0) {
            varPay1 = 10.0;
            bonus1 = 1200;
        } else {
            varPay1 = 3.0;
            bonus1 = 300;
        }

        if (exp1 >= 5.0) reward1 = 5000;

        double hike1 = (salary1 * varPay1 / 100) + bonus1 + reward1;
        double hikePercent1 = (hike1 / salary1) * 100;
        hikePercentageMap.put(name1, hikePercent1);

        // --- Employee 2: Bob Smith ---
        
        String name2 = "Bob Smith";
        double salary2 = 68000.0;
        double exp2 = 3.2;
        double rating2 = 3.8;
        double varPay2 = 0, bonus2 = 0, reward2 = 0;

        if (rating2 >= 4.0) {
            varPay2 = 15.0;
            bonus2 = 1500;
        } else if (rating2 >= 3.0) {
            varPay2 = 10.0;
            bonus2 = 1200;
        } else {
            varPay2 = 3.0;
            bonus2 = 300;
        }

        if (exp2 >= 5.0) reward2 = 5000;

        double hike2 = (salary2 * varPay2 / 100) + bonus2 + reward2;
        double hikePercent2 = (hike2 / salary2) * 100;
        hikePercentageMap.put(name2, hikePercent2);

        // --- Employee 3: Carol Davis ---
        
        String name3 = "Carol Davis";
        double salary3 = 82000.0;
        double exp3 = 7.1;
        double rating3 = 4.5;
        double varPay3 = 0, bonus3 = 0, reward3 = 0;

        if (rating3 >= 4.0) {
            varPay3 = 15.0;
            bonus3 = 1500;
        } else if (rating3 >= 3.0) {
            varPay3 = 10.0;
            bonus3 = 1200;
        } else {
            varPay3 = 3.0;
            bonus3 = 300;
        }

        if (exp3 >= 5.0) reward3 = 5000;

        double hike3 = (salary3 * varPay3 / 100) + bonus3 + reward3;
        double hikePercent3 = (hike3 / salary3) * 100;
        hikePercentageMap.put(name3, hikePercent3);

        // --- Employee 4: David Brown ---
        
        String name4 = "David Brown";
        double salary4 = 90000.0;
        double exp4 = 10.2;
        double rating4 = 2.5;
        double varPay4 = 0, bonus4 = 0, reward4 = 0;

        if (rating4 >= 4.0) {
            varPay4 = 15.0;
            bonus4 = 1500;
        } else if (rating4 >= 3.0) {
            varPay4 = 10.0;
            bonus4 = 1200;
        } else {
            varPay4 = 3.0;
            bonus4 = 300;
        }

        if (exp4 >= 5.0) reward4 = 5000;

        double hike4 = (salary4 * varPay4 / 100) + bonus4 + reward4;
        double hikePercent4 = (hike4 / salary4) * 100;
        hikePercentageMap.put(name4, hikePercent4);

        // --- Employee 5: Eva Green ---
        
        String name5 = "Eva Green";
        double salary5 = 60000.0;
        double exp5 = 2.4;
        double rating5 = 3.5;
        double varPay5 = 0, bonus5 = 0, reward5 = 0;

        if (rating5 >= 4.0) {
            varPay5 = 15.0;
            bonus5 = 1500;
        } else if (rating5 >= 3.0) {
            varPay5 = 10.0;
            bonus5 = 1200;
        } else {
            varPay5 = 3.0;
            bonus5 = 300;
        }

        if (exp5 >= 5.0) reward5 = 5000;

        double hike5 = (salary5 * varPay5 / 100) + bonus5 + reward5;
        double hikePercent5 = (hike5 / salary5) * 100;
        hikePercentageMap.put(name5, hikePercent5);

        // Step 3: Print the final hike percentage map
        
        System.out.println("Employee Hike Percentage Map:");
        for (Map.Entry<String, Double> entry : hikePercentageMap.entrySet()) {
            System.out.printf("%s: %.2f%%\n", entry.getKey(), entry.getValue());
        }
    }
}
