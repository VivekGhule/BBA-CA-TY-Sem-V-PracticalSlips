# Write a Python program to check if a given number is prime or not, and also find the factorial of the given number using a user defined function

# Define a function to check if a number is prime or not
def is_prime(n):
    # If the number is less than or equal to 1, it is not prime
    if n <= 1:
        return False
    # Loop from 2 to the square root of the number
    for i in range(2, int(n**0.5) + 1):
        # If the number is divisible by i, it is not prime
        if n % i == 0:
            return False
    # If the loop ends without finding a divisor, it is prime
    return True

# Define a function to find the factorial of a number
def factorial(n):
    # If the number is 0 or 1, the factorial is 1
    if n == 0 or n == 1:
        return 1
    # Otherwise, multiply the number by the factorial of the previous number
    else:
        return n * factorial(n - 1)

# Take the input for the number from the user
n = int(input("Enter a number: "))

# Check if the number is prime or not using the is_prime function
if is_prime(n):
    print(n, "is a prime number")
else:
    print(n, "is not a prime number")

# Find the factorial of the number using the factorial function
f = factorial(n)
print("The factorial of", n, "is", f)
