def f(n):
    b = int('11111111111111111111111111111111', 2)
    #n = n & b
    n1 = n ^ b
    print (n1)
    
n = int(input())

for i in range(0,n):
    a = int(input())
    f(a);
