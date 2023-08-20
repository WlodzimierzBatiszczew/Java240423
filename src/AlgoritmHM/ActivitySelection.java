package Lesson1408.HM1408;

import java.util.*;

public class ActivitySelection {

    public static List<Integer> maxActivities(List<int[]> activities) {

        List<Integer> selected = new ArrayList<>();

        Collections.sort(activities, (a, b) -> a[1] - b[1]);

        int last = -1;

        for (int i = 0; i < activities.size(); i++) {
            int start = activities.get(i)[0];
            int end = activities.get(i)[1];

            if (start >= last) {
                selected.add(i);
                last = end;
            }
        }
        return selected;
    }

    public static void main(String[] args) {
        List<int[]> activities = new ArrayList<>();
        activities.add(new int[]{1, 4});
        activities.add(new int[]{3, 5});
        activities.add(new int[]{0, 6});
        activities.add(new int[]{5, 7});
        activities.add(new int[]{3, 8});
        activities.add(new int[]{5, 9});
        activities.add(new int[]{6, 10});
        activities.add(new int[]{8, 11});

        System.out.println(maxActivities(activities));
    }
}
