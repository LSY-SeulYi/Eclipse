from flask import Flask,g,Response,make_response # app context 공간의 global 변수
from flask import render_template

app = Flask(__name__)
app.debug = True

@app.before_request
def before_request():
    print("before_request!!!") 
    g.str = "한글 테스트 입니다."
    g.방문자수 = '120'
    g.chatRoom = 'ARoom'
    
@app.route("/gg")
def helloworld2():
    str = "hello Flask World! "
    str += getattr(g, 'str', '111')
    str += "방문자수 : "+getattr(g, '방문자수', '0')
    str += "\n할당 챗팅방 : "+getattr(g, 'chatRoom', '임시방')
    return str

@app.route("/") # 요청
@app.route("/index") # 요청
def index():
    return render_template('index.html')

@app.route("/about") # 요청
def about():
    return render_template('about.html',title='About')

@app.route("/response1")
def res1():
    custom_res = Response("Costom Response",200,{'test':'ttt'}) # 200은 성공했다는 뜻
    return make_response(custom_res) # 주로 큰 데이타 보낼때 스트림화