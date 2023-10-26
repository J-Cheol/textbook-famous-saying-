package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class App
{
    void run()
    {

        ArrayList<String> 명언목록 = new ArrayList<>();

        Scanner Scanner = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");
        int id = 1;
        while (true)
        {
            System.out.print("명령) ");
            String 명령 = Scanner.next();

            if (명령.equalsIgnoreCase("종료"))
            {
                break;
            }

            if (명령.equalsIgnoreCase("등록"))
            {
                Scanner.nextLine();
                System.out.print("명언 : ");
                String 작가 = Scanner.nextLine();
                System.out.print("작가 : ");
                String 명언 = Scanner.nextLine();
                System.out.println(id + "번 명언이 등록되었습니다.");

                명언목록.add(id + " / " + 작가 + " / " + 명언);
                id++;
            }

            if (명령.equalsIgnoreCase("목록"))
            {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");

                int len = 명언목록.size();
                while (len - 1 >= 0)
                {
                    if (명언목록.get(len - 1) != null)
                        {
                            System.out.println(명언목록.get(len - 1));
                        }
                    len--;
                }

            }
            if (명령.startsWith("삭제?id="))
            {
                String 삭제명령 = 명령.replace("삭제?id=", "");
                int 삭제_id;
                try
                {
                    삭제_id = Integer.parseInt(삭제명령);
                    if (삭제_id >= 1 && 삭제_id <= 명언목록.size() && 명언목록.get(삭제_id - 1) != null)
                    {
                        명언목록.set(삭제_id - 1, null);

                        System.out.println(삭제_id + "번 명언이 삭제되었습니다.");
                    } else
                    {
                        System.out.println(삭제_id + "번 명언은 존재하지 않습니다.");
                    }
                } catch (NumberFormatException e)
                {
                }
            }
        }
        Scanner.close();
    }
}