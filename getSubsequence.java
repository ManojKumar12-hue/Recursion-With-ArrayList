import java.io.*;
import java.util.*;

public class getSusbsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        ArrayList<String> ans = gss(str);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0); // a
        String ros = str.substring(1); // bc

        ArrayList<String> rres = gss(ros); // [,b,c,bc]
        ArrayList<String> ans = new ArrayList<>();

        for (String s : rres) {
            ans.add(s);
        }
        for (String s : rres) {
            ans.add(ch + s);
        }
        return ans;
    }

}
