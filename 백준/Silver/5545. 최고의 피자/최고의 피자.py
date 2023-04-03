import heapq
N = int(input())
A,B = list(map(int,input().split()))
C = int(input())
lst = []
for i in range(N):
    heapq.heappush(lst,-int(input()))
maxx= C//A
temp=0
for x in range(N):
    temp-=heapq.heappop(lst)
    result= (C+temp)//(A+B*(x+1))
    if maxx < result:
        maxx = result


print (maxx)