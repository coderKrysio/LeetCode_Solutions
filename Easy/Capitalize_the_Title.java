//Question No: 2129
package Easy;

public class Capitalize_the_Title {
    public String capitalizeTitle(String title) {
        title = title.toLowerCase();
        String[] words = title.split(" ");
        for(int x = 0;x < words.length;x++) {
            if(words[x].length() > 2) {
                words[x] = Character.toUpperCase(words[x].charAt(0)) + words[x].substring(1);
            }
        }
        return String.join(" ", words);
    }
}
