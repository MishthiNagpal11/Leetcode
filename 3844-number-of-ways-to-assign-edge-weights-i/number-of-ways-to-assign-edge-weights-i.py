class Solution(object):
    def assignEdgeWeights(self, edges):
        """
        :type edges: List[List[int]]
        :rtype: int
        """
        MOD = 1000000007
        n = len(edges) + 1

        graph = [[] for _ in range(n + 1)]

        for u, v in edges:
            graph[u].append(v)
            graph[v].append(u)

        max_depth = 0

        stack = [(1, 0, 0)]  # node, parent, depth

        while stack:
            node, parent, depth = stack.pop()
            max_depth = max(max_depth, depth)

            for nei in graph[node]:
                if nei != parent:
                    stack.append((nei, node, depth + 1))

        return pow(2, max_depth - 1, MOD)