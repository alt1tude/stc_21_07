## Ассоциативный массив, реализация на основе хешей

Задача:
Пусть у нас есть put("Марсель", 27) и get("Марсель") -> 27;

С помощью хэш-кода получить от ключа "Марсель" какое-либо целое число, которое может стать индексом массива, и под
этим индексом положить значение;
```
"Марсель" -> hashCode() -> "7" -> array[7] = 27;
```

* Побитовое умножение

1612148293 & 7(макс.индекс в массиве 8) = 1612148293 & 7 -> [0, 1, 2, 3, 4, 5, 6, 7] диапазон стал больше

1100000000101110110111001000101
                            111(7)
-------------------------------
0000000000000000000000000000101 -> 5