package Spring_2023.Q5.a;

import java.util.ArrayList;
import java.util.List;

public class StringOperation {
    List<Character> strings=new ArrayList<Character>();
    StringOperation(String string){

        for(int i=0;i<string.length();i++){
            //Use this code if you want to not add "space"
//            if(string.charAt(i)!=' '){
//            strings.add(string.charAt(i));}

            strings.add(string.charAt(i));
        }
        if(strings.size()>1){
            strings.set(2,'z');
        }
        System.out.println(strings);
    }

    public static void main(String[] args) {
        new StringOperation("amar kase asho!");
    }
}
