#!/usr/bin/python3

"""
Problem to be solved is the Tower of Hanoi using recursion.
For example:

>>> towerOfHanoi(3,1,2,3)
Move disc from  1 to  3
Move disc from  1 to  2
Move disc from  3 to  2
Move disc from  1 to  3
Move disc from  2 to  1
Move disc from  2 to  3
Move disc from  1 to  3

"""


def towerOfHanoi(n: int, a: int, b: int, c: int):
    """
    :param n: Number of discs need to be moved.
    :param a: Source tower number 1
    :param b: Auxiliary tower number 2
    :param c: Target tower number 3
    :return: Moves that need to be performed for transferring disc from a to c.
    """

    if n > 0:
        towerOfHanoi(n - 1, a, c, b)  # Keeping target tower as auxiliary for intermediate state
        print("Move disc from ", a, "to ", c)
        towerOfHanoi(n - 1, b, a, c)  # Keeping source tower as auxiliary for intermediate state
