//Start:
//        program[] = {'S','o','f','t','w','a','r','e',' ','E','n','g','i','n','e','e','r','i','n','g',' ','C','a','r','e','e','r',' ','P','r','o','g','r','a','m'}
//
//        End:
//        program[] = {'r','n','n','n','i','i','g','g','e','e','E',' ','r','r','e','e','a','C',' ','r','r','o','m','g','a','P',' ','w','t','r','o','f','e','a','S'}


import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        String a = "Engineering ";

        char[] s = a.toCharArray();
        Arrays.sort(s);
        int n = a.length();
        for (int i = 0; i < n/2; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(s));
    }
}