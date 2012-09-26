def fun():
    a = 2
    print a
    return a
fun()


def fun_param(a,c):
    print a
    if c > 0:
        fun_param(c,c-1)

fun_param(0,30)

g = lambda x: x**2
print g(8)

class C:
    pass

C.x = 3
print C.x

class C:
    x = 3

print C.x

class D:
    x = 4

print D.x


