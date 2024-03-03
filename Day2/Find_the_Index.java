package TT_Smartlog.Day2;

public class Find_the_Index {
    public int strStr(String haystack, String needle) {
        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Find_the_Index finder = new Find_the_Index();

        String haystack = "Hello, World!";
        String needle = "World";
        int result = finder.strStr(haystack, needle);

        if (result != -1) {
            System.out.println("Chuỗi '" + needle + "' được tìm thấy ở vị trí " + result + " trong chuỗi '" + haystack + "'");
        } else {
            System.out.println("Chuỗi '" + needle + "' không được tìm thấy trong chuỗi '" + haystack + "'");
        }
    }

}
