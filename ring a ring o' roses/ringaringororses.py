temp = list(input().rstrip().split())
N = int(temp[0])
n = int(temp[1])
x = int(temp[2])
n = n % N
arr = [i for i in range(1,N+1)]
ans = arr[n:] + arr[0:n]
#7 13 print(ans)
print(ans.index(x)+1,end='')
