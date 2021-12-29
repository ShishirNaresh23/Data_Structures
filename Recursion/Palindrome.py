#!usr/bin/python3

"""

How to check whether string is palindrome or not.  For example,

>>> isPalindrome(535)
True
"""


def isPalindrome(n: int, start: int = 0, end: int = -1) -> bool:
    """
    :param n: number which need to accessed for palindrome.
    :param start: always start with index 0.
    :param end: Number of digits in a number - 1
    :return: Boolean True or False if integer is palindrome or not.
    """

    # Base condition
    if start >= end: return True

    return (int(str(n)[start]) == int(str(n)[end])) and isPalindrome(n, start+1, end-1)


