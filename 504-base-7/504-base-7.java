class Solution {
    public String convertToBase7(int num) {
        StringBuilder result = new StringBuilder();
        if(Math.abs(num) < 7) { //check boundary condition 
            result.append(num);
        }
        else {
            while(Math.abs(num) > 6 ) { //iteration to check if remainder
                int division = num / 7; 
                int multiply = division * 7;
                result.insert(0, Math.abs(num - multiply));
                num = division;
            }
            if(num != 0)
                result.insert(0, num);
        }
        return result.toString();
    }
}