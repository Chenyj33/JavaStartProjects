1.整型的具体数默认时是int类型,浮点型常量默认时double类型
注意：小数除某个数得到的数是近似数，比较大小时用相减
double b1 = 3.3;      
double b2 = 9.9/3;
System.out.println(b1);          3.3
System.out.println(b2);         3.3000000000000003
System.out.println(Math.abs(b1-b2));   4.440892098500626E-16
System.out.println(b1==b2);   false


2.char 字符类型

3.自动转换
byte ,short 和 char 之间不会自动转换，他们三者之间计算时，都是首先转换为int类型

4.强制转换
强转符号只支队最近的操作数有效，往往使用小括号提升优先级



