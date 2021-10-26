class BitManipulator {
    fun setBitAtPosition(number: Long, position: Int): Long {
        return (1L shl position - 1) or number
    }

    fun clearBitAtPosition(number: Long, position: Int): Long {
        return (1L shl position).inv() and number
    }

    fun bitAtPositionIsSet(position: Int, number: Long, numberOfBits: Int): Boolean {
        return ((1 shl numberOfBits - position).toLong() and number) > 0
    }
}
