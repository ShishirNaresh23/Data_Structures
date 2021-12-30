#!usr/bin/python3

"""
How to get SumDigits of a number N using recursion.  For example,

>>> sumOfDigits(545)
14

"""


def sumOfDigits(n: int, s: int = 0) -> int:
    """
    :param s: Sum of digits needs to passed in each recursion of the function and initialized 0 for initial stage.
    :param n: Number N for whose digits sum needs to be calculated.
    :return: Sum of digits

    eg: >>> sumOfDigits(545)
        14
    """

    # Base case
    if n == 0: return s

    return sumOfDigits(int(n / 10), s + (n % 10))
