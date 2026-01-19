package TwoPointer;


class reverse {
    public void reverseString(char[] s) {
        int l=0,r=s.length - 1;
        while(l<r){
            char temp = s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        reverse obj = new reverse();
        char[] s = {'h','e','l','l','o'};
        obj.reverseString(s);
        System.out.println(s);
    }
}
// Time Complexity: O(n) where n is the length of the string
// Space Complexity: O(1) as we are using constant extra space
