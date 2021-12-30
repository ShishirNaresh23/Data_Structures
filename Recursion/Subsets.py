#!usr/bin/python3

"""
Generate subsets from the character in the string.
Number of sets generate for any sequence are equivalent to 2^n where n = no. of characters in the sequence.
For example:

>>> generateSubsets("ABA")
"", A, B, C, AB, AC, BC, ABC

"""


def generateSubsets(s: str, curr: str = "", index: int = 0) -> str:
    """
    :param index: keep track of the index to which recursion is going
    :param curr: keeping current track of the character which is passed into the recursive function call
    :param s: String for whose character subsets need to be generated.
    :return: return subsets
    """
    # Base case
    if index == len(s):
        print(curr)
        return

    generateSubsets(s, curr, index + 1)
    generateSubsets(s, curr + s[index], index + 1)
