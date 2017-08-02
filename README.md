![Logo of the project](https://raw.githubusercontent.com/jehna/readme-best-practices/master/sample-logo.png)

# Hello World!
> Тестовое Spring Boot приложение. В качестве БД используется MySQL, обращение идет через MyBatis. Клиент HTML, JQuery, Bootstrap. 

## Установка

Скачайте архив проекта и распакуйте к себе на компьютер, либо сделайте клон репозитория. 

```shell
git clone https://github.com/zhanarys93/my-hello-world.git
```

Скачайте maven и распакуйте, если его у вас нет. 
```shell
https://maven.apache.org/download.cgi
```
Добавьте директорию bin распакованного архива в переменную "PATH" переменных среды системы. Для этого перейдите Свойства системы > Дополнительно > Переменные среды...  Также  удоcтоверьтесь, что у вас в "Переменных средах" есть переменное JAVA_HOME со значением пути на JDK(уставновленной в вашей системе). 

Заходим в папку с проектом. Открываем коммандную строку в папке. Пишем команду Maven для установки проекта:

```shell
mvn install package
```
После установки запускаем проект. 

```shell
mvn spring-boot:run
```
Ожидаем запуска сервера. После запуска сервера, в браузере переходим по адресу:

```shell
http://localhost:8080/
```
Видим результат. 
