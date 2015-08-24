# Spring MVC Demo
เป็นตัวอย่างการใช้ Spring MVC แสดงผลเป็น web page ผ่าน FreeMarker และ JSP

# หลักการทำงาน
Project นี้ใช้ Maven ในการสร้าง ดังนั้นต้องเริ่มที่ pom.xml ส่วน folder ที่เกี่ยวข้องได้แก่
- src/main/java/web เก็บ Application.java และ MyConroller.java
- src/main/resources/application.properties เก็บ configuration ของระบบ
- src/main/resources/templates เก็บ View ของ FreeMarker
- src/main/webapp เก็บ View ของ JSP และ configuration ของ Tomcat

# การใช้งานผ่าน Spring Boot
ใช้คำสั่ง mvn spring-boot:run

