package java6;

public class Stroka {
    public static void main(String[] args) {


        String s = "abcdef";
        char[] arr = new char[s.length()];
        for(int i = arr.length - 1; i >= 0; --i){
            char r = s.charAt(i);
            arr[(s.length()-1) - i] = r;
        }
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// System.out.print(s.charAt(i));