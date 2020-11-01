# experiment-3-2020  
## 一、实验目的  
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法：  
掌握面向对象的类设计方法（属性、方法）；  
掌握类的继承用法，通过构造方法实例化对象；  
掌握使用Object根类的toString（）方法，在自定义的类中覆盖的Object的toString（）方法，使其可以输出类的信息（比如：学生基础信息及其所选课程信息）  
## 二、实验要求  
  
    1、编写上述实体类以及测试主类（注意类之间继承关系的适用）  
    2、在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号，课程名称、上课地点、时间、授课教师等）；模拟学生退课操作，再打印课程信息。  
## 三、实验过程  
根据实验要求，我建立了一个package：choosing,五个class，分别是course、student、teacher、people和test这五个class。  
Package Choosing内包含五个class，main函数在test class内；  
Course class里包含课程名称，课程号，上课地点和上课时间；  
Student class里包含学生姓名，学生学号，性别；  
Teacher class 里包含教师姓名，教师工号，性别；  
People class是student class和teacher class需要继承的class，包含姓名，ID号和性别；  
Test class是测试class，用于输入程序需要的内容。  
实验之前先要构思如何实现这个实验目的，将程序分割为几个部分：  
1.人员，2.教师，3.学生，4.课程，5.main函数。  
在明确结构之后开始编写程序，并不断在编写的过程中调试程序，修正出现的问题，并最终完成实验目的。  
## 四、实验流程图  
![流程图](https://github.com/FanJiahang/experiment-3-2020/blob/main/java_experiment_3(2).png)  
##  五、程序运行截图  
  

## 六、编程感想  
    这次实验的过程中，我深刻体会到作为一名程序员，自身需要的专业知识和逻辑思维是多么的重要。第一次独立完成Java project，深感完成项目的艰辛。  
