public class Performance {
    public static void main(String[] args) {

        String series = "";

        for (int i = 0; i < 26; i++) {

            char ch = (char) ('a' + i);
            System.out.println(ch);

            // String is immutable, so it cannot be modified.
            // Every time this line executes:
            // series = series + ch;
            //
            // Java creates a NEW String object.
            // It copies all the characters from the old string
            // and then appends the new character.
            //
            // Example:
            // 1st iteration: ""   + 'a' -> "a"      (copies 0 chars)
            // 2nd iteration: "a"  + 'b' -> "ab"     (copies 1 char)
            // 3rd iteration: "ab" + 'c' -> "abc"    (copies 2 chars)
            // 4th iteration: "abc"+ 'd' -> "abcd"   (copies 3 chars)
            //
            // Total characters copied:
            // 0 + 1 + 2 + 3 + ... + (n-1)
            // = n(n-1)/2
            // = O(n²)
            //
            // Therefore, using String concatenation inside a loop
            // has O(n²) time complexity.
            // Use StringBuilder instead for O(n) performance.

            series = series + ch;
        }

        System.out.println(series);
    }
}





// solution for this is stringBuilder reffer it 