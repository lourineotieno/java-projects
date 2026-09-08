public class E2_methods {
    static boolean checkPass(int score) {
        if (score >= 50) {
            return true;
        } else {
            return false;
        }
    }

    static void displayResult(String studentName, boolean passed) {
        if (passed) {
            System.out.println(studentName + ": PASSED");
        } else {
            System.out.println(studentName + ": FAILED");
        }
    }

    public static void main(String[] args) {
        boolean johnPassed = checkPass(65);
        displayResult("John", johnPassed);

        boolean maryPassed = checkPass(40);
        displayResult("Mary", maryPassed);
    }
}
