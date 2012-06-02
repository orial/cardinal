a = [4]
b = [5]
c = a + b

print a[0]


print c
d = [c] * 8

print d[(8 - 3)/5 - 1][0]
print d[0-1+1]
print d[a[0]-4]
print d * a[0]
print d + a

c = [[1,2],2,3,4]
d = [[2,3],2,3,4]

print c == d
print c >= d
print c is d

c = [1,2]
d = [3,4]

print c > d
print c < d
print c > d
print c < d
print c > d
print c < d
print d >= d


c = d[0]
print c == d[0]
print c is d[0]

c = [1,1,1,3]
print c
d = c[0]
print d
c[2] = 4.0
print c
print d
c = [[1,2]]
c[0][1] = True
print c
print d

a = 0
b = [[a]]
c = [[b]]

print a,b,c
