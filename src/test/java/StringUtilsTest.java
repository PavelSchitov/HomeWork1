import org.example.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void reverseTest() {
        String input = "Hello, world";
        String expectedOutput = "dlrow ,olleH";
        String actualOutput = StringUtils.reverse(input);
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void isPalindromeTest() {
        String inputPalindrome = "racecar";
        String inputNotPalindrome = "hello";
        boolean yes = true;
        boolean no = false;
        boolean actualOutputPalindrome = StringUtils.isPalindrome(inputPalindrome);
        boolean actualOutputNotPalindrome = StringUtils.isPalindrome(inputNotPalindrome);
        Assert.assertEquals(yes,actualOutputPalindrome);
        Assert.assertEquals(no,actualOutputNotPalindrome);
    }
    @Test
    public void countOccurrencesTest() {
        String input = "abracadabra";
        char target = 'a';
        int count = 5;
        int actualOutput = StringUtils.countOccurrences(input,target);
        Assert.assertEquals(count,actualOutput);
    }

    @Test
    public void removeDuplicatesTest() {
        String input = "Mississippi";
        String expectedOutput = "Misp";
        String actualOutput = StringUtils.removeDuplicates(input);
        Assert.assertEquals(expectedOutput,actualOutput);
    }
    @Test
    public void splitByDelimiterTest() {
        String input = "Hello,world,Java";
        String delimiter = ",";
        String[] expectedOutput = {"Hello", "world", "Java"};
        String[] actualOutput = StringUtils.splitByDelimiter(input, delimiter);
        Assert.assertArrayEquals(expectedOutput,actualOutput);
    }
    @Test
    public void isAnagramTest() {
        String input1 = "listen";
        String input2 = "silent";
        String input3 = "google";
        boolean yes = true;
        boolean no = false;
        boolean actualOutput1 = StringUtils.isAnagram(input1,input2);
        boolean actualOutput2 = StringUtils.isAnagram(input1,input3);
        Assert.assertEquals(yes,actualOutput1);
        Assert.assertEquals(no,actualOutput2);
    }
}
