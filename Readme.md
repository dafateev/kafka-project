##Kafka-Project

###Простое приложение для демонстрации возможностей брокера сообщений Kafka

####Для того чтобы приложение заработало, необходимо запустить Zookeeper и Kafka

Для этого в системе Windows необходимо:
1. Скачать и распаковать архив с Kafka и Zookeper c сайта [https://kafka.apache.org/quickstart](1. Скачать и распаковать архив с Kafka и Zookeper c сайта https://kafka.apache.org/quickstart
2. В адресной строке папки с кафкой набрать команду `cmd`
3. В открывшемся окне консоли набрать команды запуска среды Kafka(Zookeeper)
`.\bin\windows\zookeeper-server-start.bat`
и через пробел путь к файлу настроек Zookeeper
`.\config\zookeeper.properties`
4. Адресный порт в логах консоли должен вывести **2181**
5. В адресной строке папки с кафкой набрать команду `cmd` еще раз
6. В открывшемся окне консоли набрать команды запуска Kafka
`.\bin\windows\kafka-server-start.bat`
и через пробел путь к файлу настроек Kafka
`.\config\server.properties`
7. Адресный порт в логах консоли должен вывести **9092**

