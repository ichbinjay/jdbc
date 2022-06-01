# opening a file in read mode
f = open("D:/pyinp.txt", "r")
print("file contains following text:\n", f.read(), "\n", sep="")
f.close()

f = open("D:/pyinp.txt", "r")
# count no of words in the file
count = 0
for line in f:
    count += len(line.split(" "))
print("no of words in file:", count)
f.close()

f = open("D:/pyinp.txt", "r")
# print words in the file in alphabetical order
words = []
for line in f:
    words += [x for x in line.split(' ')]
    if '\n' in words[-1]:
        words[-1] = words[-1][:-1]
print("sorted: ", sorted(words))
f.close()

# print count of sentences in the file
f = open("D:/pyinp.txt", "r")
count = 0
for line in f:
    if line.endswith('.'):
        count += 1
print("no of sentences in file: ", count)
f.close()

# print words in reverse order
print("words in reverse order: ")
for i in words[::-1]:
    print(i[::-1], end=" ")

print()
# count number of words with length equal to 3
for i in words:
    if len(i) == 3:
        count += 1
print("number of words with length equal to 3:", count)
f.close()
