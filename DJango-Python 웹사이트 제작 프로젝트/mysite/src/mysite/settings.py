
import os
from pathlib import Path



BASE_DIR = Path(__file__).resolve().parent.parent

SECRET_KEY = '02thy+i-ys7emlj(96ve$hukj#skj&%_1kt&36%#%p*x_rb3st'

# True로 세팅하면 개발모드 , False로 세팅하면 운영모드
# False인 운영모드라면 아래 ALLOWED_HOSTS 리스트에 반드시 서버의 IP나 도메인을 지정해야함.
# True인 개발모드라면 아래 ALLOWED_HOSTS 리스트에 지정하지 않아도 ['localhost','127.0.0.1']로 간주되도록 장고 프레임워크에 내부설정되어 있음  
DEBUG = True

# ALLOWED_HOSTS = ['192.168.0.55', 'localhost', '127.0.0.1']
ALLOWED_HOSTS = ['*']

# Application definition

# 앱을 추가했다면 이부분에 등록해야 함 
INSTALLED_APPS = [
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.messages',
    'django.contrib.staticfiles',
    'bookmark.apps.BookmarkConfig',
    'blog.apps.BlogConfig',
    'taggit.apps.TaggitAppConfig',
    'taggit_templatetags2',
    'polls.apps.PollsConfig',
    'photo.apps.PhotoConfig',
    'widget_tweaks',
    'core.apps.CoreConfig',
]

MIDDLEWARE = [
    'django.middleware.security.SecurityMiddleware',
    'django.contrib.sessions.middleware.SessionMiddleware',
    'django.middleware.common.CommonMiddleware',
    'django.middleware.csrf.CsrfViewMiddleware',
    'django.contrib.auth.middleware.AuthenticationMiddleware',
    'django.contrib.messages.middleware.MessageMiddleware',
    'django.middleware.clickjacking.XFrameOptionsMiddleware',
]

# 프로젝트 템플릿 파일이 위치할 디렉터리를 지정 - (mvc의 v, mtv의 t)
ROOT_URLCONF = 'mysite.urls'

TEMPLATES = [
    {
        'BACKEND': 'django.template.backends.django.DjangoTemplates',
        'DIRS': [os.path.join(BASE_DIR,'templates')],# 이부분 지정 (import os)
        'APP_DIRS': True,
        'OPTIONS': {
            'context_processors': [
                'django.template.context_processors.debug',
                'django.template.context_processors.request',
                'django.contrib.auth.context_processors.auth',
                'django.contrib.messages.context_processors.messages',
            ],
        },
    },
]

WSGI_APPLICATION = 'mysite.wsgi.application'


# Database
# https://docs.djangoproject.com/en/3.1/ref/settings/#databases

DATABASES = {
    'default': {
        'ENGINE': 'django.db.backends.sqlite3',
        'NAME': BASE_DIR / 'db.sqlite3',
    }
}


# Password validation
# https://docs.djangoproject.com/en/3.1/ref/settings/#auth-password-validators

AUTH_PASSWORD_VALIDATORS = [
    {
        'NAME': 'django.contrib.auth.password_validation.UserAttributeSimilarityValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.MinimumLengthValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.CommonPasswordValidator',
    },
    {
        'NAME': 'django.contrib.auth.password_validation.NumericPasswordValidator',
    },
]


# Internationalization
# https://docs.djangoproject.com/en/3.1/topics/i18n/

LANGUAGE_CODE = 'ko-kr' ############## 기본은 'en-us' 

TIME_ZONE = 'Asia/Seoul' ##############

USE_I18N = False

USE_L10N = True

USE_TZ = True #타임 존을 사용할지 여부 결정 True/False


# Static files (CSS, JavaScript, Images)
# https://docs.djangoproject.com/en/3.1/howto/static-files/

#장고가 기본으로 생성한 static file이 위치할 폴더
#  - 직접지정한 STATICFILES_DIRS 가 우선됨 
STATIC_URL = '/static/'  
# 우선적으로 사용할 statics 임의의 경로
STATICFILES_DIRS = [os.path.join(BASE_DIR,'static')] #필요하면 추가함 

# 추가 부분 
MEDIA_URL = '/media/'
MEDIA_ROOT = os.path.join(BASE_DIR,'media')

TAGGIT_CASE_INSENSITIVE = True
TAGGIT_LIMIT = 50

DISQUS_SHORTNAME = 'lsymysite'
DISQUS_MY_DOMAIN = 'http://192.168.0.55'
LOGIN_REDIRECT_URL = '/'
