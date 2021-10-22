'''
Created on 2021. 7. 20.
문장에 나타나는 문자 빈도수 계산하기
@author: pc354
'''

def getTextFrequency(fileName):
    with open(fileName,'r',encoding = 'utf-8') as f:
        text = f.read()
        freq = {}
        for c in text:
            if c in freq:
                freq[c] += 1
            else:
                freq[c] = 1
    return freq

def getWordCount(fileName):
    with open(fileName,'r',encoding = 'utf-8') as f:
        text = f.read()
        freq = {}
        data = text.split()
        for c in data:
            if c in freq:
                freq[c] += 1
            else:
                freq[c] = 1
    return freq
        
dic1 = getWordCount('news.txt')
print(dic1)


dic = getTextFrequency('news.txt')
print(dic)
dic = sorted(dic.items(),key=lambda x:x[1],reverse=True)
for c, freq in dic:
    if c == '\n':
        continue
    print('[%c]->[%d]회 나타남'%(c,freq))

ret = getTextFrequency('mydata.txt')
print(ret)
ret = sorted(ret.items(),key=lambda x:x[1],reverse=True)
for c,freq in ret:
    if c == '\n':
        continue
    print('[%c]->[%d]회 나타남'%(c,freq))