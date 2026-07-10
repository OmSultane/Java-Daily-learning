package DSA.Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindPlayersWithZeroOrOneLosses2225 {
    public List<List<Integer>> findWinners(int[][] matches) {

        List<Integer> oneLose = new ArrayList();
        List<Integer> zeroLoses = new ArrayList();
        Map<Integer, Integer> map = new HashMap();

        for(int[] team : matches){
            map.put(team[0], map.getOrDefault(team[0], 0) + 0);
            map.put(team[1], map.getOrDefault(team[1], 0) + 1);
        }

        for(int i : map.keySet()){
            if(map.get(i) == 0){
                zeroLoses.add(i);
            }else if(map.get(i) == 1){
                oneLose.add(i);
            }
        }

        Collections.sort(zeroLoses);
        Collections.sort(oneLose);

        return Arrays.asList(zeroLoses, oneLose);
    }
}