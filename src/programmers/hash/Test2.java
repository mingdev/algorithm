package programmers.hash;

import java.util.Arrays;

public class Test2 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for (int i = 0; i < phone_book.length; i++) {
            for (int j = i + 1; j < phone_book.length; j++) {
                if (phone_book[j].contains(phone_book[i]))
                    return false;
            }
        }

        return answer;
    }

    public static boolean solution2(String[] phoneBook) {
        for(int i=0; i<phoneBook.length-1; i++) {
            for(int j=i+1; j<phoneBook.length; j++) {
                // startWith 해당 접두어를 가지고 있는지 Check
                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"12", "123", "1235", "567", "88"};

        System.out.println(solution(phone_book));

        String[] phone_book2 = {"123", "456", "789"};

        System.out.println(solution(phone_book2));
    }
}
