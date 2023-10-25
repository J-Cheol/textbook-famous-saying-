package com.ll;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

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
                Scanner.nextLine();
                System.out.print("작가 : ");
                Scanner.nextLine();
            }
        }
        Scanner.close();
    }
}
//        Scanner 스캐너 = new Scanner(System.in);
//        ArrayList<String> 명언목록 = new ArrayList<>();
//        ArrayList<String> 작가목록 = new ArrayList<>();
//        int id = 1;
//
//        while (true)
//        {
//            System.out.print("명령) ");
//            String 명령 = 스캐너.next();
//
//            if (명령.equalsIgnoreCase("종료"))
//                break;
//
//            if (명령.equalsIgnoreCase("등록"))
//            {
//                System.out.print("명언 : ");
//                스캐너.nextLine();
//                String 명언 = 스캐너.nextLine();
//                System.out.print("작가 : ");
//                String 작가 = 스캐너.nextLine();
//
//                명언목록.add(id + " / " + 작가 + " / " + 명언);
//                id++;
//
//                // 새로운 명언을 추가할 때마다 id를 증가시킴
//            }
//
//            if (명령.equalsIgnoreCase("목록"))
//            {
//                System.out.println("번호 / 작가 / 명언");
//                System.out.println("----------------------");
//                for (String 명언 : 명언목록)
//                {
//                    System.out.println(명언);
//                }
//            }
//
//            if (명령.startsWith("삭제?id="))
//            {
//                String 삭제명령 = 명령.replace("삭제?id=", "");
//                int 삭제_id;
//                try
//                {
//                    삭제_id = Integer.parseInt(삭제명령);
//                    if (삭제_id >= 1 && 삭제_id <= 명언목록.size())
//                    {
//                        명언목록.remove(삭제_id - 1);
//
//                        // ID를 변경하지 않고 삭제한 경우 ID를 그대로 사용
//                        System.out.println(삭제_id + "번 명언이 삭제되었습니다.");
//                    } else
//                    {
//                        System.out.println(삭제_id + "번 명언은 존재하지 않습니다.");
//                    }
//                } catch (NumberFormatException e)
//                {
//                }
//            }
//        }
//
//        스캐너.close();
//    }
//}

