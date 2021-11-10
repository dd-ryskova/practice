package ru.ssau.tk.DDRyskovaCo.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ru.ssau.tk.DDRyskovaCo.practice.DataType.PrintType.printType;

public class HelloKitty {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            var change = in.nextInt();
            System.out.println(" Введите число от 1 до 3 с: ");
            System.out.print(" Тип вашей переменной: ");
            printType(change);
            if (change < 1 || change > 3) {
                System.out.println(" Вы ввели не то и обидели котика(");
            } else {
                System.out.println(" Вы ввели: " + change + "\n Ваша картинка готова!)");
                switch (change) {
                    case 1:
                        System.out.println("               __..,,__　　　,.｡='`1\n" +
                                "            .,,..;~`''''　　　　`''''＜``彡　}\n" +
                                "    　  _...:=,`'　　 　︵　 т　︵　　X彡-J\n" +
                                "        ＜`　彡 /　　ミ　　,_人_.　＊彡　`~\n" +
                                "        　 `~=::　　　 　　　　　　 　　　Y\n" +
                                "        　　 　i.　　　　　　　　　　　　 .:\n" +
                                "        　　　.\\　　　　　　　,｡---.,,　　./ \n" +
                                "        　　　　ヽ　／ﾞ''```\\;.{　　　 ＼／ Мяфк. ❤\n" +
                                "        　　　　　Y　　　`J..r_.彳　 　|\n" +
                                "        　　　　　{　　　``　　`　　　i\n" +
                                "        　　　　　\\　　　　　　　　　＼　　　..︵︵.\n" +
                                "        　　　　　`＼　　　　　　　　　``ゞ.,/` oQ o`)\n" +
                                "        　　　　　　`i,　　　　　　　　　　Y　 ω　/\n" +
                                "        　　　　 　　`i,　　　 　　.　　　　\"　　　/\n" +
                                "        　　　　　　`iミ　　　　　　　　　　　,,ノ\n" +
                                "        　　　　 　 ︵Y..︵.,,　　　　　,,+..__ノ``\n" +
                                "        　　　　　(,`, З о　　　　,.ノ\n" +
                                "        　　　　　 ゞ_,,,....彡彡~");
                        break;

                    case 2:
                        System.out.println("                         ／＞　　フ\n" +
                                "                       | 　_　 _l\n" +
                                "                      ／` ミ＿xノ\n" +
                                "                     /　　　　 |\n" +
                                "                    /　 ヽ　　 ﾉ\n" +
                                "                    │　　|　|　|\n" +
                                "                ／￣|　　 |　|　|\n" +
                                "               | (￣ヽ＿_ヽ_)__)\n" +
                                "                ＼二つ");
                        break;
                    case 3:
                        System.out.println("………………ℒℴѵℯ………3………ℒℴѵℯ\n" +
                                "……ℒℴѵℯ ℒℴѵℯ….ℒℴѵℯ ℒℴѵℯ\n" +
                                "……ℒℴѵℯ ℒℴѵℯ ℒℴѵℯ ℒℴѵℯ ℒℴѵℯ\n" +
                                "……ℒℴѵℯ ℒℴѵℯ ℒℴѵℯ ℒℴѵℯ ℒℴѵℯ\n" +
                                "……ℒℴѵℯℒℴѵℯℒℴѵℯℒℴѵℯℒℴѵℯ\n" +
                                "…………ℒℴѵℯℒℴѵℯℒℴѵℯℒℴѵℯ\n" +
                                "………………ℒℴѵℯℒℴѵℯℒℴѵℯ\n" +
                                "…………………ℒℴѵℯℒℴѵℯ\n" +
                                "………………………ℒℴѵℯ");
                        break;
                }
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println(" Вы ввели не число и обидели котика(");
        }
    }
}
