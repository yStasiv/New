package Part_1;

public class Tasks_0 {

}
//Завдання:
//Цикли
//1. Створіть програму, що виводить на екран всі чотиризначні числа послідовності 1000 1003 1006 1009 1012 1015.
//2. Створіть програму, що виводить на екран перші 55 елементів послідовності 1 3 5 7 9 11 13 15 17 ....
//3. Створіть програму, що виводить на екран всі невід'ємні елементи послідовності 90 85 80 75 70 65 60 ....
//4. Створіть програму, що виводить на екран перші 20 елементів послідовності 2 4 8 16 32 64 128 ....
//5. Виведіть на екран всі члени послідовності 2an-1-1, де a1 = 2, які менше 10000.
//6. Виведіть на екран всі двозначні члени послідовності 2an-1 + 200, де a1 = -166.
//7. Створіть програму, яка обчислює факторіал натурального числа n, яке користувач введе з клавіатури.
//8. Виведіть на екран всі позитивні подільники натурального числа, введеного користувачем з клавіатури.
//9. Перевірте, чи є введене користувачем з клавіатури натуральне число - простим. Постарайтеся не виконувати зайвих дій (наприклад, після того, як ви знайшли хоча б один нетривіальний дільник вже ясно, що число складене і перевірку продовжувати не потрібно). Також врахуйте, що найменший дільник натурального числа n, якщо він взагалі є, обов'язково розташовується в відрізку [2; √n].
//10. Створіть програму, що виводить на екран 12 перших елементів послідовності 2an-2-2, де a1 = 3 і a2 = 2.
//11. Виведіть на екран перші 11 членів послідовності Фібоначчі. Нагадуємо, що перший і другий члени послідовності рівні одиницям, а кожен наступний - сумою двох попередніх.
//12. Для введеного користувачем з клавіатури натурального числа порахуйте суму всіх його цифр (заздалегідь не відомо скільки цифр буде в числі).
//
//Масиви
//Підказка до завдань по масивах:
//Для того щоб получити випадкове число в певних межах:
//Random random = new Random();
//int a = random.nextInt(20); //[0; 20)
//int a1 = 20 + random.nextInt(10); // [20; 30)
//int a2 = random.nextInt() % 700; //(-699; 699)
//Завдання:
//1. Створіть масив з усіх парних чисел від 2 до 20 і виведіть елементи масиву на екран спочатку в рядок, відокремлюючи один елемент від іншого прогалиною, а потім в стовпчик (відокремлюючи один елемент від іншого початком нового рядка). Перед створенням масиву подумайте, якого він буде розміру.
//2 4 6 … 18 20 2 4 6 … 20
//2. Створіть масив з усіх непарних чисел від 1 до 99, виведіть його на екран у рядок, а потім цей же масив виведіть на екран теж в рядок, але в зворотному порядку (99 97 95 93 ... 7 5 3 1).
//3. Створіть масив з 15 випадкових цілих чисел з відрізка [0; 9]. Виведіть масив на екран. Підрахуйте скільки в масиві парних елементів і виведете цю кількість на екран на окремому рядку.
//4. Створіть масив з 8 випадкових цілих чисел з відрізка [1; 10]. Виведіть масив на екран у рядок. Замініть кожен елемент з непарним індексом на нуль. Знову виведете масив на екран на окремому рядку.
//5. Створіть 2 масиви з 5 випадкових цілих чисел з відрізка [0; 5] кожен, виведіть масиви на екран у двох окремих рядках. Порахуйте середнє арифметичне елементів кожного масиву і повідомте, для якого з масивів це значення виявилося більше (або повідомте, що їх середні арифметичні рівні).
//6. Створіть масив з 4 випадкових цілих чисел з відрізка [10; 99], виведіть його на екран у рядок. Визначити і вивести на екран повідомлення про те, чи є масив строго зростаючої послідовністю.
//7. Створіть масив з 20-ти перших чисел Фібоначчі і виведіть його на екран. Нагадуємо, що перший і другий члени послідовності рівні одиницям, а кожен наступний - сумою двох попередніх.
//8. Створіть масив з 12 випадкових цілих чисел з відрізка [-15; 15]. Визначте який елемент є в цьому масиві максимальним і повідомте індекс його останнього
//входження в масив.
//9. Створіть два масиви з 10 цілих випадкових чисел з відрізка [1; 9] і третій масив з 10 дійсних чисел. Кожен елемент з i-им індексом третього масиву повинен дорівнювати відношенню елементу з першого масиву з i-им індексом до елементу з другого масиву з i-им індексом. Вивести всі три масиву на екран (кожен на окремому рядку), потім вивести кількість цілих елементів в третьому масиві.
//10. Створіть масив з 11 випадкових цілих чисел з відрізка [-1; 1], виведіть масив на екран у рядок. Визначте який елемент зустрічається в масиві найчастіше і виведіть про це повідомлення на екран. Якщо два якихось елемента зустрічаються однакову кількість разів, то не виводьте нічого.
//
//Двомірний масив
//1. Створити двовимірний масив з 8 рядків по 5 стовпців в кожній з випадкових цілих чисел з відрізка [10; 99]. Вивести масив на екран.
//2. Створити двовимірний масив з 5 рядків по 8 стовпців в кожній з випадкових цілих чисел з відрізка [-99; 99]. Вивести масив на екран. Після на окремому рядку вивести на екран значення максимального елемента цього масиву (його індекс не має значення).