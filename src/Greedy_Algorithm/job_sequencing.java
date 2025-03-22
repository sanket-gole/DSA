package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class job_sequencing {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int deadline, int profit, int id) {
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{2,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>();
        for (int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(jobsInfo[i][0],jobsInfo[i][1],i));
        }
        Collections.sort(jobs,(a,b)->b.profit-a.profit);

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for (int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max jobs:"+seq.size());
        System.out.println(seq);
    }
}
