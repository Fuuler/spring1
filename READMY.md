Урок 2. Введение в Spring
Задание
1. Есть класс Product (id, название, цена). Товары хранятся в бине ProductRepository, в виде List<Product>, при старте в него нужно добавить 5 любых товаров.
2. ProductRepository позволяет получить весь список или один товар по id. Создаем бин Cart, в который можно добавлять и удалять товары по id.
3. Написать консольное приложение, позволяющее управлять корзиной.
4. При каждом запросе корзины из контекста, должна создаваться новая корзина.

Дополнительные материалы
Singleton и Prototype. - https://docs.spring.io/spring-framework/docs/3.0.0.M3/reference/html/ch04s04.html
Beans и Factory method. - https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans
Крис Шефер, Кларенс Хо, Роб Харроп. Spring 4 для профессионалов.
