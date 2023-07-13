//Question No: 824
package Easy;

public class Goat_Latin {
    public String toGoatLatin(String sentence) {
        String ar[] = sentence.split(" ");
        String append = "maa";
        for(int x = 0; x < ar.length; x++) {
            char f = ar[x].charAt(0);
            if(!isVowel(f)) ar[x] = ar[x].substring(1) + f;
            ar[x] = ar[x] + append;
            append += "a";
        }
        return String.join(" ", ar);
    }

    public boolean isVowel(char c) {
        if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U') return true;
        return false;
    }
}
