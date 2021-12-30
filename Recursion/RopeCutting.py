#!usr/bin/python3

"""Check whether rope can be cut into any no. of following pieces length either a,b,c from its current length l. If
possible to cut rope then return number of pieces that can be derived otherwise return -1. For example,

>>> cutRope(23,12,9,11)
2

>>> cutRope(23,13,11,14)
-1

"""


def cutRope(l: int, a: int, b: int, c: int) -> int:
    """
    :param l: Actual length of the rope
    :param a: First piece of the length that can be cut
    :param b: Second piece of the length that can be cut
    :param c: Third piece of the length that can be cut
    :return: return number of pieces that can be cut from the rope otherwise return -1.
    """

    # Base condition
    if l == 0: return 0
    if l < 0: return -1

    res = max([cutRope(l - a, a, b, c),
               cutRope(l - b, a, b, c),
               cutRope(l - c, a, b, c)])

    if res == -1: return -1

    return res + 1
