public class NPSService {
    int promoters = 0;
    int detractors = 0;
    int count=0;
    double nps;

    public double nps(int[] votes) {


        for (int i = 0; i < votes.length; i++) {
            if (votes[i]>8 && votes[i]<=10) {
                promoters++;
            }
        }
        for (int i = 0; i < votes.length; i++) {
            if (votes[i]>=0 && votes[i] < 7 ) {
                detractors++;
            }
        }
            for (int i = 0; i < votes.length; i++) {
                if(votes[i]>=0 && votes[i]<=10){
                    count++;
                }
            }

        return nps = promoters * 100.0 / count - detractors * 100.0 / count;

    }
}










