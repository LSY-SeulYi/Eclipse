'''
Created on 2021. 7. 20.
파일에서 특정 단어 개수 계산하기
@author: pc354
'''

def countWord1(fileName,word):
    with open(fileName,'r',encoding = 'utf-8') as f:
        text = f.read().lower().split()
        pos = text.find(word)
        count = 0
        while text != -1:
            count += 1
            pos = text.find(word,pos+1)
        return count
word = input('mydata.txt에서 개수를 구할 단어를 입력하세요: ')
word = word.lower()
ret = countWord1('mydata.txt',word)
print('[%s]의 개수: %d'%(word,ret))


def countWord(fileName,word):
    with open(fileName,'r',encoding = 'utf-8') as f:
        words = f.read().lower().split()
        cnt = words.count(word)
    return cnt

print('news.text','이')