class Solution {

    fun containElements(stack: Stack<Char>, character: Char): Boolean {
        return stack.isNotEmpty() && stack.peek().equals(character)
    }

    fun isValid(s: String): Boolean {
        val charArray = s.toCharArray()
        val result = Stack<Char>()

        for (character in charArray) {
            when (character) {
                ')' -> {
                    if (containElements(result, '(')) {
                        result.pop()
                    } else {
                        return false
                    }
                }
                ']' -> {
                    if (containElements(result, '[')) {
                        result.pop()
                    } else {
                        return false
                    }
                }
                '}' -> {
                    if (containElements(result, '{')) {
                        result.pop()
                    } else {
                        return false
                    }
                }
                else -> {
                    result.push(character)
                }
            }
        }
        return result.isEmpty()
    }
}
