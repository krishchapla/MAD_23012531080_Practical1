fun main() {
    val firstMatrix = Matrix(arrayOf(intArrayOf(3, -2, 5), intArrayOf(3, 0, 4)), noOfRow = 2, noOfCol = 3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2, 3), intArrayOf(-9, 0), intArrayOf(0, 4)), noOfRow = 3, noOfCol = 2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6, 3), intArrayOf(9, 0), intArrayOf(5, 4)), noOfRow = 3, noOfCol = 2)

    println("***************Addition***************")
    print("Matrix:1 ")
    print(secondMatrix1)
    print("Matrix:2 ")
    print(secondMatrix)
    val thirdMatrix = secondMatrix1 + secondMatrix
    println("Addition: $thirdMatrix")

    println("***************Subtraction***************")
    print("Matrix:1 ")
    print(secondMatrix1)
    print("Matrix:2 ")
    print(secondMatrix)
    val subtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction: $subtractMatrix")

    println("***************Multiplication***************")
    print("Matrix:1 ")
    print(firstMatrix)
    print("Matrix:2 ")
    print(secondMatrix)
    val multiplication = firstMatrix * secondMatrix
    println("Multiplication: $multiplication")
}

class Matrix(
    val data: Array<IntArray>,
    val noOfRow: Int,
    val noOfCol: Int
) {
    // Operator function for addition
    operator fun plus(other: Matrix): Matrix {
        if (noOfRow != other.noOfRow || noOfCol != other.noOfCol) {
            throw IllegalArgumentException("Matrix dimensions must match for addition.")
        }
        val result = Array(noOfRow) { IntArray(noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result, noOfRow, noOfCol)
    }

    // Operator function for subtraction
    operator fun minus(other: Matrix): Matrix {
        if (noOfRow != other.noOfRow || noOfCol != other.noOfCol) {
            throw IllegalArgumentException("Matrix dimensions must match for subtraction.")
        }
        val result = Array(noOfRow) { IntArray(noOfCol) }
        for (i in 0 until noOfRow) {
            for (j in 0 until noOfCol) {
                result[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result, noOfRow, noOfCol)
    }

    // Operator function for multiplication
    operator fun times(other: Matrix): Matrix {
        if (this.noOfCol != other.noOfRow) {
            throw IllegalArgumentException("Matrix dimensions are not valid for multiplication.")
        }

        val result = Array(this.noOfRow) { IntArray(other.noOfCol) }
        for (i in 0 until this.noOfRow) {
            for (j in 0 until other.noOfCol) {
                for (k in 0 until this.noOfCol) {
                    result[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result, this.noOfRow, other.noOfCol)
    }

    // To string for printing
    override fun toString(): String {
        return data.joinToString("\n") { row ->
            row.joinToString(" ", prefix = "[ ", postfix = " ]")
        }
    }
}
