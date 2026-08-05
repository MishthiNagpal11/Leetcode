class Solution(object):
    def remainingMethods(self, n, k, invocations):
        
        # Step 1: Build graph
        graph = [[] for _ in range(n)]

        for u, v in invocations:
            graph[u].append(v)

        # Step 2: DFS to find suspicious methods
        visited = [False] * n

        def dfs(node):
            visited[node] = True

            for nei in graph[node]:
                if not visited[nei]:
                    dfs(nei)

        dfs(k)

        # Step 3: Check if any safe method calls a suspicious method
        for u, v in invocations:
            if not visited[u] and visited[v]:
                return list(range(n))

        # Step 4: Return remaining methods
        ans = []

        for i in range(n):
            if not visited[i]:
                ans.append(i)

        return ans