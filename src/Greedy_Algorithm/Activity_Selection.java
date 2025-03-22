package Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection {
    public static void main(String[] args) {
    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};

    int activites[][]=new int[start.length][3];

    for (int i=0;i<start.length;i++){
        activites[i][0]=i;
        activites[i][1]=start[i];
        activites[i][2]=end[i];
    }

        Arrays.sort(activites, Comparator.comparingDouble(o->o[2]));

    int maxActivity=0;
    ArrayList<Integer>l=new ArrayList<>();
        maxActivity=1;
//        l.add(0);
        l.add(activites[0][0]);
//       int lastEnd=end[0];
        int lastEnd=activites[0][2];
        for (int i=1;i<start.length;i++){
            if(activites[i][1]>=lastEnd){
                maxActivity++;
//                l.add(i);
                l.add(activites[i][0]);
//                lastEnd=end[i];
                lastEnd=activites[i][2]; 
            }
        }
        System.out.println("Max activity= "+maxActivity);
        System.out.println("A"+l);
    }
}
