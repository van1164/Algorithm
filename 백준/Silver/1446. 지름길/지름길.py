import sys
input = sys.stdin.readline

N,D = list(map(int,input().split()))
graph = [0 for _ in range(D+1)]
saving = [[] for _ in range(D+1)]

for i in range(N):
    s,e,t = list(map(int,input().split()))
    if e>D:
        continue
    saving[e].append((s,t))
for i in range(1,D+1):
    minn = 1000000000000
    for j in saving[i]:
        temp = graph[j[0]]+j[1]
        if minn> temp:
            minn = temp
    graph[i]=min(graph[i-1]+1,minn)
print(graph[-1])
