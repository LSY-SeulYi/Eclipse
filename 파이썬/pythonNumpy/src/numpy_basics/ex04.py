'''
Created on 2021. 8. 2.
How do you know the shape and size of an array?
@author: pc354
'''
import numpy as np 


array_example = np.array([[[0, 1, 2, 3],
                            [4, 5, 6, 7]],

                           [[0, 1, 2, 3],
                            [4, 5, 6, 7]],

                           [[0 ,1 ,2, 3],
                            [4, 5, 6, 7]]])
print("몇차원인가? : ",array_example.ndim,"차원입니다.")
print("총 배열수는? : ",array_example.size)
print("몇동몇층몇호인가? : ",array_example.shape)