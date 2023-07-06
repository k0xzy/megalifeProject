[//]: # (## Дипломный проект)

### Автоматизированное тестирование [страниц](https://github.com/k0xzy/diplomFinal/blob/master/docs/Plan.md&#41) megalife.by

[//]: # (#### Приложение представляет собой веб-сервис, который предоставляет возможность купить тур по определённой цене с помощью двух способов:)

[//]: # (- Обычная оплата по дебетовой карте)

[//]: # (- Уникальная технология: выдача кредита по данным банковской карты)

[//]: # (#### В процессе работы над данным проектом были созданы следующие документы:)

[//]: # (1. [План автоматизации]&#40;https://github.com/k0xzy/diplomFinal/blob/master/docs/Plan.md&#41;)

[//]: # (2. [Отчет о проведенном тестировании]&#40;https://github.com/k0xzy/diplomFinal/blob/master/docs/Report.md&#41;)

[//]: # (3. [Отчет о проведённой автоматизации тестирования]&#40;https://github.com/k0xzy/diplomFinal/blob/master/docs/Summary.md&#41;)

[//]: # (#### Необходимое окружение:)

[//]: # (- установленный Docker;)

[//]: # (- убедитесь, что порты 8080, 9999 и 5432 или 3306 &#40;в зависимости от выбранной базы данных&#41; свободны;)
#### Инструкции по установке
1. Скачайте архив;

[//]: # (2. Запустите контейнер, в котором разворачивается база данных &#40;далее БД&#41; `docker-compose up -d --force-recreate`)

[//]: # (3. Убедитесь в том, что БД готова к работе &#40;логи смотреть через `docker-compose logs -f <applicationName>` &#40;mysql или postgres&#41;)
[//]: # (4. Запустить SUT во вкладке Terminal Intellij IDEA командой:)

[//]: # (- Для БД MySQL `java -Dspring.datasource.url=jdbc:mysql://localhost:3306/base_mysql -jar artifacts/aqa-shop.jar`)

[//]: # (- Для БД Postgresql `java -Dspring.datasource.url=jdbc:postgresql://localhost:3306/base_postgresql -jar artifacts/aqa-shop.jar`)
2. Для запуска авто-тестов в Terminal Intellij IDEA открыть новую сессию и ввести команду:
   `gradlew clean test --info`
   где:
   `--info` - Развернутая информация о пройденных тестах;

[//]: # (6. Для просмотра отчета Allure в терминале ввести команду:)

[//]: # (   `gradlew allureServe`)


