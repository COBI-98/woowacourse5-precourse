package onboarding;

import java.util.List;

/**
 * 기능 사항
 * 1.자릿수 별 합과 곱 중 큰 값을 리턴하는 함수
 * 2.펼친 페이지 중 큰 값을 리턴하는 함수
 * 3.예외 사항 함수
 */
class Problem1 {
    /**
     * 1.자릿수 별 합과 곱 중 큰 값을 리턴하는 함수
     */
    public static int cal(int n) {
        int sum = 0;
        int mul = 1;

        while(n > 0){
            sum += n%10;
            mul *= n%10;
            n/=10;
        }
        return Math.max(sum,mul);
    }
    
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }


}