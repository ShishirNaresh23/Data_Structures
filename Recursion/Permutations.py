#!usr/bin/python3

"""
We are going to solve print all permutations of all characters in a string using recursion. For Example,

>>> permute('AB')
AB
BA
"""


def permute(s: str, i: int = 0):
    """
    :param s: String with character whose permutations need to be printed
    :param i: @default initial index of the string where to start from not required to update as it is default parameter.
    :return: print permutations of all combination of character of a string @s.
    """
    # Base condition
    if i == len(s) - 1: print(s)

    for j in range(i, len(s)):

        s = list(s)
        s[i], s[j] = s[j], s[i]
        s = "".join(s)

        permute(s, i + 1)

        s = list(s)
        s[j], s[i] = s[i], s[j]
        s = "".join(s)
