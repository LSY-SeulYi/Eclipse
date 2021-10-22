'''
Created on 2021. 7. 13.
파이썬 모듈의 이해
@author: pc354
'''
import time

from part2 import mymodule as my
from part2.mymodule import reverse
from part2.mymodule import sum
from part2.mymodule import message
from part2.mymodule import someFunc3

print(reverse('산','토','끼'))

for x in range(10):
    print(someFunc3(9, x),end='\t')
print()

for x in range(1, 10):
    for y in range(2,10):
        print(someFunc3(y, x),end='\t')
    print()
    time.sleep(0.5)
    