/**
 * get the number of characters in a number, e.g 100 = 3, 1234 = 4, 1 = 1
 */
fun getLengthOfANumber(number: Int): Int {
    return Math.log10(number.toDouble()).toInt() + 1
}