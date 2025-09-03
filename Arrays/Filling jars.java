public static long solve(int n, List<List<Integer>> operations) {
        double avg = 0.0;
        for (List<Integer> operation : operations) {
            int a = operation.get(0);
            int b = operation.get(1);
            int k = operation.get(2);
            double total = (b-a+1)* ((k * 10.0)/10.0);
            avg += total/n;
        }
        return (long) avg;
    }

// TC : O(n)
// SC : O(1)
