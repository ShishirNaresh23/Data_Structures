#!/usr/bin/python3

"""
Problem to be solved is the Josphen using recursion.
For example:

>>> josephus(7,3)
Person sitting at chair 3 lives.

"""


def josephus(n: int, k: int):
    """
    :param n: Number of people sitting in the circle.
    :param k: Person kills after k indexes
    :return: Index of person who lives.
    """
    if n == 1: return 0

    return (josephus(n - 1, k) + k) % n  # As with each iteration, we lose the index information of person, so we need
    # to perform this
