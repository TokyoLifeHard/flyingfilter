## Описание
_Имеется некая система, которая обрабатывает авиа перелёты. Перелёт — это перевозка пассажира из одной точки в другую с возможными промежуточными посадками. Т. о. перелёт можно представить как набор из одного или нескольких элементарных перемещений, называемых сегментами. Сегмент — это атомарная перевозка, которую для простоты будем характеризовать всего двумя атрибутами: дата/время вылета и дата/время прилёта._

---
## Задача
_Необходимо написать небольшой модуль, который будет заниматься фильтрацией набора перелётов согласно различным правилам. Правил фильтрации может быть очень много. Также наборы перелётов могут быть очень большими. Правила могут выбираться и задаваться динамически в зависимости от контекста выполнения операции фильтрации._

_Операции фильрации_
* вылет до текущего момента времени
* имеются сегменты с датой прилёта раньше даты вылета
* общее время, проведённое на земле превышает два часа
---

## Технологии
*  Java 17
*  Maven
*  Junit 5

---
## Дор информация
_Ответы на вопросы лежать в папке resources_