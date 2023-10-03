def multiply(x, y):
    return x * y

def add(x, y):
    return x + y

def self_math(math_func):
    def inner_func(x):
        return math_func(x, x)
    return inner_func #the function is not called here, only the reference is given

square_func = self_math(multiply) # here the self_math functions is wrapped in square_func and not called
# square_func variable is now a function and can be called with arguments
double_func = self_math(add)

print(square_func(5)) # here the square_func is called and 5 is passed to firstly inner_func and then mulitply function.
# prints 25

print(double_func(5))
# prints 10
