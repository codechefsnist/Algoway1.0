n = input() #enter X 12299
l = len(n)
if n == n[::-1]:
    print(n,end=" ")
    print(0,end="")
else:
    if l % 2 == 1:
        first_half = (n[:int(l/2)])
        second_half = (n[int(l/2)+1:])
    else:
        first_half = (n[:int(l/2)])
        second_half = (n[int(l/2):])
    if int(first_half[::-1]) >= int(second_half):
        if l % 2 == 1:
            first_half += n[int(l/2)]
        first_half = str(int(first_half) - 1)
        ls = len(second_half)
        second_half = ('9'*ls)
        new = first_half + second_half
    else:
        new=n

    if len(str(int(n)-1)) != len(n):
        print(new,end=" ")
        print(int(n)-int(new),end=" ")
    else:
        
        if l % 2 == 1:
            first_half = (n[:int(l/2)])
        temp = int(second_half) - int(first_half[::-1])
        print(int(n)-temp-(int(n)-int(new)),end=" ")
        t = int(n) - (int(n)-temp-(int(n)-int(new)))
        print(t,end="")
