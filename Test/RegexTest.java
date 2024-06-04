package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest{
    public static void main(String[] args) {

        String pw = "a9";

        String[] regex = {
            "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*[!@#$%^&*()_])",
            "\\d+",
            "[0-9]+",
            "[a-zA-Z]+",
            "[a-z]+",
            "[A-Z]+",
            "^[0-9]",
            
        };

        int i = 0;
        for(String reg : regex){
            Pattern pattern = Pattern.compile(reg);

            Matcher matcher = pattern.matcher(pw);
            
            System.out.println(++i + " "+matcher.find());
        }
    }
}