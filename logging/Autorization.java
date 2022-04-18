package logging;

import java.util.Scanner;

public class Autorization {


    public static String loginServ(String userLog, String userPass, String sysLog, String sysPass) {
        String result ="1233";
        if (userLog.equals(sysLog) && userPass.equals(sysPass))
            result = "Успешный вход";
        else result = "Data ERROR";
        return result;
    }
}

