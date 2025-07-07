public class SubsequenceCounter {
    public static int countABCSubsequences(String s) {
        int aCount = 0, abCount = 0, abcCount = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'a') {
                aCount += 1;
            } else if (ch == 'b') {
                abCount += aCount;
            } else if (ch == 'c') {
                abcCount += abCount;
            }
        }

        return abcCount;
    }

    public static void main(String[] args) {
        String s = "aabbcc";
        int result = countABCSubsequences(s);
        System.out.println("Number of subsequences 'abc': " + result);
    }
}

// Start
//  ├── a(1)
//  │    ├── b(3)
//  │    │     └── c(5)
//  │    │     └── c(6)
//  │    └── b(4)
//  │          └── c(5)
//  │          └── c(6)
//  └── a(2)
//       ├── b(3)
//       │     └── c(5)
//       │     └── c(6)
//       └── b(4)
//             └── c(5)
//             └── c(6)
