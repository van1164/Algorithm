n = int(input())
first = [0 for _ in range(n)]
second = [0 for _ in range(n)]
non = [0 for _ in range(n)]
first[0] = second[0] = non[0] = 1

for i in range(1,n):
    first[i] = (second[i-1]+non[i-1])%9901
    second[i] = (first[i-1] + non[i-1])%9901
    non[i] = (first[i-1]+second[i-1]+non[i-1])%9901
print((first[-1]+second[-1]+non[-1])%9901)