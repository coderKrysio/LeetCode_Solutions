//Question No: 9
package Easy;

class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int num = 0;
        int i = x;
        while(i!=0){
            num = num*10 + (i%10);
            i /= 10;
        }
        if(num==x) return true;
        return false;
    }
}