package algo;

import java.text.SimpleDateFormat;
import java.util.*;

public class _10699_오늘날짜 {
    public static void main(String[] args) throws Exception {
        Date date = new Date();
//        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String newDate = format.format(date);
        System.out.println(newDate);
    }
}
