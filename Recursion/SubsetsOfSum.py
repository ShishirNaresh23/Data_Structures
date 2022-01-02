#!usr/bin/python3

"""
We will try to solve problem of finding subsets which have particular defined sum using recursion.

For example.
>>> subsetsOfSum(array = [10,5,2,3,6], sum = 8)
(2,6)
(5,3)

"""


def subsetsOfSum(arr: list, s: int, num: int) -> int:
    """

    :param num: number of terms in the arr
    :param arr: contain list of integers
    :param s: A pair of number whose sum is equivalent to s
    :return: return number of subsets whose sum is equivalent to s.
    """
    if num == 0:
        return 1 if (s == 0) else 0

    return subsetsOfSum(arr, s, num - 1) + subsetsOfSum(arr, s - arr[num - 1], num - 1)


print(subsetsOfSum([10, 5, 2, 3, 6], 8, 5))
