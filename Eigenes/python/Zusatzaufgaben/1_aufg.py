for i in range(10):
    print(i + 1, end="")
    if i < 9:
        print("-", end="")
print()

numbers: "list[int]" = list(range(1, 11))
print(*numbers, sep="-")