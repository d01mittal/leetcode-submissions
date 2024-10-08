class Solution {
    public String reverseVowels(String s) {
        int len=s.length();
        char word[]=s.toCharArray();
        int j=len-1;
        for(int i=0;i<len&&i<j;i++){
            char ch=word[i];
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                while((word[j]!='A'&&word[j]!='E'&&word[j]!='I'&&word[j]!='O'&&word[j]!='U'&&word[j]!='a'&&word[j]!='e'&&word[j]!='i'&&word[j]!='o'&&word[j]!='u')&&i<j) j--;
                char temp=word[i];
                word[i]=word[j];
                word[j]=temp;
                j--;
            }
        }
        String ans=new String(word);
        return ans;
    }
}
