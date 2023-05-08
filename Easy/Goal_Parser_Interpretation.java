//Question No: 1678
package Easy;

public class Goal_Parser_Interpretation {
    public String interpret(String command) {
        String ar[] = {"G", "()","(al)"};
        String r[] = {"G", "o", "al"};
        String res = "";
        String w = "";
        for(int x=0;x<command.length();++x){
            char ch = command.charAt(x);
            w=w+ch;
            if(ch==')' || ch=='G'){
                for(int y=0;y<3;++y){
                    if(w.equals(ar[y])) res += r[y];
                }
                w="";
            }
        }
        return res;
    }
}
