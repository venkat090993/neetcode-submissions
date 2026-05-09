class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // DAG -> it should be a directed acyclic graph
        // Kahn's algorithm

        List<Integer>[] adj = new ArrayList[numCourses];
        for(int i = 0; i<numCourses; i++){
            adj[i] = new ArrayList<>();
        }

        System.out.println(Arrays.toString(adj));

        for(int i = 0; i < prerequisites.length; i++){
            int k = prerequisites[i][1];
            int v = prerequisites[i][0];
            System.out.println("k " + k + " v " + v);
            adj[k].add(v);
        }

        int[] indegree = new int[numCourses];

        System.out.println(Arrays.toString(adj) + "is the adjacency list");

        for( int i = 0; i < numCourses; i++){
            for(int nei: adj[i]){
                indegree[nei]+=1;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i <numCourses; i++){
            if(indegree[i] == 0){
                result.add(i);
                queue.offer(i);
            }
        }

        System.out.println(Arrays.toString(indegree) + "indegree");

        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int nei: adj[node]){
                indegree[nei]-=1;
                if(indegree[nei] == 0){
                    queue.add(nei);
                    result.add(nei);
                }
            }
        }

        System.out.println(result.toString());

        if(result.size() != numCourses){
            return false;
        }

        return true;
    }
}
