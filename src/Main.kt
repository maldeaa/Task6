fun main() {
    println("Привет! Это приложение, в котором пользователь вводит две различных цифры. На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число. Результат, естественно, выводится.\nПри невозможности создать нечетное число выводится сообщение – случится страшное... Каждое число вводится на отдельной строке :)\n")
    while (true) {
        println("Введите первую цифру (или 'exit' для выхода):")
        val firstInput = readLine()?.trim()

        if (firstInput.equals("exit", ignoreCase = true)) {
            println("Программа завершена.")
            break
        }

        println("Введите вторую цифру (или 'exit' для выхода):")
        val secondInput = readLine()?.trim()

        if (secondInput.equals("exit", ignoreCase = true)) {
            println("Программа завершена.")
            break
        }

        try {
            val firstDigit = firstInput?.toInt() ?: throw NumberFormatException("Введено не число.")
            val secondDigit = secondInput?.toInt() ?: throw NumberFormatException("Введено не число.")

            if (firstDigit !in 0..9 || secondDigit !in 0..9) {
                println("Ошибка: введите цифры от 0 до 9.")
                println()
                continue
            }

            if (firstDigit == secondDigit) {
                println("Ошибка: цифры должны быть различными.")
                println()
                continue
            }

            if (firstDigit % 2 != 0) {
                println("Создано нечетное число: ${firstDigit}${secondDigit}")
            } else if (secondDigit % 2 != 0) {
                println("Создано нечетное число: ${secondDigit}${firstDigit}")
            } else {
                println("Создать нечетное число невозможно.")
            }

        } catch (e: NumberFormatException) {
            println("Ошибка: Введите корректные цифры.")
        }

        println()
    }
}
