package algorithmsmax.integers;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer trainerWithMaxAge(List<Trainer> trainers){
        Trainer older = trainers.get(0);

        for(Trainer c :trainers){

            if(c.age > older.age){
                older = c;
            }
        }

        return older;
    }

}
