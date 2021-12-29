#!usr/bin/python3

"""
In this we are talking about "Recursion" .

How to print numbers 1 to N using recursion programming method.  For example,

>>> printNum1toN(5)
1
2
3
4
5
"""


def printNumNto1(n: int) -> int:
    """
    :param n:
    :print number from N to 1
    eg: >> printNumNto1(3)
        3
        2
        1
    """
    # Base case
    if n == 0: return

    print(n)
    printNum1toN(n - 1)


def printNum1toN(n: int, k: int = 1):
    """
    :param n:
    :param k: this parameter is used to make our function tail recursive in nature.
    :print number from 1 to n

    eg: >> printNum1toN(7)
        1
        2
        3
        4
        5
        6
        7
    """
    # Base case
    if n == 0: return

    print(k)
    printNum1toN(n - 1, k + 1)
