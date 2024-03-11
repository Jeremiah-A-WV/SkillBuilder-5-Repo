/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */

public class SkillBuilder5
{

    public static void main(String[] args) {
        int[] a = {88,15,34,8,34,89,55,12};

        reverse(a);

        for (int i: a) {
            System.out.println(i);
        }
    }

    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */

    public static double[] prefixAverage(double[] data)
    {
        double[] p = new double[data.length];
        double value = 0;
        double prefixValue;

        for (int i = 0; i < data.length; i++) {
            value += data[i];

            if (i > 0) {
                prefixValue = value/(i+1);
            } else {
                prefixValue = value;
            }

//            p[i] = Math.floor(prefixValue * 100)/100;
            p[i] = prefixValue;
        }

        return p;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        int result;

        for (int i = 0; i < anArray.length; i++) {
            if (searchValue == anArray[i]) {
                result = i;
                return result;
            }
        }

        result = -1;

        return result;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        int result;

        for (int i = 0; i < anArray.length; i++) {
            if (s.equals(anArray[i])) {
                result = i;
                return result;
            }
        }

        result = -1;

        return result;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        int count = 0;
        int index = 0;

        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i].equals(s)) {
                anArray[i] = null;
                count++;
            }
        }

        String[] result = new String[anArray.length - count];

        for (String string : anArray) {
            if (!(string == null)) {
                result[index] = string;
                index++;
            }
        }

        return result;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        int[] temp = anArray.clone();

        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = temp[(anArray.length - 1) - i];
        }
    }
}
