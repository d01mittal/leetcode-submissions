import java.util.Hashtable;
import java.util.ArrayList;
import java.io.*;
class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> ans=new ArrayList<String>();
        Hashtable<Character, Integer> store=new Hashtable<>();
        char first[]={'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char second[]={'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char third[]={'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        int hold=0;
        for(int i=0;i<first.length;i++){
            store.put(first[i], 1);
        }
        for(int i=0;i<second.length;i++){
            store.put(second[i], 2);
        }
        for(int i=0;i<third.length;i++){
            store.put(third[i], 3);
        }
        for(int i=0;i<words.length;i++){
            String st=words[i];
            int j=0;
            for(j=0;j<st.length();j++){
                char ch=Character.toLowerCase(st.charAt(j));
                int num=store.get(ch);
                if(hold==0) hold=num;
                if(hold!=num) break;
            }
            if(j>=st.length()) ans.add(st);
            hold=0;
        }
        String f[]=new String[ans.size()];
        for(int i=0;i<f.length; i++){
            f[i]=ans.get(i);
        }
        return f;
    }
}
