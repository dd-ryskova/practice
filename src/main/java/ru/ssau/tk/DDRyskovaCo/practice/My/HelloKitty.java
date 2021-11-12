package ru.ssau.tk.DDRyskovaCo.practice.My;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ru.ssau.tk.DDRyskovaCo.practice.DataType.PrintType.printType;

public class HelloKitty {
    public static void main(String[] args) {

        try {
            System.out.println(" Введите число от 1 до 5 с: ");
            Scanner in = new Scanner(System.in);
            var change = in.nextInt();
            System.out.print(" Тип вашей переменной: ");
            printType(change);
            if (change < 1 || change > 5) {
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
                    case 4:
                        System.out.println("　　　　　　　   　 　　　　　　／ ¯¯｀フ\n" +
                                "　　　　　　　　　,　'' ｀ ｀ / 　 　 　 !　 　\n" +
                                "　　　　　　　 , ' 　　　　 レ　 _,　 -' ミ\n" +
                                "　　　　　　　 ; 　 　 　 　 　`ミ __,xノﾞ､\n" +
                                "　　　 　　 　 i　 　　　ﾐ　　　; ,､､､、　ヽ ¸\n" +
                                "　　　 　　,.-‐! 　 　 　 ﾐ　　i　　　　｀ヽ.._,,))\n" +
                                "　　 　　//´｀｀､　　　　 ミ　ヽ　　　　　(¯`v´¯)\n" +
                                "　　　　| l　　 　｀ ｰｰ -‐''ゝ､,,)).　 　　 　 ..`·.¸.·´\n" +
                                "　　　 　ヽ.ー─'´)");
                        break;
                    case 5:
                        System.out.println("／ﾌﾌ 　　　　　 　　 　ム｀ヽ\n" +
                                "/ ノ)　　 ∧　　∧　　　　）　ヽ\n" +
                                "/ ｜　　(´・ω ・`）ノ⌒（ゝ._,ノ\n" +
                                "/　ﾉ⌒＿⌒ゝーく　 ＼　　／\n" +
                                "丶＿ ノ 　　 ノ､　　|　/\n" +
                                "　　 `ヽ `ー-‘人`ーﾉ /\n" +
                                "　　　 丶 ￣ _人’彡ﾉ\n" +
                                "　　　／｀ヽ _/\\__' ");
                        break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println(" Вы ввели не число и обидели котика(");
        }
    }
}
