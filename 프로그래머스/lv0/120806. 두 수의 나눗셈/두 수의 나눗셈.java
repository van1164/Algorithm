class Solution {
    public int solution(int num1, int num2) {
        double tem = (double) num1/num2;
        double temp = tem*1000;
        int answer = (int) temp;
        return answer;
    }
}