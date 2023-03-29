num = int(input())

for i in range(0,num):
    print("Case #", end='')
    print(i+1, end='')
    print(":", end=' ')
    a, b = map(int, input().split())
    print(a, "+", b, "=", sep=' ', end=' ')
    print(a+b)