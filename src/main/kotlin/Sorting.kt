fun bubbleSort(input: IntArray): IntArray {
    if (input.size <2) {
        return input
    }
   
    var lastIndex = input.lastIndex
   while(lastIndex >= 1) {
        var startIndex = 0
       var endIndex = 1
    while (endIndex <= lastIndex) {
        if (input[startIndex] > input[endIndex]) {
            val temp = input[startIndex]
            input[startIndex] = input[endIndex]
            input[endIndex] = temp
        }
        startIndex++
        endIndex++
    }
      lastIndex--
   }
   return input
}
