package lang.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNum;
    private int count;

    public int[] generate(){
        lottoNum = new int[6];
        count =0;

        while (count < 6){
            int num = random.nextInt(45) + 1;
            if(isUnique(num)){
                lottoNum[count] = num;
                count++;
            }
        }
        return lottoNum;
    }

    private boolean isUnique(int number){
        for(int i=0; i< count; i++){
            if(lottoNum[i] == number ){
                return false;
            }
        }
        return true;
    }
}
