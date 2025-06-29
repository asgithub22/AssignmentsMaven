package operatorsAndConditionalStatements;

public class Assignments7 {

	public static void main(String[] args) {
		
		String customerName = "John Doe";
        int creditScore = 720;
        double income = 55000.0;
        boolean isEmployed = true;
        double debtToIncomeRatio = 35.0;

        if (creditScore > 750) {
        	System.out.println("Hi Mr." + customerName + "! you are eligible for the loan (APPROVED - Excellent Credit).");

        } else if (creditScore >= 650 && creditScore <= 750) {
            if (income >= 50000.0) {
                if (isEmployed) {
                    if (debtToIncomeRatio < 40.0) {
                        System.out.println("Hi Mr." + customerName + "! you are eligible for the loan (APPROVED - Meets all conditions).");
                    } else {
                        System.out.println("Hi Mr." + customerName + "! sorry, you are not eligible for the loan (DENIED - High DTI).");
                    }
                } else {
                    System.out.println("Hi Mr." + customerName + "! sorry, you are not eligible for the loan (DENIED - Unemployed).");
                }
            } else {
                System.out.println("Hi Mr." + customerName + "! sorry, you are not eligible for the loan (DENIED - Low Income).");
            }
        } else {
            System.out.println("Hi Mr." + customerName + "! sorry, you are not eligible for the loan (DENIED - Low Credit Score).");
        }
    }
}

