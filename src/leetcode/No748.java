package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class No748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        char[] c = new char[7];
        String keep = "";
        //Ã·»°≈∆’’
        for (int i = 0; i < licensePlate.length(); i++) {
            if (licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z') {
                c[i] = licensePlate.charAt(i);
            } else if (licensePlate.charAt(i) >= 'A' && licensePlate.charAt(i) <= 'Z') {
                c[i] = licensePlate.charAt(i);
            } else {
                c[i] = '0';
            }
        }
        String sLic = new String(c).replace("0", "").toLowerCase();
        int[] ILic = new int[26];
        for(int i = 0 ; i < sLic.length(); i++){
            int a =(int)sLic.charAt(i)-'a';
            ILic[a]++;
        }
        start:for(String word : words){
            int[] test = new int[26]; 
            for(int i=0;i<ILic.length;i++){
                test[i]=ILic[i];
            }
            for(int i = 0 ; i < word.length(); i++){
                if(test[(int)word.charAt(i)-'a']!=0){
                    test[(int)word.charAt(i)-'a']--;
                }
            }
            for(int i = 0 ; i < 26; i++){
                if(test[i]!=0){
                    continue start;
                }
                if( i==25){
                    if(keep==""){
                        keep = word;
                    } else if(word.length()<keep.length())
                        keep = word;
                }
            }
        }
        return keep;
    }
}
