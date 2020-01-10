# Chef 
Final task for training(November 2019))

Шеф-повар. Определить иерархию овощей (плодовые, корнеплодные и листовые).
Сделать салат.Посчитать калорийность. Провести сортировку овощей для салата на основе одного 
и нескольких параметров. Найти ингредиенты в салате, соответствующие заданному 
диапазону калорийности.

# Требования:
- При реализации иерархии наследования производный класс должен расширять
суперкласс новыми свойствами, для чего следует разобраться в предметной области
задачи. При описании полей можно использовать класс Optional.
- Классы-сущности должны быть отделены от классов с методами бизнес-логики.
- Использовать перечисления (enum) для описания полей с ограниченным набором
значений.
- Для сортировок наборов объектов можно использовать реализацию интерфейса
Comparator и его возможности. В частности thenComparing.
- При решении задачи можно использовать паттерн Factory Method.
- Все классы приложения должны быть грамотно структурированы по пакетам.
- Оформление кода должно соответствовать Java Code Convention.
- Параметры, необходимые для создания объектов, должны вводиться с помощью чтения
данных из файла (.txt). Среди данных в файле должны быть заведомо некорректная
информация. Должна присутствовать обработка некорректных данных инициализации
объекта.
- Код должен быть покрыт Unit-тестами.
- Запуск только с применением тестов.
# Описание проекта
- директория "recipe" содержит текстовые файлы для чтения данных из программы. (Файл "example.txt" дает понятие о информации хранимой в файлах)
