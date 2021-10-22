'''
Created on 2021. 8. 3.

@author: pc354
'''

import pandas as pd
import numpy as np

rnd = np.random.default_rng()
a = rnd.random((4,4))
print(a)
np.savetxt('npnums.csv',a,fmt='%s',delimiter=',',header='1,2,3,4')
df = pd.DataFrame(a)
print(df)

df.to_csv('rndnums.csv')

