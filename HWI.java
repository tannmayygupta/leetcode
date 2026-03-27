public static int getSumOfAllQuery(int N, List<Integer> A, int Q, List<List<Integer>> Queries) {
    // Fortunate numbers <= 10000
    int[] fn = {3,5,7,13,17,19,23,37,47,59,61,67,71,79,89,101,103,
        107,109,127,151,157,163,167,191,197,199,223,229,233,239,271,
        277,283,293,307,311,313,331,353,373,379,383,397,401,409,419,421,439,443
        ,457,461,491,499,509,523,547,601,607,613,617,619,631,641,643,653,727,733,
        751,757,773,823,877,883,911,941,1021,1061,1381};
        ..

    HashSet<Integer> fortunate = new HashSet<>();
    for (int f : fn) fortunate.add(f);

    // Segment tree for range max
    int size = 1;
    while (size < N) size *= 2;
    int[] tree = new int[2 * size];
    for (int i = 0; i < N; i++) tree[size + i] = A.get(i);
    for (int i = size - 1; i >= 1; i--) tree[i] = Math.max(tree[2*i], tree[2*i+1]);

    // Cache for recaman distances
    HashMap<Integer, Integer> cache = new HashMap<>();

    int total = 0;

    for (List<Integer> q : Queries) {
        if (q.get(0) == 0) {
            // Update
            int pos = q.get(1) + size;
            tree[pos] = q.get(2);
            pos /= 2;
            while (pos >= 1) {
                tree[pos] = Math.max(tree[2*pos], tree[2*pos+1]);
                pos /= 2;
            }
        } else {
            // Range max query
            int l = q.get(1) + size, r = q.get(2) + size + 1;
            int mx = 0;
            while (l < r) {
                if ((l & 1) == 1) { mx = Math.max(mx, tree[l]); l++; }
                if ((r & 1) == 1) { r--; mx = Math.max(mx, tree[r]); }
                l /= 2; r /= 2;
            }
            // Recaman distance
            if (!cache.containsKey(mx)) {
                HashSet<Integer> visited = new HashSet<>();
                visited.add(mx);
                int cur = mx, steps = 5000;
                for (int n = 1; n <= 5000; n++) {
                    int nxt = cur - n;
                    if (nxt > 0 && !visited.contains(nxt)) cur = nxt;
                    else cur = cur + n;
                    if (visited.contains(cur) || cur > 1000000) { steps = n; break; }
                    visited.add(cur);
                }
                cache.put(mx, steps);
            }
            int steps = cache.get(mx);
            int mult = fortunate.contains(mx) ? 17 : 1;
            total += steps * mult;
        }
    }
    return total;
}