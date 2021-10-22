'''
Created on 2021. 7. 20.
남녀 파트너 정해주기 프로그램 만들기 (zip)
@author: pc354
'''
from random import shuffle

male = ['슈퍼맨','심봉사','로미오','이몽룡','마루치']
female = ['원더우먼','뺑덕어멈','줄리엣','성춘향','아라치']
shuffle(male)
shuffle(female)
couples = zip(male, female)

for i,couple in enumerate(couples):
    print('커플%d: [%s]-[%s]'%(i+1,couple[0],couple[1]))