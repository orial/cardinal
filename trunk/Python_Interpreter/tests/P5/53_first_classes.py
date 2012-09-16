class C:
    pass

C.x = 3
print C.x

class C:
    x = 3

print C.x

class D:
    x = 4

print (C if True else D).x
