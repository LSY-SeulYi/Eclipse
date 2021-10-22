'''
Created on 2021. 7. 19.
현재 시간 년월-일 시:분:초로 출력하기 (localtime, strftime)
@author: pc354
'''
from time import localtime, strftime


logfile = 'test.log'
def writelog(logfile,log):
    time_stamp = strftime('%Y-%m-%d %X\t',localtime())
    log = time_stamp + log + '\n'
    with open(logfile,'a', encoding = 'utf-8') as f:
        f.writelines(log)
writelog(logfile,'홍길동이 디비를 열어 자료를 입력하였습니다.')