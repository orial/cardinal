print input() + input()

print
print

print 1 * -1 / 4 - 8 - 8
print ( 1 * -1 ) / ( 4 * ( 1 ) )
print ( 1 * -1 ) / ( 4 * ( 8 - 7 ) )

print
print

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

print
print

g = lambda x: x**2
print g(8)


