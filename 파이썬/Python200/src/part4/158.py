'''
Created on 2021. 7. 19.
올해 경과된 날짜 수 계산하기 (localtime)
@author: pc354
'''
from time import localtime


ct = localtime()
start_day = '%d-01-01'%ct.tm_year
elapsed_day = ct.tm_yday
print('오늘은[%s] 이후 [%d]일째 되는 날입니다.'%(start_day,elapsed_day))

######################################################################