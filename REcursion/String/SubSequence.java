package REcursion.String;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        String word="abc";
        System.out.println(subsequence("",word));
    }
    static ArrayList<String> subsequence(String PS, String word){
        ArrayList<String> list=new ArrayList<>();
        if(word.isEmpty()){
            list.add(PS);
            return list;
        }
        char ch=word.charAt(0);
        ArrayList<String> left=subsequence(PS,word.substring(1));
        ArrayList<String> right=subsequence(PS+ch,word.substring(1));
        left.addAll(right);
        return left;
    }
}
