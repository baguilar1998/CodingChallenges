def isArmStrongNumber(number):
    sum = 0
    temp= number
    while temp > 0:
        lastDigit = int(temp%10)
        sum+=(lastDigit**3)
        temp/=10
    if sum == number:
       return True
    return False

if isArmStrongNumber(153):
    print("153 is an armstrong number")
else:
    print("153 is not an armstrong number")
