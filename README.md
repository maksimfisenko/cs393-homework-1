**Homework Details:** 

1. Create a SpringBoot project with Web and Spring BootDevTools dependencies 
1. Change application server’s port as 9099 
1. Copy provided classes from github: [https://github.com/esmameral/ozu-CS393-2023-2024-Fall/tree/main/Homework1 ](https://github.com/esmameral/ozu-CS393-2023-2024-Fall/tree/main/Homework1)
4. Define ProductBean class as Spring Bean 
4. Create an implementation of DailyDiscountSelector interface. Your implementation must return 15, 20, 25 or 30 randomly as dicountRate. 
4. Create an ApplicationRunner in the “com.ozyegin.cs393.hw1.runner” package. In the ApplicationRunner class, initialize ProductBean’s productList array with at least 4 products. You can create product instances with arbitrary data. 
4. Edit RestfulServices.java  : 
   1. welcomeMessage and headerMessage must be read from application.properties file. 
   1. listProducts() method must return a String array which contains welcomeMessage, headerMessage, product list and daily discount message. DailyDiscount rate must be get from DailyDiscountSelector bean. 
4. Don’t configure Product class as SpringBean(Product is a domain object). 
4. Use DependencyInjection for Object to Object relationships. (Don’t use new keyword for creation instances, except Product class) 
4. When the application is started, the URL http://localhost:9099/products must return a response like this:
   ![image](https://github.com/maksimfisenko/cs393-homework-1/assets/90686419/dae1f436-73d9-46d6-8032-26ce2c582a09)

