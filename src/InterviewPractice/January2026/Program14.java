package InterviewPractice.January2026;

public class Program14 {

    static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }

            // 2️⃣ Print left side (descending)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // 3️⃣ Print right side (ascending)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // 4️⃣ Move to next line
            System.out.println();


        }
    }
}