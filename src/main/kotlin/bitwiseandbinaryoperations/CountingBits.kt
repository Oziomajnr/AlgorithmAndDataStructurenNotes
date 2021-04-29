// Counting bits


/**
 *  Go through each bit in the number and check if its set or not
 */

fun getNumberOfSetBits(inputNmber: Int): Int {
    var copyOfInput = inputNmber
    var count = 0
    while (copyOfInput > 0) {
        //and the least significant bit with 1, since the lsb would be removed when its shifted right
        count += copyOfInput and 1
        //shift right, e.g 11011010111 >> 1101101011 >> 110110101 >> 11011010 >> 1101101 etc..
        copyOfInput = copyOfInput shr 1
    }
    return count
}

/**
 * Using Brian Kernighan's Algorithm
 * When we do AND bit operation between number and number-1, the rightmost bit of one in the original number would be cleared.
 */
fun getNumberOfSetBitsBrianKernighan(inputNmber: Int): Int {
    var copyOfInput = inputNmber
    var count = 0
    while (copyOfInput > 0) {
        count++
        copyOfInput = copyOfInput and copyOfInput - 1
    }
    return count
}